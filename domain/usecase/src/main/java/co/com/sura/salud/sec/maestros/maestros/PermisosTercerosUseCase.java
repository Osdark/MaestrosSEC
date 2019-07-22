package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.entity.PermisosTerceros;
import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.gateway.PermisosTercerosRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class PermisosTercerosUseCase {

    private PermisosTercerosRepository permisosTercerosRepository;

    public Mono<PermisosTerceros> crearPermisosTerceros(PermisosTerceros permisosTerceros) {
        return permisosTercerosRepository.crearPermisosTerceros(permisosTerceros);
    }

    public Flux<PermisosTerceros> consultarPermisosTerceros() {
        return permisosTercerosRepository.consultarPermisosTerceros();
    }

    public Mono<Void> eliminarPermisosTerceros(String id) {
        return permisosTercerosRepository.eliminarPermisosTerceros(id);
    }
}
