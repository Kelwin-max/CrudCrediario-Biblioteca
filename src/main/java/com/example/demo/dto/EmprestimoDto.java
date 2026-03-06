package com.example.demo.dto;

public record EmprestimoDto(
        Long id,
        String dataEmprestimo,
        String dataDevolucao,
        UserDto user,
        CarteiraBibliotecaDto carteiraBiblioteca
) {
}
