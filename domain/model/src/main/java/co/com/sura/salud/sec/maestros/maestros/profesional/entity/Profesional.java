package co.com.sura.salud.sec.maestros.maestros.profesional;

import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Profesional {
    private String id;
    private String idProfesion;
    private String profesion;
    private String especialidad;
    private List<CitasProfesional> profesionalList;
}
