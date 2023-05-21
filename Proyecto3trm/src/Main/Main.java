
package Main;

import Servicios.Conexion;
import Vistas.vista1;

public class Main 
{

  public static void main(String[] args)
  {
        Conexion.Conectar();
        new vista1();
  }
    
    
}
