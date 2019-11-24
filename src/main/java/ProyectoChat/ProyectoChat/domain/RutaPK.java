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
public class RutaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ruta")
    private int idRuta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pdf")
    private int idPdf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_video")
    private int idVideo;

    public RutaPK() {
    }

    public RutaPK(int idRuta, int idPdf, int idVideo) {
        this.idRuta = idRuta;
        this.idPdf = idPdf;
        this.idVideo = idVideo;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdPdf() {
        return idPdf;
    }

    public void setIdPdf(int idPdf) {
        this.idPdf = idPdf;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRuta;
        hash += (int) idPdf;
        hash += (int) idVideo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RutaPK)) {
            return false;
        }
        RutaPK other = (RutaPK) object;
        if (this.idRuta != other.idRuta) {
            return false;
        }
        if (this.idPdf != other.idPdf) {
            return false;
        }
        if (this.idVideo != other.idVideo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.RutaPK[ idRuta=" + idRuta + ", idPdf=" + idPdf + ", idVideo=" + idVideo + " ]";
    }
    
}
