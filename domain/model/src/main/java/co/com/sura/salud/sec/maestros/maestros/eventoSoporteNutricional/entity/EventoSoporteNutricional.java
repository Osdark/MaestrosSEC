package co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.entity;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
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
