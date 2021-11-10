package DbFret;

import DbFret.Controller.Controleur2;

import java.sql.SQLException;

public class Traitement2 {


    public static void main(String[] args) throws SQLException {
        Controleur2 ctl1 = new Controleur2();
        ctl1.traiterRequete();
    }
}

