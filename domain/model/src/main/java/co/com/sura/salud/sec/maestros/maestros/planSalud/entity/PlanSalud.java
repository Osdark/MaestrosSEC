package co.com.sura.salud.sec.maestros.maestros.planSalud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PlanSalud {
    private String id;
    private String nombre;
    private String nombreAseguradora;
    private String idPlan;
}
