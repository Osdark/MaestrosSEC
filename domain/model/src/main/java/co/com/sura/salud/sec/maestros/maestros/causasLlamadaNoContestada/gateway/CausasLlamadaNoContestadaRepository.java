package co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.gateway;

import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity.CausasLlamadaNoContestada;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CausasLlamadaNoContestadaGateway {

    Mono<CausasLlamadaNoContestada> crearCausasLlamadaNoContestada();

    Flux<CausasLlamadaNoContestada> consultarCausasLlamadaNoContestada();

    Mono<CausasLlamadaNoContestada> editaCausasLlamadaNoContestada();
}
