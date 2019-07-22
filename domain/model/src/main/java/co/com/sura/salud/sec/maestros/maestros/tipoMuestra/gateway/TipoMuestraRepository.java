package co.com.sura.salud.sec.maestros.maestros.tipoMuestra.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity.TipoMuestra;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoMuestraRepository {

    Mono<TipoMuestra> crearTipoMuestra(TipoMuestra tipoMuestra);

    Flux<TipoMuestra> consultarTipoMuestra();

    Mono<Void> eliminarTipoMuestra(String idTomaMuestra);
}
