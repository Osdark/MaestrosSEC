package co.com.sura.salud.sec.maestros.maestros.planSalud.gateway;

import co.com.sura.salud.sec.maestros.maestros.planSalud.entity.PlanSalud;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlanSaludRepository {

    Mono<PlanSalud> crearPlanSalud(PlanSalud planSalud);

    Flux<PlanSalud> consultarPlanSalud();

    Mono<Void> eliminarPlanSalud(String id);
}
