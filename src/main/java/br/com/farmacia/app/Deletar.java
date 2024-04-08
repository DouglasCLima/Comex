package br.com.farmacia.app;

import br.com.farmacia.dao.ProdutoDAO;
import br.com.farmacia.modelo.Produto;
import br.com.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class Deletar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        produtoDAO.deletar(produtoDAO.buscarPorId(4));

        em.getTransaction().commit();
        em.close();

        System.out.println("Produto excluido com sucesso");
    }
}
