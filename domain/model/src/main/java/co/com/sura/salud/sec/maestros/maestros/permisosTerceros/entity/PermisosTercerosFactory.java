package co.com.sura.salud.sec.maestros.maestros.permisosTerceros.entity;

import generic.GenerateUniqueId;

import java.util.List;

public interface PermisosTercerosFactory extends GenerateUniqueId {

    default PermisosTerceros crearPermisosTerceros(
            String nombreTercero, List<String> usuarios
    ) {
        return PermisosTerceros.builder()
                .id(generateObjectId())
                .nombreTercero(nombreTercero)
                .usuarios(usuarios)
                .build();
    }
}
