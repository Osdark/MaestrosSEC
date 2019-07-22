package co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity;

import generic.GenerateUniqueId;

public interface TipoSoporteNutricionalFactory extends GenerateUniqueId {

    default TipoSoporteNutricional crearTipoSoporteNutricional(
            String idTipo, String descripcion
    ) {
        return TipoSoporteNutricional.builder()
                .id(generateObjectId())
                .idTipo(idTipo)
                .descripcion(descripcion)
                .build();
    }
}
