package co.com.sura.salud.sec.maestros.maestros.programa.entity;

import generic.GenerateUniqueId;

public interface ProgramaFactory extends GenerateUniqueId {

    default Programa crearPrograma(
            String idPrograma, String nombre, String especialidad, String profesional, boolean citaAutomatica
    ) {
        return Programa.builder()
                .id(generateObjectId())
                .idPrograma(idPrograma)
                .nombre(nombre)
                .especialidad(especialidad)
                .profesional(profesional)
                .citaAutomatica(citaAutomatica)
                .build();
    }
}
