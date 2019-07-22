package co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity;

import generic.GenerateUniqueId;

public interface TiposIdentificacionFactory extends GenerateUniqueId {

    default TiposIdentificacion crearTiposIdentificacion(
            String idTipo, String nombre, String codigoPos, String codigoSura
    ) {
        return TiposIdentificacion.builder()
                .id(generateObjectId())
                .idTipo(idTipo)
                .nombre(nombre)
                .codigoPos(codigoPos)
                .codigoSura(codigoSura)
                .build();
    }
}
