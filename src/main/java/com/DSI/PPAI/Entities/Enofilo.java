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

    public Enofilo() {}

    public Enofilo(String apellido, String nombre, String imagenPerfil, List<Vino> vino, List<Siguiendo> seguido, Usuario usuario) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.imagenPerfil = imagenPerfil;
        this.vino = vino;
        this.seguido = seguido;
        this.usuario = usuario;
    }

    public boolean seguirABodega(Bodega bodega){
        for (Siguiendo siguiendo : seguido) {
            if(siguiendo.getBodega() == bodega){
                return true;
            }
        }
        return false;
    }

    public void mostrarAmigosSeguidos() {
        // Implementar lógica
    }

    public void mostrarColeccionFavoritos() {
        // Implementar lógica
    }
}
