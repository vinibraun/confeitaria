package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.Estoque;
import br.edu.utfpr.confeitaria.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
    Estoque findFirstByItem(Ingrediente item);
}
