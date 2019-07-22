package co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.entity;

import generic.GenerateUniqueId;

public interface MotivoCancelacionFactory extends GenerateUniqueId {

    default MotivoCancelacion crearMotivoCancelacion(
            String idMotivo, String descripcion
    ) {
        return MotivoCancelacion.builder()
                .id(generateObjectId())
                .idMotivo(idMotivo)
                .descripcion(descripcion)
                .build();
    }
}
