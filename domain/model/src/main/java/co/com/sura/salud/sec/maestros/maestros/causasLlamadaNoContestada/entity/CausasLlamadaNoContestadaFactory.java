package co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada;

public interface CausasLlamadaNoContestadaFactory {

    default CausasLlamadaNoContestada crearCausaLlamadaNoContestada(
        String id, String idCausa, String nombreCausa
    ) {
        return CausasLlamadaNoContestada.builder()
                .id(id)
                .idCausa(idCausa)
                .nombreCausa(nombreCausa)
                .build();
    }
}
