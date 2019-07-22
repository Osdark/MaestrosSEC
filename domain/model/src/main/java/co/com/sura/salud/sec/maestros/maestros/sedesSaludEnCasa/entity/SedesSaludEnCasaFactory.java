package co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.entity;

import generic.GenerateUniqueId;

public interface SedesSaludEnCasaFactory extends GenerateUniqueId {

    default SedesSaludEnCasa crearSedesSaludEnCasa(
            String idCiudad, String descripcion, String ubicacion
    ) {
        return SedesSaludEnCasa.builder()
                .id(generateObjectId())
                .idCiudad(idCiudad)
                .descripcion(descripcion)
                .ubicacion(ubicacion)
                .build();
    }
}
