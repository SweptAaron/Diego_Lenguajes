
package abstraccion;

/**
 *
 * @author Vargas Vega Diego Aaron
 */
public class Validaciones {
    
    public static void validarNumeroNoNegativo(float numero) throws NumeroNegativoException {
       if(numero < 0) throw new NumeroNegativoException();
    }
     
}
