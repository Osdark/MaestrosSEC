package co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.entity;

import generic.GenerateUniqueId;

public interface MotivoAplicacionCuidadorFactory extends GenerateUniqueId {

    default MotivoAplicacionCuidador crearMotivoAplicacionCuidador(
            String descripcion
    ) {
        return MotivoAplicacionCuidador.builder()
                .id(generateObjectId())
                .descripcion(descripcion)
                .build();
    }
}
