package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Estoque;
import br.edu.utfpr.confeitaria.model.Ingrediente;
import br.edu.utfpr.confeitaria.model.Tamanho;
import br.edu.utfpr.confeitaria.repository.EstoqueRepository;
import br.edu.utfpr.confeitaria.repository.IngredienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class IngredienteService extends CrudService<Ingrediente, Long>{

    private final IngredienteRepository repository;
    private final EstoqueRepository estoqueRepository;

    @Override
    public JpaRepository<Ingrediente, Long> getRepository() {
        return repository;
    }

    public Ingrediente saveAndUpdateStock(Ingrediente ingrediente) {
        log.info("Saving item {}", ingrediente.getNome());
        var ingredienteSaved = repository.saveAndFlush(ingrediente);
        log.info("Creating stock cell to {}", ingrediente.getNome());
        estoqueRepository.save(
                Estoque.builder()
                        .ingrediente(ingredienteSaved)
                        .quantity(0.0).build()
        );
        return ingredienteSaved;
    }
}
