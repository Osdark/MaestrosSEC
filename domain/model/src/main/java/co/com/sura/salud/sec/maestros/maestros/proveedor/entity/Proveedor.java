package co.com.sura.salud.sec.maestros.maestros.proveedor.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Proveedor {
    private String id;
    private String idProveedor;
    private String descripcion;
}
