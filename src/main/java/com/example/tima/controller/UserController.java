package com.example.tima.controller;

import com.example.tima.dto.UserRequest;
import com.example.tima.enity.User;
import com.example.tima.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<User> registerGuest(@Valid @RequestBody UserRequest request) {
        return ResponseEntity.ok(userService.registerGuest(request));
    }

    @GetMapping("/guests")
    public ResponseEntity<List<User>> getAllGuests() {
        return ResponseEntity.ok(userService.getAllGuests());
    }
}
