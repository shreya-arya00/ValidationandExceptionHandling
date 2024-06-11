package com.example.validation.dto;

import com.example.validation.validation.NotAdmin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {

    @NotBlank(message = "Username cannot be blank")
    private String username;
//    @NotAdmin(message = "Username cannot be 'admin'")
//    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 8, message = "Password should be at least 8 characters long")
    private String password;

    // getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
