package co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.gateway;

import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.entity.TipoEquipoBiomedico;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoEquipoBiomedicoRepository {

    Mono<TipoEquipoBiomedico> crearTipoEquipoBiomedico(TipoEquipoBiomedico tipoEquipoBiomedico);

    Flux<TipoEquipoBiomedico> consultarTipoEquipoBiomedico();

    Mono<Void> eliminarTipoEquipoBiomedico(String id);
}
