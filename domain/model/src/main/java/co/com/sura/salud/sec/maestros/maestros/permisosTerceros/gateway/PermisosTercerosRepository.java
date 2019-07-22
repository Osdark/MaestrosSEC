package co.com.sura.salud.sec.maestros.maestros.permisosTerceros.gateway;

import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.entity.PermisosTerceros;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PermisosTercerosRepository {

    Mono<PermisosTerceros> crearPermisosTerceros(PermisosTerceros permisosTerceros);

    Flux<PermisosTerceros> consultarPermisosTerceros();

    Mono<Void> eliminarPermisosTerceros(String id);
}
