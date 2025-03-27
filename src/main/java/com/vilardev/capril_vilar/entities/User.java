package com.vilardev.capril_vilar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String email;
    private String password;

    public User() {}
}
