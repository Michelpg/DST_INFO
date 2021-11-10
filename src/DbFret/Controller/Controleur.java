package DbFret.Controller;

import DbFret.Model.Connexion;
import DbFret.Model.Repository;
import DbFret.View.Vue1;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Controleur {


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

            Vue1 vue1 = new Vue1();

            Repository rep1 = new Repository(stmt1);

            String req1 = "SELECT tarifunit FROM tranche t INNER JOIN lot l ON t.id = l.idTran WHERE idAff = 459629 ";

            rst1 = rep1.requete(conn, req1);

            vue1.showView(rst1);
        }
        catch (SQLException se) {
            se.getMessage();
        }
    }
}


