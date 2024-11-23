package com.example.budgetapp.controllers;

import com.example.budgetapp.models.User;
import com.example.budgetapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Serve the register.html page
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam(required = false) String pin) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password); // Raw password (will be hashed in the service layer)
        //newUser.setPin(pin);

        userService.registerUser(newUser); // Save the user
        return "redirect:/login"; // Redirect to the login page
    }
}
