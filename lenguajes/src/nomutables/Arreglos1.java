
package nomutables;

/**
 *
 * @author Diego Aaron Vargas Vega
 */
public class Arreglos1 {
    public static void main(String[] args) {
        
        //Vamos a generar un arreglo
        int x[]={12,-4,7};
        System.out.println("El tamaño es "+x.length);
        
        //para acceder a un elemento hacemos los siguiente
        System.out.println("em el indice 0 esta "+x[0]);
        
        int[]y={2,4,6};
        
        int[]z=new int[3];
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        //Vamos a iterar el arreglo z usando el ciclo for
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }
        //Aqui tenemos el ciclo for mejorado
        for(int valor:z){
            System.out.println("Mejorado "+valor);
        }
        
        String mensaje="Hola como estas";
        byte[]w=mensaje.getBytes();
        System.out.println("Tamaño "+w.length);
        String codificado="";
        for(byte b:w){
            System.out.println("El byte es "+b);
            codificado=codificado+b;
        }
        System.out.println("El mensaje codificado es");
        System.out.println(codificado);
        
    }
}
