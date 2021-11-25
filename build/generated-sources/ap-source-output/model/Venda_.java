package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.ItemDaVenda;
import model.Movimento;
import model.Usuario;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Veiculo> veiculo;
    public static volatile SingularAttribute<Venda, Cliente> cliente;
    public static volatile SingularAttribute<Venda, String> venStatus;
    public static volatile SingularAttribute<Venda, Double> venValorTotal;
    public static volatile SingularAttribute<Venda, Usuario> usuario;
    public static volatile ListAttribute<Venda, Movimento> movimentos;
    public static volatile SingularAttribute<Venda, Double> venTaxaJuros;
    public static volatile SingularAttribute<Venda, Date> venDataVenda;
    public static volatile SingularAttribute<Venda, Integer> idVenda;
    public static volatile SingularAttribute<Venda, Double> venDesconto;
    public static volatile SingularAttribute<Venda, Boolean> venOrcamento;
    public static volatile ListAttribute<Venda, ItemDaVenda> itensDaVenda;

}