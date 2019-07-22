package co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.entity;

import generic.GenerateUniqueId;

public interface MotivoFijarCitaFactory extends GenerateUniqueId {

    default MotivoFijarCita crearMotivoFijarCita(
            String idMotivo, String descripcion
    ) {
        return MotivoFijarCita.builder()
                .id(generateObjectId())
                .idMotivo(idMotivo)
                .descripcion(descripcion)
                .build();
    }
}
