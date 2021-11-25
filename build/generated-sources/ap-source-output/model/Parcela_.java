package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Parcela.class)
public class Parcela_ { 

    public static volatile SingularAttribute<Parcela, Venda> venda;
    public static volatile SingularAttribute<Parcela, Integer> parParcela;
    public static volatile SingularAttribute<Parcela, Double> parValorInicial;
    public static volatile SingularAttribute<Parcela, Date> parDataVenc;
    public static volatile SingularAttribute<Parcela, Date> parDataPagto;
    public static volatile SingularAttribute<Parcela, String> parStatus;
    public static volatile SingularAttribute<Parcela, Integer> idParcela;

}