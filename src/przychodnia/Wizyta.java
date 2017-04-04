package przychodnia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static przychodnia.Przychodnia.vertica;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static przychodnia.metody.WykonanieSQL;
import static przychodnia.metody.sprczylitery;

public class Wizyta extends javax.swing.JFrame {

    private int tablicacombo[] = new int[150];
    private int tablicalekow[] = new int[5];
    private int tablicachorob[] = new int[5];
    private int liczniklekow = 0;
    private int licznikchorob = 0;
    private static int numerlekarza;
    private static int numerwizty;
    private static int kod_ubezpieczenia;
    private int nrrowlekarstwo;
    private int nrrowchoroba;

    private int licznikrowlekarstwo;
    private int licznikrowchoroba;

    private int wybranachoroba = -1;
    private int wybranelekarstwo = -1;

    public Wizyta() {
        initComponents();
        start();

    }

    private void start() {
        wyswietleniechorob("SELECT * FROM choroby");
        wyswietlenielekow("SELECT * FROM lekarstwa");
        combowypelnienie();
        wyswietleniedaty();
        combolekarz.setSelectedIndex(0);
        buttonzapiszdiagnoze.setEnabled(false);
        buttondodawanielekudolisty.setEnabled(false);
        buttondrukowanierecepty.setEnabled(false);
    }


