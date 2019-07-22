package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.entity.MotivoAplicacionCuidador;
import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.gateway.MotivoAplicacionCuidadorRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MotivoAplicacionCuidadorUseCase {

    private MotivoAplicacionCuidadorRepository motivoAplicacionCuidadorRepository;

    public Mono<MotivoAplicacionCuidador> crearMotivoAplicacionCuidador(
            MotivoAplicacionCuidador motivoAplicacionCuidador
    ) {
        return motivoAplicacionCuidadorRepository.crearMotivoAplicacionCuidador(motivoAplicacionCuidador);
    }

    public Flux<MotivoAplicacionCuidador> consultarMotivoAplicacionCuidador() {
        return motivoAplicacionCuidadorRepository.consultarMotivoAplicacionCuidador();
    }

    public Mono<Void> eliminarMotivoAplicacionCuidador(String id) {
        return motivoAplicacionCuidadorRepository.eliminarMotivoAplicacionCuidador(id);
    }
}
