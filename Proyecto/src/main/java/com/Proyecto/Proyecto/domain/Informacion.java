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
@Table(name = "informacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informacion.findAll", query = "SELECT i FROM Informacion i"),
    @NamedQuery(name = "Informacion.findByIdInformacion", query = "SELECT i FROM Informacion i WHERE i.idInformacion = :idInformacion"),
    @NamedQuery(name = "Informacion.findByTexto", query = "SELECT i FROM Informacion i WHERE i.texto = :texto"),
    @NamedQuery(name = "Informacion.findByFecha", query = "SELECT i FROM Informacion i WHERE i.fecha = :fecha"),
    @NamedQuery(name = "Informacion.findByImagen", query = "SELECT i FROM Informacion i WHERE i.imagen = :imagen"),
    @NamedQuery(name = "Informacion.findByTxUser", query = "SELECT i FROM Informacion i WHERE i.txUser = :txUser"),
    @NamedQuery(name = "Informacion.findByTxHost", query = "SELECT i FROM Informacion i WHERE i.txHost = :txHost"),
    @NamedQuery(name = "Informacion.findByTxDate", query = "SELECT i FROM Informacion i WHERE i.txDate = :txDate")})
public class Informacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_informacion")
    private Integer idInformacion;
    @Size(max = 3500)
    @Column(name = "texto")
    private String texto;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 500)
    @Column(name = "imagen")
    private String imagen;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;
    @JoinColumn(name = "id_tipoi", referencedColumnName = "id_tipoi")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoInformacion idTipoi;

    public Informacion() {
    }

    public Informacion(Integer idInformacion) {
        this.idInformacion = idInformacion;
    }

    public Integer getIdInformacion() {
        return idInformacion;
    }

    public void setIdInformacion(Integer idInformacion) {
        this.idInformacion = idInformacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public TipoInformacion getIdTipoi() {
        return idTipoi;
    }

    public void setIdTipoi(TipoInformacion idTipoi) {
        this.idTipoi = idTipoi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformacion != null ? idInformacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informacion)) {
            return false;
        }
        Informacion other = (Informacion) object;
        if ((this.idInformacion == null && other.idInformacion != null) || (this.idInformacion != null && !this.idInformacion.equals(other.idInformacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.Informacion[ idInformacion=" + idInformacion + " ]";
    }
    
}
