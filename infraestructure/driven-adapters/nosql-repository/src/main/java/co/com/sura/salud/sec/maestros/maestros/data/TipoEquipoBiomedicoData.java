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
@Document(collection = "TipoEquipoBiomedico")
public class TipoEquipoBiomedicoData {

    @Id
    private String id;
    private String idEquipoBioMedico;
    private String descripcion;
    private List<String> equipos;
}
