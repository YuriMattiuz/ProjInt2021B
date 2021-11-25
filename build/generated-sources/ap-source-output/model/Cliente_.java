package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Veiculo;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Date> cliDataCad;
    public static volatile SingularAttribute<Cliente, String> cliOrgaoExp;
    public static volatile SingularAttribute<Cliente, Boolean> cliStatus;
    public static volatile SingularAttribute<Cliente, String> cliComplemento;
    public static volatile SingularAttribute<Cliente, String> cliBairro;
    public static volatile ListAttribute<Cliente, Venda> vendas;
    public static volatile SingularAttribute<Cliente, String> cliCPF;
    public static volatile SingularAttribute<Cliente, String> cliCidade;
    public static volatile SingularAttribute<Cliente, String> cliTelefone;
    public static volatile SingularAttribute<Cliente, String> cliEndereco;
    public static volatile SingularAttribute<Cliente, String> cliRG;
    public static volatile SingularAttribute<Cliente, String> cliObs;
    public static volatile ListAttribute<Cliente, Veiculo> veiculos;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> cliUF;
    public static volatile SingularAttribute<Cliente, Date> cliDataNasc;
    public static volatile SingularAttribute<Cliente, String> cliCelular;
    public static volatile SingularAttribute<Cliente, String> cliNome;
    public static volatile SingularAttribute<Cliente, String> cliNumero;
    public static volatile SingularAttribute<Cliente, String> cliEmail;

}