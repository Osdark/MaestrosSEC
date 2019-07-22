package co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.entity;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import generic.GenerateUniqueId;

import java.util.ArrayList;

public interface EventoSoporteNutricionalFactory extends GenerateUniqueId {

    default EventoSoporteNutricional crearEventoSoporteNutricional(
            Frecuencia frecuencia, TipoSoporteNutricional tipoEvento, ArrayList<Object> diasEvento,
            Integer diasTratamiento
    ) {
        return EventoSoporteNutricional.builder()
                .id(generateObjectId())
                .frecuencia(frecuencia)
                .tipoEvento(tipoEvento)
                .diasEvento(diasEvento)
                .diasTratamiento(diasTratamiento)
                .build();
    }
}
