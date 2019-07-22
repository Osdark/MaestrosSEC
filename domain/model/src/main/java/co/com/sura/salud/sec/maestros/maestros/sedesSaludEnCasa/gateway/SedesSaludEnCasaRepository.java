package co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.gateway;

import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.entity.SedesSaludEnCasa;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SedesSaludEnCasaRepository {

    Mono<SedesSaludEnCasa> crearSedesSaludEnCasa(SedesSaludEnCasa sedesSaludEnCasa);

    Flux<SedesSaludEnCasa> consultarSedesSaludEnCasa();

    Mono<Void> eliminarSedesSaludEnCasa(String id);
}
