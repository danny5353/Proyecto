package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.BusParada;
import ProyectoChat.ProyectoChat.domain.Ruta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:41:20")
@StaticMetamodel(Parada.class)
public class Parada_ { 

    public static volatile SingularAttribute<Parada, Integer> viajSuben;
    public static volatile SingularAttribute<Parada, Integer> idParada;
    public static volatile SingularAttribute<Parada, String> latitud;
    public static volatile SingularAttribute<Parada, String> longitud;
    public static volatile SingularAttribute<Parada, String> txHost;
    public static volatile ListAttribute<Parada, BusParada> busParadaList;
    public static volatile SingularAttribute<Parada, String> calle;
    public static volatile SingularAttribute<Parada, Integer> viajBajan;
    public static volatile SingularAttribute<Parada, String> txUser;
    public static volatile SingularAttribute<Parada, Ruta> idRuta;
    public static volatile SingularAttribute<Parada, Date> txDate;

}