package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private LocalDate dataEmprestimo;
    @NotNull
    private LocalDate dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "carteira_id")
    private CarteiraBiblioteca carteira;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
