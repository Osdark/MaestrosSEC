package co.com.sura.salud.sec.maestros.maestros.tipoTerapia.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.entity.TipoTerapia;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoTerapiaRepository {

    Mono<TipoTerapia> crearTipoTerapia(TipoTerapia tipoTerapia);

    Flux<TipoTerapia> consultarTipoTerapia();

    Mono<Void> eliminarTipoTerapia(String id);
}
