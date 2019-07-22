package co.com.sura.salud.sec.maestros.maestros.institucion.gateway;

import co.com.sura.salud.sec.maestros.maestros.institucion.entity.Institucion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InstitucionRepository {

    Mono<Institucion> crearInstitucion(Institucion institucion);

    Flux<Institucion> consultarInstitucion();

    Mono<Void> eliminarInstitucion(String id);
}
