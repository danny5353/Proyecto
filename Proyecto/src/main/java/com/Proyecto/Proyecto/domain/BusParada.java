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
@Table(name = "bus_parada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BusParada.findAll", query = "SELECT b FROM BusParada b"),
    @NamedQuery(name = "BusParada.findByIdBuspar", query = "SELECT b FROM BusParada b WHERE b.idBuspar = :idBuspar"),
    @NamedQuery(name = "BusParada.findByEstado", query = "SELECT b FROM BusParada b WHERE b.estado = :estado"),
    @NamedQuery(name = "BusParada.findByHora", query = "SELECT b FROM BusParada b WHERE b.hora = :hora"),
    @NamedQuery(name = "BusParada.findByFecha", query = "SELECT b FROM BusParada b WHERE b.fecha = :fecha"),
    @NamedQuery(name = "BusParada.findByTxUser", query = "SELECT b FROM BusParada b WHERE b.txUser = :txUser"),
    @NamedQuery(name = "BusParada.findByTxHost", query = "SELECT b FROM BusParada b WHERE b.txHost = :txHost"),
    @NamedQuery(name = "BusParada.findByTxDate", query = "SELECT b FROM BusParada b WHERE b.txDate = :txDate")})
public class BusParada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_buspar")
    private Integer idBuspar;
    @Size(max = 200)
    @Column(name = "estado")
    private String estado;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bus idBus;
    @JoinColumn(name = "id_parada", referencedColumnName = "id_parada")
    @ManyToOne(fetch = FetchType.LAZY)
    private Parada idParada;

    public BusParada() {
    }

    public BusParada(Integer idBuspar) {
        this.idBuspar = idBuspar;
    }

    public Integer getIdBuspar() {
        return idBuspar;
    }

    public void setIdBuspar(Integer idBuspar) {
        this.idBuspar = idBuspar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Bus getIdBus() {
        return idBus;
    }

    public void setIdBus(Bus idBus) {
        this.idBus = idBus;
    }

    public Parada getIdParada() {
        return idParada;
    }

    public void setIdParada(Parada idParada) {
        this.idParada = idParada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuspar != null ? idBuspar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusParada)) {
            return false;
        }
        BusParada other = (BusParada) object;
        if ((this.idBuspar == null && other.idBuspar != null) || (this.idBuspar != null && !this.idBuspar.equals(other.idBuspar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.BusParada[ idBuspar=" + idBuspar + " ]";
    }
    
}
