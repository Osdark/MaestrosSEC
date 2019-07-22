package co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TipoNutricion {
    private String id;
    private String tipo;
    private String idTipo;
    private String idNutricion;
    private String descripcion;
}
