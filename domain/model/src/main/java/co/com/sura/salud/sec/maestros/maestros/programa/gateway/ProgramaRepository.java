package co.com.sura.salud.sec.maestros.maestros.programa.gateway;

import co.com.sura.salud.sec.maestros.maestros.programa.entity.Programa;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProgramaRepository {

    Mono<Programa> crearPrograma(Programa programa);

    Flux<Programa> consultarPrograma();

    Mono<Void> eliminarPrograma(String id);
}
