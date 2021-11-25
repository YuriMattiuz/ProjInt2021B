package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Compra;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(ItemDaCompra.class)
public class ItemDaCompra_ { 

    public static volatile SingularAttribute<ItemDaCompra, Compra> compra;
    public static volatile SingularAttribute<ItemDaCompra, Integer> idItemCompra;
    public static volatile SingularAttribute<ItemDaCompra, Produto> produto;
    public static volatile SingularAttribute<ItemDaCompra, Integer> itcQuantidade;
    public static volatile SingularAttribute<ItemDaCompra, Double> itcPrecoUnitario;
    public static volatile SingularAttribute<ItemDaCompra, Double> itcValorTotal;

}