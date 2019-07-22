package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.municipio.entity.Municipio;
import co.com.sura.salud.sec.maestros.maestros.municipio.gateway.MunicipioRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MunicipioUseCase {

    private MunicipioRepository municipioRepository;

    public Mono<Municipio> crearMunicipio(Municipio municipio) {
        return municipioRepository.crearMunicipio(municipio);
    }

    public Flux<Municipio> consultarMunicipio() {
        return municipioRepository.consultarMunicipio();
    }

    public Mono<Void> eliminarMunicipio(String id) {
        return municipioRepository.eliminarMunicipio(id);
    }
}
