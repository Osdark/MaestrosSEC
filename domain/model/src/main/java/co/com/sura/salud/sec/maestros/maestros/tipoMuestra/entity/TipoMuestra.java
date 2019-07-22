package co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TipoMuestra {
    private String id;
    private String idTomaMuestra;
    private String descripcion;
}