    private void wyswietleniedaty() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = dateFormat.format(currentDate);
        System.out.println(dateString);
        labelczas.setText(dateString);
    }

    private void wyswietleniechorob(String SQL) {
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);

            DefaultTableModel modelchoroby = (DefaultTableModel) tablechoroby.getModel();
            modelchoroby.setRowCount(0);
            modelchoroby.setColumnIdentifiers(new Object[]{"Nazwa", "Objawy", "Leczenie", "Kod choroby"});

            licznikrowchoroba = 0;
            while (rs.next()) {
                int kod_chorobyy = rs.getInt("kod_choroby");
                String nazwa_chorobyy = rs.getString("nazwa_choroby");
                String objawyy = rs.getString("objawy");
                String leczeniee = rs.getString("leczenie");

                modelchoroby.addRow(new Object[]{nazwa_chorobyy, objawyy, leczeniee, kod_chorobyy});
                licznikrowchoroba++;
            }
            //wypełanianie nullami -dla wyglądu
            while (modelchoroby.getRowCount() < 6) {
                modelchoroby.addRow(new Object[]{" ", " ", " ", " "});
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
            modellekarstwa.setColumnIdentifiers(new Object[]{"Nazwa", "Przeciwwskazania", "Skutki uboczne", "Skład", "Kod lekarstwa"});

            licznikrowlekarstwo = 0;
            while (rs.next()) {
                int kod_lekarstwaa = rs.getInt("kod_lekarstwa");
                String nazwaa = rs.getString("nazwa");
                String przeciwwskazaniaa = rs.getString("przeciwwskazania");
                String skutkiubocznee = rs.getString("skutki_uboczne");
                String skladd = rs.getString("sklad");

                modellekarstwa.addRow(new Object[]{nazwaa, przeciwwskazaniaa, skutkiubocznee, skladd, kod_lekarstwaa});
                licznikrowlekarstwo++;
            }
            //wypełanianie nullami -dla wyglądu
            while (modellekarstwa.getRowCount() < 7) {
                modellekarstwa.addRow(new Object[]{" ", " ", " ", " ", " "});
            }

            tablelekarstwa.getColumnModel().removeColumn(tablelekarstwa.getColumnModel().getColumn(4));
        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        combolekarz = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablechoroby = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textwyszukiwaniechoroby = new javax.swing.JTextField();
        textwyszukiwanieleku = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablelekarstwa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        buttonwyszukiwaniechorobyobjawy = new javax.swing.JButton();
        buttonwyjscie = new javax.swing.JButton();
        buttonwyszukiwaniechoroby = new javax.swing.JButton();
        buttonwyszukiwanielekarstwa = new javax.swing.JButton();
        buttonpodobne = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        textareaobjawy = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        textareanotatki = new javax.swing.JTextArea();
        buttonzapiszwizyte = new javax.swing.JButton();
        buttonzapiszdiagnoze = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttondodawanielekudolisty = new javax.swing.JButton();
        buttondrukowanierecepty = new javax.swing.JButton();
        textdawka = new javax.swing.JTextField();
        textdawkowanie = new javax.swing.JTextField();
        textjednostka = new javax.swing.JTextField();
        textokres = new javax.swing.JTextField();
        labelczas = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        combolekarz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        combolekarz.setToolTipText("");
        combolekarz.setName("azazaza"); // NOI18N
        combolekarz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolekarzActionPerformed(evt);
            }
        });

        jLabel1.setText("Lekarz:");

        tablechoroby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nazwa", "Objawy", "Leczenie", "Kod choroby"
            }
        ));
        tablechoroby.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablechoroby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablechorobyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablechoroby);
        tablechoroby.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Choroba:");

        jLabel3.setText("Objawy:");

        jLabel4.setText("Notatki:");

        jLabel5.setText("Lekarstwa:");

        textwyszukiwaniechoroby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textwyszukiwaniechorobyActionPerformed(evt);
            }
        });

        tablelekarstwa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nazwa", "Przeciwwskazania", "Skutki uboczne", "Skład", "Kod lekarstwa"
            }
        ));
        tablelekarstwa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablelekarstwa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablelekarstwaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablelekarstwa);

        jLabel6.setText("Data:");

        buttonwyszukiwaniechorobyobjawy.setText("Wyszukaj po objawach");
        buttonwyszukiwaniechorobyobjawy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwyszukiwaniechorobyobjawyActionPerformed(evt);
            }
        });

        buttonwyjscie.setText("Wyjście");
        buttonwyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwyjscieActionPerformed(evt);
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

        buttonpodobne.setText("Podobne");
        buttonpodobne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpodobneActionPerformed(evt);
            }
        });

        textareaobjawy.setColumns(20);
        textareaobjawy.setRows(5);
        jScrollPane5.setViewportView(textareaobjawy);
        textareaobjawy.setLineWrap(true);

        textareanotatki.setColumns(20);
        textareanotatki.setRows(5);
        jScrollPane7.setViewportView(textareanotatki);
        textareanotatki.setLineWrap(true);

        buttonzapiszwizyte.setText("Zapisz wizytę");
        buttonzapiszwizyte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonzapiszwizyteActionPerformed(evt);
            }
        });

        buttonzapiszdiagnoze.setText("Zapisz diagnozę");
        buttonzapiszdiagnoze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonzapiszdiagnozeActionPerformed(evt);
            }
        });

        jLabel7.setText("Dawka:");

        jLabel8.setText("Jednostka:");

        jLabel9.setText("Dawkowanie:");

        jLabel10.setText("Okres:");

        buttondodawanielekudolisty.setText("Dodaj lek do recepty");
        buttondodawanielekudolisty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondodawanielekudolistyActionPerformed(evt);
            }
        });

        buttondrukowanierecepty.setText("Recepta");
        buttondrukowanierecepty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondrukowaniereceptyActionPerformed(evt);
            }
        });

        labelczas.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combolekarz, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelczas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonzapiszdiagnoze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(13, 13, 13)
                                    .addComponent(textwyszukiwaniechoroby)))
                            .addComponent(buttonzapiszwizyte, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonwyszukiwaniechoroby, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonwyszukiwaniechorobyobjawy, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttondrukowanierecepty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttondodawanielekudolisty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonwyjscie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textwyszukiwanieleku, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonwyszukiwanielekarstwa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonpodobne, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textokres)
                                    .addComponent(textdawka)
                                    .addComponent(textdawkowanie)
                                    .addComponent(textjednostka, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combolekarz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(labelczas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonzapiszwizyte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textwyszukiwanieleku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonwyszukiwanielekarstwa)
                            .addComponent(buttonpodobne))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textwyszukiwaniechoroby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonwyszukiwaniechoroby, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(buttonwyszukiwaniechorobyobjawy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textdawka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textdawkowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textjednostka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(textokres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttondodawanielekudolisty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttondrukowanierecepty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonwyjscie, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(buttonzapiszdiagnoze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        combolekarz.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textwyszukiwaniechorobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textwyszukiwaniechorobyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textwyszukiwaniechorobyActionPerformed

    private void buttonwyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyjscieActionPerformed
                HashMap mapa = new HashMap();      
        mapa.put("numer",numerwizty);
        String jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\podsumowaniewizyty.jrxml";
        String jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\podusmowaniewizyty.jasper";
        try {
            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
        } catch (JRException ex) {
            Logger.getLogger(OknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }

        Connection connn = vertica.run();   
        
        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(jasperFileName, mapa, connn);
        } catch (JRException ex) {
            Logger.getLogger(OknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer.viewReport(jp);
 
        
        dispose();
    }//GEN-LAST:event_buttonwyjscieActionPerformed

    private void buttonpodobneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpodobneActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablelekarstwa.getModel();
        int i = tablelekarstwa.getSelectedRow();
        int a = (int) model.getValueAt(i, 4);

        String b = Integer.toString(a);
        wyswietlpodobne(b);
    }//GEN-LAST:event_buttonpodobneActionPerformed

    private void buttonwyszukiwaniechorobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyszukiwaniechorobyActionPerformed
        String nazwachoroby = textwyszukiwaniechoroby.getText();

        if (sprczylitery(nazwachoroby)) {
            String SQL = "SELECT * FROM choroby WHERE nazwa_choroby LIKE '%" + nazwachoroby + "%'";
            wyswietleniechorob(SQL);
        }

    }//GEN-LAST:event_buttonwyszukiwaniechorobyActionPerformed

    private void buttonwyszukiwanielekarstwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyszukiwanielekarstwaActionPerformed
        String nazwalekarstwa = textwyszukiwanieleku.getText();

        if (sprczylitery(nazwalekarstwa)) {
            String SQL = "SELECT * FROM lekarstwa WHERE nazwa LIKE '%" + nazwalekarstwa + "%'";
            wyswietlenielekow(SQL);
        }
    }//GEN-LAST:event_buttonwyszukiwanielekarstwaActionPerformed

    private void combowypelnienie() {
        Connection conn = vertica.run();

        int licznik = 0;
        try {
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM lekarze";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                combolekarz.addItem(rs.getString("imie") + " " + rs.getString("nazwisko"));

                tablicacombo[licznik] = rs.getInt("nr_lekarza");
                licznik++;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void combolekarzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolekarzActionPerformed
        numerlekarza = tablicacombo[combolekarz.getSelectedIndex()];
        System.out.println(numerlekarza);

    }//GEN-LAST:event_combolekarzActionPerformed

    //do optymalizacji powtarza sie
    private void wyswietlpodobne(String b) {

        DefaultTableModel modellekarstwa = (DefaultTableModel) tablelekarstwa.getModel();

        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            String SQL = ("SELECT lekarstwa.kod_lekarstwa, lekarstwa.nazwa, lekarstwa.sklad, lekarstwa.przeciwwskazania, lekarstwa.skutki_uboczne FROM lekarstwa JOIN interakcje ON lekarstwa.kod_lekarstwa=interakcje.kod_lekarstwa2 OR lekarstwa.kod_lekarstwa=interakcje.kod_lekarstwa1 WHERE interakcje.kod_lekarstwa2=" + b + " OR interakcje.kod_lekarstwa1=" + b + " ;");
            System.out.println(SQL);
            ResultSet rs = stmt.executeQuery(SQL);
            modellekarstwa.setRowCount(0);

            while (rs.next()) {
                String text1 = rs.getString("nazwa");
                String text2 = rs.getString("przeciwwskazania");
                String text3 = rs.getString("skutki_uboczne");
                String text4 = rs.getString("sklad");
                int text5 = rs.getInt("kod_lekarstwa");

                modellekarstwa.setColumnIdentifiers(new Object[]{"Nazwa", "Przeciwwskazania", "Skutki uboczne", "Skład", "Kod lekarstwa"});
                modellekarstwa.addRow(new Object[]{text1, text2, text3, text4, text5});
            }

            // wypełanianie nullami -dla wyglądu
            while (modellekarstwa.getRowCount() < 11) {
                modellekarstwa.addRow(new Object[]{"", "", "", "", ""});
            }

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buttonwyszukiwaniechorobyobjawyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyszukiwaniechorobyobjawyActionPerformed
        String objawy = textareaobjawy.getText();

        if (sprczylitery(objawy)) {
            String SQL = "SELECT * FROM choroby WHERE objawy LIKE '%" + objawy + "%'";
            System.out.print(SQL);
            wyswietleniechorob(SQL);
        }

    }//GEN-LAST:event_buttonwyszukiwaniechorobyobjawyActionPerformed


    private int realizowanawizytylastid() {
        int wizyta = 0;
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            String SQL = ("SELECT LAST_INSERT_ID() ");
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                wizyta = rs.getInt("LAST_INSERT_ID");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return wizyta;
    }
    private void buttonzapiszwizyteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonzapiszwizyteActionPerformed
        String objawy = textareaobjawy.getText();
        String notatki = textareanotatki.getText();
        String SQL = "INSERT INTO wizyty (nr_wizyty, nr_lekarza, data_wizyty, objawy, notatki, nr_ubezpieczenia)VALUES(DEFAULT, " + numerlekarza + ", now(),'" + objawy + "', '" + notatki + "', " + kod_ubezpieczenia + ");";
        WykonanieSQL(SQL);

        numerwizty = realizowanawizytylastid();
        System.out.println("realizowana wizyta: " + numerwizty);

        buttonwyjscie.setEnabled(false);
        buttonzapiszwizyte.setEnabled(false);
        combolekarz.setEnabled(false);
        buttondodawanielekudolisty.setEnabled(true);
        buttonzapiszdiagnoze.setEnabled(true);
        textareanotatki.setEnabled(false);
        textareaobjawy.setEnabled(false);
    }//GEN-LAST:event_buttonzapiszwizyteActionPerformed

    private boolean sprlekarstw() {
        boolean spr = true;
        if (liczniklekow >= 5) {
            spr = false;
        } else {

            for (int i = 0; i < liczniklekow; i++) {
                System.out.print(tablicalekow[i]);
                System.out.println("wybrana: " + wybranelekarstwo);

                if (wybranelekarstwo != tablicalekow[i]) {
                } else {
                    spr = false;
                }

            }
        }
        System.out.print(spr);
        return spr;
    }
    private boolean sprchorob() {
        boolean spr = true;
        if (licznikchorob >= 5) {
            spr = false;
        } else {

            for (int i = 0; i < licznikchorob; i++) {
                System.out.print(tablicachorob[i]);
                System.out.println("wybrana: " + wybranachoroba);

                if (wybranachoroba != tablicachorob[i]) {
                } else {
                    spr = false;
                }

            }
        }
        System.out.print(spr);
        return spr;
    }

    private void buttonzapiszdiagnozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonzapiszdiagnozeActionPerformed

        if (wybranachoroba == -1) {
            JOptionPane.showMessageDialog(null, "Wybierz chorobę!", "Błąd", 0);
        } else if (sprchorob() == false && licznikchorob >= 5) {
            JOptionPane.showMessageDialog(null, "Maksymalna liczba chorób", "Błąd", 0);
        } else if (sprchorob() == false) {
            JOptionPane.showMessageDialog(null, "Wybierz inną chorobę!", "Błąd", 0);
        } else {
            String SQL = "INSERT INTO diagnoza (nr_wizyty, kod_choroby) VALUES(" + numerwizty + ", " + wybranachoroba + ");";
            WykonanieSQL(SQL);

            tablicachorob[licznikchorob] = wybranachoroba;
            licznikchorob++;

        }

    }//GEN-LAST:event_buttonzapiszdiagnozeActionPerformed

    private void tablechorobyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablechorobyMouseClicked
        nrrowchoroba = tablechoroby.getSelectedRow();
        if (nrrowchoroba < licznikrowchoroba) {
            DefaultTableModel model = (DefaultTableModel) tablechoroby.getModel();
            wybranachoroba = (int) model.getValueAt(nrrowchoroba, 3);

            wybranelekarstwo = -1; //zerowanie lekarstw, bo nowa choroba
            System.out.println(wybranachoroba);
            wyswietlenielekow("SELECT lekarstwa.kod_lekarstwa, lekarstwa.nazwa, lekarstwa.sklad, lekarstwa.przeciwwskazania, lekarstwa.skutki_uboczne FROM lekarstwa JOIN leczenie ON lekarstwa.kod_lekarstwa=leczenie.kod_lekarstwa JOIN choroby ON leczenie.kod_choroby=choroby.kod_choroby WHERE choroby.kod_choroby=" + wybranachoroba + "  ;");
        } else {
            wybranachoroba = -1;

        }

        wypelnienieleczenia();
    }//GEN-LAST:event_tablechorobyMouseClicked

    private void wypelnienieleczenia() {
        if (wybranachoroba != -1 && wybranelekarstwo != -1) {

            Connection conn = vertica.run();
            try {
                Statement stmt = conn.createStatement();
                String SQL = ("SELECT typowa_dawka, typowa_jednostka, typowe_dawkowanie, typowy_okres FROM leczenie WHERE kod_lekarstwa=" + wybranelekarstwo + " AND kod_choroby=" + wybranachoroba + ";");

                System.out.println(SQL);
                ResultSet rs = stmt.executeQuery(SQL);

                while (rs.next()) {

                    textjednostka.setText(rs.getString("typowa_jednostka"));
                    textdawkowanie.setText(rs.getString("typowe_dawkowanie"));
                    textokres.setText(rs.getString("typowy_okres"));
                    textdawka.setText(rs.getString("typowa_dawka"));
                }

            } catch (SQLException ex) {
                Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            textjednostka.setText("");
            textdawkowanie.setText("");
            textokres.setText("");
            textdawka.setText("");

        }

    }
    private void tablelekarstwaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablelekarstwaMouseClicked

        nrrowlekarstwo = tablelekarstwa.getSelectedRow();
        if (nrrowlekarstwo < licznikrowlekarstwo) {
            DefaultTableModel model = (DefaultTableModel) tablelekarstwa.getModel();
            wybranelekarstwo = (int) model.getValueAt(nrrowlekarstwo, 4);

            System.out.println(wybranelekarstwo);
        } else {
            wybranelekarstwo = -1;
        }
        wypelnienieleczenia();
    }//GEN-LAST:event_tablelekarstwaMouseClicked

   

    private void buttondodawanielekudolistyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondodawanielekudolistyActionPerformed

        if (wybranelekarstwo == -1) {
            JOptionPane.showMessageDialog(null, "Wybierz lekarstwo!", "Błąd", 0);
        } else if (sprlekarstw() == false && liczniklekow >= 5) {
            JOptionPane.showMessageDialog(null, "Maksymalna liczba lekarstw", "Błąd", 0);
        } else if (sprlekarstw() == false) {
            JOptionPane.showMessageDialog(null, "Wybierz inne lekarstwo!", "Błąd", 0);
        } else {
            buttondrukowanierecepty.setEnabled(true);
            //buttonwyjscie.setEnabled(true);

            String SQL = "INSERT INTO recepta (nr_wizyty, dawka, jednostka, dawkowanie, okres, kod_lekarstwa) VALUES(" + numerwizty + ", '" + textdawka.getText() + "', '" + textjednostka.getText() + "', '" + textdawkowanie.getText() + "', '" + textokres.getText() + "', " + wybranelekarstwo + ");";
            WykonanieSQL(SQL);

            tablicalekow[liczniklekow] = wybranelekarstwo;
            liczniklekow++;

        }


    }//GEN-LAST:event_buttondodawanielekudolistyActionPerformed

    private void buttondrukowaniereceptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondrukowaniereceptyActionPerformed
        buttonwyjscie.setEnabled(true);
        
        HashMap mapa = new HashMap();      
        mapa.put("numer",numerwizty);
        String jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\recepta.jrxml";
        String jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\recepta.jasper";
        try {
            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
        } catch (JRException ex) {
            Logger.getLogger(OknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }

        Connection connn = vertica.run();   
        
        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(jasperFileName, mapa, connn);
        } catch (JRException ex) {
            Logger.getLogger(OknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer.viewReport(jp);

    }//GEN-LAST:event_buttondrukowaniereceptyActionPerformed

    public void run(int nr) {
        kod_ubezpieczenia = nr;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Wizyta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wizyta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wizyta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wizyta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Wizyta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondodawanielekudolisty;
    private javax.swing.JButton buttondrukowanierecepty;
    private javax.swing.JButton buttonpodobne;
    private javax.swing.JButton buttonwyjscie;
    private javax.swing.JButton buttonwyszukiwaniechoroby;
    private javax.swing.JButton buttonwyszukiwaniechorobyobjawy;
    private javax.swing.JButton buttonwyszukiwanielekarstwa;
    private javax.swing.JButton buttonzapiszdiagnoze;
    private javax.swing.JButton buttonzapiszwizyte;
    private javax.swing.JComboBox<String> combolekarz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelczas;
    private javax.swing.JTable tablechoroby;
    private javax.swing.JTable tablelekarstwa;
    private javax.swing.JTextArea textareanotatki;
    private javax.swing.JTextArea textareaobjawy;
    private javax.swing.JTextField textdawka;
    private javax.swing.JTextField textdawkowanie;
    private javax.swing.JTextField textjednostka;
    private javax.swing.JTextField textokres;
    private javax.swing.JTextField textwyszukiwaniechoroby;
    private javax.swing.JTextField textwyszukiwanieleku;
    // End of variables declaration//GEN-END:variables

}
