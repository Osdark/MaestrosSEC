package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.profesional.entity.Profesional;
import co.com.sura.salud.sec.maestros.maestros.profesional.gateway.ProfesionalRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ProfesionalUseCase {

    private ProfesionalRepository profesionalRepository;

    public Mono<Profesional> crearProfesional(Profesional profesional) {
        return profesionalRepository.crearProfesional(profesional);
    }

    public Flux<Profesional> consultarProfesional() {
        return profesionalRepository.consultarProfesional();
    }

    public Mono<Void> eliminarProfesional(String id) {
        return profesionalRepository.eliminarProfesional(id);
    }
}
