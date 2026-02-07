package br.com.my;

import exception.EmptyStorageException;
import exception.UserNotFoundException;
import usermodel.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO { //CRUD (create, read, update, remove)
	
	private long nextId = 1L;
	private final List<UserModel> models = new ArrayList<>();
	
	public UserModel save (final UserModel model) {
		model.setId(nextId++);
		models.add(model);
		return model;
	}
	
	
	
	public UserModel update(final UserModel model) {
	    int index = -1;
	    for (int i = 0; i < models.size(); i++) {
	        if (models.get(i).getId() == model.getId()) {
	            index = i;
	            break;
	        }
	    }

	    if (index == -1) {
	        throw new UserNotFoundException("Não existe o usuário com o id " + model.getId() + " cadastrado");
	    }

	    models.set(index, model); // substitui diretamente
	    return model;
	}

	
	public void delete(final long id) {
		
		var toDelete = findById(id);
		models.remove(toDelete);
		
	}
	
	public UserModel findById (final long id) {
		
		verifyStorage();
		final String message = String.format("Não existe o usuário com o id %s cadastrado", id);
		return models.stream().filter(u -> u.getId() == id)
		.findFirst()
		.orElseThrow(() -> new UserNotFoundException(message));
	}
	
	public List<UserModel> findAll(){
		
		return new ArrayList<>(models);
	}
	
	private void verifyStorage() {
		if (models.isEmpty()) throw new EmptyStorageException ("O armazenamento está vazio");
	}
	
}
