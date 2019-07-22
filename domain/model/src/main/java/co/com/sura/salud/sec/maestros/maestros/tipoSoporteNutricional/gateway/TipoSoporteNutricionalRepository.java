package co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoSoporteNutricionalRepository {

    Mono<TipoSoporteNutricional> crearTipoSoporteNutricional(TipoSoporteNutricional tipoSoporteNutricional);

    Flux<TipoSoporteNutricional> consultarTipoSoporteNutricional();

    Mono<Void> eliminarTipoSoporteNutricional(String idTipo);
}
