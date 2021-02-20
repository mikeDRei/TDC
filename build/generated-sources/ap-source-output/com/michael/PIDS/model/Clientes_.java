package com.michael.PIDS.model;

import com.michael.PIDS.model.Funcionarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-23T09:18:44")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Integer> tipo;
    public static volatile SingularAttribute<Clientes, Integer> ano;
    public static volatile SingularAttribute<Clientes, Date> datacadastro;
    public static volatile SingularAttribute<Clientes, String> Telefone;
    public static volatile SingularAttribute<Clientes, String> nome;
    public static volatile SingularAttribute<Clientes, String> TelFixo;
    public static volatile SingularAttribute<Clientes, Integer> ativoinativo;
    public static volatile SingularAttribute<Clientes, Integer> mes;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> cpfoucnpj;
    public static volatile SingularAttribute<Clientes, Funcionarios> funcionario;
    public static volatile SingularAttribute<Clientes, Integer> dia;
    public static volatile SingularAttribute<Clientes, String> email;

}