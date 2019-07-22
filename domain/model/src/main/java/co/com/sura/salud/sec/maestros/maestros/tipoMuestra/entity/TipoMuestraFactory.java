package co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity;

import generic.GenerateUniqueId;

public interface TipoMuestraFactory extends GenerateUniqueId {

    default TipoMuestra crearTipoMuestra(
            String idTomaMuestra, String descripcion
    ) {
        return TipoMuestra.builder()
                .id(generateObjectId())
                .idTomaMuestra(idTomaMuestra)
                .descripcion(descripcion)
                .build();
    }
}
