package co.com.sura.salud.sec.maestros.maestros.programa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Programa {
    private String id;
    private String idPrograma;
    private String nombre;
    private String especialidad;
    private String profesional;
    private boolean citaAutomatica;
}
