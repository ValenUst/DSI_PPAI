package com.DSI.PPAI.Entities;

import lombok.Data;
import java.time.LocalDateTime;


@Data
public class NovedadEvento {
    private int codigoDescuentoPremium;
    private String descripcion;
    private boolean esSoloPremium;
    private LocalDateTime fechaHoraEvento; // Esto se puede modificar de ser necesario, lo definí así porque así me salio en el oráculo.
    private String nombreEvento;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public boolean esPremium(boolean esSoloPremium){
        return esSoloPremium;
    }

    public boolean estaEnPeriodo(){
        return (fechaHoraEvento.isEqual(fechaInicio) || fechaHoraEvento.isAfter(fechainicio)) &&
                (fechaHoraEvento.isEqual(fechaFin) || fechaHoraEvento.isBefore(fechaFin));
    }

    public String mostrarDescripcion() {
        return descripcion;
    }
}
