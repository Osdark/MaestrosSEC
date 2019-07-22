package co.com.sura.salud.sec.maestros.maestros.diagnostico.gateway;

import co.com.sura.salud.sec.maestros.maestros.diagnostico.entity.Diagnostico;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DiagnosticoRepository {

    Mono<Diagnostico> crearDiagnostico(Diagnostico diagnostico);

    Flux<Diagnostico> consultarDiagnostico();

    Mono<Void> eliminarDiagnostico(String id);
}
