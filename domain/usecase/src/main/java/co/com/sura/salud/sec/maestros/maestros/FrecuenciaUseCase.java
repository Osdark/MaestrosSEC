package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.frecuencia.gateway.FrecuenciaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class FrecuenciaUseCase {

    private FrecuenciaRepository frecuenciaRepository;

    public Mono<Frecuencia> crearFrecuencia(Frecuencia frecuencia) {
        return frecuenciaRepository.crearFrecuencia(frecuencia);
    }

    public Flux<Frecuencia> consultarFrecuencia() {
        return frecuenciaRepository.consultaFrecuencia();
    }

    public Mono<Void> eliminarFrecuencia(String id) {
        return frecuenciaRepository.eliminarFrecuencia(id);
    }
}
