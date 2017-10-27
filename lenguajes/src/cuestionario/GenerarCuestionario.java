/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;
import java.util.*;

/**
 *
 * @author diego
 */
public class GenerarCuestionario {
    public ArrayList<Pregunta> generar(){
        //primero generamos el arreglo que contendra las preguntas
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        //primero generamos cada opcion de la priemra pregunta
        Opcion op11 = new Opcion("Moscu", false);
        Opcion op21 = new Opcion("Kiev", false);
        Opcion op31 = new Opcion("Helsinki", true);
        Opcion op41 = new Opcion("Turim", false);
        //generar la pregu nta
        ArrayList<Opcion> opciones1= new ArrayList <>();
        opciones1.add(op11);
        opciones1.add(op21);
        opciones1.add(op31);
        opciones1.add(op41);
        Pregunta p1=new Pregunta ("Capital de Finlandia", opciones1);
        preguntas.add(p1);
        
        //segunda prgunta
        Opcion op12 = new Opcion("Roma", false);
        Opcion op22 = new Opcion("Transilvania", false);
        Opcion op32 = new Opcion("Kiev", true);
        Opcion op42 = new Opcion("aze", false);
        ArrayList<Opcion> opciones2= new ArrayList <>();
        opciones1.add(op12);
        opciones1.add(op22);
        opciones1.add(op32);
        opciones1.add(op42);
        Pregunta p2=new Pregunta ("Capital de Finlandia", opciones2);
        preguntas.add(p2);
        return preguntas;
    }    
}
