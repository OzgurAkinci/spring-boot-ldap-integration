package com.app.spring_boot_ldap_integration;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public/test")
    public String publicEndpoint() {
        return "This is a public endpoint";
    }

    @GetMapping("/secure/test")
    public String secureEndpoint() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "Welcome " + auth.getName() + "! This is a secure endpoint";
    }
}