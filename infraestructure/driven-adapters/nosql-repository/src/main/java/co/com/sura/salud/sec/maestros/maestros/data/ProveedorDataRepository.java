package co.com.sura.salud.sec.maestros.maestros.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProveedorDataRepository extends ReactiveCrudRepository<ProveedorData, String> {

    Mono<Void> deleteByIdProveedor(String idProveedor);
}
