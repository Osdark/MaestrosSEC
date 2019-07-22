package co.com.sura.salud.sec.maestros.maestros.municipio.entity;

import generic.GenerateUniqueId;

public interface MunicipioFactory extends GenerateUniqueId {

    default Municipio crearMunicipio(
            String nombre, String idCiudad, String idMunicipio, double longitud, double latitud
    ) {
        return Municipio.builder()
                .id(generateObjectId())
                .nombre(nombre)
                .idCiudad(idCiudad)
                .idMunicipio(idMunicipio)
                .longitud(longitud)
                .latitud(latitud)
                .build();
    }
}
