package DbFret.View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue2 {


    public void showView(ResultSet resultat) throws SQLException {

        try {
            System.out.println("les identifiants des bateaux pour lesquels aucun affrètement n’a été enregistré au mois de mars 2021: \n");

            while (resultat.next())
            {
                String id = resultat.getString("id");
                 String date = resultat.getString("date");
                 String heure = resultat.getString("heure");
                 String idBatFret = resultat.getString("idBatFret");
                System.out.println("id : " +id + "\t date : " + date + "\t heure : " + heure + "\t id de bateaux : " + idBatFret+" \n ");

            }

        }

        catch (SQLException se){
            se.getMessage();
        }
    }
}


