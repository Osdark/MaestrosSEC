package co.com.sura.salud.sec.maestros.maestros.tipoSondaje;

import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TipoSondaje {
    private String id;
    private String idTipo;
    private String tipo;
    private List<ListaSondaje> listaSondaje;
}
