package com.DSI.PPAI.Services;

import com.DSI.PPAI.Entities.Bodega;
import com.DSI.PPAI.Entities.Vino;

import java.util.List;

public interface BodegaAPI {
    List<Vino> obtenerActualizaciones(Bodega bodega);
}
