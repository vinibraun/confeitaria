package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.Sabor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaborRepository extends JpaRepository<Sabor, Long>{

}
