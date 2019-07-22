package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.programa.entity.Programa;
import co.com.sura.salud.sec.maestros.maestros.programa.gateway.ProgramaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ProgramaUseCase {

    private ProgramaRepository programaRepository;

    public Mono<Programa> crearPrograma(Programa programa) {
        return programaRepository.crearPrograma(programa);
    }

    public Flux<Programa> consultarPrograma() {
        return programaRepository.consultarPrograma();
    }

    public Mono<Void> eliminarPrograma(String id) {
        return programaRepository.eliminarPrograma(id);
    }
}
