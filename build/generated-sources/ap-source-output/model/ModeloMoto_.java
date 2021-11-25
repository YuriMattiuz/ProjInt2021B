package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MarcaMoto;
import model.ProdutoModMoto;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(ModeloMoto.class)
public class ModeloMoto_ { 

    public static volatile SingularAttribute<ModeloMoto, Integer> idModeloMoto;
    public static volatile CollectionAttribute<ModeloMoto, Veiculo> veiculos;
    public static volatile CollectionAttribute<ModeloMoto, ProdutoModMoto> produtosModMoto;
    public static volatile SingularAttribute<ModeloMoto, String> modModelo;
    public static volatile SingularAttribute<ModeloMoto, MarcaMoto> marcaMoto;

}