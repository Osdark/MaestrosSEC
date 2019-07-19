package co.com.sura.salud.sec.maestros.maestros.ciudad;

public interface CiudadFactory {

    default Ciudad crearCiudad(
            String id, String idCiudad, String nombre, String codigoDANE, String codigoIPS
    ) {
        return Ciudad.builder()
                .id(id)
                .idCiudad(idCiudad)
                .nombre(nombre)
                .codigoDANE(codigoDANE)
                .codigoIPS(codigoIPS)
                .build();
    }
}
