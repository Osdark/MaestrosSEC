package co.com.sura.salud.sec.maestros.maestros.motivoFijarCita;

public interface MotivoFijarCitaFactory {

    default MotivoFijarCita crearMotivoFijarCita(
            String id, String idMotivo, String descripcion
    ) {
        return MotivoFijarCita.builder()
                .id(id)
                .idMotivo(idMotivo)
                .descripcion(descripcion)
                .build();
    }
}
