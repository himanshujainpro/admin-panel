package io.adminpanel.mapper;

import io.adminpanel.dto.CreateUserDto;
import io.adminpanel.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    User dtoToModel(CreateUserDto createUserDto);
}
