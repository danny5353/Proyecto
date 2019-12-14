package com.Proyecto.Proyecto.bl;

import com.Proyecto.Proyecto.dao.ChatRepository;
import com.Proyecto.Proyecto.dao.UserBotRepository;
import com.Proyecto.Proyecto.dao.UsuarioRepository;
import com.Proyecto.Proyecto.domain.Chat;
import com.Proyecto.Proyecto.domain.UserBot;
import com.Proyecto.Proyecto.domain.Usuario;
import com.Proyecto.Proyecto.dto.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BotBl {
    private static final Logger LOGGER = LoggerFactory.getLogger(BotBl.class);

    private UsuarioRepository UsuarioRepository;
    private UserBotRepository UserBotRepository;
    private ChatRepository ChatRepository;

    @Autowired
    public BotBl(UsuarioRepository UsuarioRepository, UserBotRepository UserBotRepository, ChatRepository ChatRepository) {
        this.UsuarioRepository = UsuarioRepository;
        this.UserBotRepository = UserBotRepository;
        this.ChatRepository = ChatRepository;
    }

    public List<String>processUpdate(Update update) {
        LOGGER.info("Recibiendo update {} ", update);
        List<String> chatResponse = new ArrayList<>();
        UserBot UserBot = initUserBot(update.getMessage().getFrom());
        continueChatWithUser(update, UserBot, chatResponse);
        return chatResponse;
    }


    private void continueChatWithUser(Update update, UserBot UserBot, List<String> chatResponse) {
        // Obtener el ultimo mensaje que envió el usuario
        Chat lastMessage = ChatRepository.findLastChatByBotUserId(UserBot.getIdUserbot());
        // Preparo la vaiable para retornar la respuesta
        String response = null;
        // Si el ultimo mensaje no existe (es la primera conversación)
        if (lastMessage == null) {
            // Retornamos 1
            LOGGER.info("Primer mensaje del usuario botUserId{}", UserBot.getIdUserbot());
            response = "1";
        } else {
            // Si existe convesasción previa iniciamos la variable del ultimo mensaje en 1
            int lastMessageInt = 0;
            try {
                // Intenemos obtener el ultimo mensaje retornado y lo convertimos a entero.
                // Si la coversin falla en el catch retornamos 1
                lastMessageInt = Integer.parseInt(lastMessage.getOutMessage());
                response = "" + (lastMessageInt + 1);
            } catch (NumberFormatException nfe) {
                response = "1";
            }
        }
        LOGGER.info("PROCESSING IN MESSAGE: {} from user {}" ,update.getMessage().getText(),UserBot.getIdUserbot());
        // Creamos el objeto CpChat con la respuesta a la presente conversación.
        Chat Chat = new Chat();
        Chat.setIdUserbot(UserBot);
        Chat.setInMessage(update.getMessage().getText());
        Chat.setOutMessage(response);
        Chat.setMsgDate(new Date()); //FIXME Obtener la fecha del campo entero update.getMessage().
        Chat.setTxDate(new Date());
        Chat.setTxUser(UserBot.getIdUserbot().toString());
        Chat.setTxHost(update.getMessage().getChatId().toString());
        // Guardamos en base dedatos
        ChatRepository.save(Chat);
        // Agregamos la respuesta al chatResponse.
        chatResponse.add(response);
    }

    private UserBot initUserBot(User userbot) {
        UserBot UserBot = UserBotRepository.findByBotUserId(userbot.getId().toString());
        if (UserBot == null) {
            Usuario Usuario = new Usuario();
            Usuario.setNombre(userbot.getFirstName());
            Usuario.setApellido(userbot.getLastName());
            Usuario.setEstado(Status.ACTIVE.getStatus());
            Usuario.setTxHost("localhost");
            Usuario.setTxUser("admin");
            Usuario.setTxDate(new Date());
            UsuarioRepository.save(Usuario);
            UserBot = new UserBot ();
            UserBot .setIdUserbot(userbot.getId());
            UserBot .setIdUsuario(Usuario);
            UserBot .setTxHost("localhost");
            UserBot .setTxUser("admin");
            UserBot .setTxDate(new Date());
            UserBotRepository.save(UserBot);
        }
        return UserBot;
    }

}