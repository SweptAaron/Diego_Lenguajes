
package ejerciciospecial;

import java.util.ArrayList;


public class GeneradorCliente {
  //creamos metodo con retorno ArrayList
    public ArrayList<Cliente> generadorClientes(){
       //ArrayListGenerico
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    //creamos las direcciones
    Direccion direc1 = new Direccion("Calle 11","Unidad CTM",54985,"Tultepec");
    Direccion direc2= new Direccion("Calle leon","Ojo de agua",25682,"Ecatepec");
    Direccion direc3 = new Direccion("Calle 1977","Leyes de reforma",54985,"Iztacalco");
    
    //Generar los cliente
    ArrayList<Direccion> nuevos = new ArrayList<Direccion>();
    nuevos.add(direc1);
    nuevos.add(direc2);
    nuevos.add(direc3);
    
    Cliente c1 = new Cliente("Diego Aaron",22,"daavv_2603@hotmail.com",direc1);
    Cliente c2 = new Cliente("Luis Hugo",28,"hugo.vargas.vega@gmail.com",direc2);
    Cliente c3 = new Cliente("Cyan Cindel",23,"cyanciindeelvc@hotmail.com",direc3);
    
    //Agregamos los clientes al arraylist generico
    clientes.add(c1);
    clientes.add(c2);
    clientes.add(c3);
    
    
    return clientes;
    }
}
    
