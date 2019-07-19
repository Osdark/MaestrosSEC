package co.com.sura.salud.sec.maestros.maestros.tipoNutricion.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity.TipoMuestra;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoNutricion {

    Mono<TipoNutricion> crearTipoNutricion(TipoNutricion tipoNutricion);

    Flux<TipoNutricion> consultarTipoNutricion();

    Mono<TipoNutricion> editarTipoNutricion(String tipo);
}
