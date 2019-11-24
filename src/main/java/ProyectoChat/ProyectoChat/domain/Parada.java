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
@Table(name = "parada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parada.findAll", query = "SELECT p FROM Parada p"),
    @NamedQuery(name = "Parada.findByIdParada", query = "SELECT p FROM Parada p WHERE p.paradaPK.idParada = :idParada"),
    @NamedQuery(name = "Parada.findByViajSuben", query = "SELECT p FROM Parada p WHERE p.viajSuben = :viajSuben"),
    @NamedQuery(name = "Parada.findByViajBajan", query = "SELECT p FROM Parada p WHERE p.viajBajan = :viajBajan"),
    @NamedQuery(name = "Parada.findByLatitud", query = "SELECT p FROM Parada p WHERE p.latitud = :latitud"),
    @NamedQuery(name = "Parada.findByLongitud", query = "SELECT p FROM Parada p WHERE p.longitud = :longitud"),
    @NamedQuery(name = "Parada.findByCalle", query = "SELECT p FROM Parada p WHERE p.calle = :calle"),
    @NamedQuery(name = "Parada.findByIdRuta", query = "SELECT p FROM Parada p WHERE p.paradaPK.idRuta = :idRuta")})
public class Parada implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParadaPK paradaPK;
    @Column(name = "viaj_suben")
    private Integer viajSuben;
    @Column(name = "viaj_bajan")
    private Integer viajBajan;
    @Size(max = 500)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 500)
    @Column(name = "longitud")
    private String longitud;
    @Size(max = 500)
    @Column(name = "calle")
    private String calle;
    @JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ruta ruta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parada", fetch = FetchType.LAZY)
    private List<BusParada> busParadaList;

    public Parada() {
    }

    public Parada(ParadaPK paradaPK) {
        this.paradaPK = paradaPK;
    }

    public Parada(int idParada, int idRuta) {
        this.paradaPK = new ParadaPK(idParada, idRuta);
    }

    public ParadaPK getParadaPK() {
        return paradaPK;
    }

    public void setParadaPK(ParadaPK paradaPK) {
        this.paradaPK = paradaPK;
    }

    public Integer getViajSuben() {
        return viajSuben;
    }

    public void setViajSuben(Integer viajSuben) {
        this.viajSuben = viajSuben;
    }

    public Integer getViajBajan() {
        return viajBajan;
    }

    public void setViajBajan(Integer viajBajan) {
        this.viajBajan = viajBajan;
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

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    @XmlTransient
    public List<BusParada> getBusParadaList() {
        return busParadaList;
    }

    public void setBusParadaList(List<BusParada> busParadaList) {
        this.busParadaList = busParadaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paradaPK != null ? paradaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parada)) {
            return false;
        }
        Parada other = (Parada) object;
        if ((this.paradaPK == null && other.paradaPK != null) || (this.paradaPK != null && !this.paradaPK.equals(other.paradaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.Parada[ paradaPK=" + paradaPK + " ]";
    }
    
}
