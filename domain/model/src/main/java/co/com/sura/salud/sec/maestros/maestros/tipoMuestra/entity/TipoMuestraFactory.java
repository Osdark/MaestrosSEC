package co.com.sura.salud.sec.maestros.maestros.tipoMuestra;

public interface TipoMuestraFactory {

    default TipoMuestra crearTipoMuestra(
            String idTomaMuestra, String descripcion
    ) {
        return TipoMuestra.builder()
                .idTomaMuestra(idTomaMuestra)
                .descripcion(descripcion)
                .build();
    }
}
