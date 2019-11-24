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
@Table(name = "url")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Url.findAll", query = "SELECT u FROM Url u"),
    @NamedQuery(name = "Url.findByIdUrl", query = "SELECT u FROM Url u WHERE u.idUrl = :idUrl"),
    @NamedQuery(name = "Url.findByNombre", query = "SELECT u FROM Url u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Url.findByUrl", query = "SELECT u FROM Url u WHERE u.url = :url")})
public class Url implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_url")
    private Integer idUrl;
    @Size(max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 500)
    @Column(name = "url")
    private String url;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "url")
    private List<Ruta> rutaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "url1")
    private List<Ruta> rutaList1;

    public Url() {
    }

    public Url(Integer idUrl) {
        this.idUrl = idUrl;
    }

    public Integer getIdUrl() {
        return idUrl;
    }

    public void setIdUrl(Integer idUrl) {
        this.idUrl = idUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public List<Ruta> getRutaList() {
        return rutaList;
    }

    public void setRutaList(List<Ruta> rutaList) {
        this.rutaList = rutaList;
    }

    @XmlTransient
    public List<Ruta> getRutaList1() {
        return rutaList1;
    }

    public void setRutaList1(List<Ruta> rutaList1) {
        this.rutaList1 = rutaList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUrl != null ? idUrl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Url)) {
            return false;
        }
        Url other = (Url) object;
        if ((this.idUrl == null && other.idUrl != null) || (this.idUrl != null && !this.idUrl.equals(other.idUrl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.Url[ idUrl=" + idUrl + " ]";
    }
    
}
