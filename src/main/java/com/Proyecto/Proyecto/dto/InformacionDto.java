package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Informacion;
import com.Proyecto.Proyecto.domain.TipoInformacion;

import java.sql.Date;

public class InformacionDto {

    private Integer idInformacion;
    private String texto;
    private Date fecha;
    private String imagen;
    private TipoInformacion idTipoi;

    public InformacionDto (){

    }

    public InformacionDto (Informacion informacion){
        this.idInformacion= informacion.getIdInformacion();
        this.texto=informacion.getTexto();
        this.imagen=informacion.getImagen();
        this.idTipoi=informacion.getIdTipoi();

    }

    public Integer getIdInformacion() {
        return idInformacion;
    }

    public void setIdInformacion(Integer idInformacion) {
        this.idInformacion = idInformacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public TipoInformacion getIdTipoi() {
        return idTipoi;
    }

    public void setIdTipoi(TipoInformacion idTipoi) {
        this.idTipoi = idTipoi;
    }
}
