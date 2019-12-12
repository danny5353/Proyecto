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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;


public class BotBlTest {
    @Test
    void testProcessUpdateExistingUsuario() {
        Usuario usuario = Mockito.mock(Usuario.class);
        Mockito.doReturn(7891).when(usuario).getIdUsuario();
        Mockito.doReturn("Flavia").when(usuario).getNombre();
        Mockito.doReturn("Salazar").when(usuario).getApellido();
    }
}

