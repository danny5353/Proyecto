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
public class ParadaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_parada")
    private int idParada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ruta")
    private int idRuta;

    public ParadaPK() {
    }

    public ParadaPK(int idParada, int idRuta) {
        this.idParada = idParada;
        this.idRuta = idRuta;
    }

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idParada;
        hash += (int) idRuta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParadaPK)) {
            return false;
        }
        ParadaPK other = (ParadaPK) object;
        if (this.idParada != other.idParada) {
            return false;
        }
        if (this.idRuta != other.idRuta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.ParadaPK[ idParada=" + idParada + ", idRuta=" + idRuta + " ]";
    }
    
}
