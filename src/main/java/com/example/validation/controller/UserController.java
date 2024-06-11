package com.example.validation.controller;

import com.example.validation.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDto userDto) {
        // Simulate saving user data to a database or performing business logic
        return ResponseEntity.ok("User created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @Valid @RequestBody UserDto userDto) {
        // Simulate updating user data in a database or performing business logic
        return ResponseEntity.ok("User updated successfully");
    }
}
