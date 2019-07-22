package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.entity.SedesSaludEnCasa;
import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.gateway.SedesSaludEnCasaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class SedesSaludEnCasaUseCase {

    private SedesSaludEnCasaRepository sedesSaludEnCasaRepository;

    public Mono<SedesSaludEnCasa> crearSedesSaludEnCasa(SedesSaludEnCasa sedesSaludEnCasa) {
        return sedesSaludEnCasaRepository.crearSedesSaludEnCasa(sedesSaludEnCasa);
    }

    public Flux<SedesSaludEnCasa> consultarSedesSaludEnCasa() {
        return sedesSaludEnCasaRepository.consultarSedesSaludEnCasa();
    }

    public Mono<Void> eliminarSedesSaludEnCasa(String id) {
        return sedesSaludEnCasaRepository.eliminarSedesSaludEnCasa(id);
    }
}
