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

public class Provincia {
    private String nombre;
    private List<RegionVitivinicola> regiones;

    public void conocerRegiones() {
        for (RegionVitivinicola region : regiones) {
            System.out.println(region.getNombre() + ": "+ region.getDescripcion());
        }
    }
    public int contarRegiones() {
        return regiones.size();
    }

}
