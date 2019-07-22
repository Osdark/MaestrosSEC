package co.com.sura.salud.sec.maestros.maestros.listaSondaje.gateway;

import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ListaSondajeRepository {

    Mono<ListaSondaje> crearListaSondaje(ListaSondaje listaSondaje);

    Flux<ListaSondaje> consultarListaSondaje();

    Mono<Void> eliminarListaSondaje(String idTipoSondaje);
}
