package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.diagnostico.entity.Diagnostico;
import co.com.sura.salud.sec.maestros.maestros.diagnostico.gateway.DiagnosticoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class DiagnosticoUseCase {

    private DiagnosticoRepository diagnosticoRepository;

    public Mono<Diagnostico> crearDiagnostico(Diagnostico diagnostico) {
        return diagnosticoRepository.crearDiagnostico(diagnostico);
    }

    public Flux<Diagnostico> consultarDiagnostico() {
        return diagnosticoRepository.consultarDiagnostico();
    }

    public Mono<Void> eliminarDiagnostico(String id) {
        return diagnosticoRepository.eliminarDiagnostico(id);
    }

}
