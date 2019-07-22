package co.com.sura.salud.sec.maestros.maestros.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Municipio")
public class MunicipioData {

    @Id
    private String id;
    private String nombre;
    private String idCiudad;
    private String idMunicipio;
    private double longitud;
    private double latitud;
}
