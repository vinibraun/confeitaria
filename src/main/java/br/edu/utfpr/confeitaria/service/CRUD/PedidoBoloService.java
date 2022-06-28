package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.PedidoBolo;
import br.edu.utfpr.confeitaria.repository.PedidoBoloRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class PedidoBoloService extends CrudService<PedidoBolo, Long>{

    private final PedidoBoloRepository pedidoBoloRepository;

    @Override
    public JpaRepository<PedidoBolo, Long> getRepository() {
        return pedidoBoloRepository;
    }
}
