package com.example.demo.dto;

public record UsuarioDto(
        @NotBlank
        String name,
        @NotBlank
        String email
) {}
