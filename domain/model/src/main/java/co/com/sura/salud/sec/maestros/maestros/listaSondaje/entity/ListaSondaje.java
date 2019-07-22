package co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ListaSondaje {
    private String id;
    private String idTipoSondaje;
    private String descripcion;
}
