package DbFret.Controller;

import DbFret.Model.Connexion;
import DbFret.Model.Repository;
import DbFret.View.Vue1;
import DbFret.View.Vue2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Controleur2 {



        public void traiterRequete() throws SQLException {
            Statement stmt1=null;

            ResultSet rst1=null;
            Properties props = new Properties();
            String url = "jdbc:mysql://localhost:3306/DbFret";
            props.setProperty("user","root");
            props.setProperty("password","");

            Connection conn=null;
            try {
                conn = Connexion.getConnexion(url, props);

                Vue2 vue2 = new Vue2();

                Repository rep1 = new Repository(stmt1);

                String req1 = "SELECT * FROM affretement WHERE date NOT BETWEEN 01/03/2021 AND 31/03/2021";

                rst1 = rep1.requete(conn, req1);

                vue2.showView(rst1);
            }
            catch (SQLException se) {
                se.getMessage();
            }
        }
    }


