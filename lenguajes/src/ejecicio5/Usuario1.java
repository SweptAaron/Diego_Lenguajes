
package ejecicio5;

/**
 *
 * @author Vaio
 */
public class Usuario1 {
        
       private int peso;
       private float altura;
       private String nombre;
       
       public Usuario1(){
           peso=50;
           altura=1.70f;
           nombre="Diego";
       }

       public Usuario1(String nombre)
       {
           this.nombre=nombre;
       }
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
