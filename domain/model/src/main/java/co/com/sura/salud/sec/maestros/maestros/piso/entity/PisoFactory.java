package co.com.sura.salud.sec.maestros.maestros.piso.entity;

import generic.GenerateUniqueId;

public interface PisoFactory extends GenerateUniqueId {

    default Piso crearPiso(
            String idPiso, String nombre, String idCiudad, String tipoPiso, String idPrograma
    ) {
        return Piso.builder()
                .id(generateObjectId())
                .idPiso(idPiso)
                .nombre(nombre)
                .idCiudad(idCiudad)
                .tipoPiso(tipoPiso)
                .idPrograma(idPrograma)
                .build();
    }
}
