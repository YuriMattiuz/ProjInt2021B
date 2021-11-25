package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Movimento.class)
public class Movimento_ { 

    public static volatile SingularAttribute<Movimento, Integer> idMovimento;
    public static volatile SingularAttribute<Movimento, Venda> venda;
    public static volatile SingularAttribute<Movimento, String> movMotivo;
    public static volatile SingularAttribute<Movimento, Double> movValor;
    public static volatile SingularAttribute<Movimento, Date> movData;
    public static volatile SingularAttribute<Movimento, String> movTipo;

}