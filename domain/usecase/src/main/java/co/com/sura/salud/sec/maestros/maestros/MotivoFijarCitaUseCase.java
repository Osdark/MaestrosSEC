package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.entity.MotivoFijarCita;
import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.gateway.MotivoFijarCitaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MotivoFijarCitaUseCase {

    private MotivoFijarCitaRepository motivoFijarCitaRepository;

    public Mono<MotivoFijarCita> crearMotivoFijarCita(MotivoFijarCita motivoFijarCita) {
        return motivoFijarCitaRepository.crearmoMotivoFijarCita(motivoFijarCita);
    }

    public Flux<MotivoFijarCita> consultarMotivoFijarCita() {
        return motivoFijarCitaRepository.consultarMotivoFijarCita();
    }

    public Mono<Void> eliminarMotivoFijarCita(String id) {
        return motivoFijarCitaRepository.eliminarMotivoFijarCita(id);
    }
}
