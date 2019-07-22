package co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.entity;

import generic.GenerateUniqueId;

public interface CentroEstadiaTemporalFactory extends GenerateUniqueId {

    default CentroEstadiaTemporal crearCentroEstadiaTemporal(
            String idCiudad, String nombre
    ) {
        return CentroEstadiaTemporal.builder()
                .id(generateObjectId())
                .idCiudad(idCiudad)
                .nombre(nombre)
                .build();
    }
}
