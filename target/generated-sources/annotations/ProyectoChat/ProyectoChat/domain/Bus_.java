package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.BusParada;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:46:54")
@StaticMetamodel(Bus.class)
public class Bus_ { 

    public static volatile SingularAttribute<Bus, Integer> idBus;
    public static volatile ListAttribute<Bus, BusParada> busParadaList;
    public static volatile SingularAttribute<Bus, String> anfitrion;
    public static volatile SingularAttribute<Bus, String> conductor;
    public static volatile SingularAttribute<Bus, String> placa;

}