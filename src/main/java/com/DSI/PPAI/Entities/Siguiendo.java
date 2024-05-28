package com.DSI.PPAI.Entities;

import lombok.Data;

import java.util.Date;

@Data
public class Siguiendo {
    private Date fechaFin;
    private Date fechaInicio;
    private Bodega bodega;
    private Enofilo enofilo;
    private Sommelier somelier;

    public boolean sosDeAmigo(){
        return enofilo != null;
    }

    public boolean sosDeBodega(){
        return bodega != null;
    }

    public boolean sosDeSomelier(){
        return somelier != null;
    }
}
