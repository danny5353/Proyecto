package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Ubicacion;
import com.Proyecto.Proyecto.domain.Usuario;

public class UbicacionDto {

    private Integer idUbicacion;
    private String latitud;
    private String longitud;
    private String calle;
    private Usuario idUsuario;

    public UbicacionDto() {
    }

    public UbicacionDto(Ubicacion ubicacion) {
        this.latitud = ubicacion.getLatitud();
        this.longitud = ubicacion.getLongitud();
        this.calle = ubicacion.getCalle();
        this.idUsuario=ubicacion.getIdUsuario();
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}
