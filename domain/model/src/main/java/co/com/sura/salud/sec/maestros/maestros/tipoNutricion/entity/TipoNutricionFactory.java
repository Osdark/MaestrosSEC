package co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity;

import generic.GenerateUniqueId;

public interface TipoNutricionFactory extends GenerateUniqueId {

    default TipoNutricion crearTipoNutricion(
            String tipo, String idTipo, String idNutricion, String descripcion
    ) {
        return TipoNutricion.builder()
                .id(generateObjectId())
                .tipo(tipo)
                .idTipo(idTipo)
                .idNutricion(idNutricion)
                .descripcion(descripcion)
                .build();
    }
}
