package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Parada;
import ProyectoChat.ProyectoChat.domain.Url;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:41:20")
@StaticMetamodel(Ruta.class)
public class Ruta_ { 

    public static volatile SingularAttribute<Ruta, Url> idVideo;
    public static volatile SingularAttribute<Ruta, Url> idPdf;
    public static volatile SingularAttribute<Ruta, String> txHost;
    public static volatile SingularAttribute<Ruta, String> inicio;
    public static volatile SingularAttribute<Ruta, String> fin;
    public static volatile SingularAttribute<Ruta, String> txUser;
    public static volatile ListAttribute<Ruta, Parada> paradaList;
    public static volatile SingularAttribute<Ruta, Integer> idRuta;
    public static volatile SingularAttribute<Ruta, Date> txDate;

}