package com.Proyecto.Proyecto.dto;

import com.Proyecto.Proyecto.domain.Ruta;
import com.Proyecto.Proyecto.domain.Tarifa;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class TarifaDto {


    private Integer idTarifa;
    private String tarifa;
    private BigDecimal precioDiurno;
    private BigDecimal precioNocturno;
public TarifaDto(){

}
public TarifaDto (Tarifa tarifa) {

        this.idTarifa = tarifa.getIdTarifa();
        this.tarifa = tarifa.getTarifa();
        this.precioDiurno = tarifa.getPrecioDiurno();
        this.precioNocturno = tarifa.getPrecioNocturno();
    }


    public Integer getIdTarifa() { return idTarifa; }

    public void setIdTarifa(Integer idTarifa) { this.idTarifa = idTarifa; }

    public String getTarifa() { return tarifa; }

    public void setTarifa(String tarifa) { this.tarifa = tarifa; }

    public BigDecimal getPrecioDiurno() { return precioDiurno; }

    public void setPrecioDiurno(BigDecimal precioDiurno) { this.precioDiurno = precioDiurno; }

    public BigDecimal getPrecioNocturno() { return precioNocturno; }

    public void setPrecioNocturno(BigDecimal precioNocturno) { this.precioNocturno = precioNocturno; }
     }


