package com.example.budgetapp.repositories;

import com.example.budgetapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Query to find a user by username
}
