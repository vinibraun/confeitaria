package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
