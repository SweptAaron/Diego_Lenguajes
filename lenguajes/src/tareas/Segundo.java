
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Segundo extends Thread{
    public void run(){
        
        while(true){
        //Aqui pone la accion del Thread
        System.out.println("Soy el segundo Thread que tampoco hago nada");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Segundo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
