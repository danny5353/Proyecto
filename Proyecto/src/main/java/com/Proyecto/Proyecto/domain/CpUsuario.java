package com.Proyecto.Proyecto.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "prueba", catalog = "")
public class CpUsuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private Date fechaNac;
    private String txUser;
    private String txHost;
    private Date txDate;

    @Id
    @Column(name = "id_usuario")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "correo")
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "telefono")
    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "fecha_nac")
    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
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
        CpUsuario cpUsuario = (CpUsuario) o;
        return idUsuario == cpUsuario.idUsuario &&
                Objects.equals(nombre, cpUsuario.nombre) &&
                Objects.equals(apellido, cpUsuario.apellido) &&
                Objects.equals(correo, cpUsuario.correo) &&
                Objects.equals(telefono, cpUsuario.telefono) &&
                Objects.equals(fechaNac, cpUsuario.fechaNac) &&
                Objects.equals(txUser, cpUsuario.txUser) &&
                Objects.equals(txHost, cpUsuario.txHost) &&
                Objects.equals(txDate, cpUsuario.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombre, apellido, correo, telefono, fechaNac, txUser, txHost, txDate);
    }
}
