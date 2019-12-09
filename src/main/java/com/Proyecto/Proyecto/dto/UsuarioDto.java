package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.TipoUsuario;
import com.Proyecto.Proyecto.domain.Ubicacion;
import com.Proyecto.Proyecto.domain.Usuario;

import java.util.Date;
import java.util.List;
//import java.sql.Date;

public class UsuarioDto {

    private Integer idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private Date fechaNac;
    private TipoUsuario idTipou;
    private List<Ubicacion> ubicacionList;

    public UsuarioDto() {
    }

    public UsuarioDto(Usuario usuario) {
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.correo = usuario.getCorreo();
        this.telefono = usuario.getTelefono();
        this.fechaNac=usuario.getFechaNac();
        this.idTipou=usuario.getIdTipou();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public TipoUsuario getIdTipou() {
        return idTipou;
    }

    public void setIdTipou(TipoUsuario idTipou) {
        this.idTipou = idTipou;
    }

    public List<Ubicacion> getUbicacionList() {
        return ubicacionList;
    }

    public void setUbicacionList(List<Ubicacion> ubicacionList) {
        this.ubicacionList = ubicacionList;
    }
}
