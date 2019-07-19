package co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class SedesSaludEnCasa {
    private String id;
    private String idCiudad;
    private String descripcion;
    private Object ubicacion;
}
