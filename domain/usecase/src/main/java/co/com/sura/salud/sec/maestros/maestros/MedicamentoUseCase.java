package co.com.sura.salud.sec.maestros.maestros;

import co.com.sura.salud.sec.maestros.maestros.medicamento.entity.Medicamento;
import co.com.sura.salud.sec.maestros.maestros.medicamento.gateway.MedicamentoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class MedicamentoUseCase {

    private MedicamentoRepository medicamentoRepository;

    public Mono<Medicamento> crearMedicamento(Medicamento medicamento) {
        return medicamentoRepository.crearMedicamento(medicamento);
    }

    public Flux<Medicamento> consultarMedicamento() {
        return medicamentoRepository.consultarMedicamento();
    }

    public Mono<Void> eliminarMedicamento(String id) {
        return medicamentoRepository.eliminarMedicamento(id);
    }
}
