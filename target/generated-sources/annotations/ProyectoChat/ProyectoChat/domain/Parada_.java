package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.BusParada;
import ProyectoChat.ProyectoChat.domain.ParadaPK;
import ProyectoChat.ProyectoChat.domain.Ruta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:11:29")
@StaticMetamodel(Parada.class)
public class Parada_ { 

    public static volatile SingularAttribute<Parada, Integer> viajSuben;
    public static volatile SingularAttribute<Parada, String> latitud;
    public static volatile SingularAttribute<Parada, String> longitud;
    public static volatile ListAttribute<Parada, BusParada> busParadaList;
    public static volatile SingularAttribute<Parada, Ruta> ruta;
    public static volatile SingularAttribute<Parada, ParadaPK> paradaPK;
    public static volatile SingularAttribute<Parada, String> calle;
    public static volatile SingularAttribute<Parada, Integer> viajBajan;

}