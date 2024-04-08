package br.com.farmacia.repository;

import br.com.farmacia.orm.Fabricante;
import org.springframework.data.repository.CrudRepository;

public interface FabricanteRepository extends CrudRepository<Fabricante, Integer> {
}
