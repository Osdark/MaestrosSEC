package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity.TiposIdentificacion;
import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.gateway.TiposIdentificacionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TiposIdentificacionUseCase {

    private TiposIdentificacionRepository tiposIdentificacionRepository;

    public Mono<TiposIdentificacion> crearTiposIdentificacion(TiposIdentificacion tiposIdentificacion) {
        return tiposIdentificacionRepository.crearTiposIdentificacion(tiposIdentificacion);
    }

    public Flux<TiposIdentificacion> consultarTiposIdentificacion() {
        return tiposIdentificacionRepository.consultarTiposIdentificacion();
    }

    public Mono<Void> eliminarTiposIdentificacion(String id) {
        return tiposIdentificacionRepository.eliminarTiposIdentificacion(id);
    }
}
