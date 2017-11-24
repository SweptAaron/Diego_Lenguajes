
package conexion;

//Este paquete es de java no del driver de MySQL
import java.sql.*;

/**
 *
 * @author T-102
 */
public class Conexion {
    
    public static Connection conectarse(String login,String password) throws SQLException, ClassNotFoundException{
     //Primero escribirmos la url del servidor de MySQL
     String url = "jdbc:mysql://localhost:3306/mysql"; //java data base connector
     
     //Cargado del driver con codigo
     //Cargamos el driver de mysql para que sepa que nos conectaremos a mysql
     Class.forName("com.mysql.jdbc.Driver");
     Connection con = DriverManager.getConnection(url, login, password);
     
     return con;
    }
    
}
