package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity.TipoMuestra;
import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.gateway.TipoMuestraRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoMuestraUseCase {

    private TipoMuestraRepository tipoMuestraRepository;

    public Mono<TipoMuestra> crearTipoMuestra(TipoMuestra tipoMuestra) {
        return tipoMuestraRepository.crearTipoMuestra(tipoMuestra);
    }

    public Flux<TipoMuestra> consultarTipoMuestra() {
        return tipoMuestraRepository.consultarTipoMuestra();
    }

    public Mono<Void> eliminarTipoMuestra(String id) {
        return tipoMuestraRepository.eliminarTipoMuestra(id);
    }
}
