
package constructores;


public class Fruta {
    private String nombre;
    private float costo;
    
 public void Fruta()
 {
     //Este no es constructor, este es un metodo
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
