package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.entity.TipoEquipoBiomedico;
import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.gateway.TipoEquipoBiomedicoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class TipoEquipoBiomedicoUseCase {

    private TipoEquipoBiomedicoRepository tipoEquipoBiomedicoRepository;

    public Mono<TipoEquipoBiomedico> crearTipoEquipoBiomedico(TipoEquipoBiomedico tipoEquipoBiomedico) {
        return tipoEquipoBiomedicoRepository.crearTipoEquipoBiomedico(tipoEquipoBiomedico);
    }

    public Flux<TipoEquipoBiomedico> consultarTipoEquipoBiomedico() {
        return tipoEquipoBiomedicoRepository.consultarTipoEquipoBiomedico();
    }

    public Mono<Void> eliminarTipoEquipoBiomedico(String id) {
        return tipoEquipoBiomedicoRepository.eliminarTipoEquipoBiomedico(id);
    }
}
