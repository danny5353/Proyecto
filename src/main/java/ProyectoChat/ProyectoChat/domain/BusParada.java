/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @NamedQuery(name = "BusParada.findByIdBuspar", query = "SELECT b FROM BusParada b WHERE b.busParadaPK.idBuspar = :idBuspar"),
    @NamedQuery(name = "BusParada.findByIdBus", query = "SELECT b FROM BusParada b WHERE b.busParadaPK.idBus = :idBus"),
    @NamedQuery(name = "BusParada.findByIdParada", query = "SELECT b FROM BusParada b WHERE b.busParadaPK.idParada = :idParada")})
public class BusParada implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BusParadaPK busParadaPK;
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Bus bus;
    @JoinColumn(name = "id_parada", referencedColumnName = "id_parada", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Parada parada;

    public BusParada() {
    }

    public BusParada(BusParadaPK busParadaPK) {
        this.busParadaPK = busParadaPK;
    }

    public BusParada(int idBuspar, int idBus, int idParada) {
        this.busParadaPK = new BusParadaPK(idBuspar, idBus, idParada);
    }

    public BusParadaPK getBusParadaPK() {
        return busParadaPK;
    }

    public void setBusParadaPK(BusParadaPK busParadaPK) {
        this.busParadaPK = busParadaPK;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busParadaPK != null ? busParadaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusParada)) {
            return false;
        }
        BusParada other = (BusParada) object;
        if ((this.busParadaPK == null && other.busParadaPK != null) || (this.busParadaPK != null && !this.busParadaPK.equals(other.busParadaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.BusParada[ busParadaPK=" + busParadaPK + " ]";
    }
    
}
