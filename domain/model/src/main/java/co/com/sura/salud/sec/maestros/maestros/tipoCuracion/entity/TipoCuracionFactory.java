package co.com.sura.salud.sec.maestros.maestros.tipoCuracion.entity;

import generic.GenerateUniqueId;

public interface TipoCuracionFactory extends GenerateUniqueId {

    default TipoCuracion crearTipoCuracion(
            String idTipoCutracion, String descripcion
    ) {
        return TipoCuracion.builder()
                .id(generateObjectId())
                .idTipoCuracion(idTipoCutracion)
                .descripcion(descripcion)
                .build();
    }
}
