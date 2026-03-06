package com.example.demo.service;

import com.example.demo.dto.EmprestimoDto;
import com.example.demo.entities.Emprestimo;
import com.example.demo.repo.EmprestimoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepo emprestimoRepo;

    public List<Emprestimo> findAll() {
        return emprestimoRepo.findAll();
    }

    public Emprestimo save(Emprestimo emprestimo) {
        return emprestimoRepo.save(emprestimo);
    }
    
    public Emprestimo findById(Long id) {
        return emprestimoRepo.findById(id).orElseThrow(() -> new RuntimeException("Emprestimo not found"));
    }

    public Emprestimo update(Long id, Emprestimo emprestimoDetails) {
        Emprestimo emprestimo = findById(id);
        emprestimo.setDataEmprestimo(emprestimoDetails.getDataEmprestimo());
        emprestimo.setDataDevolucao(emprestimoDetails.getDataDevolucao());
        emprestimo.setUser(emprestimoDetails.getUser());
        emprestimo.setCarteira(emprestimoDetails.getCarteira());
        return emprestimoRepo.save(emprestimo);
    }

    public void deleteById(Long id) {
        emprestimoRepo.deleteById(id);
    }
}
