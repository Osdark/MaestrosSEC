package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.proveedor.entity.Proveedor;
import co.com.sura.salud.sec.maestros.maestros.proveedor.gateway.ProveedorRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ProveedorUseCase {

    private ProveedorRepository proveedorRepository;

    public Mono<Proveedor> crearProveedor(Proveedor proveedor) {
        return proveedorRepository.crearProveedor(proveedor);
    }

    public Flux<Proveedor> consultarProveedor() {
        return proveedorRepository.consultarProveedor();
    }

    public Mono<Void> eliminarProveedor(String id) {
        return proveedorRepository.eliminarProveedor(id);
    }
}
