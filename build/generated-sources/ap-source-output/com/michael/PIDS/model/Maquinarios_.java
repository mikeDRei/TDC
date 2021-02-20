package com.michael.PIDS.model;

import com.michael.PIDS.model.Funcionarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-23T09:18:44")
@StaticMetamodel(Maquinarios.class)
public class Maquinarios_ { 

    public static volatile SingularAttribute<Maquinarios, Integer> ClienteId;
    public static volatile SingularAttribute<Maquinarios, String> tipo;
    public static volatile SingularAttribute<Maquinarios, Date> datacadastro;
    public static volatile SingularAttribute<Maquinarios, String> serie;
    public static volatile SingularAttribute<Maquinarios, Integer> id;
    public static volatile SingularAttribute<Maquinarios, String> nomeCliente;
    public static volatile SingularAttribute<Maquinarios, Funcionarios> funcionario;
    public static volatile SingularAttribute<Maquinarios, String> modelo;
    public static volatile SingularAttribute<Maquinarios, String> descricao;

}