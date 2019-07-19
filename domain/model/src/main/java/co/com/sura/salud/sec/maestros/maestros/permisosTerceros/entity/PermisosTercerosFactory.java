package co.com.sura.salud.sec.maestros.maestros.permisosTerceros;

import java.util.List;

public interface PermisosTercerosFactory {

    default PermisosTerceros crearPermisosTerceros(
            String id, String nombreTercero, List<String> usuarios
    ) {
        return PermisosTerceros.builder()
                .id(id)
                .nombreTercero(nombreTercero)
                .usuarios(usuarios)
                .build();
    }
}
