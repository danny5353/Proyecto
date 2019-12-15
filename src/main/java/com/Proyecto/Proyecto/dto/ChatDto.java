package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Chat;

import java.util.Date;

public class ChatDto {


    private Integer idChat;
    private String inMessage;
    private String outMessage;
    private Date msgDate;


    public ChatDto() {
    }

    public ChatDto(Chat chat) {
        this.idChat = chat.getIdChat();
        this.inMessage = chat.getInMessage();
        this.outMessage = chat.getOutMessage();
        this.msgDate = chat.getMsgDate();
    }

    public Integer getIdChat() {
        return idChat;
    }

    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }

    public String getInMessage() {
        return inMessage;
    }

    public void setInMessage(String inMessage) {
        this.inMessage = inMessage;
    }

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

}
