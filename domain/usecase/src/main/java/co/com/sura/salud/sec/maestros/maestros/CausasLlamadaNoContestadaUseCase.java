package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity.CausasLlamadaNoContestada;
import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.gateway.CausasLlamadaNoContestadaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CausasLlamadaNoContestadaUseCase {

    private CausasLlamadaNoContestadaRepository causasLlamadaNoContestadaRepository;

    public Mono<CausasLlamadaNoContestada> crearCausasLlamadaNoContestada(
            CausasLlamadaNoContestada causasLlamadaNoContestada
    ) {
        return causasLlamadaNoContestadaRepository.crearCausasLlamadaNoContestada(causasLlamadaNoContestada);
    }

    public Flux<CausasLlamadaNoContestada> consultarCausasLlamadaNoContestada() {
        return causasLlamadaNoContestadaRepository.consultarCausasLlamadaNoContestada();
    }

    public Mono<Void> eliminarCausasLlamadaNoContestada(String id) {
        return causasLlamadaNoContestadaRepository.eliminarCausasLlamadaNoContestada(id);
    }
}
