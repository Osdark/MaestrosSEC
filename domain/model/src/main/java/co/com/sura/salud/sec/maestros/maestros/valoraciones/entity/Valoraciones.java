package co.com.sura.salud.sec.maestros.maestros.valoraciones.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Valoraciones {
    private String id;
    private String idValoracion;
    private String nombre;
    private String idTipo;
}

