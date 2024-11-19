package com.example.budgetapp.services;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseService {
    private static final String URL = "jdbc:sqlite:budgetapp.db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            throw new RuntimeException("Database connection failed", e);
        }
    }
}
