package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Ruta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:11:29")
@StaticMetamodel(Url.class)
public class Url_ { 

    public static volatile SingularAttribute<Url, Integer> idUrl;
    public static volatile ListAttribute<Url, Ruta> rutaList;
    public static volatile SingularAttribute<Url, String> nombre;
    public static volatile SingularAttribute<Url, String> url;
    public static volatile ListAttribute<Url, Ruta> rutaList1;

}