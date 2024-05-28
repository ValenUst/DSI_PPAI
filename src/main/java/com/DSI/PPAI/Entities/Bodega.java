package com.DSI.PPAI.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bodega {
    private List<Integer> coordenadasUbicacion;
    private String descripcion;
    private String nombre;
    private Integer periodoActualizacion; // En meses
    private Boolean estaParaActualizacionNovedadesVino;
    private LocalDate fechaUltimaActualizacion; // Añadir este campo

    public boolean estaListaParaActualizar() {
        if (fechaUltimaActualizacion == null) {
            return true;
        }
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaUltimaActualizacion, ahora);
        return periodo.getMonths() >= periodoActualizacion;
    }
}
