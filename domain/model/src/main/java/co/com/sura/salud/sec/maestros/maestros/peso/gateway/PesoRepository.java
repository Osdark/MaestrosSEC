package co.com.sura.salud.sec.maestros.maestros.peso.gateway;

import co.com.sura.salud.sec.maestros.maestros.peso.entity.Peso;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PesoRepository {

    Mono<Peso> crearPeso(Peso peso);

    Flux<Peso> consultarPeso();

    Mono<Void> eliminarPeso(String id);
}
