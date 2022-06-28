package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Estoque;
import br.edu.utfpr.confeitaria.model.Ingrediente;
import br.edu.utfpr.confeitaria.repository.EstoqueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class EstoqueService extends CrudService<Estoque, Long>{

    private final EstoqueRepository estoqueRepository;

    @Override
    public JpaRepository<Estoque, Long> getRepository() {
        return estoqueRepository;
    }

    public Estoque findFirstByItem(Ingrediente ingrediente) {
        log.info("Fetching stock from {}", ingrediente.getNome());
        return estoqueRepository.findFirstByItem(ingrediente);
    }
}
