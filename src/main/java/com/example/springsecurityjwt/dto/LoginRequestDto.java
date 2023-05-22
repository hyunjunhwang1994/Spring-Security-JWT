package com.example.springsecurityjwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDto {
    private String memberName;
    private String password;
}
