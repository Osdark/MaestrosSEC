package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.valoraciones.entity.Valoraciones;
import co.com.sura.salud.sec.maestros.maestros.valoraciones.gateway.ValoracionesRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ValoracionesUseCase {

    private ValoracionesRepository valoracionesRepository;

    public Mono<Valoraciones> crearValoraciones(Valoraciones valoraciones) {
        return valoracionesRepository.crearValoraciones(valoraciones);
    }

    public Flux<Valoraciones> consultarValoraciones() {
        return valoracionesRepository.consultarValoraciones();
    }

    public Mono<Void> eliminarValoraciones(String id) {
        return valoracionesRepository.eliminarValoraciones(id);
    }
}
