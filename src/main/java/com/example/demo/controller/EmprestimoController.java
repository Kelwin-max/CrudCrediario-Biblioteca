package com.example.demo.controller;

import com.example.demo.entities.Emprestimo;
import com.example.demo.service.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
@RequiredArgsConstructor
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    @GetMapping
    public ResponseEntity<List<Emprestimo>> findAll() {
        return ResponseEntity.ok(emprestimoService.findAll());
    }

    @PostMapping
    public ResponseEntity<Emprestimo> save(@RequestBody Emprestimo emprestimo) {
        return ResponseEntity.ok(emprestimoService.save(emprestimo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emprestimo> findById(@PathVariable Long id) {
        return ResponseEntity.ok(emprestimoService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> update(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        return ResponseEntity.ok(emprestimoService.update(id, emprestimo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        emprestimoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
