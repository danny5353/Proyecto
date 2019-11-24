/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
    @NamedQuery(name = "TipoInformacion.findByInformacion", query = "SELECT t FROM TipoInformacion t WHERE t.informacion = :informacion")})
public class TipoInformacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipoi")
    private Integer idTipoi;
    @Size(max = 50)
    @Column(name = "informacion")
    private String informacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoInformacion", fetch = FetchType.LAZY)
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

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
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
        return "ProyectoChat.ProyectoChat.domain.TipoInformacion[ idTipoi=" + idTipoi + " ]";
    }
    
}
