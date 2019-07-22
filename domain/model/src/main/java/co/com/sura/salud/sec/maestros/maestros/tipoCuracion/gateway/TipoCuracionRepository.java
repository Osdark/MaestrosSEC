package co.com.sura.salud.sec.maestros.maestros.tipoCuracion.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.entity.TipoCuracion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoCuracionRepository {

    Mono<TipoCuracion> crearTipoCuracion(TipoCuracion tipoCuracion);

    Flux<TipoCuracion> consultarTipoCuracion();

    Mono<Void> eliminarTipoCuracion(String id);
}
