package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "informacion", schema = "prueba", catalog = "")
public class CpInformacion {
    private int idInformacion;
    private String texto;
    private Date fecha;
    private String imagen;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_informacion")
    public int getIdInformacion() {
        return idInformacion;
    }

    public void setIdInformacion(int idInformacion) {
        this.idInformacion = idInformacion;
    }

    @Basic
    @Column(name = "texto")
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Basic
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "imagen")
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Basic
    @Column(name = "tx_user")
    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    @Basic
    @Column(name = "tx_host")
    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    @Basic
    @Column(name = "tx_date")
    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CpInformacion that = (CpInformacion) o;
        return idInformacion == that.idInformacion &&
                Objects.equals(texto, that.texto) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(imagen, that.imagen) &&
                Objects.equals(txUser, that.txUser) &&
                Objects.equals(txHost, that.txHost) &&
                Objects.equals(txDate, that.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInformacion, texto, fecha, imagen, txUser, txHost, txDate);
    }
}
