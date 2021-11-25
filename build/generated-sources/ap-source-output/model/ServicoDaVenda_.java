package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Servico;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(ServicoDaVenda.class)
public class ServicoDaVenda_ { 

    public static volatile SingularAttribute<ServicoDaVenda, Double> sveValorServico;
    public static volatile SingularAttribute<ServicoDaVenda, Venda> venda;
    public static volatile SingularAttribute<ServicoDaVenda, Integer> idServicosVenda;
    public static volatile SingularAttribute<ServicoDaVenda, Servico> servico;

}