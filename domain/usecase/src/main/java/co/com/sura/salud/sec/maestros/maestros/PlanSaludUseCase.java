package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.planSalud.entity.PlanSalud;
import co.com.sura.salud.sec.maestros.maestros.planSalud.gateway.PlanSaludRepository;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class PlanSaludUseCase {

    private PlanSaludRepository planSaludRepository;

    public Mono<PlanSalud> crearPlanSalud(PlanSalud planSalud) {
        return planSaludRepository.crearPlanSalud(planSalud);
    }

    public Flux<PlanSalud> consultarPlanSalud() {
        return planSaludRepository.consultarPlanSalud();
    }

    public Mono<Void> eliminarPlanSalud(String id) {
        return planSaludRepository.eliminarPlanSalud(id);
    }
}
