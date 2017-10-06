
package referenciados;

import abstraccion.Usuario;

public class Prueba2{ 
     
    public static void main(String[] args) {
        //Todos los referenciados pertenecen a una clase
        //Ademas se necesito uno o mas primitivos para definirlos
        
        String nombre="Diego Aaron";
        String otro=new String("Toy");
        Usuario u=new Usuario();
        u.setAltura(1.7f);
        u.setPeso(50);
        
    }
}
