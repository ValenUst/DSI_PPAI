package com.DSI.PPAI.Entities;

import lombok.Data;

@Data
public class TipoUva {
    private String nombre;
    private String descripcion;

    public Boolean sosTipoUva(String nombre){
        if(this.nombre.equals(nombre)){
            return true;
        }
        return false;
    }

    public String toString() {
        return "TipoUva{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
}
