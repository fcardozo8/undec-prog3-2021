public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private EstimacionGanancia estimacion;
    private ImprimirProducto prod;


    public Producto(String nombre, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        estimacion=new EstimacionGanancia();
        prod=new ImprimirProducto();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    /*
    aquí podriamos estimar el precio del producto  y imprimirlo en un metodo que se encargue de ambas cosas.
|   pero no se estaría cumpliendo el principio Single Responsibility

    public void estimoyImprimo(){

         this.estimacion.estimacionDeGanancia(this);
         this.prod.imprimir(this);

    }

   lo que podemos hacer es separar el metodo estimoyImprimo
//    de manera que podamos estimar el precio del producto y imprimirlo como unica
//    responsabilidad


     */

    public void imprimir(){
        this.prod.imprimir(this);
    }

    public void estimacionDeGanancia(){
        this.estimacion.estimacionDeGanancia(this);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

