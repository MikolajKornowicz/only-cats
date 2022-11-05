package com.onlycats.onlycats.back.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private String repeatPassword;
}
