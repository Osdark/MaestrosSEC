package co.com.sura.salud.sec.maestros.maestros.tipoNutricion;

public interface TipoNutricionFactory {

    default TipoNutricion crearTipoNutricion(
            String tipo, String idTipo, String idNutricion, String descripcion
    ) {
        return TipoNutricion.builder()
                .tipo(tipo)
                .idTipo(idTipo)
                .idNutricion(idNutricion)
                .descripcion(descripcion)
                .build();
    }
}
