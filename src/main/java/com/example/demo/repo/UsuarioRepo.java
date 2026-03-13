package com.example.demo.repo;

import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
    boolean existsByName(String name);
}
