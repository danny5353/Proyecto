package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Bus;
import ProyectoChat.ProyectoChat.domain.Parada;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:41:20")
@StaticMetamodel(BusParada.class)
public class BusParada_ { 

    public static volatile SingularAttribute<BusParada, Parada> idParada;
    public static volatile SingularAttribute<BusParada, Bus> idBus;
    public static volatile SingularAttribute<BusParada, Integer> idBuspar;

}