package co.com.sura.salud.sec.maestros.maestros.motivoEgreso.entity;

import generic.GenerateUniqueId;

public interface MotivoEgresoFactory extends GenerateUniqueId {

    default MotivoEgreso crearMotivoEgreso(
            String idMotivo, String descripcion
    ) {
        return MotivoEgreso.builder()
                .id(generateObjectId())
                .idMotivo(idMotivo)
                .descripcion(descripcion)
                .build();
    }
}
