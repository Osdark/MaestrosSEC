package co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity;

public interface CitasProfesionalFactory {

    default  CitasProfesional crearCitasProfesional(
            String idCita, String tipoCita
    ) {
        return CitasProfesional.builder()
                .idCita(idCita)
                .tipoCita(tipoCita)
                .build();
    }
}
