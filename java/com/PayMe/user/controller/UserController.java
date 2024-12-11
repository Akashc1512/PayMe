// UserController class in the user.service package
package com.payme.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<String> register() {
        // Placeholder for user registration logic
        return ResponseEntity.ok("User registered successfully.");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        // Placeholder for user login logic
        return ResponseEntity.ok("User logged in successfully.");
    }
}
