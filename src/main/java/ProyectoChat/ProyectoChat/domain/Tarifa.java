/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoChat.ProyectoChat.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "tarifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarifa.findAll", query = "SELECT t FROM Tarifa t"),
    @NamedQuery(name = "Tarifa.findByIdTarifa", query = "SELECT t FROM Tarifa t WHERE t.idTarifa = :idTarifa"),
    @NamedQuery(name = "Tarifa.findByTarifa", query = "SELECT t FROM Tarifa t WHERE t.tarifa = :tarifa"),
    @NamedQuery(name = "Tarifa.findByPrecioDiurno", query = "SELECT t FROM Tarifa t WHERE t.precioDiurno = :precioDiurno"),
    @NamedQuery(name = "Tarifa.findByPrecioNocturno", query = "SELECT t FROM Tarifa t WHERE t.precioNocturno = :precioNocturno")})
public class Tarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tarifa")
    private Integer idTarifa;
    @Size(max = 50)
    @Column(name = "tarifa")
    private String tarifa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_diurno")
    private BigDecimal precioDiurno;
    @Column(name = "precio_nocturno")
    private BigDecimal precioNocturno;

    public Tarifa() {
    }

    public Tarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getPrecioDiurno() {
        return precioDiurno;
    }

    public void setPrecioDiurno(BigDecimal precioDiurno) {
        this.precioDiurno = precioDiurno;
    }

    public BigDecimal getPrecioNocturno() {
        return precioNocturno;
    }

    public void setPrecioNocturno(BigDecimal precioNocturno) {
        this.precioNocturno = precioNocturno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarifa != null ? idTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifa)) {
            return false;
        }
        Tarifa other = (Tarifa) object;
        if ((this.idTarifa == null && other.idTarifa != null) || (this.idTarifa != null && !this.idTarifa.equals(other.idTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoChat.ProyectoChat.domain.Tarifa[ idTarifa=" + idTarifa + " ]";
    }
    
}
