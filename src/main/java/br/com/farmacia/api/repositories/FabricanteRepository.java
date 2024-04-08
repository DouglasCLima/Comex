package br.com.farmacia.api.repositories;

import br.com.farmacia.api.entities.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
