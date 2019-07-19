package co.com.sura.salud.sec.maestros.maestros.programa;

public interface ProgramaFactory {

    default Programa crearPrograma(
            String id, String idPrograma, String nombre, String especialidad, String profesional, boolean citaAutomatica
    ) {
        return Programa.builder()
                .id(id)
                .idPrograma(idPrograma)
                .nombre(nombre)
                .especialidad(especialidad)
                .profesional(profesional)
                .citaAutomatica(citaAutomatica)
                .build();
    }
}
