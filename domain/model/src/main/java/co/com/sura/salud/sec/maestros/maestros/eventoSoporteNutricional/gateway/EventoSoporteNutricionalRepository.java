package co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.gateway;

import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.entity.EventoSoporteNutricional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventoSoporteNutricionalRepository {

    Mono<EventoSoporteNutricional> creEventoSoporteNutricional(EventoSoporteNutricional eventoSoporteNutricional);

    Flux<EventoSoporteNutricional> consultarEventoSoporteNutricional();

    Mono<Void> eliminarEventoSoporteNutricional(String id);
}
