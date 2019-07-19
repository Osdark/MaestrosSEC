package co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador;

public interface MotivoAplicacionCuidadorFactory {

    default MotivoAplicacionCuidador crearMotivoAplicacionCuidador(
            String id, String descripcion
    ) {
        return MotivoAplicacionCuidador.builder()
                .id(id)
                .descripcion(descripcion)
                .build();
    }
}
