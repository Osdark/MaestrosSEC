package co.com.sura.salud.sec.maestros.maestros.proveedor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Proveedor {
    private String idProveedor;
    private String descripcion;
}
