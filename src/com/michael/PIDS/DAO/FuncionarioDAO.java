package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Funcionarios;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FuncionarioDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TechnicalDeliveryControlPU");
        return factory.createEntityManager();
    }

    public Funcionarios saveFuncionario(Funcionarios funcionario) {
        EntityManager em = getEM();
        try {
            em.getTransaction().begin();

            //Validando se campos estão vazios
            if (funcionario.getId() == null) {

                if (funcionario.getNome().equals("") || funcionario.getLoginName().equals("") || funcionario.getEmail().equals("")
                        || funcionario.getSenha().equals("")) {
                    em.close();
                }

                em.persist(funcionario);
            } else {
                funcionario = em.merge(funcionario);
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return funcionario;
    }

    public Funcionarios consultarFuncionario(Integer id) {
        EntityManager em = getEM();
        Funcionarios funcionario = null;
        try {
            funcionario = em.find(Funcionarios.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return funcionario;
    }

    public List<Funcionarios> consultarTodosFuncionarios() {
        EntityManager em = getEM();
        List<Funcionarios> funcionarios;
        try {
            Query q = em.createNamedQuery("funcionario.findAll");
            funcionarios = q.getResultList();
        } catch (Exception e) {
            funcionarios = new ArrayList();

        } finally {
            em.close();
        }
        return funcionarios;
    }

    public List<Funcionarios> consultarFuncionarioPorNome(String nome) {
        EntityManager em = getEM();
        List<Funcionarios> funcionarios;

        try {
            Query q = em.createNamedQuery("funcionario.findName");
            q.setParameter("lnome", "%" + nome + "%");
            funcionarios = q.getResultList();
        } catch (Exception e) {
            funcionarios = new ArrayList();
        } finally {
            em.close();
        }
        return funcionarios;

    }

    public Funcionarios findLogin(String login) {
        EntityManager em = getEM();
        Funcionarios funcionario = new Funcionarios();
        try {
            funcionario.setLoginName(login);
            Query q = em.createNamedQuery("funcionario.findLoginName");
            q.setParameter("login", login);

            funcionario = (Funcionarios) q.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return funcionario;
    }

}
