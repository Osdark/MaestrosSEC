package co.com.sura.salud.sec.maestros.maestros.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface NovedadesPorTipoAdmisionDataRepository extends ReactiveCrudRepository<NovedadesPorTipoAdmisionData, String> {

    Mono<Void> deleteByTipoAtencion(String tipoAtencion);
}
