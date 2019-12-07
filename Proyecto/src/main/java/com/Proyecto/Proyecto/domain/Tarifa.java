/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto.Proyecto.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tarifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarifa.findAll", query = "SELECT t FROM Tarifa t"),
    @NamedQuery(name = "Tarifa.findByIdTarifa", query = "SELECT t FROM Tarifa t WHERE t.idTarifa = :idTarifa"),
    @NamedQuery(name = "Tarifa.findByTarifa", query = "SELECT t FROM Tarifa t WHERE t.tarifa = :tarifa"),
    @NamedQuery(name = "Tarifa.findByPrecioDiurno", query = "SELECT t FROM Tarifa t WHERE t.precioDiurno = :precioDiurno"),
    @NamedQuery(name = "Tarifa.findByPrecioNocturno", query = "SELECT t FROM Tarifa t WHERE t.precioNocturno = :precioNocturno"),
    @NamedQuery(name = "Tarifa.findByTxUser", query = "SELECT t FROM Tarifa t WHERE t.txUser = :txUser"),
    @NamedQuery(name = "Tarifa.findByTxHost", query = "SELECT t FROM Tarifa t WHERE t.txHost = :txHost"),
    @NamedQuery(name = "Tarifa.findByTxDate", query = "SELECT t FROM Tarifa t WHERE t.txDate = :txDate")})
public class Tarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarifa")
    private Integer idTarifa;
    @Size(max = 50)
    @Column(name = "tarifa")
    private String tarifa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_diurno")
    private BigDecimal precioDiurno;
    @Column(name = "precio_nocturno")
    private BigDecimal precioNocturno;
    @Size(max = 50)
    @Column(name = "tx_user")
    private String txUser;
    @Size(max = 100)
    @Column(name = "tx_host")
    private String txHost;
    @Column(name = "tx_date")
    @Temporal(TemporalType.DATE)
    private Date txDate;

    public Tarifa() {
    }

    public Tarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getPrecioDiurno() {
        return precioDiurno;
    }

    public void setPrecioDiurno(BigDecimal precioDiurno) {
        this.precioDiurno = precioDiurno;
    }

    public BigDecimal getPrecioNocturno() {
        return precioNocturno;
    }

    public void setPrecioNocturno(BigDecimal precioNocturno) {
        this.precioNocturno = precioNocturno;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarifa != null ? idTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifa)) {
            return false;
        }
        Tarifa other = (Tarifa) object;
        if ((this.idTarifa == null && other.idTarifa != null) || (this.idTarifa != null && !this.idTarifa.equals(other.idTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.Tarifa[ idTarifa=" + idTarifa + " ]";
    }
    
}
