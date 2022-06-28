package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.ControleEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleEstoqueRepository extends JpaRepository<ControleEstoque, Long>{
}
