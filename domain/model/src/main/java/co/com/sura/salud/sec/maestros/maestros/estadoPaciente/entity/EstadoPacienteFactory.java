package co.com.sura.salud.sec.maestros.maestros.estadoPaciente;

public interface EstadoPacienteFactory {

    default EstadoPaciente crearEstadoPaciente(
            String id, String nombre
    ) {
        return EstadoPaciente.builder()
                .id(id)
                .nombre(nombre)
                .build();
    }
}
