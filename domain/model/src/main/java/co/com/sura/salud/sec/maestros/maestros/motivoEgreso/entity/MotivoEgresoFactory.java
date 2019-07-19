package co.com.sura.salud.sec.maestros.maestros.motivoEgreso;

public interface MotivoEgresoFactory {

    default MotivoEgreso crearMotivoEgreso(
            String id, String idMotivo, String descripcion
    ) {
        return MotivoEgreso.builder()
                .id(id)
                .idMotivo(idMotivo)
                .descripcion(descripcion)
                .build();
    }
}
