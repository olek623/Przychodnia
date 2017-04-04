package przychodnia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public final class database {

    private static String ip;
    private Connection conn = null;
    private static boolean spr = true;
    private static boolean sprwl=true;
                  

    protected database() {
        while (spr) {
            Properties myProp = new Properties();
            myProp.put("user", "dbadmin");
            myProp.put("password", "password");
            myProp.put("loginTimeout", "35");
            myProp.put("binaryBatchInsert", "true");

            try {
                try (BufferedReader br = new BufferedReader(new FileReader("ADRESIP.TXT"))) {
                    ip = br.readLine();
                    System.out.print(ip);
                }
            } catch (IOException e) {
                System.out.println("błąd IO");
                zmiana();
            }
            try {
                                        //192.168.56.102
                conn = DriverManager.getConnection("jdbc:vertica://" + ip + "/przychodnia", myProp);
                spr = false;
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Błąd połączenia, sprawdź czy uruchomiony jest serwer", "Błąd", 0);
                sprwl=false;
                zmiana();

            }
        }
    }

    protected void zmiana() {
        try { 
            String content = JOptionPane.showInputDialog("Podaj adres IP", ip);
            File file = new File("ADRESIP.TXT"); // zmiena file z lokalizacją pliku
            if (!file.exists()) { //warunek, jeśli plik nie istnieje.
                file.createNewFile(); //stworzenie pliku.
                System.out.println("Stworzono nowy plik."); //wyświetlenie komunikatu o stworzeniu pliku.
            } else {   //else z komunikatem o instniejącym pliku.
                System.out.println("Plik już istnieje. ");
            }
            //bufor umożliwiający pisanie w pliku.
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ADRESIP.TXT", false))) {
                bw.write(content); //zapis do pliku tekstu z "content".    // jeśli na końcu jest true- tekst dopisywany jest w instniejącym pliku.                                                                      
                bw.close(); //zamknięcie bufora.                           // jeśli jest false- jest tworzony nowy plik z danym tekstem.
               if (sprwl)
               {
                JOptionPane.showMessageDialog(null, "Ustawienia zostaną zatwierdzone po ponownym uruchomieniu", "Komunikat", 1);
               }
               }
        } catch (IOException e) { //błąd wejśćia/wyjścia.
            System.out.println("Błąd IO");
        }

    }

    protected Connection run() {
        return conn;
    }
}
