package co.com.sura.salud.sec.maestros.maestros.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Medicamento")
public class MedicamentoData {

    @Id
    private String id;
    private String idMedicamento;
    private String nombre;
    private String presentacion;
    private String codigoMedicamento;
}
