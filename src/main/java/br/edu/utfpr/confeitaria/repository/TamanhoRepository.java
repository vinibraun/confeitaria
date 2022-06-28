package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.Tamanho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TamanhoRepository extends JpaRepository<Tamanho, Long>{

}
