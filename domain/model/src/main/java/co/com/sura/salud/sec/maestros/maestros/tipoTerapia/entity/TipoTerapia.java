package co.com.sura.salud.sec.maestros.maestros.tipoTerapia;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TipoTerapia {
    private String id;
    private String idTipoTerapia;
    private String descripcion;
}
