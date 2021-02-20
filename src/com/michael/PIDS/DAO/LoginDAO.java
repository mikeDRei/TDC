package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Funcionarios;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TechnicalDeliveryControlPU");
        return factory.createEntityManager();
    }

    public Funcionarios login(String login, String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        EntityManager em = getEM();

        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        Funcionarios funcionario = new Funcionarios();

        try {
            funcionario.setLoginName(login);
            funcionario.setSenha(senha);

            Query q = em.createNamedQuery("funcionario.login");
            q.setParameter("login", login);
            q.setParameter("senha", CriptografarSenha(senha).toString());
            funcionario = (Funcionarios) q.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return funcionario;
    }

    public BigInteger CriptografarSenha(String senha) throws NoSuchAlgorithmException {
        MessageDigest md5;
        BigInteger senhacrip = null;

        md5 = MessageDigest.getInstance("MD5");
        md5.reset();
        md5.update(senha.getBytes(), 0, senha.length());
        senhacrip = new BigInteger(1, md5.digest());

        return senhacrip;

    }
}
