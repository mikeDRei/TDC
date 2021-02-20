package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Clientes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClienteDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TechnicalDeliveryControlPU");
        return factory.createEntityManager();
    }

    public Clientes saveCliente(Clientes clientes) {
        EntityManager em = getEM();
        try {
            em.getTransaction().begin();

            //Validando se campos estão vazios
            if (clientes.getId() == null) {

                em.persist(clientes);
            } else {
                clientes = em.merge(clientes);
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return clientes;
    }

    public Clientes consultarClientePorId(Integer id) {
        EntityManager em = getEM();
        Clientes cliente = null;
        try {
            cliente = em.find(Clientes.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return cliente;
    }

    public List<Clientes> consultarTodosClientes() {
        EntityManager em = getEM();
        List<Clientes> clientes;
        try {
            Query q = em.createNamedQuery("cliente.findAll");
            clientes = q.getResultList();
        } catch (Exception e) {
            clientes = new ArrayList();

        } finally {
            em.close();
        }
        return clientes;
    }

    public List<Clientes> consultarClientePorNome(String nome) {
        EntityManager em = getEM();
        List<Clientes> clientes;

        try {
            Query q = em.createNamedQuery("cliente.findName");
            System.out.println(nome);
            q.setParameter("nome", nome);
            clientes = q.getResultList();
        } catch (Exception e) {
            clientes = new ArrayList();
        } finally {
            em.close();
        }
        return clientes;

    }

    public List<Clientes> consultarClientePorEmail(String email) {
        EntityManager em = getEM();
        List<Clientes> clientes;

        try {
            Query q = em.createNamedQuery("cliente.findEmail");
            System.out.println(email);
            q.setParameter("email", "%" + email + "%");
            clientes = q.getResultList();
        } catch (Exception e) {
            clientes = new ArrayList();
        } finally {
            em.close();
        }
        return clientes;

    }

    public Clientes consultarClientePorCpfOuCnpj2(String cpf) {
        EntityManager em = getEM();
        Clientes clientes = new Clientes();

        try {
            Query q = em.createNamedQuery("cliente.findCpfOuCnpj");

            q.setParameter("cpf", cpf);
            clientes = (Clientes) q.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return clientes;

    }

    public boolean ValidarCpf(String CPF) {
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {

            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {

                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }

    }

    public boolean ValidarCnpj(String CNPJ) {

        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {

            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {

                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public String gerarSenha() {
        int qtdeMaximaCaracteres = 8;
        String[] caracteres = {"0", "1", "b", "2", "4", "5", "6", "7", "8",
            "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();

    }
}
