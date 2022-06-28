package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Tamanho;
import br.edu.utfpr.confeitaria.repository.TamanhoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service @Slf4j @RequiredArgsConstructor
public class TamanhoService extends CrudService<Tamanho, Long>{

    private final TamanhoRepository repository;

    @Override
    public JpaRepository<Tamanho, Long> getRepository() { //pq ESSA DAQUI nao deixou eu colocar 'TamanhoRepository'????
        return repository;
    }
}
