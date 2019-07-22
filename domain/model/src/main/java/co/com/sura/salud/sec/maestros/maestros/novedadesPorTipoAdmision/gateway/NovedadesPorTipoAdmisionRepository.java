package co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.gateway;

import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.entity.NovedadesPorTipoAdmision;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NovedadesPorTipoAdmisionRepository {

    Mono<NovedadesPorTipoAdmision> crearNovedadesPorTipoAdmision(NovedadesPorTipoAdmision novedadesPorTipoAdmision);

    Flux<NovedadesPorTipoAdmision> consultarNovedadesPorTipoAdmision();

    Mono<Void> eliminarNovedadesPorTipoAdmision(String id);
}
