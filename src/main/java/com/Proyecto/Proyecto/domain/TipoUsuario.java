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
@Table(name = "tipo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t"),
    @NamedQuery(name = "TipoUsuario.findByIdTipou", query = "SELECT t FROM TipoUsuario t WHERE t.idTipou = :idTipou"),
    @NamedQuery(name = "TipoUsuario.findByTipo", query = "SELECT t FROM TipoUsuario t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "TipoUsuario.findByTxUser", query = "SELECT t FROM TipoUsuario t WHERE t.txUser = :txUser"),
    @NamedQuery(name = "TipoUsuario.findByTxHost", query = "SELECT t FROM TipoUsuario t WHERE t.txHost = :txHost"),
    @NamedQuery(name = "TipoUsuario.findByTxDate", query = "SELECT t FROM TipoUsuario t WHERE t.txDate = :txDate")})
public class TipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipou")
    private Integer idTipou;
    @Size(max = 50)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;
    @OneToMany(mappedBy = "idTipou", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer idTipou) {
        this.idTipou = idTipou;
    }

    public Integer getIdTipou() {
        return idTipou;
    }

    public void setIdTipou(Integer idTipou) {
        this.idTipou = idTipou;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipou != null ? idTipou.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.idTipou == null && other.idTipou != null) || (this.idTipou != null && !this.idTipou.equals(other.idTipou))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.TipoUsuario[ idTipou=" + idTipou + " ]";
    }
    
}
