package com.example.demo.dto;

public record EmprestimoDto(
        Long id,
        String dataEmprestimo,
        String dataDevolucao,
        UsuarioDto usuario,
        CarteiraBibliotecaDto carteiraBiblioteca
) {
}
