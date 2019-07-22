package co.com.sura.salud.sec.maestros.maestros.piso.gateway;

import co.com.sura.salud.sec.maestros.maestros.piso.entity.Piso;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PisoRepository {

    Mono<Piso> crearPiso(Piso piso);

    Flux<Piso> consultarPiso();

    Mono<Void> eliminarPiso(String idPiso);
}
