package io.adminpanel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "f_name")
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    private String city;

    @Column(name = "dob")
    private LocalDate dateOfBirth;

    @Max(10)
    private String mobile;
}
