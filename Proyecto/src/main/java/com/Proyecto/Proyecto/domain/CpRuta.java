package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ruta", schema = "prueba", catalog = "")
public class CpRuta {
    private int idRuta;
    private String inicio;
    private String fin;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_ruta")
    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    @Basic
    @Column(name = "inicio")
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    @Basic
    @Column(name = "fin")
    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
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
        CpRuta cpRuta = (CpRuta) o;
        return idRuta == cpRuta.idRuta &&
                Objects.equals(inicio, cpRuta.inicio) &&
                Objects.equals(fin, cpRuta.fin) &&
                Objects.equals(txUser, cpRuta.txUser) &&
                Objects.equals(txHost, cpRuta.txHost) &&
                Objects.equals(txDate, cpRuta.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRuta, inicio, fin, txUser, txHost, txDate);
    }
}
