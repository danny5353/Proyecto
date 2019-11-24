/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author macbookpro
 */
@Embeddable
public class BusParadaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_buspar")
    private int idBuspar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_bus")
    private int idBus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_parada")
    private int idParada;

    public BusParadaPK() {
    }

    public BusParadaPK(int idBuspar, int idBus, int idParada) {
        this.idBuspar = idBuspar;
        this.idBus = idBus;
        this.idParada = idParada;
    }

    public int getIdBuspar() {
        return idBuspar;
    }

    public void setIdBuspar(int idBuspar) {
        this.idBuspar = idBuspar;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idBuspar;
        hash += (int) idBus;
        hash += (int) idParada;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusParadaPK)) {
            return false;
        }
        BusParadaPK other = (BusParadaPK) object;
        if (this.idBuspar != other.idBuspar) {
            return false;
        }
        if (this.idBus != other.idBus) {
            return false;
        }
        if (this.idParada != other.idParada) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.BusParadaPK[ idBuspar=" + idBuspar + ", idBus=" + idBus + ", idParada=" + idParada + " ]";
    }
    
}
