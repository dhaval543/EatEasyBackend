package com.eateasy.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eateasy.userservice.model.User;
import com.eateasy.userservice.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{username}")
    public Optional<User> getUser(@PathVariable String username) {
        return userService.findByUsername(username);
    }
}
