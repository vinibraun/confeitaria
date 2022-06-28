package br.edu.utfpr.confeitaria.repository;

import br.edu.utfpr.confeitaria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
