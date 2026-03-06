package com.example.demo.repo;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
    boolean existsByname(String username);
}
