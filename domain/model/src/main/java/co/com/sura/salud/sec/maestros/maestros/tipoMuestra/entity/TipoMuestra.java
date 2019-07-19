package co.com.sura.salud.sec.maestros.maestros.tipoMuestra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TipoMuestra {
    private String idTomaMuestra;
    private String descripcion;
}
