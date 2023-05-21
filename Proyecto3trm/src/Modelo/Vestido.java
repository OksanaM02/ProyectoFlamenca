
package Modelo;

public class Vestido 
{
    private int precio;
    private String descripcion;
    private String foto;
    private int codigo;
    private int cantidad;
    
    public Vestido(int precio, String descripcion,String foto, int codigo, int cantidad)
    {
        this.descripcion=descripcion;
        this.precio=precio;
        this.foto=foto;
        this.codigo=codigo;
        this.cantidad=cantidad;
    }
    
     public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCodigpo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
