package co.com.sura.salud.sec.maestros.maestros.peso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class  Peso {
    private String id;
    private String descripcion;

    public static List<Peso> consultarListaPesos(){
        List<Peso> pesos = new ArrayList<>();

        pesos.add(new Peso("kg", "Kg"));
        pesos.add(new Peso("g", "g"));

        return pesos;
    }
}
