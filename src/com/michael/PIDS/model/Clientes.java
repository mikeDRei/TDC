package com.michael.PIDS.model;

import com.michael.PIDS.ENUM.TipoCliente;
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
    @NamedQuery(name = "cliente.findAll", query = "SELECT c FROM"
            + " Clientes c")
    ,
@NamedQuery(name = "cliente.findName", query = "SELECT c FROM Clientes c"
            + " WHERE c.nome LIKE :nome")
    ,
@NamedQuery(name = "cliente.findEmail", query = "SELECT c FROM Clientes c"
            + " WHERE c.email LIKE :email")
        ,
@NamedQuery(name = "cliente.findCpfOuCnpj", query = "SELECT c FROM Clientes c"
            + " WHERE c.cpfoucnpj LIKE :cpf")
})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String cpfoucnpj;
    private Integer tipo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacadastro;
    @OneToOne
    private Funcionarios funcionario;
    private String Telefone;
    private String TelFixo;
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Integer ativoinativo;
    
    public Clientes(Integer id, String nome, String email, String cpfoucnpj,
            Integer tipo, Date datacadastro, Funcionarios funcionario,String 
                    Telefone,String TelFixo,Date datanascimento, Integer dia
            ,Integer mes, Integer ano,Integer ativoinativo, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfoucnpj = cpfoucnpj;
        this.tipo = tipo;
        this.datacadastro = datacadastro;
        this.funcionario = funcionario;
        this.Telefone = Telefone;
        this.TelFixo = TelFixo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.ativoinativo = ativoinativo;
        this.senha = senha;
        
    }

    public Clientes(Integer id, String nome, String email, String cpf, Date datacadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfoucnpj = cpfoucnpj;
        this.datacadastro = datacadastro;

    }

    public Clientes() {

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfoucnpj() {
        return cpfoucnpj;
    }

    public void setCpfoucnpj(String cpfoucnpj) {
        this.cpfoucnpj = cpfoucnpj;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

    public Funcionarios getFuncionarioId() {
        return funcionario;
    }

    public void setFuncionarioId(Funcionarios funcionarioId) {
        this.funcionario = funcionarioId;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTelFixo() {
        return TelFixo;
    }

    public void setTelFixo(String TelFixo) {
        this.TelFixo = TelFixo;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getAtivoinativo() {
        return ativoinativo;
    }

    public void setAtivoinativo(Integer ativoinativo) {
        this.ativoinativo = ativoinativo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 
    
    

}
