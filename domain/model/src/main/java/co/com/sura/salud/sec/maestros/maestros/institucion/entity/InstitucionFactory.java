package co.com.sura.salud.sec.maestros.maestros.institucion.entity;

import generic.GenerateUniqueId;

public interface InstitucionFactory extends GenerateUniqueId {

    default Institucion crearInstitucion(
            String idInstitucion, String idCiudad, String nombre
    ) {
        return Institucion.builder()
                .id(generateObjectId())
                .idInstitucion(idInstitucion)
                .idCiudad(idCiudad)
                .nombre(nombre)
                .build();
    }
}
