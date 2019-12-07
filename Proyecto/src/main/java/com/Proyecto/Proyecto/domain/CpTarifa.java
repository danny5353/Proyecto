package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tarifa", schema = "prueba", catalog = "")
public class CpTarifa {
    private int idTarifa;
    private String tarifa;
    private BigDecimal precioDiurno;
    private BigDecimal precioNocturno;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_tarifa")
    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    @Basic
    @Column(name = "tarifa")
    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    @Basic
    @Column(name = "precio_diurno")
    public BigDecimal getPrecioDiurno() {
        return precioDiurno;
    }

    public void setPrecioDiurno(BigDecimal precioDiurno) {
        this.precioDiurno = precioDiurno;
    }

    @Basic
    @Column(name = "precio_nocturno")
    public BigDecimal getPrecioNocturno() {
        return precioNocturno;
    }

    public void setPrecioNocturno(BigDecimal precioNocturno) {
        this.precioNocturno = precioNocturno;
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
        CpTarifa cpTarifa = (CpTarifa) o;
        return idTarifa == cpTarifa.idTarifa &&
                Objects.equals(tarifa, cpTarifa.tarifa) &&
                Objects.equals(precioDiurno, cpTarifa.precioDiurno) &&
                Objects.equals(precioNocturno, cpTarifa.precioNocturno) &&
                Objects.equals(txUser, cpTarifa.txUser) &&
                Objects.equals(txHost, cpTarifa.txHost) &&
                Objects.equals(txDate, cpTarifa.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarifa, tarifa, precioDiurno, precioNocturno, txUser, txHost, txDate);
    }
}
