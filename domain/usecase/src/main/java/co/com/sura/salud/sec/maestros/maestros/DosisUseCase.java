package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.dosis.entity.Dosis;
import co.com.sura.salud.sec.maestros.maestros.dosis.gateway.DosisRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class DosisUseCase {

    private DosisRepository dosisRepository;

    public Mono<Dosis> crearDosis(Dosis dosis) {
        return dosisRepository.crearDosis(dosis);
    }

    public Flux<Dosis> consultarDosis() {
        return dosisRepository.consultarDosis();
    }

    public Mono<Void> eliminarDosis(String id) {
        return dosisRepository.eliminarDosis(id);
    }
}
