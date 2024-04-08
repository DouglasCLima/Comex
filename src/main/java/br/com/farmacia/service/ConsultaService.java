package br.com.farmacia.service;

import br.com.farmacia.orm.Produto;
import br.com.farmacia.repository.ProdutoRepository;

import java.util.List;

public class ConsultaService {
    private final ProdutoRepository produtoRepository;

    public ConsultaService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public void findIdNome(){
        List<Produto> list = produtoRepository.findIdNome(2, "Aspirina");
        list.forEach(System.out::println);
    }
}
