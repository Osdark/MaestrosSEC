package co.com.sura.salud.sec.maestros.maestros.frecuencia.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Frecuencia {
    private String id;
    private String idFrecuencia;
    private String tipo;
    private String descripcion;
}
