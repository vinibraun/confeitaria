package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.Bolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoloRepository extends JpaRepository<Bolo, Long> {

}
