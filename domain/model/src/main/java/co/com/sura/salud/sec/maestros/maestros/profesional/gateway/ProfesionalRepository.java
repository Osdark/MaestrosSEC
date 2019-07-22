package co.com.sura.salud.sec.maestros.maestros.profesional.gateway;

import co.com.sura.salud.sec.maestros.maestros.profesional.entity.Profesional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProfesionalRepository {

    Mono<Profesional> crearProfesional(Profesional profesional);

    Flux<Profesional> consultarProfesional();

    Mono<Void> eliminarProfesional(String id);
}
