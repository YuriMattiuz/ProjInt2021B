package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(ItemDaVenda.class)
public class ItemDaVenda_ { 

    public static volatile SingularAttribute<ItemDaVenda, Venda> venda;
    public static volatile SingularAttribute<ItemDaVenda, Integer> idItemVenda;
    public static volatile SingularAttribute<ItemDaVenda, Produto> produto;
    public static volatile SingularAttribute<ItemDaVenda, Double> itvPrecoUnitario;
    public static volatile SingularAttribute<ItemDaVenda, Double> itvValorTotal;
    public static volatile SingularAttribute<ItemDaVenda, String> itvOrigem;
    public static volatile SingularAttribute<ItemDaVenda, Integer> itvQuantidade;

}