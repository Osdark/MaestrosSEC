package co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.entity;

import generic.GenerateUniqueId;

import java.util.List;

public interface TipoEquipoBiomedicoFactory extends GenerateUniqueId {

    default TipoEquipoBiomedico crearTipoEquipoBiomedico(
            String idEquipoBiomedico, String descripcion, List<String> equipos
    ) {
        return TipoEquipoBiomedico.builder()
                .id(generateObjectId())
                .idEquipoBioMedico(idEquipoBiomedico)
                .descripcion(descripcion)
                .equipos(equipos)
                .build();
    }
}
