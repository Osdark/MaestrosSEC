package co.com.sura.salud.sec.maestros.maestros.motivoEgreso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MotivoEgreso {
    private String id;
    private String idMotivo;
    private String descripcion;

}
