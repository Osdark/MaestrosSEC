package co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TipoSoporteNutricional {
    private String id;
    private String idTipo;
    private String descripcion;
}

