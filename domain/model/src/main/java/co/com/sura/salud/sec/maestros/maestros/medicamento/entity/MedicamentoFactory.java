package co.com.sura.salud.sec.maestros.maestros.medicamento;

public interface MedicamentoFactory {

    default Medicamento crearMedicamento(
            String id, String idMedicamento, String nombre, String presentacion, String codigoMedicamento
    ) {
        return Medicamento.builder()
                .id(id)
                .idMedicamento(idMedicamento)
                .nombre(nombre)
                .presentacion(presentacion)
                .codigoMedicamento(codigoMedicamento)
                .build();
    }
}
