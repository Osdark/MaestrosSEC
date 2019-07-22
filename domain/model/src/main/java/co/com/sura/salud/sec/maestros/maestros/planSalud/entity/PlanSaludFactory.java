package co.com.sura.salud.sec.maestros.maestros.planSalud.entity;

import generic.GenerateUniqueId;

public interface PlanSaludFactory extends GenerateUniqueId {

    default PlanSalud crearPlanSalud(
            String nombre, String nombreAseguradora, String idPlan
    ) {
        return PlanSalud.builder()
                .id(generateObjectId())
                .nombre(nombre)
                .nombreAseguradora(nombreAseguradora)
                .idPlan(idPlan)
                .build();
    }
}
