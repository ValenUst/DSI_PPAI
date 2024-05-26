package com.DSI.PPAI.Entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Siguiendo {
    private Date fechaFin;
    private Date fechaInicio;
    private Bodega bodega;
    private Enofilo enofilo;

    public Void sosDeAmigo(){
        return null;
    }

    public Void sosDeBodega(){
        return null;
    }

    public Void sosDeSomelier(){
        return null;
    }
}
