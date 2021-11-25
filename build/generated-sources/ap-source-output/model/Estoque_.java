package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Estoque.class)
public class Estoque_ { 

    public static volatile SingularAttribute<Estoque, Integer> estQuantEntSai;
    public static volatile SingularAttribute<Estoque, Integer> idEstoque;
    public static volatile SingularAttribute<Estoque, Produto> produto;
    public static volatile SingularAttribute<Estoque, String> estMotivoEntSai;
    public static volatile SingularAttribute<Estoque, Date> estDataEntSai;
    public static volatile SingularAttribute<Estoque, Usuario> usuario;

}