package ProyectoChat.ProyectoChat.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-24T01:11:29")
@StaticMetamodel(Tarifa.class)
public class Tarifa_ { 

    public static volatile SingularAttribute<Tarifa, String> tarifa;
    public static volatile SingularAttribute<Tarifa, Integer> idTarifa;
    public static volatile SingularAttribute<Tarifa, BigDecimal> precioNocturno;
    public static volatile SingularAttribute<Tarifa, BigDecimal> precioDiurno;

}