package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity.TipoNutricion;
import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.gateway.TipoNutricionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoNutricionUseCase {

    private TipoNutricionRepository tipoNutricionRepository;

    public Mono<TipoNutricion> crearTipoNutricion(TipoNutricion tipoNutricion) {
        return tipoNutricionRepository.crearTipoNutricion(tipoNutricion);
    }

    public Flux<TipoNutricion> consultarTipoNutricion() {
        return tipoNutricionRepository.consultarTipoNutricion();
    }

    public Mono<Void> eliminarTipoNutricion(String id) {
        return tipoNutricionRepository.eliminarTipoNutricion(id);
    }
}
