/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto.Proyecto.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "chat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chat.findAll", query = "SELECT c FROM Chat c"),
    @NamedQuery(name = "Chat.findByIdChat", query = "SELECT c FROM Chat c WHERE c.idChat = :idChat"),
    @NamedQuery(name = "Chat.findByInMessage", query = "SELECT c FROM Chat c WHERE c.inMessage = :inMessage"),
    @NamedQuery(name = "Chat.findByOutMessage", query = "SELECT c FROM Chat c WHERE c.outMessage = :outMessage"),
    @NamedQuery(name = "Chat.findByMsgDate", query = "SELECT c FROM Chat c WHERE c.msgDate = :msgDate"),
    @NamedQuery(name = "Chat.findByTxUser", query = "SELECT c FROM Chat c WHERE c.txUser = :txUser"),
    @NamedQuery(name = "Chat.findByTxHost", query = "SELECT c FROM Chat c WHERE c.txHost = :txHost"),
    @NamedQuery(name = "Chat.findByTxDate", query = "SELECT c FROM Chat c WHERE c.txDate = :txDate")})
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_chat")
    private Integer idChat;
    @Size(max = 200)
    @Column(name = "in_message")
    private String inMessage;
    @Size(max = 200)
    @Column(name = "out_message")
    private String outMessage;
    @Column(name = "msg_date")
    @Temporal(TemporalType.DATE)
    private Date msgDate;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;
    @JoinColumn(name = "id_userbot", referencedColumnName = "id_userbot")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserBot idUserbot;

    public Chat() {
    }

    public Chat(Integer idChat) {
        this.idChat = idChat;
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

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public UserBot getIdUserbot() {
        return idUserbot;
    }

    public void setIdUserbot(UserBot idUserbot) {
        this.idUserbot = idUserbot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChat != null ? idChat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chat)) {
            return false;
        }
        Chat other = (Chat) object;
        if ((this.idChat == null && other.idChat != null) || (this.idChat != null && !this.idChat.equals(other.idChat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.Chat[ idChat=" + idChat + " ]";
    }
    
}
