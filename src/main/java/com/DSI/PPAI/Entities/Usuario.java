package com.DSI.PPAI.Entities;

import lombok.Data;

@Data
public class Usuario {
    private String nombre;
    private String contraseña;
    private Boolean premiun;

    public String toString() {
        return "Usua;rio{" + "nombre=" + nombre + '}';
    }
}

