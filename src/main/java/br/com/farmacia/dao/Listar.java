package br.com.farmacia.dao;

import br.com.farmacia.dao.ProdutoDAO;
import br.com.farmacia.modelo.Produto;
import br.com.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class Listar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        List<Produto> todos = produtoDAO.buscarTodosLazy();
        todos.forEach(produto -> System.out.println("Nome: " + produto.getNome() + "| Descrição: "
                + produto.getDescricao() + "| Preço: R$ " + produto.getPreco() + produto.getFabricante()));
    }
}
