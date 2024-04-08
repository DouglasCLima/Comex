package br.com.farmacia.dao;

import br.com.farmacia.modelo.Fabricante;
import br.com.farmacia.modelo.Produto;

import javax.persistence.EntityManager;

public class FabricanteDAO
{
    private EntityManager em;

    public FabricanteDAO(EntityManager em)
    {
        this.em = em;
    }

    public void cadastrar(Fabricante fabricante)
    {
        this.em.persist(fabricante);
    }
}
