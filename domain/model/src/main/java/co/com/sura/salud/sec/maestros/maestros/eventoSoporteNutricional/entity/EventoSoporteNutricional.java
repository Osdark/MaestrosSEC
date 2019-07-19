package co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.TipoSoporteNutricional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class EventoSoporteNutricional {
    private String id;
    private Frecuencia frecuencia;
    private TipoSoporteNutricional tipoEvento;
    private ArrayList<Object> diasEvento;
    private Integer diasTratamiento;
}
