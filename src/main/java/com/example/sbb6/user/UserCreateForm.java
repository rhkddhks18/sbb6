package com.example.sbb6.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.units.qual.min;

@Getter
@Setter
public class UserCreateForm {
    @Email
    @NotEmpty(message = "아이디는 필수 항목")
    private String emailId;
    @Size(min = 3, max = 25)
    @NotEmpty(message = "닉네임은 필수 항목")
    private String nickname;

    @NotEmpty(message = "비밀번호는 필수 항목")
    private String password1;

    @NotEmpty(message = "비밀번호확인은 필수 항목")
    private String password2;
}
