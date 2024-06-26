package com.DSI.PPAI.Entities;

import lombok.Data;

@Data
public class Varietal {

    private String descripcion;
    private Float porcentajeComposicion;
    private TipoUva tipoUva;

    public String toString() {
        return descripcion + " " + porcentajeComposicion + " " + tipoUva.toString();
    }

}
