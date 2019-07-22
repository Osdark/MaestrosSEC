package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.entity.NovedadesPorTipoAdmision;
import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.gateway.NovedadesPorTipoAdmisionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class NovedadesPorTipoAdmisionUseCase {

    private NovedadesPorTipoAdmisionRepository novedadesPorTipoAdmisionRepository;

    public Mono<NovedadesPorTipoAdmision> crearNovedadesPorTipoAdmision(
            NovedadesPorTipoAdmision novedadesPorTipoAdmision
    ) {
        return novedadesPorTipoAdmisionRepository.crearNovedadesPorTipoAdmision(novedadesPorTipoAdmision);
    }

    public Flux<NovedadesPorTipoAdmision> consultarNovedadesPorTipoAdmision() {
        return novedadesPorTipoAdmisionRepository.consultarNovedadesPorTipoAdmision();
    }

    public Mono<Void> eliminarNovedadesPorTipoAdmision(String id) {
        return novedadesPorTipoAdmisionRepository.eliminarNovedadesPorTipoAdmision(id);
    }
}
