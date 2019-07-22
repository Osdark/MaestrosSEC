package co.com.sura.salud.sec.maestros.maestros.tipoSondaje.entity;

import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import generic.GenerateUniqueId;

import java.util.List;

public interface TipoSondajeFactory extends GenerateUniqueId {

    default TipoSondaje crearTipoSondaje(
            String idTipo, String tipo, List<ListaSondaje> listaSondaje
    ) {
        return TipoSondaje.builder()
                .id(generateObjectId())
                .idTipo(idTipo)
                .tipo(tipo)
                .listaSondaje(listaSondaje)
                .build();
    }
}
