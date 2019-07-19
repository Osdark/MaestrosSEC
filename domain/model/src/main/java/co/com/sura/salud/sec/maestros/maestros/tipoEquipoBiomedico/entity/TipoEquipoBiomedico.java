package co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor
public class TipoEquipoBiomedico {
    private String id;
    private String idEquipoBioMedico;
    private String descripcion;
    private List<String> equipos;
}
