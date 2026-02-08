package com.servicebooking.servicebookingbackend.controller;

import com.servicebooking.servicebookingbackend.dto.auth.LoginRequest;
import com.servicebooking.servicebookingbackend.dto.auth.RegisterRequest;
import com.servicebooking.servicebookingbackend.model.User;
import com.servicebooking.servicebookingbackend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    private final UserRepository userRepository;

    // fixed admin credentials
    private static final String ADMIN_EMAIL = "admin@servicehub.com";
    private static final String ADMIN_PASSWORD = "admin123";

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody RegisterRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(request.getRole());

        userRepository.save(user);

        return Map.of(
                "message", "Registration successful. Please login."
        );
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest request) {

        // ADMIN login (fixed credentials)
        if (ADMIN_EMAIL.equals(request.getEmail())
                && ADMIN_PASSWORD.equals(request.getPassword())) {

            User admin = new User();
            admin.setId("ADMIN");
            admin.setName("Admin");
            admin.setEmail(ADMIN_EMAIL);
            admin.setRole("admin");

            return Map.of(
                    "id", admin.getId(),
                    "name", admin.getName(),
                    "email", admin.getEmail(),
                    "role", admin.getRole()
            );
        }

        // NORMAL user login
        User user = userRepository
                .findByEmailAndPassword(request.getEmail(), request.getPassword())
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));

        return Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail(),
                "role", user.getRole()
        );
    }
}
