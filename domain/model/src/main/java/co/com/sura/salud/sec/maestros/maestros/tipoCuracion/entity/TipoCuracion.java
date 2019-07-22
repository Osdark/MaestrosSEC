package co.com.sura.salud.sec.maestros.maestros.tipoCuracion.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TipoCuracion {
    private String id;
    private String idTipoCuracion;
    private String descripcion;
}
