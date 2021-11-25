package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Compra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ { 

    public static volatile SingularAttribute<Fornecedor, String> forTelefone;
    public static volatile SingularAttribute<Fornecedor, String> forEmail;
    public static volatile SingularAttribute<Fornecedor, String> forCnpj;
    public static volatile SingularAttribute<Fornecedor, Integer> idFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> forContato;
    public static volatile SingularAttribute<Fornecedor, String> forEndereco;
    public static volatile SingularAttribute<Fornecedor, String> forUf;
    public static volatile SingularAttribute<Fornecedor, String> forInscEstadual;
    public static volatile ListAttribute<Fornecedor, Compra> compras;
    public static volatile SingularAttribute<Fornecedor, String> forRazaoSocial;
    public static volatile SingularAttribute<Fornecedor, String> forCidade;
    public static volatile SingularAttribute<Fornecedor, String> forBairro;
    public static volatile SingularAttribute<Fornecedor, String> forNomeFantasia;

}