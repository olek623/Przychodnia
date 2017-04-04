package przychodnia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static przychodnia.Przychodnia.vertica;
import static przychodnia.metody.WykonanieSQL;
import static przychodnia.metody.sprczyliczby;
import static przychodnia.metody.sprczylitery;

public class DElekarzapacjenta extends javax.swing.JFrame {

    private static String wybor;
    private static String zapytanie;

    private void ustawieniaokna() {
        if (!"INSERT".equals(zapytanie)) {
            buttondodaj.setText("Zmień");
            label5.setVisible(false);
            text5.setVisible(false);
        }

        else if ("lekarze".equals(wybor)) {
            label5.setVisible(false);
            text5.setVisible(false);
        } 

    }

    public DElekarzapacjenta() {
        initComponents();
        ustawieniaokna();
       if (!"INSERT".equals(zapytanie)) {
        wypelnienie();
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        text4 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        buttondodaj = new javax.swing.JButton();
        buttonwyjsciedispose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label1.setText("imie:");

        label2.setText("nazwisko:");

        label3.setText("adres:");

        label4.setText("telefon:");

        text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5ActionPerformed(evt);
            }
        });

        label5.setText("nr ubezpieczenia:");

        buttondodaj.setText("Dodaj");
        buttondodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondodajActionPerformed(evt);
            }
        });

        buttonwyjsciedispose.setText("Wyjście");
        buttonwyjsciedispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwyjsciedisposeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2)
                            .addComponent(label3)
                            .addComponent(label4)
                            .addComponent(label5)
                            .addComponent(label1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text2)
                            .addComponent(text3)
                            .addComponent(text4)
                            .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttondodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonwyjsciedispose, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttondodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonwyjsciedispose, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5ActionPerformed

    private void wypelnienie() {

        String SQL;
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();

            if ("pacjenci".equals(wybor)) {
                SQL = "SELECT * FROM pacjenci WHERE nr_ubezpieczenia=" + zapytanie;
            } else {
                SQL = "SELECT * FROM lekarze WHERE nr_lekarza=" + zapytanie;
            }
            System.out.println(SQL);
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                text1.setText(rs.getString("imie"));
                text2.setText(rs.getString("nazwisko"));
                text3.setText(rs.getString("adres"));
                text4.setText(rs.getString("telefon"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buttonwyjsciedisposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyjsciedisposeActionPerformed
        dispose();
    }//GEN-LAST:event_buttonwyjsciedisposeActionPerformed




    private void buttondodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondodajActionPerformed

        String SQL = null;
        String Stext1 = text1.getText();
        String Stext2 = text2.getText();
        String Stext3 = text3.getText();
        String Stext4 = text4.getText();
        String Stext5 = text5.getText();

        if ("INSERT".equals(zapytanie)) 
        {

            if ("pacjenci".equals(wybor) && sprczylitery(Stext1) == true && sprczylitery(Stext2) == true && sprczyliczby(Stext5)==true && metody.sprczyliczby(Stext4)==true) {

                SQL = "INSERT INTO pacjenci (imie, nazwisko, adres, telefon, nr_ubezpieczenia) VALUES('" + Stext1 + "', '" + Stext2 + "', '" + Stext3 + "', '" + Stext4 + "', " + Stext5 + ")";
                WykonanieSQL(SQL);
                dispose();

            } else if ("lekarze".equals(wybor) && sprczylitery(Stext1) == true && sprczylitery(Stext2) == true && sprczyliczby(Stext4)==true) {

                SQL = "INSERT INTO lekarze (nr_lekarza, imie, nazwisko, adres, telefon) VALUES (DEFAULT, '" + Stext1 + "', '" + Stext2 + "', '" + Stext3 + "', '" + Stext4 + "')";
               WykonanieSQL(SQL);
               dispose();

            }  else {
                //błędnie wprowadzone dane- komunikat
                JOptionPane.showMessageDialog(null, "Niepoprawnie podane dane", "Błąd", 0);
            }
             
        } else 
            

        {         
            System.out.println("edycja");
            
            if ("pacjenci".equals(wybor) && sprczylitery(Stext1) == true && sprczylitery(Stext2) == true  && sprczyliczby(Stext4)==true) {

                SQL = "UPDATE pacjenci SET imie='"+Stext1+"', nazwisko='"+Stext2+"', adres='"+Stext3+"', telefon='"+Stext4+"' WHERE nr_ubezpieczenia= "+zapytanie ;
                WykonanieSQL(SQL);
                dispose();

            } else if ("lekarze".equals(wybor) && sprczylitery(Stext1) == true && sprczylitery(Stext2) == true && sprczyliczby(Stext4)==true) {

                SQL = "UPDATE lekarze SET imie='"+Stext1+"', nazwisko='"+Stext2+"', adres='"+Stext3+"', telefon='"+Stext4+"' WHERE nr_lekarza= "+zapytanie ;                WykonanieSQL(SQL);
                WykonanieSQL(SQL);
                dispose();
            }  
                   else {
                //błędnie wprowadzone dane- komunikat
                JOptionPane.showMessageDialog(null, "Niepoprawnie podane dane", "Błąd", 0);
            }
             
        }

       
      
    }//GEN-LAST:event_buttondodajActionPerformed

    public void run(String wyborr, String zapytaniee) {
        wybor = wyborr;
        zapytanie = zapytaniee;

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DElekarzapacjenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DElekarzapacjenta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondodaj;
    private javax.swing.JButton buttonwyjsciedispose;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    // End of variables declaration//GEN-END:variables

}
