package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Compra;
import model.Estoque;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Usuario.class)
public class Usuario_ extends Auditable_ {

    public static volatile SingularAttribute<Usuario, String> usuSenha;
    public static volatile SingularAttribute<Usuario, Date> usuDataCad;
    public static volatile SingularAttribute<Usuario, Date> usuDataNasc;
    public static volatile SingularAttribute<Usuario, String> usuLogin;
    public static volatile ListAttribute<Usuario, Compra> compras;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile ListAttribute<Usuario, Venda> vendas;
    public static volatile SingularAttribute<Usuario, String> usuPermissao;
    public static volatile SingularAttribute<Usuario, String> usuNome;
    public static volatile ListAttribute<Usuario, Estoque> estoques;

}