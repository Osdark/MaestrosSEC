package co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MotivoAplicacionCuidador {
    private String id;
    private String descripcion;

}
