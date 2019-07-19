package co.com.sura.salud.sec.maestros.maestros.institucion;

public interface InstitucionFactory {

    default Institucion crearInstitucion(
            String id, String idInstitucion, String idCiudad, String nombre
    ) {
        return Institucion.builder()
                .id(id)
                .idInstitucion(idInstitucion)
                .idCiudad(idCiudad)
                .nombre(nombre)
                .build();
    }
}
