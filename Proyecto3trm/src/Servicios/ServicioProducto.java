
package Servicios;
import Modelo.Vestido;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class ServicioProducto 
{
    public static Vestido cargarVestido()
    {
        Vestido vestido = new Vestido(0, "", "",1,0);
        ResultSet rs;
        String consulta = "SELECT descripcion, precio, foto, cantidad  FROM producto WHERE codigo=1";
        rs = Conexion.EjecutarSentencia(consulta);
        try {
            while(rs.next())
            {
                vestido.setDescripcion(rs.getString("descripcion"));
                vestido.setFoto(rs.getString("foto"));
                vestido.setPrecio(rs.getInt("precio"));
                vestido.setCantidad(rs.getInt("cantidad"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vestido;
    }
    
    public static Vestido cargarSiguienteVestido(int codigoAnterior)
    {
        Vestido vestido = new Vestido(0, "", "",0,0);
        ResultSet rs;
        String consulta = "SELECT descripcion, precio, foto, cantidad  FROM producto WHERE codigo="+(codigoAnterior);
        rs = Conexion.EjecutarSentencia(consulta);
        try {
            while(rs.next())
            {
                vestido.setDescripcion(rs.getString("descripcion"));
                vestido.setFoto(rs.getString("foto"));
                vestido.setPrecio(rs.getInt("precio"));
                vestido.setCodigo(codigoAnterior);
                vestido.setCantidad(rs.getInt("cantidad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vestido;
    }
    
    
    public static int descuento(int codigoVestido) 
    {
        Vestido vestido = new Vestido(0, "", "", 0,0);
        try {
            ResultSet rs;
            String sentenciaDescuento = "UPDATE producto SET precio = (precio * 0.9) WHERE codigo = " + codigoVestido;
            Conexion.EjecutarUpdate(sentenciaDescuento);

            // Obtener el nuevo precio del vestido actualizado
            String sentenciaPrecio = "SELECT precio FROM producto WHERE codigo = " + codigoVestido;
            rs = Conexion.EjecutarSentencia(sentenciaPrecio);
            if (rs.next()) {
                vestido.setPrecio(rs.getInt("precio"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vestido.getPrecio();
    }
    
    
    public static void actualizarCartelcantidad(JLabel cantidad, Vestido vestido) 
    {
      
        int cant = 0;
        int codigo = vestido.getCodigpo();
        String consulta = "SELECT cantidad FROM producto WHERE codigo = " + codigo;
        ResultSet resultado = Conexion.EjecutarSentencia(consulta);
        try {
            
            if (resultado.next()) {
                cant = resultado.getInt("cantidad");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        String cantAct = String.valueOf(cant);
        cantidad.setText(cantAct);
    }
    
    public static void Comprar(Vestido vestido)
    {
        int codigoVestido = vestido.getCodigpo();
        int cantidad = vestido.getCantidad();
        
        if(cantidad < 1)
        {
            JOptionPane.showMessageDialog(null, "Producto agotado");
        }
        else
        {
            String consulta = "UPDATE producto SET cantidad = cantidad-1 WHERE codigo = " + codigoVestido;
            Conexion.EjecutarUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Gracias por su compra");
        }
    }
    
    
    
    public static void AñadirCom(String texto) throws IOException
    {
        try 
	{
		FileWriter fichero = new FileWriter("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Proyecto3trm\\archivo.txt",true);
		fichero.write(texto+ "\n");
		fichero.flush();
		fichero.close();
                JOptionPane.showMessageDialog(null, "Comentario Añadido");
	} 
         catch (IOException e) 
	{
	  e.printStackTrace();
	}
    }
    
   public static String VerCom (String archivo)
   {
        StringBuilder sb = new StringBuilder(200);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) 
        {
             String linea;
             while ((linea = reader.readLine()) != null) 
             {
                 sb.append(linea);
                 sb.append("\n");
             }
        } 
        catch (IOException e) 
        {
             e.printStackTrace();
        }

         String resultado = sb.toString();
         return resultado;
    }

    
    
}
  
