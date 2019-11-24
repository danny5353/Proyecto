/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "ubicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubicacion.findAll", query = "SELECT u FROM Ubicacion u"),
    @NamedQuery(name = "Ubicacion.findByIdUbicacion", query = "SELECT u FROM Ubicacion u WHERE u.ubicacionPK.idUbicacion = :idUbicacion"),
    @NamedQuery(name = "Ubicacion.findByLatitud", query = "SELECT u FROM Ubicacion u WHERE u.latitud = :latitud"),
    @NamedQuery(name = "Ubicacion.findByLongitud", query = "SELECT u FROM Ubicacion u WHERE u.longitud = :longitud"),
    @NamedQuery(name = "Ubicacion.findByCalle", query = "SELECT u FROM Ubicacion u WHERE u.calle = :calle"),
    @NamedQuery(name = "Ubicacion.findByIdUsuario", query = "SELECT u FROM Ubicacion u WHERE u.ubicacionPK.idUsuario = :idUsuario")})
public class Ubicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UbicacionPK ubicacionPK;
    @Size(max = 500)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 500)
    @Column(name = "longitud")
    private String longitud;
    @Size(max = 500)
    @Column(name = "calle")
    private String calle;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Ubicacion() {
    }

    public Ubicacion(UbicacionPK ubicacionPK) {
        this.ubicacionPK = ubicacionPK;
    }

    public Ubicacion(int idUbicacion, int idUsuario) {
        this.ubicacionPK = new UbicacionPK(idUbicacion, idUsuario);
    }

    public UbicacionPK getUbicacionPK() {
        return ubicacionPK;
    }

    public void setUbicacionPK(UbicacionPK ubicacionPK) {
        this.ubicacionPK = ubicacionPK;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubicacionPK != null ? ubicacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubicacion)) {
            return false;
        }
        Ubicacion other = (Ubicacion) object;
        if ((this.ubicacionPK == null && other.ubicacionPK != null) || (this.ubicacionPK != null && !this.ubicacionPK.equals(other.ubicacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.Ubicacion[ ubicacionPK=" + ubicacionPK + " ]";
    }
    
}
