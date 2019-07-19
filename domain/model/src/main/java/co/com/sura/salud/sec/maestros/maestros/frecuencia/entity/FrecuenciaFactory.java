package co.com.sura.salud.sec.maestros.maestros.frecuencia;

public interface FrecuenciaFactory {

    default Frecuencia crearFrecuencia(
            String id, String idFrecuencia, String tipo, String descripcion
    ) {
        return Frecuencia.builder()
                .id(id)
                .idFrecuencia(idFrecuencia)
                .tipo(tipo)
                .descripcion(descripcion)
                .build();
    }
}
