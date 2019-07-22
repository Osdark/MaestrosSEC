package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.entity.CentroEstadiaTemporal;
import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.gateway.CentroEstadiaTemporalRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CentroEstadiaTemporalUseCase {

    private CentroEstadiaTemporalRepository centroEstadiaTemporalRepository;

    public Mono<CentroEstadiaTemporal> crearCentroEstadiaTemporal(CentroEstadiaTemporal centroEstadiaTemporal) {
        return centroEstadiaTemporalRepository.crearCentroEstadiaTemporal(centroEstadiaTemporal);
    }

    public Flux<CentroEstadiaTemporal> consultarCentroEstadiaTemporal() {
        return centroEstadiaTemporalRepository.consultarCentroEstadiaTemporal();
    }

    public Mono<Void> eliminarCentroEstadiaTemporal(String id) {
        return centroEstadiaTemporalRepository.eliminarCentroEstadiaTemporal(id);
    }
}
