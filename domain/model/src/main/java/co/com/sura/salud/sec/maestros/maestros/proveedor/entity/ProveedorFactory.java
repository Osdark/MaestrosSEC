package co.com.sura.salud.sec.maestros.maestros.proveedor.entity;

import generic.GenerateUniqueId;

public interface ProveedorFactory extends GenerateUniqueId {

    default Proveedor crearProveedor(
            String idProveedor, String descripcion
    ) {
        return Proveedor.builder()
                .id(generateObjectId())
                .idProveedor(idProveedor)
                .descripcion(descripcion)
                .build();
    }
}
