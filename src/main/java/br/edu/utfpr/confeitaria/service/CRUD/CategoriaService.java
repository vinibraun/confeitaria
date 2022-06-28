package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Categoria;
import br.edu.utfpr.confeitaria.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class CategoriaService extends CrudService<Categoria, Long> {

    private final CategoriaRepository repository;
    //private final StockRepository stockRepository; -Farei um estoque??

    @Override
    public JpaRepository<Categoria, Long> getRepository() { //por que usar jpa repository ao inves do categoria repository?
        return null;
    }

}
