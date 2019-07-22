package co.com.sura.salud.sec.maestros.maestros.municipio.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Municipio {
    private String id;
    private String nombre;
    private String idCiudad;
    private String idMunicipio;
    private double longitud;
    private double latitud;
}
