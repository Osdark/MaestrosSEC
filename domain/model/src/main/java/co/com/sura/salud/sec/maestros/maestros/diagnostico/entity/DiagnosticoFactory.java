package co.com.sura.salud.sec.maestros.maestros.diagnostico.entity;

import generic.GenerateUniqueId;

public interface DiagnosticoFactory extends GenerateUniqueId {

    default Diagnostico crearDiagnostico(
            String codgio, String nombre
    ) {
        return Diagnostico.builder()
                .id(generateObjectId())
                .codigo(codgio)
                .nombre(nombre)
                .build();
    }
}
