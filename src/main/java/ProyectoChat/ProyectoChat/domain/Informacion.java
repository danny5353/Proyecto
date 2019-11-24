/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "informacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informacion.findAll", query = "SELECT i FROM Informacion i"),
    @NamedQuery(name = "Informacion.findByIdInformacion", query = "SELECT i FROM Informacion i WHERE i.informacionPK.idInformacion = :idInformacion"),
    @NamedQuery(name = "Informacion.findByInformacion", query = "SELECT i FROM Informacion i WHERE i.informacion = :informacion"),
    @NamedQuery(name = "Informacion.findByFecha", query = "SELECT i FROM Informacion i WHERE i.fecha = :fecha"),
    @NamedQuery(name = "Informacion.findByImagen", query = "SELECT i FROM Informacion i WHERE i.imagen = :imagen"),
    @NamedQuery(name = "Informacion.findByIdTipoi", query = "SELECT i FROM Informacion i WHERE i.informacionPK.idTipoi = :idTipoi")})
public class Informacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InformacionPK informacionPK;
    @Size(max = 3500)
    @Column(name = "informacion")
    private String informacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 500)
    @Column(name = "imagen")
    private String imagen;
    @JoinColumn(name = "id_tipoi", referencedColumnName = "id_tipoi", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoInformacion tipoInformacion;

    public Informacion() {
    }

    public Informacion(InformacionPK informacionPK) {
        this.informacionPK = informacionPK;
    }

    public Informacion(int idInformacion, int idTipoi) {
        this.informacionPK = new InformacionPK(idInformacion, idTipoi);
    }

    public InformacionPK getInformacionPK() {
        return informacionPK;
    }

    public void setInformacionPK(InformacionPK informacionPK) {
        this.informacionPK = informacionPK;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public TipoInformacion getTipoInformacion() {
        return tipoInformacion;
    }

    public void setTipoInformacion(TipoInformacion tipoInformacion) {
        this.tipoInformacion = tipoInformacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (informacionPK != null ? informacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informacion)) {
            return false;
        }
        Informacion other = (Informacion) object;
        if ((this.informacionPK == null && other.informacionPK != null) || (this.informacionPK != null && !this.informacionPK.equals(other.informacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.Informacion[ informacionPK=" + informacionPK + " ]";
    }
    
}
