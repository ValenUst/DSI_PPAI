package com.DSI.PPAI;

import com.DSI.PPAI.Entities.Bodega;
import com.DSI.PPAI.Services.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PpaiApplication {
    public static void main(String[] args) {
        // Crear algunos objetos de ejemplo
        Bodega bodega1 = new Bodega(new ArrayList<>(), "Descripcion 1", "Bodega Los Andes", 2, true, LocalDate.now().minusMonths(3));
        Bodega bodega2 = new Bodega(new ArrayList<>(), "Descripcion 2", "Bodega El Sol", 4, true, LocalDate.now().minusMonths(5));

        List<Bodega> bodegas = List.of(bodega1, bodega2);

        BodegaService bodegaService = new BodegaService(bodegas);
        BodegaAPI bodegaAPI = new BodegaAPIImpl();
        GestorImportadorBodegas gestorImportadorBodegas = new GestorImportadorBodegas(bodegaService, bodegaAPI);

        gestorImportadorBodegas.importarActualizacionesDeBodegas();
    }
}
