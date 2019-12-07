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
@Table(name = "tipo_informacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInformacion.findAll", query = "SELECT t FROM TipoInformacion t"),
    @NamedQuery(name = "TipoInformacion.findByIdTipoi", query = "SELECT t FROM TipoInformacion t WHERE t.idTipoi = :idTipoi"),
    @NamedQuery(name = "TipoInformacion.findByTipo", query = "SELECT t FROM TipoInformacion t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "TipoInformacion.findByTxUser", query = "SELECT t FROM TipoInformacion t WHERE t.txUser = :txUser"),
    @NamedQuery(name = "TipoInformacion.findByTxHost", query = "SELECT t FROM TipoInformacion t WHERE t.txHost = :txHost"),
    @NamedQuery(name = "TipoInformacion.findByTxDate", query = "SELECT t FROM TipoInformacion t WHERE t.txDate = :txDate")})
public class TipoInformacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoi")
    private Integer idTipoi;
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
    @OneToMany(mappedBy = "idTipoi", fetch = FetchType.LAZY)
    private List<Informacion> informacionList;

    public TipoInformacion() {
    }

    public TipoInformacion(Integer idTipoi) {
        this.idTipoi = idTipoi;
    }

    public Integer getIdTipoi() {
        return idTipoi;
    }

    public void setIdTipoi(Integer idTipoi) {
        this.idTipoi = idTipoi;
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
    public List<Informacion> getInformacionList() {
        return informacionList;
    }

    public void setInformacionList(List<Informacion> informacionList) {
        this.informacionList = informacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoi != null ? idTipoi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoInformacion)) {
            return false;
        }
        TipoInformacion other = (TipoInformacion) object;
        if ((this.idTipoi == null && other.idTipoi != null) || (this.idTipoi != null && !this.idTipoi.equals(other.idTipoi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proyecto.Proyecto.domain.TipoInformacion[ idTipoi=" + idTipoi + " ]";
    }
    
}
