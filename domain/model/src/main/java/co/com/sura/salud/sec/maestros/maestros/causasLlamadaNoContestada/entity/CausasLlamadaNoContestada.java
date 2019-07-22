package co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CausasLlamadaNoContestada {
    private String id;
    private String idCausa;
    private String nombreCausa;
}
