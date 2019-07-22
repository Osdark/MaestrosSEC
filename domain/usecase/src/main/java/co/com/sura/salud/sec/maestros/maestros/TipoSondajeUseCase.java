package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.entity.TipoSondaje;
import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.gateway.TipoSondajeRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoSondajeUseCase {

    private TipoSondajeRepository tipoSondajeRepository;

    public Mono<TipoSondaje> crearTipoSondaje(TipoSondaje tipoSondaje) {
        return tipoSondajeRepository.crearTipoSondaje(tipoSondaje);
    }

    public Flux<TipoSondaje> consultarTipoSondaje() {
        return tipoSondajeRepository.consultarTipoSondaje();
    }

    public Mono<Void> eliminarTipoSondaje(String id) {
        return tipoSondajeRepository.eliminarTipoSondaje(id);
    }
}
