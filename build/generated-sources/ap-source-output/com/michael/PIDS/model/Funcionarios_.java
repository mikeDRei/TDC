package com.michael.PIDS.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-23T09:18:44")
@StaticMetamodel(Funcionarios.class)
public class Funcionarios_ { 

    public static volatile SingularAttribute<Funcionarios, String> senha;
    public static volatile SingularAttribute<Funcionarios, String> loginName;
    public static volatile SingularAttribute<Funcionarios, Date> datacadastro;
    public static volatile SingularAttribute<Funcionarios, String> nome;
    public static volatile SingularAttribute<Funcionarios, Integer> id;
    public static volatile SingularAttribute<Funcionarios, Integer> permissao;
    public static volatile SingularAttribute<Funcionarios, Integer> ativoInativo;
    public static volatile SingularAttribute<Funcionarios, String> email;

}