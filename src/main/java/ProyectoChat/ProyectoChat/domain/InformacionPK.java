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
public class InformacionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_informacion")
    private int idInformacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipoi")
    private int idTipoi;

    public InformacionPK() {
    }

    public InformacionPK(int idInformacion, int idTipoi) {
        this.idInformacion = idInformacion;
        this.idTipoi = idTipoi;
    }

    public int getIdInformacion() {
        return idInformacion;
    }

    public void setIdInformacion(int idInformacion) {
        this.idInformacion = idInformacion;
    }

    public int getIdTipoi() {
        return idTipoi;
    }

    public void setIdTipoi(int idTipoi) {
        this.idTipoi = idTipoi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idInformacion;
        hash += (int) idTipoi;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionPK)) {
            return false;
        }
        InformacionPK other = (InformacionPK) object;
        if (this.idInformacion != other.idInformacion) {
            return false;
        }
        if (this.idTipoi != other.idTipoi) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.InformacionPK[ idInformacion=" + idInformacion + ", idTipoi=" + idTipoi + " ]";
    }
    
}
