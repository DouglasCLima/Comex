package br.com.farmacia.service;

import br.com.farmacia.orm.Produto;
import br.com.farmacia.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public void cadastrar(){
        Produto produto2 = new Produto();
        produto2.setDescricao("Para Dor");
        produto2.setNome("Aspirina");
        produto2.setPreco(5.60);
        produtoRepository.save(produto2);

        Produto produto3 = new Produto();
        produto3.setDescricao("Para dores musculares");
        produto3.setNome("Canela de Véio");
        produto3.setPreco(20.00);
        produtoRepository.save(produto3);
    }

    public void atualizarDescricao(){
        Produto produto = new Produto();
        produto.setId(1);
        produto.setDescricao("Para tosse");
        produto.setNome("Xarope");
        produto.setPreco(11.10);
        produtoRepository.save(produto);
    }

    public void listarProdutos(){
        Iterable<Produto> produtos = produtoRepository.findAll();
        produtos.forEach(produto -> System.out.println(produto));
    }

    public void deletar(){
        produtoRepository.deleteById(3);
        System.out.println("Deletado");
    }

    public void findIdNome(){
        List<Produto> list = produtoRepository.findIdNome(2, "Aspirina");
        list.forEach(System.out::println);
    }
}
