package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "parada", schema = "prueba", catalog = "")
public class CpParada {
    private int idParada;
    private String latitud;
    private String longitud;
    private String calle;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_parada")
    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    @Basic
    @Column(name = "latitud")
    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    @Basic
    @Column(name = "longitud")
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Basic
    @Column(name = "calle")
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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
        CpParada cpParada = (CpParada) o;
        return idParada == cpParada.idParada &&
                Objects.equals(latitud, cpParada.latitud) &&
                Objects.equals(longitud, cpParada.longitud) &&
                Objects.equals(calle, cpParada.calle) &&
                Objects.equals(txUser, cpParada.txUser) &&
                Objects.equals(txHost, cpParada.txHost) &&
                Objects.equals(txDate, cpParada.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParada, latitud, longitud, calle, txUser, txHost, txDate);
    }
}
