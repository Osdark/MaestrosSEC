package co.com.sura.salud.sec.maestros.maestros.tipoTerapia.entity;

import generic.GenerateUniqueId;

public interface TipoTerapiaFactory extends GenerateUniqueId {

    default TipoTerapia crearTipoTerapia(
            String idTipoTerapia, String descripcion
    ) {
        return TipoTerapia.builder()
                .id(generateObjectId())
                .idTipoTerapia(idTipoTerapia)
                .descripcion(descripcion)
                .build();
    }
}
