package co.com.sura.salud.sec.maestros.maestros.permisosTerceros;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PermisosTerceros {
    private String id;
    private String nombreTercero;
    private List<String> usuarios;
}
