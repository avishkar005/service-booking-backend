package com.servicebooking.servicebookingbackend.service;

import com.servicebooking.servicebookingbackend.model.User;
import com.servicebooking.servicebookingbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
