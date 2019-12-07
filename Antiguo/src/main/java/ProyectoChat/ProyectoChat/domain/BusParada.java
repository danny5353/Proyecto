/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
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
    @NamedQuery(name = "BusParada.findByIdBuspar", query = "SELECT b FROM BusParada b WHERE b.idBuspar = :idBuspar")})
public class BusParada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_buspar")
    private Integer idBuspar;
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
        return "ProyectoChat.ProyectoChat.domain.BusParada[ idBuspar=" + idBuspar + " ]";
    }
    
}
