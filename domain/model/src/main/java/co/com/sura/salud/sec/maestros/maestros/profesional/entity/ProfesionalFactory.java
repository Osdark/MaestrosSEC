package co.com.sura.salud.sec.maestros.maestros.profesional.entity;

import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import generic.GenerateUniqueId;

import java.util.List;

public interface ProfesionalFactory extends GenerateUniqueId {

    default Profesional crearProfesional(
            String idProfesion, String profesion, String especialidad, List<CitasProfesional> profesionalList
    ) {
        return Profesional.builder()
                .id(generateObjectId())
                .idProfesion(idProfesion)
                .profesion(profesion)
                .especialidad(especialidad)
                .profesionalList(profesionalList)
                .build();
    }
}
