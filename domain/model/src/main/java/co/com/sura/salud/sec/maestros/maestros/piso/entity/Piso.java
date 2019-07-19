package co.com.sura.salud.sec.maestros.maestros.piso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Piso {
    private String idPiso;
    private String nombre;
    private String idCiudad;
    private String tipoPiso;
    private String idPrograma;
}