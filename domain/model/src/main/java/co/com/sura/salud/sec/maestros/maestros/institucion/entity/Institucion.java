package co.com.sura.salud.sec.maestros.maestros.institucion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Institucion {
    private String id;
    private String idInstitucion;
    private String idCiudad;
    private String nombre;
}
