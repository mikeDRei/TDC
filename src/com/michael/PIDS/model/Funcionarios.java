package com.michael.PIDS.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

@Entity
@NamedQueries({
    @NamedQuery(name = "funcionario.findAll", query = "SELECT f FROM"
            + " Funcionarios f")
    ,
@NamedQuery(name = "funcionario.findName", query = "SELECT f FROM Funcionarios f"
            + " WHERE f.nome LIKE :lnome")
    ,
@NamedQuery(name = "funcionario.login", query = "SELECT f FROM Funcionarios f"
            + " WHERE f.loginName =:login AND f.senha =:senha")
    ,
@NamedQuery(name = "funcionario.findLoginName", query = "SELECT f FROM Funcionarios f"
            + " WHERE f.loginName =:login")
})
public class Funcionarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String email;
    private String loginName;
    private Integer permissao;
    private String senha;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datacadastro;
    private Integer ativoInativo;

    public Funcionarios(Integer id, String nome, String email, String loginName, Integer permissao, Date datacadastro, String senha, Integer ativoInativo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.loginName = loginName;
        this.permissao = permissao;
        this.datacadastro = datacadastro;
        this.senha = senha;
        this.ativoInativo = ativoInativo;
    }

    public Funcionarios() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String LoginName) {
        this.loginName = LoginName;
    }

    public Integer getPermissao() {
        return permissao;
    }

    public void setPermissao(Integer permissao) {
        this.permissao = permissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getAtivoInativo() {
        return ativoInativo;
    }

    public void setAtivoInativo(Integer ativoInativo) {
        this.ativoInativo = ativoInativo;
    }

}
