package co.com.sura.salud.sec.maestros.maestros.dosis;

public interface DosisFactory {

    default Dosis crearDosis(
            String id, String idDosis, String tipo, String descripcion
    ) {
        return Dosis.builder()
                .id(id)
                .idDosis(idDosis)
                .tipo(tipo)
                .descripcion(descripcion)
                .build();
    }
}
