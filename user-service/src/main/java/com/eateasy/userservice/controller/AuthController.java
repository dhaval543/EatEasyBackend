package com.eateasy.userservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eateasy.userservice.model.User;
import com.eateasy.userservice.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return authService.authenticate(username, password);
    }
}

