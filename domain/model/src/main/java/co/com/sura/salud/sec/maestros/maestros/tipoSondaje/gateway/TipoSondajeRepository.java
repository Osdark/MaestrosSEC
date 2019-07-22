package co.com.sura.salud.sec.maestros.maestros.tipoSondaje.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.entity.TipoSondaje;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoSondajeRepository {

    Mono<TipoSondaje> crearTipoSondaje(TipoSondaje tipoSondaje);

    Flux<TipoSondaje> consultarTipoSondaje();

    Mono<Void> eliminarTipoSondaje(String id);
}
