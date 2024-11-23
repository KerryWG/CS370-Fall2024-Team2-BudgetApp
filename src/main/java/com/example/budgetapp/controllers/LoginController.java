package com.example.budgetapp.controllers;

import com.example.budgetapp.models.User;
import com.example.budgetapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Serve the login.html template
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        User user = userService.findByUsername(username);

        // Check if user exists and the password matches
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return "redirect:/dashboard"; // Redirect to dashboard if login is successful
        } else {
            return "redirect:/login?error=true"; // Redirect back to login with an error parameter
        }
    }
}
