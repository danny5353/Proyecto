package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Parada;
import com.Proyecto.Proyecto.domain.Ruta;
import com.Proyecto.Proyecto.domain.Url;

import java.util.Date;
import java.util.List;

public class RutaDto {

    private Integer idRuta;
    private String inicio;
    private String fin;
    private Url idImg;
    private Url idVideo;
    private List<Parada> paradaList;

    public RutaDto() {
    }

    public RutaDto(Ruta ruta) {
        this.idRuta = ruta.getIdRuta();
        this.inicio =ruta.getInicio();
        this.fin=ruta.getFin();
        this.idImg=ruta.getIdImg();
        this.idVideo= ruta.getIdVideo();
        this.paradaList=ruta.getParadaList();
    }



    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public Url getIdImg() {
        return idImg;
    }

    public void setIdImg(Url idImg) {
        this.idImg = idImg;
    }

    public Url getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Url idVideo) {
        this.idVideo = idVideo;
    }

    public List<Parada> getParadaList() {
        return paradaList;
    }

    public void setParadaList(List<Parada> paradaList) {
        this.paradaList = paradaList;
    }




}
