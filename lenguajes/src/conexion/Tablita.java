
package conexion;

/**
 *
 * @author T-102
 */
public class Tablita {
    
    private Integer id;
    private String nombre;

    public Tablita(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Tablita() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
