package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.entity.TipoCuracion;
import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.gateway.TipoCuracionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoCuracionUseCase {

    private TipoCuracionRepository tipoCuracionRepository;

    public Mono<TipoCuracion> crearTipoCuracion(TipoCuracion tipoCuracion) {
        return tipoCuracionRepository.crearTipoCuracion(tipoCuracion);
    }

    public Flux<TipoCuracion> consultarTipoCuracion() {
        return tipoCuracionRepository.consultarTipoCuracion();
    }

    public Mono<Void> eliminarTipoCuracion(String id) {
        return tipoCuracionRepository.eliminarTipoCuracion(id);
    }
}
