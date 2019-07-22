package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.institucion.entity.Institucion;
import co.com.sura.salud.sec.maestros.maestros.institucion.gateway.InstitucionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class InstitucionUseCase {

    private InstitucionRepository institucionRepository;

    public Mono<Institucion> crearInstitucion(Institucion institucion) {
        return institucionRepository.crearInstitucion(institucion);
    }

    public Flux<Institucion> consultarInstitucion() {
        return institucionRepository.consultarInstitucion();
    }

    public Mono<Void> eliminarInstitucion(String id) {
        return institucionRepository.eliminarInstitucion(id);
    }
}
