package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.PedidoBolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoBoloRepository extends JpaRepository<PedidoBolo, Long>{
}
