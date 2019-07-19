package co.com.sura.salud.sec.maestros.maestros.medicamento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Medicamento {
    private String id;
    private String idMedicamento;
    private String nombre;
    private String presentacion;
    private String codigoMedicamento;
}
