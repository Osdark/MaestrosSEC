package co.com.sura.salud.sec.maestros.maestros.proveedor.gateway;

import co.com.sura.salud.sec.maestros.maestros.proveedor.entity.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProveedorRepository {

    Mono<Proveedor> crearProveedor(Proveedor proveedor);

    Flux<Proveedor> consultarProveedor();

    Mono<Void> eliminarProveedor(String idProveedor);
}
