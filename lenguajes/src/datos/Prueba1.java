
package datos;

public class Prueba1 {
    public static void main(String[] args) {
        
        //probaremos los tipos de datos integrales
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //algunas de las siguientes lineas van a marcar error 
        
        b=(byte)s;
        s=b;
        i=s;
        l=s;
        s=(short)l;
        b=(byte)i;
        
        //algo chistoso con los flotantes
        
        float f=2.0f;
        double d=2.0;
        
        boolean b1=true;
        boolean b2=false;
        
        //Tipo de caracter
        char algo='D';
        char otro=' ';
    }
}
