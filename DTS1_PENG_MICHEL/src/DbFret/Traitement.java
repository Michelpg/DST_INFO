package DbFret;

import DbFret.Controller.Controleur;
import DbFret.Controller.Controleur2;

import java.sql.SQLException;

import java.sql.*;

public class Traitement {

    public static void main(String[] args) throws SQLException {
        Controleur ctl1 = new Controleur();
        ctl1.traiterRequete();
    }
}


