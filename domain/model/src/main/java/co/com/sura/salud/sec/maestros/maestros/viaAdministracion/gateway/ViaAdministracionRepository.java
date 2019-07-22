package co.com.sura.salud.sec.maestros.maestros.viaAdministracion.gateway;

import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity.ViaAdministracion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ViaAdministracionRepository {

    Mono<ViaAdministracion> crearViaAdministracion(ViaAdministracion viaAdministracion);

    Flux<ViaAdministracion> consultarViaAdministracion();

    Mono<Void> eliminarViaAdministracion(String id);
}
