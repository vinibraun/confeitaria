package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Sabor;
import br.edu.utfpr.confeitaria.repository.SaborRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class SaborService extends CrudService<Sabor, Long>{

    private final SaborRepository repository;

    @Override
    public SaborRepository getRepository() {
        return repository;
    }
}
