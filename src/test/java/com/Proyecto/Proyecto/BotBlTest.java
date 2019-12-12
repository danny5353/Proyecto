package com.Proyecto.Proyecto;

import com.Proyecto.Proyecto.bl.BotBl;
import com.Proyecto.Proyecto.dao.ChatRepository;
import com.Proyecto.Proyecto.dao.UserBotRepository;
import com.Proyecto.Proyecto.dao.UsuarioRepository;
import com.Proyecto.Proyecto.domain.Chat;
import com.Proyecto.Proyecto.domain.Usuario;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;


public class BotBlTest {
    @Test
    void testProcessUpdateExistingUsuario() {
        Usuario usuario = Mockito.mock(Usuario.class);
        Mockito.doReturn(7891).when(usuario).getIdUsuario();
        Mockito.doReturn("Flavia").when(usuario).getNombre();
        Mockito.doReturn("Salazar").when(usuario).getApellido();

      /*Message message = Mockito.mock(Message.class);
        Mockito.doReturn(usuario).when(message).getFrom();
        Mockito.doReturn("Hola").when(message).getText();
        Mockito.doReturn(123456L).when(message).getChatId();
        Update update = Mockito.mock(Update.class);
        Mockito.doReturn(message).when(update).getMessage();*/
    }


  /*  // Simulando aceso a base de datos CpPersonRepository
    UsuarioRepository UsuarioRepository  = Mockito.mock(UsuarioRepository.class);

    // Simulando aceso a base de datos CpPersonRepository
    Chat Chat = Mockito.mock(Chat.class);
		Mockito.doReturn("4").when(Chat).getOutMessage();
    ChatRepository ChatRepository = Mockito.mock(ChatRepository.class);
		Mockito.doReturn(Chat).when(ChatRepository).findLastChatByUserId(1);


    //PRUEBA UNITARIA
        BotBl botBl = new BotBl(UserBotRepository,UsuarioRepository,ChatRepository);
    List<String> result = botBl.processUpdate(update);
    assertNotNull(result);
    assertEquals(result.size() , 1);
    assertEquals(result.get(0) , "5");
*/}

