package io.adminpanel.service;

import io.adminpanel.dto.CreateUserDto;
import io.adminpanel.mapper.UserMapper;
import io.adminpanel.model.User;
import io.adminpanel.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User createUser(CreateUserDto createUserDto) {
        return userRepository.save(userMapper.dtoToModel(createUserDto));
    }

    @Transactional(readOnly = true)
    public List<User> users() {
        return userRepository.findAll();
    }
}
