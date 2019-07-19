package co.com.sura.salud.sec.maestros.maestros.viaAdministracion;

public interface ViaAdministracionFactory {

    default ViaAdministracion crearViaAdministracion(
            String id, String idViaAdministracion, String tipo, String descripcion
    ) {
        return ViaAdministracion.builder()
                .id(id)
                .idViaAdministracion(idViaAdministracion)
                .tipo(tipo)
                .descripcion(descripcion)
                .build();
    }
}
