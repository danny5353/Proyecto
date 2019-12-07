package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tipo_usuario", schema = "prueba", catalog = "")
public class CpTipoUsuario {
    private int idTipou;
    private String tipo;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_tipou")
    public int getIdTipou() {
        return idTipou;
    }

    public void setIdTipou(int idTipou) {
        this.idTipou = idTipou;
    }

    @Basic
    @Column(name = "tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        CpTipoUsuario that = (CpTipoUsuario) o;
        return idTipou == that.idTipou &&
                Objects.equals(tipo, that.tipo) &&
                Objects.equals(txUser, that.txUser) &&
                Objects.equals(txHost, that.txHost) &&
                Objects.equals(txDate, that.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipou, tipo, txUser, txHost, txDate);
    }
}
