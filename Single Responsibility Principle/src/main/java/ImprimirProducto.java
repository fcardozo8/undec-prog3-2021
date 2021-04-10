public class ImprimirProducto {
    public void imprimir(Producto producto){
        System.out.println(producto.getNombre() + producto.getDescripcion() + producto.getPrecio());
    }
}
