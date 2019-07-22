package co.com.sura.salud.sec.maestros.maestros.tipoNutricion.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity.TipoNutricion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoNutricionRepository {

    Mono<TipoNutricion> crearTipoNutricion(TipoNutricion tipoNutricion);

    Flux<TipoNutricion> consultarTipoNutricion();

    Mono<Void> eliminarTipoNutricion(String tipo);
}
