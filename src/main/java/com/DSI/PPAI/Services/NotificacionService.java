package com.DSI.PPAI.Services;

import com.DSI.PPAI.Entities.Bodega;
import com.DSI.PPAI.Entities.Enofilo;
import com.DSI.PPAI.Entities.Vino;

import java.util.List;

public class NotificacionService {
    public void notificar(Bodega bodega, List<Enofilo> enofilos, List<Vino> vinosActualizados) {
        for (Enofilo enofilo : enofilos) {
            if (enofilo.seguirABodega(bodega)) {
                System.out.println("Notificando a " + enofilo.getNombre() + " sobre la actualización de la bodega: " + bodega.getNombre());
            }
        }
    }
}
