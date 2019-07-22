package co.com.sura.salud.sec.maestros.maestros.medicamento.entity;

import generic.GenerateUniqueId;

public interface MedicamentoFactory extends GenerateUniqueId {

    default Medicamento crearMedicamento(
            String idMedicamento, String nombre, String presentacion, String codigoMedicamento
    ) {
        return Medicamento.builder()
                .id(generateObjectId())
                .idMedicamento(idMedicamento)
                .nombre(nombre)
                .presentacion(presentacion)
                .codigoMedicamento(codigoMedicamento)
                .build();
    }
}
