package co.com.sura.salud.sec.maestros.maestros.diagnostico;

public interface DiagnosticoFactory {

    default Diagnostico crearDiagnostico(
            String id, String codgio, String nombre
    ) {
        return Diagnostico.builder()
                .id(id)
                .codigo(codgio)
                .nombre(nombre)
                .build();
    }
}
