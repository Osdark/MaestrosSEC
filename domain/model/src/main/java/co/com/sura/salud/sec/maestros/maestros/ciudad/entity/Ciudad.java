package co.com.sura.salud.sec.maestros.maestros.ciudad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Ciudad {
    private String id;
    private String idCiudad;
    private String nombre;
    private String codigoDANE;
    private String codigoIPS;
}

