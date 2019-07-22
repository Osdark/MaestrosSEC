package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.entity.EstadoPaciente;
import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.gateway.EstadoPacienteRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EstadoPacienteUseCase {

    private EstadoPacienteRepository estadoPacienteRepository;

    public Mono<EstadoPaciente> crearEstadoPaciente(EstadoPaciente estadoPaciente) {
        return estadoPacienteRepository.crearEstadoPaciente(estadoPaciente);
    }

    public Flux<EstadoPaciente> consultarEstadoPaciente() {
        return estadoPacienteRepository.consultarEstadoPaciente();
    }

    public Mono<Void> eliminarEstadoPaciente(String id) {
        return estadoPacienteRepository.eliminarEstadoPaciente(id);
    }
}
