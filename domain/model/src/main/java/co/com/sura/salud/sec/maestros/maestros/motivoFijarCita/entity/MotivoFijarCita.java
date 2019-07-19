package co.com.sura.salud.sec.maestros.maestros.motivoFijarCita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MotivoFijarCita {
    private String id;
    private String idMotivo;
    private String descripcion;

}
