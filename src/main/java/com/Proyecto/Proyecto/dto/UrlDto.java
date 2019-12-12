package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Ruta;
import com.Proyecto.Proyecto.domain.Url;

import java.util.List;

public class UrlDto {
    private Integer idUrl;
    private String nombre;
    private String url;

    public UrlDto(){

    }
    public UrlDto(Url url){
        this.idUrl=url.getIdUrl();
        this.nombre=url.getNombre();
        this.url=url.getUrl();
    }

    public Integer getIdUrl() {
        return idUrl;
    }

    public void setIdUrl(Integer idUrl) {
        this.idUrl = idUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
