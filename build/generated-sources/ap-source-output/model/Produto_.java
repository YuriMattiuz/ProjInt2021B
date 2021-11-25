package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Categoria;
import model.Estoque;
import model.Grupo;
import model.ItemDaCompra;
import model.ItemDaVenda;
import model.MarcaProduto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> proPrecoVenda;
    public static volatile SingularAttribute<Produto, Integer> proEstoqueInicial;
    public static volatile SingularAttribute<Produto, Integer> proEstoqueAtual;
    public static volatile SingularAttribute<Produto, Categoria> categoria;
    public static volatile SingularAttribute<Produto, Grupo> grupo;
    public static volatile SingularAttribute<Produto, String> proCodigo;
    public static volatile ListAttribute<Produto, ItemDaCompra> itensDaCompra;
    public static volatile SingularAttribute<Produto, String> proFoto;
    public static volatile SingularAttribute<Produto, Integer> idProduto;
    public static volatile SingularAttribute<Produto, MarcaProduto> marcaProduto;
    public static volatile SingularAttribute<Produto, Integer> proEstoqueMinimo;
    public static volatile SingularAttribute<Produto, String> proDescricao;
    public static volatile ListAttribute<Produto, Estoque> estoques;
    public static volatile ListAttribute<Produto, ItemDaVenda> itensDaVenda;

}