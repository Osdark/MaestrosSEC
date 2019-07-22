package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity.ViaAdministracion;
import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.gateway.ViaAdministracionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ViaAdministracionUseCase {

    private ViaAdministracionRepository viaAdministracionRepository;

    public Mono<ViaAdministracion> crearViaAdministracion(ViaAdministracion viaAdministracion) {
        return viaAdministracionRepository.crearViaAdministracion(viaAdministracion);
    }

    public Flux<ViaAdministracion> consultarViaAdministracion() {
        return viaAdministracionRepository.consultarViaAdministracion();
    }

    public Mono<Void> eliminarViaAdministracion(String id) {
        return viaAdministracionRepository.eliminarViaAdministracion(id);
    }
}