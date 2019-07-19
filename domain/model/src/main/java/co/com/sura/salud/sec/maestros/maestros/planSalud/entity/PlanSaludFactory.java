package co.com.sura.salud.sec.maestros.maestros.planSalud;

public interface PlanSaludFactory {

    default PlanSalud crearPlanSalud(
            String id, String nombre, String nombreAseguradora, String idPlan
    ) {
        return PlanSalud.builder()
                .id(id)
                .nombre(nombre)
                .nombreAseguradora(nombreAseguradora)
                .idPlan(idPlan)
                .build();
    }
}
