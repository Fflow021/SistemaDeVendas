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
        em.close();
        return result;
    }

    public void update(T object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        em.close();
    }

    public T createCustomQUERY(String jpqlQUERY){
        EntityManager em = emf.createEntityManager();
        T resultado = em.createQuery(jpqlQUERY, entidade).setMaxResults(1).getSingleResult();
        em.close();
        return resultado;
    }
}
