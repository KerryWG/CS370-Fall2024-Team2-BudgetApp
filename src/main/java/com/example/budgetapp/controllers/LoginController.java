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

    @GetMapping("/login")
    public String showLoginPage(@RequestParam(value = "error", required = false) String error,
                                org.springframework.ui.Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Invalid username or password");
        }
        return "login"; // Return the login.html template
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        User user = userService.findByUsername(username);

        if (user != null && new BCryptPasswordEncoder().matches(password, user.getPassword())) {
            return "redirect:/dashboard"; // Redirect to dashboard on success
        } else {
            return "redirect:/login?error=true"; // Redirect back to login on failure
        }
    }
}
