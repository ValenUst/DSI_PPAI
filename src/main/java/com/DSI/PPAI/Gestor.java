package com.DSI.PPAI;

import com.DSI.PPAI.Entities.Bodega;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class Gestor {

    private List<String> bodegasParaActualizar;
    private Bodega bodegaElegida;

    public List<String> opcionImportarActualizaciónVinos(List<Bodega> bodegas){
        return buscarBodegasParaActualizar(bodegas);
    }

    public List<String> buscarBodegasParaActualizar(List<Bodega> bodegas){
        List<String> bodegasParaActualizar = new ArrayList<>();
        for (Bodega bodega : bodegas) {
            if(bodega.getEstaParaActualizacionNovedadesVino()){
                bodegasParaActualizar.add(bodega.getNombre());
            }
        }
        return bodegasParaActualizar;
    }

    public Void obtenerActualizacionVinosBodega(List<Bodega> bodegas){
        return null;
    };
    public Void determinarVinosAActualizar(){
        return null;
    };
    public Void actualizarOCrearVinos(){
        return null;
    };
    public Void actualizarCaracteristicasVinoExistentes(){
        return null;
    };
}
