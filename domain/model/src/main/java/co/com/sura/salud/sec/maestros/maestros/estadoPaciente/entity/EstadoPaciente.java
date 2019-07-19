package co.com.sura.salud.sec.maestros.maestros.estadoPaciente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class EstadoPaciente {

    private String id;
    private String nombre;
}
