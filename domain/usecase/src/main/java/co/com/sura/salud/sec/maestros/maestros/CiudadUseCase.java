package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.ciudad.entity.Ciudad;
import co.com.sura.salud.sec.maestros.maestros.ciudad.gateway.CiudadRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CiudadUseCase {

    private CiudadRepository ciudadRepository;

    public Mono<Ciudad> crearCiudad(Ciudad ciudad) {
        return ciudadRepository.crearCiudad(ciudad);
    }

    public Flux<Ciudad> consultarCiudad() {
        return ciudadRepository.consultarCiudad();
    }

    public Mono<Void> eliminarCiudad(String id) {
        return ciudadRepository.eliminarCiudad(id);
    }
}
