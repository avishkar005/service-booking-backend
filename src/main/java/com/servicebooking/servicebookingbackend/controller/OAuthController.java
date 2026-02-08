package com.servicebooking.servicebookingbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.UUID;

@RestController
public class OAuthController {

    @GetMapping("/auth/oauth-success")
    public org.springframework.http.ResponseEntity<Void> oauthSuccess() {

        // frontend redirect
        String redirectUrl =
                "http://localhost:3000/oauth/callback"
                        + "?token=dummy-google-token"
                        + "&role=customer"
                        + "&id=" + UUID.randomUUID();

        return org.springframework.http.ResponseEntity
                .status(302)
                .location(URI.create(redirectUrl))
                .build();
    }
}
