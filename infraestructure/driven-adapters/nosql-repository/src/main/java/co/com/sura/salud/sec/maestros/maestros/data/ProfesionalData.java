package co.com.sura.salud.sec.maestros.maestros.data;

import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Profesional")
public class ProfesionalData {

    @Id
    private String id;
    private String idProfesion;
    private String profesion;
    private String especialidad;
    private List<CitasProfesional> profesionalList;
}
