package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.InformacionPK;
import ProyectoChat.ProyectoChat.domain.TipoInformacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:46:53")
@StaticMetamodel(Informacion.class)
public class Informacion_ { 

    public static volatile SingularAttribute<Informacion, Date> fecha;
    public static volatile SingularAttribute<Informacion, InformacionPK> informacionPK;
    public static volatile SingularAttribute<Informacion, String> informacion;
    public static volatile SingularAttribute<Informacion, String> imagen;
    public static volatile SingularAttribute<Informacion, TipoInformacion> tipoInformacion;

}