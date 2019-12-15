package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Bus;
import com.Proyecto.Proyecto.domain.BusParada;
import com.Proyecto.Proyecto.domain.Parada;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

public class BusParadaDto {

    private Integer idBuspar;
    private String estado;
    private Date hora;
    private Date fecha;
    private Bus idBus;
    private Parada idParada;

    public BusParadaDto() {
    }

    public BusParadaDto(BusParada busParada){

        this.idBuspar = busParada.getIdBuspar();
        this.estado = busParada.getEstado();
        this.hora = busParada.getHora();
        this.fecha = busParada.getFecha();
        this.idBus = busParada.getIdBus();
        this.idParada = busParada.getIdParada();
    }





    public Integer getIdBuspar() {
        return idBuspar;
    }

    public void setIdBuspar(Integer idBuspar) {
        this.idBuspar = idBuspar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Bus getIdBus() {
        return idBus;
    }

    public void setIdBus(Bus idBus) {
        this.idBus = idBus;
    }

    public Parada getIdParada() {
        return idParada;
    }

    public void setIdParada(Parada idParada) {
        this.idParada = idParada;
    }

}
