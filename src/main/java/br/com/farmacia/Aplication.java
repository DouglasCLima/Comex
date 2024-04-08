package br.com.farmacia;

import br.com.farmacia.service.ProdutoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplication implements CommandLineRunner {


    private final ProdutoService produtoService;

    public Aplication(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Aplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        produtoService.atualizarDescricao();

        produtoService.listarProdutos();

        produtoService.cadastrar();

        produtoService.deletar();

        produtoService.findIdNome();
    }
}
