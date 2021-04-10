public class EstimacionGanancia {
    public double estimacionDeGanancia(Producto producto) {
        double estimo;
        estimo= producto.getPrecio()* producto.getStock();
        return estimo;
    }
}