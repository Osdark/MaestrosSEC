package co.com.sura.salud.sec.maestros.maestros.data;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "EventoSoporteNutricional")
public class EventoSoporteNutricionalData {

    @Id
    private String id;
    private Frecuencia frecuencia;
    private TipoSoporteNutricional tipoEvento;
    private ArrayList<Object> diasEvento;
    private Integer diasTratamiento;
}
