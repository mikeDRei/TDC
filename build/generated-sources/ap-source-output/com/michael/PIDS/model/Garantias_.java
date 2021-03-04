package com.michael.PIDS.model;

import com.michael.PIDS.model.Funcionarios;
import com.michael.PIDS.model.Maquinarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-02T20:28:18")
@StaticMetamodel(Garantias.class)
public class Garantias_ { 

    public static volatile SingularAttribute<Garantias, Date> dataFinalGarantia;
    public static volatile SingularAttribute<Garantias, Integer> clienteId;
    public static volatile SingularAttribute<Garantias, Maquinarios> maquina;
    public static volatile SingularAttribute<Garantias, String> SerialMaquina;
    public static volatile SingularAttribute<Garantias, Integer> id;
    public static volatile SingularAttribute<Garantias, Date> dataInicial;
    public static volatile SingularAttribute<Garantias, Funcionarios> funcionario;
    public static volatile SingularAttribute<Garantias, Integer> notaFiscal;
    public static volatile SingularAttribute<Garantias, String> status;

}