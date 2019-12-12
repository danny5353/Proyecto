package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Bus;


public class BusDto {


    private Integer idBus;
    private String placa;
    private String conductor;
    private String anfitrion;


    public BusDto() {

    }
    public BusDto(Bus bus) {
        this.idBus = bus.getIdBus();
        this.placa = bus.getPlaca();
        this.conductor = bus.getConductor();
        this.anfitrion = bus.getAnfitrion();
    }


    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }
}
