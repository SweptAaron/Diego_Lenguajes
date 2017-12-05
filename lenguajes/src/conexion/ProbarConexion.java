
package conexion;

import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Diego
 */
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;
        //
        try{
            con= Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            //aqui se vienen queries de mysql
            //Con la conexion que se llama con
            //vamos a generar una sentencia que es una clase
            
            //Statement st= con.createStatement();
            
            //generamos la tabla
           
//ESTA COMENTADA PARA QUE NO MARQUE ERROR DE QUE YA SE EJECUTO!!!!!!!
            // st.execute("create table tablita(id integer primary key,nombre varchar(40))");
            //System.out.println("Tabla generada con exito");           
// EL INSERT UPDATE DELETE SE LES CONOCE COMO CRUD (CREATE READ UPDATE DELETE)
            
           
            //Caso 1:INSERT,UPDATE, DELETE
            PreparedStatement st = con.prepareStatement("insert into tablita values(?,?)");
            st.setInt(1, 1);
            st.setString(2,"Diego");
            //invocar o dar enter 
            st.execute();
            
            System.out.println("Registros insertados");
            
            //Caso 2: SELECT 
            
            st.close();
        }
        catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            System.out.println("No se cargo algo bien en sql ");
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                System.out.println("No se cargo bien en sql");
            }
        }    
    }
}
 
