package co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.gateway;

import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.entity.MotivoAplicacionCuidador;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MotivoAplicacionCuidadorRepository {

    Mono<MotivoAplicacionCuidador> crearMotivoAplicacionCuidador(MotivoAplicacionCuidador motivoAplicacionCuidador);

    Flux<MotivoAplicacionCuidador> consultarMotivoAplicacionCuidador();

    Mono<Void> eliminarMotivoAplicacionCuidador(String id);
}
