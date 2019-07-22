package co.com.sura.salud.sec.maestros.maestros.dosis.gateway;

import co.com.sura.salud.sec.maestros.maestros.dosis.entity.Dosis;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DosisRepository {

    Mono<Dosis> crearDosis(Dosis dosis);

    Flux<Dosis> consultarDosis();

    Mono<Void> eliminarDosis(String id);
}
