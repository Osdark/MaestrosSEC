package co.com.sura.salud.sec.maestros.maestros.profesional;

import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;

import java.util.List;

public interface ProfesionalFactory {

    default Profesional crearProfesional(
            String id, String idProfesion, String profesion, String especialidad, List<CitasProfesional> profesionalList
    ) {
        return Profesional.builder()
                .id(id)
                .idProfesion(idProfesion)
                .profesion(profesion)
                .especialidad(especialidad)
                .profesionalList(profesionalList)
                .build();
    }
}
