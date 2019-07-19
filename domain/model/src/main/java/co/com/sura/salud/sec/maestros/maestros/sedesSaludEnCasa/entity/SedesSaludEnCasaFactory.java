package co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa;

public interface SedesSaludEnCasaFactory {

    default SedesSaludEnCasa crearSedesSaludEnCasa(
            String id, String idCiudad, String descripcion, String ubicacion
    ) {
        return SedesSaludEnCasa.builder()
                .id(id)
                .idCiudad(idCiudad)
                .descripcion(descripcion)
                .ubicacion(ubicacion)
                .build();
    }
}
