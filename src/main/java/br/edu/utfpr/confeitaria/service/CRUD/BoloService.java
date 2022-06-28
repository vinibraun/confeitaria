package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Bolo;
import br.edu.utfpr.confeitaria.repository.BoloRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class BoloService extends CrudService<Bolo, Long>{

    private final BoloRepository repository;

    @Override
    public JpaRepository<Bolo, Long> getRepository() {
        return repository;
    }
}
