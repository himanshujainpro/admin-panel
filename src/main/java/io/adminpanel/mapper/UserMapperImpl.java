package io.adminpanel.mapper;

import io.adminpanel.dto.CreateUserDto;
import io.adminpanel.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User dtoToModel(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setCity(createUserDto.getCity());
        user.setMobile(createUserDto.getMobile());
        user.setDateOfBirth(createUserDto.getDateOfBirth());
        return user;
    }
}
