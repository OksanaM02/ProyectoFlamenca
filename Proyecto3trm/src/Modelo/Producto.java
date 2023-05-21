
package Modelo;


public class Producto 
{
    private int precio;
    private int cantidad;
    private String descripcion;
    private String foto;
    String url = "src/fotos/";

    public Producto(int precio, int caantidad, String descripcion, String foto)
    {
        this.cantidad=caantidad;
        this.precio=precio;
        this.descripcion=descripcion;
        this.foto=foto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
