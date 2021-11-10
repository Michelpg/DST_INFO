package DbFret;

import DbFret.Controller.Controleur3;

import java.sql.SQLException;
import java.util.Scanner;

public class Traitement3 {

    public static void main(String[] args) throws SQLException {

        System.out.println("Entrer l'id de l'affretemtent : ");
        Scanner clavier = new Scanner(System.in);

        Controleur3 ctl1 = new Controleur3();
        ctl1.traiterRequete();
    }
}
