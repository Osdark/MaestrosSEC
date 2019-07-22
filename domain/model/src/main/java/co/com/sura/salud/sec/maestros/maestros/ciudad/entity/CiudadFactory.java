package co.com.sura.salud.sec.maestros.maestros.ciudad.entity;

import generic.GenerateUniqueId;

public interface CiudadFactory extends GenerateUniqueId {

    default Ciudad crearCiudad(
            String idCiudad, String nombre, String codigoDANE, String codigoIPS
    ) {
        return Ciudad.builder()
                .id(generateObjectId())
                .idCiudad(idCiudad)
                .nombre(nombre)
                .codigoDANE(codigoDANE)
                .codigoIPS(codigoIPS)
                .build();
    }
}
