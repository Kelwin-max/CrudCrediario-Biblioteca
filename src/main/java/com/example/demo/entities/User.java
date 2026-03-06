package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Email
    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private CarteiraBiblioteca carteira;

    @OneToMany(mappedBy = "user")
    private List<Emprestimo> emprestimos;

    public User(Object o, String name, String email) {
    }
}
