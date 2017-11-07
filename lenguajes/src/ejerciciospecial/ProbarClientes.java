
package ejerciciospecial;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class ProbarClientes {
    public static void main(String[] args) {
      GeneradorCliente clientes = new GeneradorCliente();
      
      
      for (Cliente i : clientes.generadorClientes())
      {
          System.out.println("\nNombre: "+i.getNombre()+" \nEdad: "+i.getEdad()+" \nEmail: "+i.getEmail()+"\nDireccion: " +i.getDireccion().getCalle() +" "+i.getDireccion().getColonia() +" "+i.getDireccion().getCp() +" "+i.getDireccion().getMunicipio());
      }
    }
  
}
