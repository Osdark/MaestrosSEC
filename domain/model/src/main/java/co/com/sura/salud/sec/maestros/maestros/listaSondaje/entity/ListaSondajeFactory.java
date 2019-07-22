package co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity;

import generic.GenerateUniqueId;

public interface ListaSondajeFactory extends GenerateUniqueId {

    default ListaSondaje crearListaSondaje(
            String idTipoSondaje, String descripcion
    ) {
        return ListaSondaje.builder()
                .id(generateObjectId())
                .idTipoSondaje(idTipoSondaje)
                .descripcion(descripcion)
                .build();
    }
}
