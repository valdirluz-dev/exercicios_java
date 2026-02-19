package br.com.my.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import br.com.my.dto.UserDTO;
import br.com.my.model.UserModel;

@Mapper
public interface UserMapper {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "userName", source = "name")
    UserModel toModel(UserDTO dto);

    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "userName")
    UserDTO toDTO(UserModel model);
}
