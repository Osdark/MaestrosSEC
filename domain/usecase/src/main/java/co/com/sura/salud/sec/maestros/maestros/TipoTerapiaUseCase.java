package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.entity.TipoTerapia;
import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.gateway.TipoTerapiaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoTerapiaUseCase {

    private TipoTerapiaRepository tipoTerapiaRepository;

    public Mono<TipoTerapia> crearTipoTerapia(TipoTerapia tipoTerapia) {
        return tipoTerapiaRepository.crearTipoTerapia(tipoTerapia);
    }

    public Flux<TipoTerapia> consultarTipoTerapia() {
        return tipoTerapiaRepository.consultarTipoTerapia();
    }

    public Mono<Void> eliminarTipoTerapia(String id) {
        return tipoTerapiaRepository.eliminarTipoTerapia(id);
    }
}
