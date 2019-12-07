package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Chat;
import ProyectoChat.ProyectoChat.domain.Ubicacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:41:20")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> txHost;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile ListAttribute<Usuario, Ubicacion> ubicacionList;
    public static volatile SingularAttribute<Usuario, String> txUser;
    public static volatile SingularAttribute<Usuario, Integer> telefono;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Date> txDate;
    public static volatile ListAttribute<Usuario, Chat> chatList;

}