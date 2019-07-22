package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.entity.MotivoEgreso;
import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.gateway.MotivoEgresoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MotivoEgresoUseCase {

    private MotivoEgresoRepository motivoEgresoRepository;

    public Mono<MotivoEgreso> crearMotivoEgreso(MotivoEgreso motivoEgreso) {
        return motivoEgresoRepository.crearMotivoEgreso(motivoEgreso);
    }

    public Flux<MotivoEgreso> consultarMotivoEgreso() {
        return motivoEgresoRepository.consultarMotivoEgreso();
    }

    public Mono<Void> eliminarMotivoEgreso(String id) {
        return motivoEgresoRepository.eliminarMotivoEgreso(id);
    }
}
