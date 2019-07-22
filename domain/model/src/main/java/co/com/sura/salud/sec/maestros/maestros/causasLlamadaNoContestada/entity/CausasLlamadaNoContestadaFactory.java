package co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity;

import generic.GenerateUniqueId;

public interface CausasLlamadaNoContestadaFactory extends GenerateUniqueId {

    default CausasLlamadaNoContestada crearCausaLlamadaNoContestada (
        String idCausa, String nombreCausa
    ) {
        return CausasLlamadaNoContestada.builder()
                .id(generateObjectId())
                .idCausa(idCausa)
                .nombreCausa(nombreCausa)
                .build();
    }
}
