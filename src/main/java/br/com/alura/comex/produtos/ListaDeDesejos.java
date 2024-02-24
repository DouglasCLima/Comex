package br.com.alura.comex.produtos;

import java.util.LinkedList;
import java.util.List;

public class ListaDeDesejos {
    List<Produtos> listaDeDesejos = new LinkedList<>();

    public void adicionarProdutos(Produtos produtos){
        listaDeDesejos.add(produtos);
    }
    public void imprimeProdutos(){
        System.out.println("Lista de Desejos: " + listaDeDesejos);
    }
}
