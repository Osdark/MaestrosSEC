package co.com.sura.salud.sec.maestros.maestros.motivoEgreso.gateway;

import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.entity.MotivoEgreso;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.*;

public interface MotivoEgresoRepository {

    Mono<MotivoEgreso> crearMotivoEgreso(MotivoEgreso motivoEgreso);

    Flux<MotivoEgreso> consultarMotivoEgreso();

    Mono<Void> eliminarMotivoEgreso(String id);
}
