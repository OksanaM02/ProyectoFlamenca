package Controlador;

import Modelo.Vestido;
import Servicios.ServicioProducto;
import Servicios.ServicioUsuario;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;

public class Controlador 
{
    public static boolean Login(String nombre, String contraseña)
    {
        boolean resultado= ServicioUsuario.Login(nombre, contraseña);
        return resultado;
    }
    
    public static void Registrar(String nombre, String contraseña)
    {
        ServicioUsuario.Registrar(nombre, contraseña);
    }
    
    public static void Eliminar(String nombre, String contraseña)
    {
        ServicioUsuario.borrarUsuario(nombre, contraseña);
    }
    
    public static Vestido verVestido1()
    {
        return ServicioProducto.cargarVestido();
    }
    
    public static Vestido vestidoNext(int codigo)
    {
        return ServicioProducto.cargarSiguienteVestido(codigo);
    }
    
    public static int Descuento(int codigo)
    {
        return ServicioProducto.descuento(codigo);
    }
    public static void Actualizar(JLabel cantidad,Vestido vestido)
    {
        ServicioProducto.actualizarCartelcantidad(cantidad,vestido);
    }
    
    public static void Comprar (Vestido vestido)
    {
        ServicioProducto.Comprar(vestido);
    }
    public static void AñadirCom(String texto) throws IOException
    {
        ServicioProducto.AñadirCom(texto);
    }
    public static String VerCom(String Archivo)
    {
       String com =  ServicioProducto.VerCom(Archivo);
       return com;
    }
}
