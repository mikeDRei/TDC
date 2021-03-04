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
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
    @NamedQuery(name = "garantia.findData", query = "SELECT g FROM"
            + " Garantias g WHERE g.dataInicial =:datainicial AND g.dataFinalGarantia =:datafinal")
    ,
    @NamedQuery(name = "garantia.findSeriaNumber", query = "SELECT g FROM"
            + " Garantias g WHERE g.SerialMaquina LIKE :serie")
    ,
       @NamedQuery(name = "garantia.findAll", query = "SELECT g FROM"
            + " Garantias g"),
       @NamedQuery(name = "garantia.findClient", query = "SELECT g FROM"
            + " Garantias g WHERE g.clienteId LIKE :id")
})
public class Garantias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Temporal(TemporalType.DATE)
    private Date dataFinalGarantia;
    private Maquinarios maquina;
    private Funcionarios funcionario;
    private Integer clienteId;
    private Integer notaFiscal;
    private String status;
    private String SerialMaquina;
    private String descricaoMaquina;

    public Garantias(Integer id, Date dataInicial, Date dataFinalGarantia,
            Maquinarios maquina, Integer clienteId, Funcionarios funcionarioId,
            Integer notaFiscal, String status, String SerialMaquina) {
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinalGarantia = dataFinalGarantia;
        this.maquina = maquina;
        this.clienteId = clienteId;
        this.funcionario = funcionarioId;
        this.notaFiscal = notaFiscal;
        this.status = status;
        this.SerialMaquina = SerialMaquina;

    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Garantias() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinalGarantia() {
        return dataFinalGarantia;
    }

    public void setDataFinalGarantia(Date dataFinalGarantia) {
        this.dataFinalGarantia = dataFinalGarantia;
    }

    public Maquinarios getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquinarios maquina) {
        this.maquina = maquina;
    }

    public Funcionarios getFuncionarioId() {
        return funcionario;
    }

    public void setFuncionarioId(Funcionarios funcionarioId) {
        this.funcionario = funcionarioId;
    }

    public Integer getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Integer notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

    public String getSerialMaquina() {
        return SerialMaquina;
    }

    public void setSerialMaquina(String SerialMaquina) {
        this.SerialMaquina = SerialMaquina;
    }

    public String getDescricaoMaquina() {
        return descricaoMaquina;
    }

    public void setDescricaoMaquina(String descricaoMaquina) {
        this.descricaoMaquina = descricaoMaquina;
    }

}
