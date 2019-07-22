package co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CitasProfesional {
    private String id;
    private String idCita;
    private String tipoCita;
}
