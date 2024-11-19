package com.example.budgetapp.controllers;

import com.example.budgetapp.utils.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void handleLogin(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Add authentication logic here
        if ("admin".equals(username) && "password".equals(password)) {
            Navigation.loadScene("dashboard.fxml");
        } else {
            System.out.println("Invalid credentials");
        }
    }

    @FXML
    public void handleRegister(ActionEvent event) throws Exception {
        Navigation.loadScene("register.fxml");
    }
}
