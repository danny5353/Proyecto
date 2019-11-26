package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:41:20")
@StaticMetamodel(Ubicacion.class)
public class Ubicacion_ { 

    public static volatile SingularAttribute<Ubicacion, String> latitud;
    public static volatile SingularAttribute<Ubicacion, String> longitud;
    public static volatile SingularAttribute<Ubicacion, String> txHost;
    public static volatile SingularAttribute<Ubicacion, String> calle;
    public static volatile SingularAttribute<Ubicacion, Usuario> idUsuario;
    public static volatile SingularAttribute<Ubicacion, Integer> idUbicacion;
    public static volatile SingularAttribute<Ubicacion, String> txUser;
    public static volatile SingularAttribute<Ubicacion, Date> txDate;

}