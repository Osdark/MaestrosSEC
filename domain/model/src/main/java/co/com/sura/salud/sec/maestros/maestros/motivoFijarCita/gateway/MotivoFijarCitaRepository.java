package co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.gateway;

import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.entity.MotivoFijarCita;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MotivoFijarCitaRepository {

    Mono<MotivoFijarCita> crearmoMotivoFijarCita(MotivoFijarCita motivoFijarCita);

    Flux<MotivoFijarCita> consultarMotivoFijarCita();

    Mono<Void> eliminarMotivoFijarCita(String id);
}
