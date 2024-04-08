package br.com.farmacia.app;

import br.com.farmacia.dao.FabricanteDAO;
import br.com.farmacia.dao.ProdutoDAO;
import br.com.farmacia.modelo.Fabricante;
import br.com.farmacia.modelo.Produto;
import br.com.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class Cadastrar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        FabricanteDAO fabricanteDAO = new FabricanteDAO(em);
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        Fabricante fabricante1 = new Fabricante("Fabricante 1");
        Fabricante fabricante2 = new Fabricante("Fabricante 2");
        Fabricante fabricante3 = new Fabricante("Fabricante 3");
        Fabricante fabricante4 = new Fabricante("Fabricante 4");

        Produto produto1 = new Produto("Produto 1", "Primeiro Produto", 1, fabricante1);
        Produto produto2 = new Produto("Produto 2", "Segundo Produto", 2, fabricante2);
        Produto produto3 = new Produto("Produto 3", "Terceiro Produto", 3, fabricante3);
        Produto produto4 = new Produto("Produto 4", "Quarto Produto", 4, fabricante4);

        em.getTransaction().begin();

        fabricanteDAO.cadastrar(fabricante1);
        fabricanteDAO.cadastrar(fabricante2);
        fabricanteDAO.cadastrar(fabricante3);
        fabricanteDAO.cadastrar(fabricante4);

        produtoDAO.cadastrar(produto1);
        produtoDAO.cadastrar(produto2);
        produtoDAO.cadastrar(produto3);
        produtoDAO.cadastrar(produto4);

        em.getTransaction().commit();
        em.close();
    }
}