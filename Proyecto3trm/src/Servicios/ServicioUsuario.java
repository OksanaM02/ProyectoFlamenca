
package Servicios;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ServicioUsuario {
    
    public static boolean Login(String nombre,String contraseña)
    {
        boolean resultado =false;
        ResultSet rs;
        int contador = 0;
        String consulta = "SELECT COUNT(*) FROM USUARIO WHERE Nombre='"+nombre+"' AND Contraseña='"+contraseña+"'";
        rs = Conexion.EjecutarSentencia(consulta);
        try {
            while(rs.next()){
                contador = rs.getInt(1);
                if(contador==1)
                {
                    resultado=true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public static void Registrar(String nombre, String contraseña)
    {
        int lc= contraseña.length();
        int l = nombre.length();
        String consulta = "INSERT INTO USUARIO VALUES ('"+nombre+"', '"+contraseña+"')";
        if(Login(nombre,contraseña))
        {
             JOptionPane.showMessageDialog(null, "Usuario ya existe");
        }
        else if(l<5 || lc<5)
        {
            JOptionPane.showMessageDialog(null, "Ambos campos tinen que tener mas de 5 caracteres");
        }
        else
        {
             Conexion.EjecutarUpdate(consulta);
             JOptionPane.showMessageDialog(null, "Usuario añadido");
        }
    }
    
    public static void borrarUsuario(String nombre, String contraseña) 
    {
        String consulta = "DELETE FROM usuario WHERE Nombre='"+nombre+"' AND Contraseña='"+contraseña+"'";
        if(Login(nombre,contraseña))
        {
            Conexion.EjecutarUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
	  
    }
}
