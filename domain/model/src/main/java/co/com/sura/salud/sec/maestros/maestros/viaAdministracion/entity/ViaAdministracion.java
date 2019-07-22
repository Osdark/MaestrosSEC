package co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ViaAdministracion {
    private String id;
    private String idViaAdministracion;
    private String tipo;
    private String descripcion;
}
