
package przychodnia;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static przychodnia.Przychodnia.vertica;


public  class metody {
    
     static void WykonanieSQL(String SQL) {
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(SQL);
            stmt.executeUpdate(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    static boolean sprczylitery(String test) {
        boolean spr = true;
        if (test.length() == 0) //brak wpisanego tekstu-false
        {
            spr = false;
        }
        int i = 0;
        while (spr == true && i < test.length()) { //sprawczenie czy podane znaki to A-Z lub a-z
            if (test.charAt(i) < 'A' || test.charAt(i) > 'z' || (test.charAt(i) > 'Z' && test.charAt(i) < 'a')) {
                spr = false;
            }
            ++i;
        }
        return spr; //wynik
    }

    static boolean sprczyliczby(String test) {
        boolean spr = true;
        if (test.length() == 0) //brak wpisanego tekstu-false
        {
            spr = false;
        }
        int i = 0;

        while (spr == true && i < test.length()) {//sprawdznie czy znaki to 0-9
            if ((test.charAt(i) < '0' || test.charAt(i) > '9' ) && (test.charAt(i)!='-' && test.charAt(i)!=' ' ) ) {
                spr = false;
            }
            ++i;
        }
        return spr; //zwrócenie wyniku
    }
    
    
    
    
    
    
    
}
