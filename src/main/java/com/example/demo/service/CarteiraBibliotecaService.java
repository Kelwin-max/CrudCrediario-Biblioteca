package com.example.demo.service;

import com.example.demo.entities.CarteiraBiblioteca;
import com.example.demo.repo.CarteiraBibliotecaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarteiraBibliotecaService {

    private final CarteiraBibliotecaRepo carteiraBibliotecaRepo;

    public CarteiraBiblioteca save(CarteiraBiblioteca carteiraBiblioteca) {
        return carteiraBibliotecaRepo.save(carteiraBiblioteca);
    }
}
