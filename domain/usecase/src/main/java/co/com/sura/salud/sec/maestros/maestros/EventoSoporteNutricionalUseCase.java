package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.entity.EventoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.gateway.EventoSoporteNutricionalRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EventoSoporteNutricionalUseCase {

    private EventoSoporteNutricionalRepository eventoSoporteNutricionalRepository;

    public Mono<EventoSoporteNutricional> crearEventoSoporteNutricional(
            EventoSoporteNutricional eventoSoporteNutricional
    ) {
        return eventoSoporteNutricionalRepository.creEventoSoporteNutricional(eventoSoporteNutricional);
    }

    public Flux<EventoSoporteNutricional> consultarEventoSoporteNutricional() {
        return eventoSoporteNutricionalRepository.consultarEventoSoporteNutricional();
    }

    public Mono<Void> eliminarEventoSoporteNutricional(String id) {
        return eventoSoporteNutricionalRepository.eliminarEventoSoporteNutricional(id);
    }
}
