package co.com.sura.salud.sec.maestros.maestros.tipoSondaje;

import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;

import java.util.List;

public interface TipoSondajeFactory {

    default TipoSondaje crearTipoSondaje(
            String id, String idTipo, String tipo, List<ListaSondaje> listaSondaje
    ) {
        return TipoSondaje.builder()
                .id(id)
                .idTipo(idTipo)
                .tipo(tipo)
                .listaSondaje(listaSondaje)
                .build();
    }
}
