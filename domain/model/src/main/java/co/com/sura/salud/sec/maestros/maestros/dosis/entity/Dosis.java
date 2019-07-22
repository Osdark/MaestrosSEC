package co.com.sura.salud.sec.maestros.maestros.dosis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Dosis {
    private String id;
    private String idDosis;
    private String tipo;
    private String descripcion;
}
