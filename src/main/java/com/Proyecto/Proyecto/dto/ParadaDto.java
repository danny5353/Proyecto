package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.BusParada;
import com.Proyecto.Proyecto.domain.Parada;
import com.Proyecto.Proyecto.domain.Ruta;

import java.util.List;

public class ParadaDto {
    private Integer idParada;
    private String latitud;
    private String longitud;
    private String calle;
    private Ruta idRuta;
    private List<BusParada> busParadaList;

    public ParadaDto() {
    }

    public ParadaDto(Parada parada) {
        this.idParada= parada.getIdParada();
        this.latitud=parada.getLatitud();
        this.longitud=parada.getLongitud();
        this.calle=parada.getCalle();
        this.idRuta=parada.getIdRuta();
        this.busParadaList=parada.getBusParadaList();
    }

    public Integer getIdParada() {
        return idParada;
    }

    public void setIdParada(Integer idParada) {
        this.idParada = idParada;
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

    public Ruta getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Ruta idRuta) {
        this.idRuta = idRuta;
    }

    public List<BusParada> getBusParadaList() {
        return busParadaList;
    }

    public void setBusParadaList(List<BusParada> busParadaList) {
        this.busParadaList = busParadaList;
    }
}
