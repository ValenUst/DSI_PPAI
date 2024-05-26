package com.DSI.PPAI.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Vino {
    private Integer añada;
    private String imagenEtiqueta;
    private String nombre;
    private String notaDeCataBodega;
    private List<Maridaje> maridaje;
    private Bodega bodega;
    private List<Varietal> varietal;
    private Float precioARS;

    public Void calcularRankings(){
        return null;
    };

    public Void comprarEtiqueta(){
        return null;
    }

    public Void esDeBodega(){
        return null;
    }

    public Void esDeRegionVitivinicola(){
        return null;
    }
}
