
package conexion;

import java.sql.*;

/**
 *
 * @author T-102
 */
public class ProbarConexio {
    public static void main(String[] args) {
      Connection con= null;
        try{
      con =  Conexion.conectarse("root", "");
        System.out.println("Te conectaste!!!!");
    }catch(ClassNotFoundException e){
        
    }catch(SQLException e){
        
    }finally{
         con.close();
        }
    
}
