package co.com.sura.salud.sec.maestros.maestros.frecuencia.gateway;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FrecuenciaRepository {

    Mono<Frecuencia> crearFrecuencia(Frecuencia frecuencia);

    Flux<Frecuencia> consultaFrecuencia();

    Mono<Void> eliminarFrecuencia(String id);
}
