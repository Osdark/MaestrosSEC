package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.peso.entity.Peso;
import co.com.sura.salud.sec.maestros.maestros.peso.gateway.PesoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class PesoUseCase {

    private PesoRepository pesoRepository;

    public Mono<Peso> crearPeso(Peso peso) {
        return pesoRepository.crearPeso(peso);
    }

    public Flux<Peso> consultarPeso() {
        return pesoRepository.consultarPeso();
    }

    public Mono<Void> eliminarPeso(String id) {
        return pesoRepository.eliminarPeso(id);
    }
}
