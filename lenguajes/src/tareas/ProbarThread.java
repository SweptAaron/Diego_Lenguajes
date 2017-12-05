
package tareas;

/**
 *
 * @author Diego
 */
public class ProbarThread {
    public static void main(String[] args) {
        //Thread creado
        Primero p = new Primero();
        Segundo s = new Segundo();
        //Thread en estado de ejecucion(rubbable)
        p.start();
        s.start();
    }
}
