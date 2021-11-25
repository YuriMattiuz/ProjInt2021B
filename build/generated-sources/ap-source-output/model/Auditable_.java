package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-05T10:09:29")
@StaticMetamodel(Auditable.class)
public abstract class Auditable_ { 

    public static volatile SingularAttribute<Auditable, Date> dataAtualizado;
    public static volatile SingularAttribute<Auditable, String> idAuditoria;
    public static volatile SingularAttribute<Auditable, Date> dataCriado;
    public static volatile SingularAttribute<Auditable, String> criadoPor;
    public static volatile SingularAttribute<Auditable, String> atualizadoPor;

}