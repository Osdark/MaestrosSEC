package co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TiposIdentificacion {
    private String id;
    private String idTipo;
    private String nombre;
    private String codigoPos;
    private String codigoSura;
}
