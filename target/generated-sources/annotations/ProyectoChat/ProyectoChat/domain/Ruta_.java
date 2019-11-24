package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Parada;
import ProyectoChat.ProyectoChat.domain.RutaPK;
import ProyectoChat.ProyectoChat.domain.Url;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:11:29")
@StaticMetamodel(Ruta.class)
public class Ruta_ { 

    public static volatile SingularAttribute<Ruta, RutaPK> rutaPK;
    public static volatile SingularAttribute<Ruta, Url> url1;
    public static volatile SingularAttribute<Ruta, String> inicio;
    public static volatile SingularAttribute<Ruta, String> fin;
    public static volatile ListAttribute<Ruta, Parada> paradaList;
    public static volatile SingularAttribute<Ruta, Url> url;

}