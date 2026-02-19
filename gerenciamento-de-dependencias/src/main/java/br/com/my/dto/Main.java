package br.com.my.dto;

import java.time.LocalDate;

import org.mapstruct.factory.Mappers;

import br.com.my.mapper.UserMapper;
import br.com.my.model.UserModel;

public class Main {
	
	private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);
	
	public static void main(String[] args) {
		var model = new UserModel();
		
		model.setCode(0);
		model.setUserName("Maria");
		model.setBirthday(LocalDate.now().minusYears(30));
		System.out.println(mapper.toDTO(model));
		
		var dto = new UserDTO();
		dto.setId(1);
		dto.setName("James");
		dto.setBirthday(LocalDate.now().minusYears(20));
		System.out.println(mapper.toModel(dto));
		
	}

}
