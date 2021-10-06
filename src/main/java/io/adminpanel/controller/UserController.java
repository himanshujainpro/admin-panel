package io.adminpanel.controller;

import io.adminpanel.dto.CreateUserDto;
import io.adminpanel.model.User;
import io.adminpanel.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {
    private static final String NEW_USER_LOG = "New user was created id:{}";
    private static final Logger logger =
            LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    @Operation(summary = "Create a new user")
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto) {
        final User createdUser = userService.createUser(createUserDto);
        logger.info(NEW_USER_LOG, createdUser.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @Operation(summary = "Get the list of all users")
    @GetMapping("/users")
    public ResponseEntity<List<User>> users() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.users());
    }


}
