package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "bus", schema = "prueba", catalog = "")
public class CpBus {
    private int idBus;
    private String placa;
    private String conductor;
    private String anfitrion;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_bus")
    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    @Basic
    @Column(name = "placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Basic
    @Column(name = "conductor")
    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    @Basic
    @Column(name = "anfitrion")
    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
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
        CpBus cpBus = (CpBus) o;
        return idBus == cpBus.idBus &&
                Objects.equals(placa, cpBus.placa) &&
                Objects.equals(conductor, cpBus.conductor) &&
                Objects.equals(anfitrion, cpBus.anfitrion) &&
                Objects.equals(txUser, cpBus.txUser) &&
                Objects.equals(txHost, cpBus.txHost) &&
                Objects.equals(txDate, cpBus.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBus, placa, conductor, anfitrion, txUser, txHost, txDate);
    }
}
