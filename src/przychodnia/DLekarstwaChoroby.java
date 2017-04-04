
package przychodnia;

import static przychodnia.metody.WykonanieSQL;

/**
 *
 * @author Olek
 */
public class DLekarstwaChoroby extends javax.swing.JFrame {

    private static String wybor;
    public DLekarstwaChoroby() {
        initComponents();
        ustawieniaokna();
    }

    private void ustawieniaokna()
    {
        if ("chorobe".equals(wybor))
        {
            labelsklad.setVisible(false);
            text4.setVisible(false);
            labelprzeciwwskazania.setText("Leczenie, opis:");
            labelskutkiuboczne.setText("Objawy:");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        labelprzeciwwskazania = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextArea();
        labelskutkiuboczne = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text3 = new javax.swing.JTextArea();
        labelsklad = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        text4 = new javax.swing.JTextArea();
        buttondodaj = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nazwa:");

        labelprzeciwwskazania.setText("Przeciwwskazania:");

        text2.setColumns(20);
        text2.setRows(5);
        jScrollPane1.setViewportView(text2);
        text2.setLineWrap(true);

        labelskutkiuboczne.setText("Skutki uboczne:");

        text3.setColumns(20);
        text3.setRows(5);
        jScrollPane2.setViewportView(text3);
        text3.setLineWrap(true);

        labelsklad.setText("Skład:");

        text4.setColumns(20);
        text4.setRows(5);
        jScrollPane3.setViewportView(text4);
        text4.setLineWrap(true);

        buttondodaj.setText("Dodaj");
        buttondodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondodajActionPerformed(evt);
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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttondodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addComponent(labelsklad)
                    .addComponent(jScrollPane2)
                    .addComponent(labelskutkiuboczne)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1))
                    .addComponent(labelprzeciwwskazania))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelprzeciwwskazania)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelskutkiuboczne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelsklad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(buttondodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttondodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondodajActionPerformed
        String Stext1 = text1.getText();
        String Stext2 = text2.getText();
        String Stext3 = text3.getText();
        String Stext4 = text4.getText();
        String SQL;
        
        if ("chorobe".equals(wybor))
        {
        SQL = "INSERT INTO choroby\n" +
                "(kod_choroby, nazwa_choroby, objawy, leczenie)\n" +
                "VALUES(DEFAULT, '"+Stext1+"', '"+Stext3+"', '"+Stext2+"');" ;
        }
        else
        {
            SQL = "INSERT INTO lekarstwa (kod_lekarstwa, nazwa, sklad, przeciwwskazania, skutki_uboczne) VALUES (DEFAULT, '" + Stext1 + "', '" + Stext4 + "', '" + Stext2 + "', '" + Stext3 + "')";
        }
        WykonanieSQL(SQL);
         
        dispose();
            
    }//GEN-LAST:event_buttondodajActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public void run(String wyborr) {
        wybor=wyborr;
        
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
            java.util.logging.Logger.getLogger(DLekarstwaChoroby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DLekarstwaChoroby().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondodaj;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelprzeciwwskazania;
    private javax.swing.JLabel labelsklad;
    private javax.swing.JLabel labelskutkiuboczne;
    private javax.swing.JTextField text1;
    private javax.swing.JTextArea text2;
    private javax.swing.JTextArea text3;
    private javax.swing.JTextArea text4;
    // End of variables declaration//GEN-END:variables
}
