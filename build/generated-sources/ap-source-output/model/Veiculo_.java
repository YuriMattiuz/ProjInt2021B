package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.ModeloMoto;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Date> veiDataCad;
    public static volatile SingularAttribute<Veiculo, Cliente> cliente;
    public static volatile SingularAttribute<Veiculo, Integer> veiAnoFabric;
    public static volatile SingularAttribute<Veiculo, String> veiCor;
    public static volatile ListAttribute<Veiculo, Venda> vendas;
    public static volatile SingularAttribute<Veiculo, Integer> idVeiculo;
    public static volatile SingularAttribute<Veiculo, String> veiObs;
    public static volatile SingularAttribute<Veiculo, ModeloMoto> modeloMoto;
    public static volatile SingularAttribute<Veiculo, Integer> veiAnoModelo;
    public static volatile SingularAttribute<Veiculo, String> veiPlaca;

}