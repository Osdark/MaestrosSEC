package co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional;

public interface TipoSoporteNutricionalFactory {

    default TipoSoporteNutricional crearTipoSoporteNutricional(
            String idTipo, String descripcion
    ) {
        return TipoSoporteNutricional.builder()
                .idTipo(idTipo)
                .descripcion(descripcion)
                .build();
    }
}
