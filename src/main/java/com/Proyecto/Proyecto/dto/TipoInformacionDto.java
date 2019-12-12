package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Informacion;
import com.Proyecto.Proyecto.domain.TipoInformacion;

import java.sql.Date;
import java.util.List;

public class TipoInformacionDto {

    private Integer idTipoi;
    private String tipo;
    private List<Informacion> informacionList;

    public TipoInformacionDto() {
    }

    public TipoInformacionDto(TipoInformacion tipoInformacion) {
        this.idTipoi=tipoInformacion.getIdTipoi();
        this.tipo=tipoInformacion.getTipo();
        this.informacionList=tipoInformacion.getInformacionList();
    }

    public Integer getIdTipoi() {
        return idTipoi;
    }

    public void setIdTipoi(Integer idTipoi) {
        this.idTipoi = idTipoi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Informacion> getInformacionList() {
        return informacionList;
    }

    public void setInformacionList(List<Informacion> informacionList) {
        this.informacionList = informacionList;
    }
}
