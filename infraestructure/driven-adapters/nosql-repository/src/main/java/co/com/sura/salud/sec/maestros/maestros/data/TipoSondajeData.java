package co.com.sura.salud.sec.maestros.maestros.data;

import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "TipoSondaje")
public class TipoSondajeData {

    @Id
    private String id;
    private String idTipo;
    private String tipo;
    private List<ListaSondaje> listaSondaje;
}
