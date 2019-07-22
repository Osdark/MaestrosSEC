package co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class NovedadesPorTipoAdmision {
    private String id;
    private String tipoAtencion;
    private String codigoPiso;
    private Boolean enviarProgramacion;
    private List<String> tipoNovedad;
}
