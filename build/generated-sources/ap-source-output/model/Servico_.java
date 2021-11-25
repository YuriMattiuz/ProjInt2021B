package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ServicoDaVenda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, Integer> idServico;
    public static volatile SingularAttribute<Servico, Double> serValor;
    public static volatile SingularAttribute<Servico, String> serDescricao;
    public static volatile ListAttribute<Servico, ServicoDaVenda> servicosOs;

}