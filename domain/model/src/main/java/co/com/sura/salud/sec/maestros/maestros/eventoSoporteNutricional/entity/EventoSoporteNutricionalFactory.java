package co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.TipoSoporteNutricional;

import java.util.ArrayList;

public interface EventoSoporteNutricionalFactory {

    default EventoSoporteNutricional crearEventoSoporteNutricional(
            String id, Frecuencia frecuencia, TipoSoporteNutricional tipoEvento, ArrayList<Object> diasEvento,
            Integer diasTratamiento
    ) {
        return EventoSoporteNutricional.builder()
                .id(id)
                .frecuencia(frecuencia)
                .tipoEvento(tipoEvento)
                .diasEvento(diasEvento)
                .diasTratamiento(diasTratamiento)
                .build();
    }
}
