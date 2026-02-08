package com.servicebooking.servicebookingbackend.service;

import com.servicebooking.servicebookingbackend.model.User;
import com.servicebooking.servicebookingbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    // fixed admin credentials
    private static final String ADMIN_EMAIL = "admin@servicehub.com";
    private static final String ADMIN_PASSWORD = "admin123";

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }

    public User login(String email, String password) {

        // ADMIN login
        if (ADMIN_EMAIL.equals(email) && ADMIN_PASSWORD.equals(password)) {
            User admin = new User();
            admin.setId("ADMIN");
            admin.setName("Admin");
            admin.setEmail(ADMIN_EMAIL);
            admin.setRole("admin");
            return admin;
        }

        // NORMAL user login
        return userRepository.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }
}
