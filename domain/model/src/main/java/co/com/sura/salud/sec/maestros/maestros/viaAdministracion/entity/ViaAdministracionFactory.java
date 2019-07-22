package co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity;

import generic.GenerateUniqueId;

public interface ViaAdministracionFactory extends GenerateUniqueId {

    default ViaAdministracion crearViaAdministracion(
            String idViaAdministracion, String tipo, String descripcion
    ) {
        return ViaAdministracion.builder()
                .id(generateObjectId())
                .idViaAdministracion(idViaAdministracion)
                .tipo(tipo)
                .descripcion(descripcion)
                .build();
    }
}
