package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Maquinarios;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MaquinaDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TechnicalDeliveryControlPU");
        return factory.createEntityManager();
    }

    public Maquinarios saveMaquina(Maquinarios maquina) {
        EntityManager em = getEM();
        try {
            em.getTransaction().begin();
            if (maquina.getId() == null) {
                em.persist(maquina);
            } else {
                maquina = em.merge(maquina);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return maquina;
    }

    public List<Maquinarios> consultarTodasAsMaquinas() {
        EntityManager em = getEM();
        List<Maquinarios> maquinas;
        try {
            Query q = em.createNamedQuery("maquinas.findAll");
            maquinas = q.getResultList();
        } catch (Exception e) {
            maquinas = new ArrayList();

        } finally {
            em.close();
        }
        return maquinas;
    }

    public void removerMaquina(int id) {
        EntityManager em = getEM();
        Maquinarios maq = em.find(Maquinarios.class, id);
        try {
            em.getTransaction().begin();
            em.remove(maq);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    public Maquinarios consultarMaquinarioPorId(Integer id) {
        EntityManager em = getEM();
        Maquinarios maquina = null;
        try {
            maquina = em.find(Maquinarios.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return maquina;
    }

    public List<Maquinarios> consultarMaquinarioPorDescricao(String descricao) {
        EntityManager em = getEM();
        List<Maquinarios> maquina;
        try {

            Query q = em.createNamedQuery("maquinas.findDescricao");
            q.setParameter("descricao", "%" + descricao + "%");

            maquina = q.getResultList();
        } catch (Exception e) {
            maquina = new ArrayList();
        } finally {
            em.close();
        }
        return maquina;
    }

    public Maquinarios consultarMaquinarioPorSerie(String serie) {
        EntityManager em = getEM();
        Maquinarios maquina = new Maquinarios();
        try {

            Query q = em.createNamedQuery("maquinas.findSerie");
            q.setParameter("serie", serie);

            maquina = (Maquinarios) q.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return maquina;
    }

    public List<Maquinarios> consultarMaquinarioPorTipo(String tipo) {
        EntityManager em = getEM();
        List<Maquinarios> maquina;
        try {

            Query q = em.createNamedQuery("maquinas.findTipo");
            q.setParameter("tipo", "%" + tipo + "%");

            maquina = q.getResultList();
        } catch (Exception e) {
            maquina = new ArrayList();
        } finally {
            em.close();
        }
        return maquina;
    }

}
