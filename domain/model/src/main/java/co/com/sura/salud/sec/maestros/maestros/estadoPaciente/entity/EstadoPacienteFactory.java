package co.com.sura.salud.sec.maestros.maestros.estadoPaciente.entity;

import generic.GenerateUniqueId;

public interface EstadoPacienteFactory extends GenerateUniqueId {

    default EstadoPaciente crearEstadoPaciente(
            String nombre
    ) {
        return EstadoPaciente.builder()
                .id(generateObjectId())
                .nombre(nombre)
                .build();
    }
}
