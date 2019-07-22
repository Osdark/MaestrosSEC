package co.com.sura.salud.sec.maestros.maestros.municipio.gateway;

import co.com.sura.salud.sec.maestros.maestros.municipio.entity.Municipio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MunicipioRepository {

    Mono<Municipio> crearMunicipio(Municipio municipio);

    Flux<Municipio> consultarMunicipio();

    Mono<Void> eliminarMunicipio(String id);
}
