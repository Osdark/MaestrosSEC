package co.com.sura.salud.sec.maestros.maestros.tipoCuracion;

public interface TipoCuracionFactory {

    default TipoCuracion crearTipoCuracion(
            String id, String idTipoCutracion, String descripcion
    ) {
        return TipoCuracion.builder()
                .id(id)
                .idTipoCuracion(idTipoCutracion)
                .descripcion(descripcion)
                .build();
    }
}
