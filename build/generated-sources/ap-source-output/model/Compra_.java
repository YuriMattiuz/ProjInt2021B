package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ContaPagar;
import model.Fornecedor;
import model.ItemDaCompra;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, String> comDescricao;
    public static volatile SingularAttribute<Compra, Date> comDataCompra;
    public static volatile SingularAttribute<Compra, Double> comValor;
    public static volatile SingularAttribute<Compra, Integer> comQuantParcelas;
    public static volatile ListAttribute<Compra, ContaPagar> contasPagar;
    public static volatile SingularAttribute<Compra, Integer> idCompra;
    public static volatile SingularAttribute<Compra, Usuario> usuario;
    public static volatile SingularAttribute<Compra, Fornecedor> fornecedor;
    public static volatile ListAttribute<Compra, ItemDaCompra> itensDaCompra;

}