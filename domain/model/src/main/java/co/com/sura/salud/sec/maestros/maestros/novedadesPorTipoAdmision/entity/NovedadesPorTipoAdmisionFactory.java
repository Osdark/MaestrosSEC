package co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision;

import java.util.List;

public interface NovedadesPorTipoAdmisionFactory {

    default NovedadesPorTipoAdmision crearNovedadesPorTipoAdmision(
            String tipoAtencion, String codigoPiso, Boolean enviarProgramacion, List<String> tipoNovedad
    ) {
        return NovedadesPorTipoAdmision.builder()
                .tipoAtencion(tipoAtencion)
                .codigoPiso(codigoPiso)
                .enviarProgramacion(enviarProgramacion)
                .tipoNovedad(tipoNovedad)
                .build();
    }
}
