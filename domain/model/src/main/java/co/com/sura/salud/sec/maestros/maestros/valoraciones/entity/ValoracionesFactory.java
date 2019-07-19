package co.com.sura.salud.sec.maestros.maestros.valoraciones;

public interface ValoracionesFactory {

    default Valoraciones crearValoraciones(
            String id, String idValoracion, String nombre, String idTipo
    ) {
        return Valoraciones.builder()
                .id(id)
                .idValoracion(idValoracion)
                .nombre(nombre)
                .idTipo(idTipo)
                .build();
    }
}
