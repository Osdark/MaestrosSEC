package co.com.sura.salud.sec.maestros.maestros.frecuencia.entity;

import generic.GenerateUniqueId;

public interface FrecuenciaFactory extends GenerateUniqueId {

    default Frecuencia crearFrecuencia(
            String idFrecuencia, String tipo, String descripcion
    ) {
        return Frecuencia.builder()
                .id(generateObjectId())
                .idFrecuencia(idFrecuencia)
                .tipo(tipo)
                .descripcion(descripcion)
                .build();
    }
}
