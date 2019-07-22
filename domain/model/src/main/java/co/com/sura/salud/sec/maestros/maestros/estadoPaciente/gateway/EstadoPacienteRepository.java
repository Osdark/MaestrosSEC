package co.com.sura.salud.sec.maestros.maestros.estadoPaciente.gateway;

import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.entity.EstadoPaciente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EstadoPacienteRepository {

    Mono<EstadoPaciente> crearEstadoPaciente(EstadoPaciente estadoPaciente);

    Flux<EstadoPaciente> consultarEstadoPaciente();

    Mono<Void> eliminarEstadoPaciente(String id);
}
