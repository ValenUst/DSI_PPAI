package com.DSI.PPAI.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Bodega {

    private List<Integer> coordenadasUbicacion;
    private String descripcion;
    private String nombre;
    private Integer periodoActualizacion; //En meses
    private Boolean estaParaActualizacionNovedadesVino;

}
