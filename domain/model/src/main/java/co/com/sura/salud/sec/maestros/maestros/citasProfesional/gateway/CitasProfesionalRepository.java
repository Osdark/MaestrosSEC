package co.com.sura.salud.sec.maestros.maestros.citasProfesional.gateway;

import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CitasProfesionalRepository {

    Mono<CitasProfesional> crearCitasProfesional(CitasProfesional citasProfesional);

    Flux<CitasProfesional> consultarCitasProfesional();

    Mono<Void> eliminarCitasProfesional(String idCita);
}
