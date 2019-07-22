package co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.gateway;

import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.entity.CentroEstadiaTemporal;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CentroEstadiaTemporalRepository {

    Mono<CentroEstadiaTemporal> crearCentroEstadiaTemporal(CentroEstadiaTemporal centroEstadiaTemporal);

    Flux<CentroEstadiaTemporal> consultarCentroEstadiaTemporal();

    Mono<Void> eliminarCentroEstadiaTemporal(String id);
}
