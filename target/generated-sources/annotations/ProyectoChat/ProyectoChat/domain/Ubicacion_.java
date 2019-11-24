package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.UbicacionPK;
import ProyectoChat.ProyectoChat.domain.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:46:53")
@StaticMetamodel(Ubicacion.class)
public class Ubicacion_ { 

    public static volatile SingularAttribute<Ubicacion, String> latitud;
    public static volatile SingularAttribute<Ubicacion, String> longitud;
    public static volatile SingularAttribute<Ubicacion, String> calle;
    public static volatile SingularAttribute<Ubicacion, UbicacionPK> ubicacionPK;
    public static volatile SingularAttribute<Ubicacion, Usuario> usuario;

}