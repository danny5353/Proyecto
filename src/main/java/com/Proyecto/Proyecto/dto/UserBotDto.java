package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Chat;
import com.Proyecto.Proyecto.domain.UserBot;
import com.Proyecto.Proyecto.domain.Usuario;

import java.util.List;

public class UserBotDto {

    private static final long serialVersionUID = 1L;
    private Integer idUserbot;
    private String botuserid;
    private Usuario idUsuario;
    private List<Chat> chatList;

        public UserBotDto (){}

        public UserBotDto (UserBot userbot)
        {
            this.idUserbot = userbot.getIdUserbot();
            this.botuserid = userbot.getBotuserid();
            this.chatList = userbot.getChatList();
            this.idUsuario = userbot.getIdUsuario();
            this.chatList = userbot.getChatList();
        }

    }
