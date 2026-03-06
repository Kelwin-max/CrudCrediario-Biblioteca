package com.example.demo.controller;

import com.example.demo.entities.CarteiraBiblioteca;
import com.example.demo.service.CarteiraBibliotecaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carteiras")
@RequiredArgsConstructor
public class CarteiraBibliotecaController {

    private final CarteiraBibliotecaService carteiraBibliotecaService;

    @PostMapping
    public ResponseEntity<CarteiraBiblioteca> save(@RequestBody CarteiraBiblioteca carteiraBiblioteca) {
        return ResponseEntity.ok(carteiraBibliotecaService.save(carteiraBiblioteca));
    }
}
