package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.entity.MotivoCancelacion;
import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.gateway.MotivoCancelacionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MotivoCancelacionUseCase {

    private MotivoCancelacionRepository motivoCancelacionRepository;

    public Mono<MotivoCancelacion> crearMotivoCancelacion(MotivoCancelacion motivoCancelacion) {
        return motivoCancelacionRepository.crearMotivoCancelacion(motivoCancelacion);
    }

    public Flux<MotivoCancelacion> consultarMotivoCancelacion() {
        return motivoCancelacionRepository.consultarMotivoCancelacion();
    }

    public Mono<Void> eliminarMotivoCancelacion(String id) {
        return motivoCancelacionRepository.eliminarMOtiMotivoCancelacion(id);
    }
}
