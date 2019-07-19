package co.com.sura.salud.sec.maestros.maestros.tipoTerapia;

public interface TipoTerapiaFactory {

    default TipoTerapia crearTipoTerapia(
            String id, String idTipoTerapia, String descripcion
    ) {
        return TipoTerapia.builder()
                .id(id)
                .idTipoTerapia(idTipoTerapia)
                .descripcion(descripcion)
                .build();
    }
}
