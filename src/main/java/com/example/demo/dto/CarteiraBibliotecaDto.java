package com.example.demo.dto;

public record CarteiraBibliotecaDto(
        Long id,
        String codigo,
        UsuarioDto usuario
) {}
