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
@Table(name = "parada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parada.findAll", query = "SELECT p FROM Parada p"),
    @NamedQuery(name = "Parada.findByIdParada", query = "SELECT p FROM Parada p WHERE p.idParada = :idParada"),
    @NamedQuery(name = "Parada.findByLatitud", query = "SELECT p FROM Parada p WHERE p.latitud = :latitud"),
    @NamedQuery(name = "Parada.findByLongitud", query = "SELECT p FROM Parada p WHERE p.longitud = :longitud"),
    @NamedQuery(name = "Parada.findByCalle", query = "SELECT p FROM Parada p WHERE p.calle = :calle"),
    @NamedQuery(name = "Parada.findByTxUser", query = "SELECT p FROM Parada p WHERE p.txUser = :txUser"),
    @NamedQuery(name = "Parada.findByTxHost", query = "SELECT p FROM Parada p WHERE p.txHost = :txHost"),
    @NamedQuery(name = "Parada.findByTxDate", query = "SELECT p FROM Parada p WHERE p.txDate = :txDate")})
public class Parada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parada")
    private Integer idParada;
    @Size(max = 500)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 500)
    @Column(name = "longitud")
    private String longitud;
    @Size(max = 500)
    @Column(name = "calle")
    private String calle;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;
    @JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ruta idRuta;
    @OneToMany(mappedBy = "idParada", fetch = FetchType.LAZY)
    private List<BusParada> busParadaList;

    public Parada() {
    }

    public Parada(Integer idParada) {
        this.idParada = idParada;
    }

    public Integer getIdParada() {
        return idParada;
    }

    public void setIdParada(Integer idParada) {
        this.idParada = idParada;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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

    public Ruta getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Ruta idRuta) {
        this.idRuta = idRuta;
    }

    @XmlTransient
    public List<BusParada> getBusParadaList() {
        return busParadaList;
    }

    public void setBusParadaList(List<BusParada> busParadaList) {
        this.busParadaList = busParadaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParada != null ? idParada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parada)) {
            return false;
        }
        Parada other = (Parada) object;
        if ((this.idParada == null && other.idParada != null) || (this.idParada != null && !this.idParada.equals(other.idParada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.Parada[ idParada=" + idParada + " ]";
    }
    
}
