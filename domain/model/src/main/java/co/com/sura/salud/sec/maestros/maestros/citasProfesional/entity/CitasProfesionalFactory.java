package co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity;

import generic.GenerateUniqueId;

public interface CitasProfesionalFactory extends GenerateUniqueId {

    default  CitasProfesional crearCitasProfesional(
            String idCita, String tipoCita
    ) {
        return CitasProfesional.builder()
                .id(generateObjectId())
                .idCita(idCita)
                .tipoCita(tipoCita)
                .build();
    }
}
