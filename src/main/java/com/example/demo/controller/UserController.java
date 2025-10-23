package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/me")
    public Object getMe(@AuthenticationPrincipal UserDetails user) {
        // return minimal info
        return Map.of("username", user.getUsername(), "roles", user.getAuthorities());
    }
}
