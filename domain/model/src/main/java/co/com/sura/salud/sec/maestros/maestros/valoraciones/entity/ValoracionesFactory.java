package co.com.sura.salud.sec.maestros.maestros.valoraciones.entity;

import generic.GenerateUniqueId;

public interface ValoracionesFactory extends GenerateUniqueId {

    default Valoraciones crearValoraciones(
            String idValoracion, String nombre, String idTipo
    ) {
        return Valoraciones.builder()
                .id(generateObjectId())
                .idValoracion(idValoracion)
                .nombre(nombre)
                .idTipo(idTipo)
                .build();
    }
}
