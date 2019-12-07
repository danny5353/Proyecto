package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "url", schema = "prueba", catalog = "")
public class CpUrl {
    private int idUrl;
    private String nombre;
    private String url;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_url")
    public int getIdUrl() {
        return idUrl;
    }

    public void setIdUrl(int idUrl) {
        this.idUrl = idUrl;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        CpUrl cpUrl = (CpUrl) o;
        return idUrl == cpUrl.idUrl &&
                Objects.equals(nombre, cpUrl.nombre) &&
                Objects.equals(url, cpUrl.url) &&
                Objects.equals(txUser, cpUrl.txUser) &&
                Objects.equals(txHost, cpUrl.txHost) &&
                Objects.equals(txDate, cpUrl.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUrl, nombre, url, txUser, txHost, txDate);
    }
}
