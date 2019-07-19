package co.com.sura.salud.sec.maestros.maestros.proveedor;

public interface ProveedorFactory {

    default Proveedor crearProveedor(
            String idProveedor, String descripcion
    ) {
        return Proveedor.builder()
                .idProveedor(idProveedor)
                .descripcion(descripcion)
                .build();
    }
}
