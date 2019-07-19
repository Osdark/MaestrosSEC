package co.com.sura.salud.sec.maestros.maestros.motivoCancelacion;

public interface MotivoCancelacionFactory {

    default MotivoCancelacion crearMotivoCancelacion(
            String id, String idMotivo, String descripcion
    ) {
        return MotivoCancelacion.builder()
                .id(id)
                .idMotivo(idMotivo)
                .descripcion(descripcion)
                .build();
    }
}
