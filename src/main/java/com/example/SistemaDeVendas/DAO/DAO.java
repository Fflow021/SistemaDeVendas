package com.example.SistemaDeVendas.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class DAO<T extends Serializable> {

    private Class<T> entidade;

    private EntityManagerFactory emf;
    private EntityManager em;

    public DAO(Class<T> entidade) {
        this.entidade = entidade;
        this.emf = Persistence.createEntityManagerFactory("pu-vendas");
    }

    public DAO() {
    }

    public void persisteNoDB(T object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        em.close();
        System.out.println("PERSISTIDO NA DATABASE: \n" + object.toString() + "\n");
    }

    public T selectNaDBbyID(Integer id) {
        EntityManager em = emf.createEntityManager();
        T result = em.find(entidade, id);
        System.out.println("\nSELECT NA DATABASE PELO ID: " + id + "\n");
        em.close();
        return result;
    }
}
