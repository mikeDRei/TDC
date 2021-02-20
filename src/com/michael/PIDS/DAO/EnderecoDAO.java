package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Enderecos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EnderecoDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TechnicalDeliveryControlPU");
        return factory.createEntityManager();
    }

    public Enderecos saveEndereco(Enderecos endereco) {
        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            if (endereco.getId() == null) {
                em.persist(endereco);
            } else {
                if (!em.contains(endereco)) {
                    if (em.find(Enderecos.class, endereco.getId()) == null) {
                        throw new Exception("Erro ao atualizar o local!");
                    }
                }
                endereco = em.merge(endereco);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return endereco;
    }

    public Enderecos findIdCliente(int clienteId) {
        EntityManager em = getEM();
        Enderecos end = new Enderecos();
        try {
            end.setCliente(clienteId);
            Query q = em.createNamedQuery("enderecos.findIdClient");
            q.setParameter("clienteId", clienteId);

            end = (Enderecos) q.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return end;
    }
}
