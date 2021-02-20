package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Garantias;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GarantiaDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TechnicalDeliveryControlPU");
        return factory.createEntityManager();
    }

    public Garantias saveGarantia(Garantias garantias) {
        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            if (garantias.getId() == null) {
                em.persist(garantias);
            } else {
                if (!em.contains(garantias)) {
                    if (em.find(Garantias.class, garantias.getId()) == null) {
                        throw new Exception("Erro ao atualizar o local!");
                    }
                }
                garantias = em.merge(garantias);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return garantias;
    }

    public List<Garantias> consultarTodasGarantias() {
        EntityManager em = getEM();
        List<Garantias> garantias;
        try {
            Query q = em.createNamedQuery("garantia.findAll");
            garantias = q.getResultList();
        } catch (Exception e) {
            garantias = new ArrayList();

        } finally {
            em.close();
        }
        return garantias;
    }

    public Garantias consultarGarantiaPorId(Integer id) {
        EntityManager em = getEM();
        Garantias garantia = null;
        try {
            garantia = em.find(Garantias .class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return garantia;
    }

    public Garantias GarantiaVencida(Garantias garantias) {
        EntityManager em = getEM();

        em.getTransaction().begin();
        garantias.setStatus("Vencida");
        garantias = em.merge(garantias);

        em.getTransaction().commit();

        return garantias;
    }

    public Date somaDias(Date data, int dias) {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = new GregorianCalendar();
        formatter.format(data);
        cal.setTime(data);

        cal.add(Calendar.DAY_OF_MONTH, dias);

        return cal.getTime();
    }

    public List<Garantias> consultarGarantiaPorData(Date datainicial, Date datafinal) {
        EntityManager em = getEM();
        List<Garantias> garantias;

        try {
            Query q = em.createNamedQuery("garantia.findData");
            q.setParameter("datainicial", datainicial);
            q.setParameter("datafinal", datafinal);
            garantias = q.getResultList();
        } catch (Exception e) {
            garantias = new ArrayList();
        } finally {
            em.close();
        }
        return garantias;

    }
     public List<Garantias> consultarGarantiaPorCliente(Integer idClient) {
        EntityManager em = getEM();
        List<Garantias> garantias;

        try {
            Query q = em.createNamedQuery("garantia.findClient");
            q.setParameter("id", idClient);
            garantias = q.getResultList();
        } catch (Exception e) {
            garantias = new ArrayList();
        } finally {
            em.close();
        }
        return garantias;

    }
   
    public Garantias consultarGarantiaPorSerieMaquina(String serie) {
        EntityManager em = getEM();
        Garantias garantias = new Garantias();
        try {

            Query q = em.createNamedQuery("garantia.findSeriaNumber");
            q.setParameter("serie", serie);

            garantias = (Garantias) q.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return garantias;
    }
    

    public void removerGarantia(int id) {
        EntityManager em = getEM();
        Garantias garantia = em.find(Garantias.class, id);
        try {
            em.getTransaction().begin();
            em.remove(garantia);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

}
