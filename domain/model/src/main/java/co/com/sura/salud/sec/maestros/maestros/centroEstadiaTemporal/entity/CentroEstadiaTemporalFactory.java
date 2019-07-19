package co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal;

public interface CentroEstadiaTemporalFactory {

    default CentroEstadiaTemporal crearCentroEstadiaTemporal(
            String id, String idCiudad, String nombre
    ) {
        return CentroEstadiaTemporal.builder()
                .id(id)
                .idCiudad(idCiudad)
                .nombre(nombre)
                .build();
    }
}
