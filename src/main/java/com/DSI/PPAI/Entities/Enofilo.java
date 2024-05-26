package com.DSI.PPAI.Entities;

import lombok.Data;

import java.util.List;

@Data
public class Enofilo {
    private String apellido;
    private String nombre;
    private String imagenPerfil;
    private List<Vino> vino;
    private List<Siguiendo> seguido;
    private Usuario usuario;

    public Void mostrarAmigosSeguidos(){
        return null;
    }
    public Void mostrarColeccionFavoritos(){
        return null;
    }

    public Boolean seguisABodega(Bodega bodega){
        for (Siguiendo siguiendo : seguido) {
            if(siguiendo.getBodega() == bodega){
                return true;
            }
        }
        return false;
    }
}
