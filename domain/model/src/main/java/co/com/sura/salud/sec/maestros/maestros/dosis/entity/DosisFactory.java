package co.com.sura.salud.sec.maestros.maestros.dosis.entity;

import generic.GenerateUniqueId;

public interface DosisFactory extends GenerateUniqueId {

    default Dosis crearDosis(
            String idDosis, String tipo, String descripcion
    ) {
        return Dosis.builder()
                .id(generateObjectId())
                .idDosis(idDosis)
                .tipo(tipo)
                .descripcion(descripcion)
                .build();
    }
}
