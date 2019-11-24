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
public class UbicacionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ubicacion")
    private int idUbicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;

    public UbicacionPK() {
    }

    public UbicacionPK(int idUbicacion, int idUsuario) {
        this.idUbicacion = idUbicacion;
        this.idUsuario = idUsuario;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUbicacion;
        hash += (int) idUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UbicacionPK)) {
            return false;
        }
        UbicacionPK other = (UbicacionPK) object;
        if (this.idUbicacion != other.idUbicacion) {
            return false;
        }
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.UbicacionPK[ idUbicacion=" + idUbicacion + ", idUsuario=" + idUsuario + " ]";
    }
    
}
