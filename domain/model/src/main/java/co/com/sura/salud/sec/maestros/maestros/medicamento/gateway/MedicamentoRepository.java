package co.com.sura.salud.sec.maestros.maestros.medicamento.gateway;

import co.com.sura.salud.sec.maestros.maestros.medicamento.entity.Medicamento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MedicamentoRepository {

    Mono<Medicamento> crearMedicamento(Medicamento medicamento);

    Flux<Medicamento> consultarMedicamento();

    Mono<Void> eliminarMedicamento(String id);
}
