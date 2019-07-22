package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.gateway.TipoSoporteNutricionalRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoSoporteNutricionalUseCase {

    private TipoSoporteNutricionalRepository tipoSoporteNutricionalRepository;

    public Mono<TipoSoporteNutricional> crearTipoSoporteNutricional(TipoSoporteNutricional tipoSoporteNutricional) {
        return tipoSoporteNutricionalRepository.crearTipoSoporteNutricional(tipoSoporteNutricional);
    }

    public Flux<TipoSoporteNutricional> consultarTipoSoporteNutricional() {
        return tipoSoporteNutricionalRepository.consultarTipoSoporteNutricional();
    }

    public Mono<Void> eliminarTipoSoporteNutricional(String id) {
        return tipoSoporteNutricionalRepository.eliminarTipoSoporteNutricional(id);
    }
}
