package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import co.com.sura.salud.sec.maestros.maestros.listaSondaje.gateway.ListaSondajeRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ListaSondajeUseCase {

    private ListaSondajeRepository listaSondajeRepository;

    public Mono<ListaSondaje> crearListaSondaje(ListaSondaje listaSondaje) {
        return listaSondajeRepository.crearListaSondaje(listaSondaje);
    }

    public Flux<ListaSondaje> consultarListaSondaje() {
        return listaSondajeRepository.consultarListaSondaje();
    }

    public Mono<Void> eliminarListaSondaje(String idTipoSondaje) {
        return listaSondajeRepository.eliminarListaSondaje(idTipoSondaje);
    }
}
