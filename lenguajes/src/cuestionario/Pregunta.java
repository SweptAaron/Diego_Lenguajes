/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Pregunta {
    private ArrayList<Opcion> Opcion;
            private String titulo;

    public Pregunta(String titulo ,ArrayList<Opcion> Opcion) {
        this.Opcion = Opcion;
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpcion() {
        return Opcion;
    }

    public void setOpcion(ArrayList<Opcion> Opcion) {
        this.Opcion = Opcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
