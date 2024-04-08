package br.com.farmacia.repository;

import br.com.farmacia.orm.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    @Query("SELECT p FROM Produto p WHERE p.id = :id AND p.nome = :nome")
    List<Produto> findIdNome(Integer id, String nome);
}
