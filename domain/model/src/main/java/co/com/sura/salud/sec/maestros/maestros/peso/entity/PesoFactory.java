package co.com.sura.salud.sec.maestros.maestros.peso.entity;

import generic.GenerateUniqueId;

public interface PesoFactory extends GenerateUniqueId {

    default Peso crearPeso(
            String descripcion
    ) {
        return Peso.builder()
                .id(generateObjectId())
                .descripcion(descripcion)
                .build();
    }
}
