package co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion;

public interface TiposIdentificacionFactory {

    default TiposIdentificacion crearTiposIdentificacion(
            String id, String idTipo, String nombre, String codigoPos, String codigoSura
    ) {
        return TiposIdentificacion.builder()
                .id(id)
                .idTipo(idTipo)
                .nombre(nombre)
                .codigoPos(codigoPos)
                .codigoSura(codigoSura)
                .build();
    }
}
