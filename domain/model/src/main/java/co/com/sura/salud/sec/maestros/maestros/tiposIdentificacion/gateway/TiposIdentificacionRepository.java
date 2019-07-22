package co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.gateway;

import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity.TiposIdentificacion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TiposIdentificacionRepository {

    Mono<TiposIdentificacion> crearTiposIdentificacion(TiposIdentificacion tiposIdentificacion);

    Flux<TiposIdentificacion> consultarTiposIdentificacion();

    Mono<Void> eliminarTiposIdentificacion(String id);

}
