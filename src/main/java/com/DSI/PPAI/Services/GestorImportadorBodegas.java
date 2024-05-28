package com.DSI.PPAI.Services;

import com.DSI.PPAI.Entities.Bodega;
import com.DSI.PPAI.Entities.Vino;

import java.time.LocalDate;
import java.util.List;

public class GestorImportadorBodegas {
    private BodegaService bodegaService;
    private BodegaAPI bodegaAPI;
    private NotificacionService notificacionService;

    public GestorImportadorBodegas(BodegaService bodegaService, BodegaAPI bodegaAPI, NotificacionService notificacionService) {
        this.bodegaService = bodegaService;
        this.bodegaAPI = bodegaAPI;
        this.notificacionService = notificacionService;
    }

    public void importarActualizacionesDeBodegas() {
        List<Bodega> bodegasParaActualizar = bodegaService.obtenerBodegasParaActualizar();
        for (Bodega bodega : bodegasParaActualizar) {
            List<Vino> vinosActualizados = bodegaAPI.obtenerActualizaciones(bodega);
            // Actualizar la bodega con los nuevos vinos
            bodega.setFechaUltimaActualizacion(LocalDate.now());
            // Notificar a los enófilos
            notificarEnofilos(bodega, vinosActualizados);
        }
    }

    private void notificarEnofilos(Bodega bodega, List<Vino> vinosActualizados) {
        // Simulación de notificación a enófilos
        System.out.println("Notificando enófilos de la bodega: " + bodega.getNombre());
        // Aquí es donde se implementaría la lógica de notificación real
    }
}
