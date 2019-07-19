package co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CentroEstadiaTemporal {
    private String id;
    private String idCiudad;
    private String nombre;
}
