package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.piso.entity.Piso;
import co.com.sura.salud.sec.maestros.maestros.piso.gateway.PisoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class PisoUseCase {

    private PisoRepository pisoRepository;

    public Mono<Piso> crearPiso(Piso piso) {
        return pisoRepository.crearPiso(piso);
    }

    public Flux<Piso> consultarPiso() {
        return pisoRepository.consultarPiso();
    }

    public Mono<Void> eliminarPiso(String id) {
        return pisoRepository.eliminarPiso(id);
    }
}
