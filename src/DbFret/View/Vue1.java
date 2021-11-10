package DbFret.View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue1 {


    public void showView(ResultSet resultat) throws SQLException {

        try {

            while (resultat.next())
            {
                String tarifunit = resultat.getString("tarifunit");
                System.out.println("le chiffre d'affaires de l'affrètement n°459629 : " + tarifunit+" euro ");
            }

        }

        catch (SQLException se){
            se.getMessage();
        }
    }
}
