package co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.gateway;

import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.entity.MotivoCancelacion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MotivoCancelacionRepository {

    Mono<MotivoCancelacion> crearMotivoCancelacion(MotivoCancelacion motivoCancelacion);

    Flux<MotivoCancelacion> consultarMotivoCancelacion();

    Mono<Void> eliminarMOtiMotivoCancelacion(String id);
}
