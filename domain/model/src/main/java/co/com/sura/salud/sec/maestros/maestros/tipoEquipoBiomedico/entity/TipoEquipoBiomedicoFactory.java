package co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico;

import java.util.List;

public interface TipoEquipoBiomedicoFactory {

    default TipoEquipoBiomedico crearTipoEquipoBiomedico(
            String id, String idEquipoBiomedico, String descripcion, List<String> equipos
    ) {
        return TipoEquipoBiomedico.builder()
                .id(id)
                .idEquipoBioMedico(idEquipoBiomedico)
                .descripcion(descripcion)
                .equipos(equipos)
                .build();
    }
}
