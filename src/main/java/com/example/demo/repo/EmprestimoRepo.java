package com.example.demo.repo;

import com.example.demo.entities.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepo extends JpaRepository<Emprestimo, Long> {
}
