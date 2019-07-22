package co.com.sura.salud.sec.maestros.maestros.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Programa")
public class ProgramaData {

    @Id
    private String id;
    private String idPrograma;
    private String nombre;
    private String especialidad;
    private String profesional;
    private boolean citaAutomatica;
}
