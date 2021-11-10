package DbFret.View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue3 {




    public void showView(ResultSet resultat) throws SQLException {

        try {


            while (resultat.next())
            {
                String poids = resultat.getString("poids");

                System.out.println("le poids total de l' affrêtement n°459629 : " + poids+" kg ");
            }

        }

        catch (SQLException se){
            se.getMessage();
        }
    }
}
