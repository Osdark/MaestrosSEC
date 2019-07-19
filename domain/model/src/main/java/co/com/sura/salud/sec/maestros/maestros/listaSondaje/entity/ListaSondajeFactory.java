package co.com.sura.salud.sec.maestros.maestros.listaSondaje;

public interface ListaSondajeFactory {

    default ListaSondaje crearListaSondaje(
            String idTipoSondaje, String descripcion
    ) {
        return ListaSondaje.builder()
                .idTipoSondaje(idTipoSondaje)
                .descripcion(descripcion)
                .build();
    }
}
