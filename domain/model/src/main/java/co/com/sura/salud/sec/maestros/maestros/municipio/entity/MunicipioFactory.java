package co.com.sura.salud.sec.maestros.maestros.municipio;

public interface MunicipioFactory {

    default Municipio crearMunicipio(
            String id, String nombre, String idCiudad, String idMunicipio, double longitud, double latitud
    ) {
        return Municipio.builder()
                .id(id)
                .nombre(nombre)
                .idCiudad(idCiudad)
                .idMunicipio(idMunicipio)
                .longitud(longitud)
                .latitud(latitud)
                .build();
    }
}
