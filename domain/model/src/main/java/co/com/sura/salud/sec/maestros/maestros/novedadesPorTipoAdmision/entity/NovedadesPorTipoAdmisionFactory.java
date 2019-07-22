package co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.entity;

import generic.GenerateUniqueId;

import java.util.List;

public interface NovedadesPorTipoAdmisionFactory extends GenerateUniqueId {

    default NovedadesPorTipoAdmision crearNovedadesPorTipoAdmision(
            String tipoAtencion, String codigoPiso, Boolean enviarProgramacion, List<String> tipoNovedad
    ) {
        return NovedadesPorTipoAdmision.builder()
                .id(generateObjectId())
                .tipoAtencion(tipoAtencion)
                .codigoPiso(codigoPiso)
                .enviarProgramacion(enviarProgramacion)
                .tipoNovedad(tipoNovedad)
                .build();
    }
}
