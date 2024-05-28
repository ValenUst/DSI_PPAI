package com.DSI.PPAI.Entities;

import lombok.Data;

@Data
public class Maridaje {
    private String nombre;
    private String descripcion;

    public String toString() {
        return "Maridaje" + nombre + "\n" + descripcion;
    }
}
