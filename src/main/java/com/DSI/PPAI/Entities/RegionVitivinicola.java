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
public class RegionVitivinicola {
    private String nombre;
    private String descripcion;
    private List<Bodega> bodegas;

    public void conocerBodegas() {
        for (Bodega bodega : bodegas) {
            System.out.println("Bodega: " + bodega.getNombre() + ", descripcion: " + bodega.getDescripcion());
        }
    }
    public int contarBodegas() {
        return bodegas.size();
    }
}

