package com.michael.PIDS.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
    @NamedQuery(name = "maquinas.findAll", query = "SELECT m FROM"
            + " Maquinarios m"),
    @NamedQuery(name = "maquinas.findDescricao", query = "SELECT m FROM Maquinarios m"
            + " WHERE m.descricao LIKE :descricao"),
    @NamedQuery(name = "maquinas.findSerie", query = "SELECT m FROM Maquinarios m"
            + " WHERE m.serie LIKE :serie"),
    @NamedQuery(name = "maquinas.findTipo", query = "SELECT m FROM Maquinarios m"
            + " WHERE m.tipo LIKE :tipo")
    
})
public class Maquinarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String serie;
    private String descricao;
    private String modelo;
    private String tipo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacadastro;
    private String nomeCliente;
    private Integer ClienteId;
    @OneToOne
    private Funcionarios funcionario;
    
    public Maquinarios() {

    }

    public Maquinarios(Integer id,String serie, String descricao, String modelo, String tipo, Date datacadastro, String nomeCliente, Integer ClienteId, Funcionarios funcionario) {
        this.id = id;
        this.serie = serie;
        this.descricao = descricao;
        this.modelo = modelo;
        this.tipo = tipo;
        this.datacadastro = datacadastro;
        this.nomeCliente = nomeCliente;
        this.ClienteId = ClienteId;
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getClienteId() {
        return ClienteId;
    }

    public void setClienteId(Integer ClienteId) {
        this.ClienteId = ClienteId;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

}
