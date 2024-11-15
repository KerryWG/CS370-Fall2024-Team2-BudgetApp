package com.example.budgetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard") // Change to a unique endpoint if needed
    public String dashboard() {
        return "dashboard";
    }
}

