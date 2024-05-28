package com.DSI.PPAI;

import com.DSI.PPAI.Entities.*;
import com.DSI.PPAI.Services.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos objetos de ejemplo
        Bodega bodega1 = new Bodega(new ArrayList<>(), "Descripcion 1", "Bodega Los Andes", 2, true);
        Bodega bodega2 = new Bodega(new ArrayList<>(), "Descripcion 2", "Bodega El Sol", 4, true);

        List<Bodega> bodegas = List.of(bodega1, bodega2);

        // Crear usuario
        Usuario usuario = new Usuario("ValenUst", "password", true);

        // Crear algunos enófilos
        Enofilo enofilo1 = new Enofilo("Novarino", "Valentin", "imagenPerfil", new ArrayList<>(), new ArrayList<>(), usuario);

        // Crear lista de enófilos
        List<Enofilo> enofilos = List.of(enofilo1);

        // Crear servicios
        BodegaService bodegaService = new BodegaService(bodegas);
        BodegaAPI bodegaAPI = new BodegaAPIImpl();
        NotificacionService notificacionService = new NotificacionService();
        GestorImportadorBodegas gestorImportadorBodegas = new GestorImportadorBodegas(bodegaService, bodegaAPI, notificacionService);

        // Importar actualizaciones de bodegas
        gestorImportadorBodegas.importarActualizacionesDeBodegas();

        // Confirmar que la información se actualizó y se notificó correctamente
        for (Bodega bodega : bodegas) {
            System.out.println("Información de la Bodega:");
            System.out.println("Nombre: " + bodega.getNombre());
            System.out.println("Descripción: " + bodega.getDescripcion());
        }
    }
}
