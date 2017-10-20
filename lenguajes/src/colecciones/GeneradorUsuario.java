
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class GeneradorUsuario {
    public static void main(String[] args) {
        
        
        //Vamos a generar 5 usuario
        Usuario u1=new Usuario();
        u1.setEdad(23);
        u1.setEmail("rapidclimate@gmail.com");
        u1.setNombre("Diego");
        
        Usuario u2=new Usuario();
        u2.setEdad(22);
        u2.setEmail("otro@gmail.com");
        u2.setNombre("cyan");
        
        Usuario u3=new Usuario();
        u3.setEdad(26);
        u3.setEmail("otro2@gmail.com");
        u3.setNombre("Hugo");
        
        Usuario u4=new Usuario();
        u4.setEdad(50);
        u4.setEmail("otro23@gmail.com");
        u4.setNombre("Ricardo");
        
         Usuario u5=new Usuario();
        u5.setEdad(53);
        u5.setEmail("otro29@gmail.com");
        u5.setNombre("Griselda");
        
        
        //Generaremos un arreglo mutable
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //Vamos a iterarlo para ver los nombres
        for(Usuario u : usuarios){
            System.out.println("Nombre: "+u.getNombre()+" Edad: "+u.getEdad()+ " Email: "+u.getEmail());
        }
        
    }
}
