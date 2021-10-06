package io.adminpanel.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateUserDto {
    private String firstName;
    private String lastName;
    private String city;
    private String mobile;
    private LocalDate dateOfBirth;
}
