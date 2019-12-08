/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto.Proyecto.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "user_bot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserBot.findAll", query = "SELECT u FROM UserBot u"),
    @NamedQuery(name = "UserBot.findByIdUserbot", query = "SELECT u FROM UserBot u WHERE u.idUserbot = :idUserbot"),
    @NamedQuery(name = "UserBot.findByBotuserid", query = "SELECT u FROM UserBot u WHERE u.botuserid = :botuserid"),
    @NamedQuery(name = "UserBot.findByTxUser", query = "SELECT u FROM UserBot u WHERE u.txUser = :txUser"),
    @NamedQuery(name = "UserBot.findByTxHost", query = "SELECT u FROM UserBot u WHERE u.txHost = :txHost"),
    @NamedQuery(name = "UserBot.findByTxDate", query = "SELECT u FROM UserBot u WHERE u.txDate = :txDate")})
public class UserBot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_userbot")
    private Integer idUserbot;
    @Size(max = 100)
    @Column(name = "botuserid")
    private String botuserid;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuario;
    @OneToMany(mappedBy = "idUserbot", fetch = FetchType.LAZY)
    private List<Chat> chatList;

    public UserBot() {
    }

    public UserBot(Integer idUserbot) {
        this.idUserbot = idUserbot;
    }

    public Integer getIdUserbot() {
        return idUserbot;
    }

    public void setIdUserbot(Integer idUserbot) {
        this.idUserbot = idUserbot;
    }

    public String getBotuserid() {
        return botuserid;
    }

    public void setBotuserid(String botuserid) {
        this.botuserid = botuserid;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<Chat> getChatList() {
        return chatList;
    }

    public void setChatList(List<Chat> chatList) {
        this.chatList = chatList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserbot != null ? idUserbot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserBot)) {
            return false;
        }
        UserBot other = (UserBot) object;
        if ((this.idUserbot == null && other.idUserbot != null) || (this.idUserbot != null && !this.idUserbot.equals(other.idUserbot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.UserBot[ idUserbot=" + idUserbot + " ]";
    }
    
}
