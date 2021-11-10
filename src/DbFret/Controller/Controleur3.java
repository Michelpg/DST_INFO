package DbFret.Controller;

import DbFret.Model.Connexion;
import DbFret.Model.Repository;
import DbFret.Traitement;
import DbFret.View.Vue3;
import DbFret.Traitement3;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Controleur3 {


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

            Vue3 vue3 = new Vue3();

            Repository rep1 = new Repository(stmt1);

            String req1 = "SELECT poids FROM affretement a INNER JOIN lot l ON a.id = l.idAff WHERE a.id =459629  ";

            rst1 = rep1.requete(conn, req1);

            vue3.showView(rst1);
        }
        catch (SQLException se) {
            se.getMessage();
        }
    }
}

