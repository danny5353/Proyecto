package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "bus_parada", schema = "prueba", catalog = "")
public class CpBusParada {
    private int idBuspar;
    private String estado;
    private Time hora;
    private Date fecha;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_buspar")
    public int getIdBuspar() {
        return idBuspar;
    }

    public void setIdBuspar(int idBuspar) {
        this.idBuspar = idBuspar;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "hora")
    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
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
        CpBusParada that = (CpBusParada) o;
        return idBuspar == that.idBuspar &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(hora, that.hora) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(txUser, that.txUser) &&
                Objects.equals(txHost, that.txHost) &&
                Objects.equals(txDate, that.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuspar, estado, hora, fecha, txUser, txHost, txDate);
    }
}
