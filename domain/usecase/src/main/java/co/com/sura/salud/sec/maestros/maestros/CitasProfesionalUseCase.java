package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import co.com.sura.salud.sec.maestros.maestros.citasProfesional.gateway.CitasProfesionalRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CitasProfesionalUseCase {

    private CitasProfesionalRepository citasProfesionalRepository;

    public Mono<CitasProfesional> crearCitasProfesional(CitasProfesional citasProfesional) {
        return citasProfesionalRepository.crearCitasProfesional(citasProfesional);
    }

    public Flux<CitasProfesional> consultarCitasProfesional() {
        return citasProfesionalRepository.consultarCitasProfesional();
    }

    public Mono<Void> eliminarCitasProfesional(String id) {
        return citasProfesionalRepository.eliminarCitasProfesional(id);
    }
}
