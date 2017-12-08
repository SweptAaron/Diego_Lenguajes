/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author T-102
 */
public class RelojitoChafa implements Runnable{
    public static void main(String[] args) {
    
        //Creamos el thread con esta interfaz
        Runnable r = new RelojitoChafa();
        Thread t1= new Thread(r);
        t1.start();
        
    }
    
    
    public void run(){
        while(true){
            
            try{
        Calendar c = Calendar.getInstance();
        //Sacamos la hora del sistema
        Thread.sleep(1000);
        int hora=c.get(Calendar.HOUR);
        int minutos=c.get(Calendar.MINUTE);
        int segundos=c.get(Calendar.SECOND);
        System.out.println("la hora es: "+hora+ ":"+minutos+":"+segundos);
            }catch(InterruptedException e){
            }
        }
    }
}
