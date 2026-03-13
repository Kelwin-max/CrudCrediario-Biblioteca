package com.example.demo.service;

import com.example.demo.entities.Usuario;
import com.example.demo.repo.UsuarioRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    public List<Usuario> findAll() {
        return usuarioRepo.findAll();
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public Usuario findById(Long id) {
        return usuarioRepo.findById(id).orElseThrow(() -> new RuntimeException("Usuario not found"));
    }

    public Usuario update(Long id, Usuario usuarioDetails) {
        Usuario usuario = findById(id);
        usuario.setName(usuarioDetails.getName());
        usuario.setEmail(usuarioDetails.getEmail());
        return usuarioRepo.save(usuario);
    }

    public void deleteById(Long id) {
        usuarioRepo.deleteById(id);
    }
}
