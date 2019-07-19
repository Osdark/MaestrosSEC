package co.com.sura.salud.sec.maestros.maestros.piso;

public interface PisoFactory {

    default Piso crearPiso(
            String idPiso, String nombre, String idCiudad, String tipoPiso, String idPrograma
    ) {
        return Piso.builder()
                .idPiso(idPiso)
                .nombre(nombre)
                .idCiudad(idCiudad)
                .tipoPiso(tipoPiso)
                .idPrograma(idPrograma)
                .build();
    }
}
