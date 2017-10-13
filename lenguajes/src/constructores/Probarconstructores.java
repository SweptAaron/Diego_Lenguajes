package constructores;

import javax.swing.JFrame;


public class Probarconstructores {
    
    public static void main(String[] args) {
       
        //creamos un objeto de la clase animal
        
        Animal algo = new Animal();
        //String x;
        //algo.setEdad(5);
       
        
        //System.out.println(x);
        System.out.println(algo.getEdad());
        System.out.println(algo.getNombre());
        System.out.println(algo.isMuerde());
        
        Animal otro =new Animal(8);
        otro.setEdad(10);
        System.out.println(otro.getEdad());
        
        //Vamos a usar un constructor de una clase que no hemos hecho nosotros
        
        JFrame ventana = new JFrame("hola mundo");
        ventana.setSize(300,300);
        ventana.setVisible(true);
        
    }
}
