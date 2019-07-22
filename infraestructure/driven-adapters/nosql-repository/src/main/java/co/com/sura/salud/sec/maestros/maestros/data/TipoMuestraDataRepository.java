package co.com.sura.salud.sec.maestros.maestros.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface TipoMuestraDataRepository extends ReactiveCrudRepository<TipoMuestraData, String> {

    Mono<Void> deleteByIdTomaMuestra(String idTomaMuestra);
}
