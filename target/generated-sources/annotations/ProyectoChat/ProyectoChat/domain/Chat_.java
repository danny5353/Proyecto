package ProyectoChat.ProyectoChat.domain;

import ProyectoChat.ProyectoChat.domain.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:41:20")
@StaticMetamodel(Chat.class)
public class Chat_ { 

    public static volatile SingularAttribute<Chat, String> outMessage;
    public static volatile SingularAttribute<Chat, String> txHost;
    public static volatile SingularAttribute<Chat, String> inMessage;
    public static volatile SingularAttribute<Chat, Usuario> idUsuario;
    public static volatile SingularAttribute<Chat, String> txUser;
    public static volatile SingularAttribute<Chat, Integer> idChat;
    public static volatile SingularAttribute<Chat, Date> msgDate;
    public static volatile SingularAttribute<Chat, Date> txDate;

}