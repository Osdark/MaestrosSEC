package co.com.sura.salud.sec.maestros.maestros.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "NovedadesPorTipoAdmision")
public class NovedadesPorTipoAdmisionData {

    @Id
    private String id;
    private String tipoAtencion;
    private String codigoPiso;
    private Boolean enviarProgramacion;
    private List<String> tipoNovedad;
}
