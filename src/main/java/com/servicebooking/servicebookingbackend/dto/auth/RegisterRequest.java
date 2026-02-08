package com.servicebooking.servicebookingbackend.dto.auth;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private String role; // customer | vendor | admin
}
