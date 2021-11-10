package DbFret.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connexion {


    public static Connection getConnexion(String url, Properties props) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Erreur lors du chargement" + e.getMessage());

        }

        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection(url, props);
        }
        catch (SQLException e){
            System.out.println("Erreur lors du chargement" + e.getMessage());
        }

        return connexion;
    }
}


