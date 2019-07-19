package co.com.sura.salud.sec.maestros.maestros.peso;

public interface PesoFactory {

    default Peso crearPeso(
            String id, String descripcion
    ) {
        return Peso.builder()
                .id(id)
                .descripcion(descripcion)
                .build();
    }
}
