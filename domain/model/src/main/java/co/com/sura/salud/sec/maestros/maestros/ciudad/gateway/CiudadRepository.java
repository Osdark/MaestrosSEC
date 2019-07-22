package co.com.sura.salud.sec.maestros.maestros.ciudad.gateway;

import co.com.sura.salud.sec.maestros.maestros.ciudad.entity.Ciudad;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CiudadRepository {

    Mono<Ciudad> crearCiudad(Ciudad ciudad);

    Flux<Ciudad> consultarCiudad();

    Mono<Void> eliminarCiudad(String id);
}
