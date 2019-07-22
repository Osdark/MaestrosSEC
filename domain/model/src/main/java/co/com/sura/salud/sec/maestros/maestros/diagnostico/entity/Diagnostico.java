package co.com.sura.salud.sec.maestros.maestros.diagnostico.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Diagnostico {
    private String id;
    private String codigo;
    private String nombre;
}

