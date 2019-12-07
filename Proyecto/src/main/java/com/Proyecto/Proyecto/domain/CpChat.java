package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "chat", schema = "prueba", catalog = "")
public class CpChat {
    private int idChat;
    private String inMessage;
    private String outMessage;
    private Date msgDate;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_chat")
    public int getIdChat() {
        return idChat;
    }

    public void setIdChat(int idChat) {
        this.idChat = idChat;
    }

    @Basic
    @Column(name = "in_message")
    public String getInMessage() {
        return inMessage;
    }

    public void setInMessage(String inMessage) {
        this.inMessage = inMessage;
    }

    @Basic
    @Column(name = "out_message")
    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }

    @Basic
    @Column(name = "msg_date")
    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    @Basic
    @Column(name = "tx_user")
    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    @Basic
    @Column(name = "tx_host")
    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    @Basic
    @Column(name = "tx_date")
    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CpChat cpChat = (CpChat) o;
        return idChat == cpChat.idChat &&
                Objects.equals(inMessage, cpChat.inMessage) &&
                Objects.equals(outMessage, cpChat.outMessage) &&
                Objects.equals(msgDate, cpChat.msgDate) &&
                Objects.equals(txUser, cpChat.txUser) &&
                Objects.equals(txHost, cpChat.txHost) &&
                Objects.equals(txDate, cpChat.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChat, inMessage, outMessage, msgDate, txUser, txHost, txDate);
    }
}
