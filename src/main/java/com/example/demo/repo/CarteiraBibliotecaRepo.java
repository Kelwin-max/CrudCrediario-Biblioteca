package com.example.demo.repo;

import com.example.demo.entities.CarteiraBiblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraBibliotecaRepo extends JpaRepository<CarteiraBiblioteca, Long> {
}
