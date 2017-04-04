/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przychodnia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static przychodnia.Przychodnia.vertica;
import static przychodnia.metody.WykonanieSQL;
import static przychodnia.metody.sprczylitery;

public class DLeczenie extends javax.swing.JFrame {

    public DLeczenie() {
        initComponents();
        wyswietleniechorob("SELECT * FROM choroby");
        wyswietlenielekow("SELECT * FROM lekarstwa");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablechoroby = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelekarstwa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textwyszukiwaniechoroby = new javax.swing.JTextField();
        textwyszukiwanieleku = new javax.swing.JTextField();
        buttonwyszukiwaniechoroby = new javax.swing.JButton();
        buttonwyszukiwanielekarstwa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textjednostka = new javax.swing.JTextField();
        textdawkowanie = new javax.swing.JTextField();
        textokres = new javax.swing.JTextField();
        textdawka = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablechoroby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nazwa", "Objawy", "Leczenie", "kod choroby"
            }
        ));
        tablechoroby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablechoroby);

        tablelekarstwa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nazwa", "Przeciwwskazania", "Skutki uboczne", "Sklad", "kod lekarstwa"
            }
        ));
        tablelekarstwa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tablelekarstwa);

        jLabel1.setText("Choroba:");

        jLabel2.setText("Lekarstwo:");

        textwyszukiwaniechoroby.setText("nazwa");
        textwyszukiwaniechoroby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textwyszukiwaniechorobyActionPerformed(evt);
            }
        });

        textwyszukiwanieleku.setText("nazwa lekarstwa");
        textwyszukiwanieleku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textwyszukiwanielekuActionPerformed(evt);
            }
        });

        buttonwyszukiwaniechoroby.setText("Wyszukaj");
        buttonwyszukiwaniechoroby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwyszukiwaniechorobyActionPerformed(evt);
            }
        });

        buttonwyszukiwanielekarstwa.setText("Wyszukaj");
        buttonwyszukiwanielekarstwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwyszukiwanielekarstwaActionPerformed(evt);
            }
        });

        jLabel3.setText("Typowa jednostka:");

        jLabel4.setText("Typowe dawkowanie:");

        jLabel5.setText("Typowy okres:");

        jLabel6.setText("Typowa dawka:");

        textdawkowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdawkowanieActionPerformed(evt);
            }
        });

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Wyjście");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textwyszukiwanieleku)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonwyszukiwanielekarstwa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textwyszukiwaniechoroby)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonwyszukiwaniechoroby, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textokres)
                                    .addComponent(textdawka)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textjednostka)
                                    .addComponent(textdawkowanie)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textwyszukiwaniechoroby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonwyszukiwaniechoroby))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textwyszukiwanieleku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonwyszukiwanielekarstwa))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textjednostka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textdawkowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textokres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textdawka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textwyszukiwanielekuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textwyszukiwanielekuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textwyszukiwanielekuActionPerformed
    private void wyswietleniechorob(String SQL) {
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);

            DefaultTableModel modelchoroby = (DefaultTableModel) tablechoroby.getModel();
            modelchoroby.setRowCount(0);

            while (rs.next()) {
                int kod_chorobyy = rs.getInt("kod_choroby");
                String nazwa_chorobyy = rs.getString("nazwa_choroby");
                String objawyy = rs.getString("objawy");
                String leczeniee = rs.getString("leczenie");

                modelchoroby.addRow(new Object[]{ nazwa_chorobyy, objawyy, leczeniee,kod_chorobyy});

            }
            //wypełanianie nullami -dla wyglądu
            while (modelchoroby.getRowCount() < 4) {
                modelchoroby.addRow(new Object[]{"", "", "", ""});
            }
            tablechoroby.getColumnModel().removeColumn(tablechoroby.getColumnModel().getColumn(3));


        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void wyswietlenielekow(String SQL) {
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            DefaultTableModel modellekarstwa = (DefaultTableModel) tablelekarstwa.getModel();
            modellekarstwa.setRowCount(0);

            while (rs.next()) {
                int kod_lekarstwaa = rs.getInt("kod_lekarstwa");
                String nazwaa = rs.getString("nazwa");
                String przeciwwskazaniaa = rs.getString("przeciwwskazania");
                String skutkiubocznee = rs.getString("skutki_uboczne");
                String skladd = rs.getString("sklad");

                modellekarstwa.addRow(new Object[]{nazwaa, przeciwwskazaniaa, skutkiubocznee, skladd,kod_lekarstwaa});

            }
            //wypełanianie nullami -dla wyglądu
            while (modellekarstwa.getRowCount() < 4) {
                modellekarstwa.addRow(new Object[]{"", "", "", "", ""});
            }
             tablelekarstwa.getColumnModel().removeColumn(tablelekarstwa.getColumnModel().getColumn(4));

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void textwyszukiwaniechorobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textwyszukiwaniechorobyActionPerformed


    }//GEN-LAST:event_textwyszukiwaniechorobyActionPerformed

    private void buttonwyszukiwanielekarstwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyszukiwanielekarstwaActionPerformed
        String nazwalekarstwa = textwyszukiwanieleku.getText();

        if (sprczylitery(nazwalekarstwa)) {
            String SQL = "SELECT * FROM lekarstwa WHERE nazwa LIKE '%" + nazwalekarstwa + "%'";
            wyswietlenielekow(SQL);
        }
    }//GEN-LAST:event_buttonwyszukiwanielekarstwaActionPerformed

    private void buttonwyszukiwaniechorobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyszukiwaniechorobyActionPerformed
        String nazwachoroby = textwyszukiwaniechoroby.getText();

        if (sprczylitery(nazwachoroby)) {
            String SQL = "SELECT * FROM choroby WHERE nazwa_choroby LIKE '%" + nazwachoroby + "%'";
            wyswietleniechorob(SQL);
        }
    }//GEN-LAST:event_buttonwyszukiwaniechorobyActionPerformed


    private void textdawkowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdawkowanieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdawkowanieActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Sjednostka = textjednostka.getText();
        String Sdawkowanie = textdawkowanie.getText();
        String Sokres = textokres.getText();
        String Sdawka = textdawka.getText();

        DefaultTableModel modelchoroby = (DefaultTableModel) tablechoroby.getModel();
        int i = tablechoroby.getSelectedRow();

        DefaultTableModel modellekarstwa = (DefaultTableModel) tablelekarstwa.getModel();
        int j = tablelekarstwa.getSelectedRow();

        if (j == -1 || i == -1) {
            JOptionPane.showMessageDialog(null, "Wybierz pola!", "Błąd", 0);

        } else {
            int numerchoroby = (int) modelchoroby.getValueAt(i, 3);
            int numerlekarstwa = (int) modellekarstwa.getValueAt(j, 4);

            String SQL = ("INSERT INTO leczenie (typowa_dawka, typowa_jednostka, typowe_dawkowanie, typowy_okres, kod_lekarstwa, kod_choroby) VALUES('" + Sdawka + "', '" + Sjednostka + "', '" + Sdawkowanie + "', '" + Sokres + "'," + numerlekarstwa + " , " + numerchoroby + ")");
            WykonanieSQL(SQL);

            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void run() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DLeczenie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DLeczenie().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonwyszukiwaniechoroby;
    private javax.swing.JButton buttonwyszukiwanielekarstwa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablechoroby;
    private javax.swing.JTable tablelekarstwa;
    private javax.swing.JTextField textdawka;
    private javax.swing.JTextField textdawkowanie;
    private javax.swing.JTextField textjednostka;
    private javax.swing.JTextField textokres;
    private javax.swing.JTextField textwyszukiwaniechoroby;
    private javax.swing.JTextField textwyszukiwanieleku;
    // End of variables declaration//GEN-END:variables
}
