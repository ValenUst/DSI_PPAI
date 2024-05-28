package com.DSI.PPAI.Services;

import com.DSI.PPAI.Entities.Bodega;

import java.util.List;
import java.util.stream.Collectors;

public class BodegaService {
    private List<Bodega> bodegas;

    public BodegaService(List<Bodega> bodegas) {
        this.bodegas = bodegas;
    }

    public List<Bodega> obtenerBodegasParaActualizar() {
        return bodegas.stream()
                .filter(Bodega::estaListaParaActualizar)
                .collect(Collectors.toList());
    }
}
