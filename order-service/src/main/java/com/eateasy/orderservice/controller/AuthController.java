package com.eateasy.orderservice.controller;

import org.springframework.web.bind.annotation.*;

import com.eateasy.orderservice.utils.JwtUtil;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/token")
    public Map<String, String> generateToken(@RequestParam String username) {
        String token = jwtUtil.generateToken(username);
        return Map.of("token", token);
    }
}
