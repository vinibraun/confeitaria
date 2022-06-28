package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.ControleEstoque;
import br.edu.utfpr.confeitaria.repository.ControleEstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ControleEstoqueService extends CrudService<ControleEstoque, Long>{

    private final ControleEstoqueRepository repository;

    @Override
    public JpaRepository<ControleEstoque, Long> getRepository() {
        return repository;
    }
}
