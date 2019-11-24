/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "ruta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ruta.findAll", query = "SELECT r FROM Ruta r"),
    @NamedQuery(name = "Ruta.findByIdRuta", query = "SELECT r FROM Ruta r WHERE r.rutaPK.idRuta = :idRuta"),
    @NamedQuery(name = "Ruta.findByInicio", query = "SELECT r FROM Ruta r WHERE r.inicio = :inicio"),
    @NamedQuery(name = "Ruta.findByFin", query = "SELECT r FROM Ruta r WHERE r.fin = :fin"),
    @NamedQuery(name = "Ruta.findByIdPdf", query = "SELECT r FROM Ruta r WHERE r.rutaPK.idPdf = :idPdf"),
    @NamedQuery(name = "Ruta.findByIdVideo", query = "SELECT r FROM Ruta r WHERE r.rutaPK.idVideo = :idVideo")})
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RutaPK rutaPK;
    @Size(max = 200)
    @Column(name = "inicio")
    private String inicio;
    @Size(max = 200)
    @Column(name = "fin")
    private String fin;
    @JoinColumn(name = "id_pdf", referencedColumnName = "id_url", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Url url;
    @JoinColumn(name = "id_video", referencedColumnName = "id_url", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Url url1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ruta", fetch = FetchType.LAZY)
    private List<Parada> paradaList;

    public Ruta() {
    }

    public Ruta(RutaPK rutaPK) {
        this.rutaPK = rutaPK;
    }

    public Ruta(int idRuta, int idPdf, int idVideo) {
        this.rutaPK = new RutaPK(idRuta, idPdf, idVideo);
    }

    public RutaPK getRutaPK() {
        return rutaPK;
    }

    public void setRutaPK(RutaPK rutaPK) {
        this.rutaPK = rutaPK;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Url getUrl1() {
        return url1;
    }

    public void setUrl1(Url url1) {
        this.url1 = url1;
    }

    @XmlTransient
    public List<Parada> getParadaList() {
        return paradaList;
    }

    public void setParadaList(List<Parada> paradaList) {
        this.paradaList = paradaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutaPK != null ? rutaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        if ((this.rutaPK == null && other.rutaPK != null) || (this.rutaPK != null && !this.rutaPK.equals(other.rutaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.Ruta[ rutaPK=" + rutaPK + " ]";
    }
    
}
