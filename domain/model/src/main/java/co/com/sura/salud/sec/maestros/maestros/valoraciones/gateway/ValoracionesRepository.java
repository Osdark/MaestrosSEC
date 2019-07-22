package co.com.sura.salud.sec.maestros.maestros.valoraciones.gateway;

import co.com.sura.salud.sec.maestros.maestros.valoraciones.entity.Valoraciones;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ValoracionesRepository {

    Mono<Valoraciones> crearValoraciones(Valoraciones valoraciones);

    Flux<Valoraciones> consultarValoraciones();

    Mono<Void> eliminarValoraciones(String id);
}
