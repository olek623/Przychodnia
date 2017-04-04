package przychodnia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static przychodnia.Przychodnia.vertica;


public class OknoGlowne extends javax.swing.JFrame {

    private int combowybrane; //wybrana opcja przypisywana przy przycisku wyboru
    

    private Connection conhyuhun;
    private int wielkosctable=24;
    private int a;
    private int b;
    private int wyboruser=-1;
    private int licznikpol;
    
    protected OknoGlowne() {
        initComponents();
        Combowybor.setSelectedIndex(0);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablewyszukiwanie = new javax.swing.JTable();
        textimie = new javax.swing.JTextField();
        textnazwisko = new javax.swing.JTextField();
        textadres = new javax.swing.JTextField();
        Combowybor = new javax.swing.JComboBox<>();
        ButtonWyszukaj = new javax.swing.JButton();
        buttonwykonajwizyte = new javax.swing.JButton();
        buttonwyjscie = new javax.swing.JButton();
        buttonprint = new javax.swing.JButton();
        buttonusun = new javax.swing.JButton();
        buttonedytuj = new javax.swing.JButton();
        labelimie = new javax.swing.JLabel();
        labelnazwisko = new javax.swing.JLabel();
        labeladres = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        dodaj = new javax.swing.JMenu();
        menudodajpacjenta = new javax.swing.JMenuItem();
        menudodajlekarza = new javax.swing.JMenuItem();
        menudodajlekarstwo = new javax.swing.JMenuItem();
        menudodajleczenie = new javax.swing.JMenuItem();
        dodawaniechoroby = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        raportlekarstw = new javax.swing.JMenuItem();
        RaportWizyt = new javax.swing.JMenuItem();
        info = new javax.swing.JMenu();
        menuwyswietlinfo = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        Tablewyszukiwanie.setAutoCreateRowSorter(true);
        Tablewyszukiwanie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Imię ", "Nazwisko", "Adres", "Telefon", "Nr ubezpieczenia"
            }
        ));
        Tablewyszukiwanie.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tablewyszukiwanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablewyszukiwanieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablewyszukiwanie);

        textimie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textimieActionPerformed(evt);
            }
        });

        textadres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textadresActionPerformed(evt);
            }
        });

        Combowybor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pacjent", "Lekarz", "Lekarstwa","Sposób Leczenia","Wizyty","Choroby" }));
        Combowybor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombowyborActionPerformed(evt);
            }
        });

        ButtonWyszukaj.setText("Wyszukaj");
        ButtonWyszukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWyszukajActionPerformed(evt);
            }
        });

        buttonwykonajwizyte.setText("Wykonaj wizytę");
        buttonwykonajwizyte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwykonajwizyteActionPerformed(evt);
            }
        });

        buttonwyjscie.setText("Wyjście");
        buttonwyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonwyjscieActionPerformed(evt);
            }
        });

        buttonprint.setText("Drukuj");
        buttonprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonprintActionPerformed(evt);
            }
        });

        buttonusun.setText("Usuń");
        buttonusun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonusunActionPerformed(evt);
            }
        });

        buttonedytuj.setText("Edytuj");
        buttonedytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonedytujActionPerformed(evt);
            }
        });

        labelimie.setText("imie:");

        labelnazwisko.setText("nazwisko:");

        labeladres.setText("adres:");

        dodaj.setText("Dodaj");

        menudodajpacjenta.setText("Pacjenta");
        menudodajpacjenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudodajpacjentaActionPerformed(evt);
            }
        });
        dodaj.add(menudodajpacjenta);

        menudodajlekarza.setText("Lekarza");
        menudodajlekarza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudodajlekarzaActionPerformed(evt);
            }
        });
        dodaj.add(menudodajlekarza);

        menudodajlekarstwo.setText("Lekarstwo");
        menudodajlekarstwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudodajlekarstwoActionPerformed(evt);
            }
        });
        dodaj.add(menudodajlekarstwo);

        menudodajleczenie.setText("Leczenie");
        menudodajleczenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudodajleczenieActionPerformed(evt);
            }
        });
        dodaj.add(menudodajleczenie);

        dodawaniechoroby.setText("Chorobę");
        dodawaniechoroby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodawaniechorobyActionPerformed(evt);
            }
        });
        dodaj.add(dodawaniechoroby);

        jMenuBar1.add(dodaj);

        jMenu4.setText("Raporty");

        raportlekarstw.setText("Lekarstw");
        raportlekarstw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raportlekarstwActionPerformed(evt);
            }
        });
        jMenu4.add(raportlekarstw);

        RaportWizyt.setText("Wizyty");
        RaportWizyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaportWizytActionPerformed(evt);
            }
        });
        jMenu4.add(RaportWizyt);

        jMenuBar1.add(jMenu4);

        info.setText("Info");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        menuwyswietlinfo.setText("Info");
        menuwyswietlinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuwyswietlinfoActionPerformed(evt);
            }
        });
        info.add(menuwyswietlinfo);

        jMenuBar1.add(info);

        jMenu7.setText("Opcje");

        jMenuItem1.setText("Zmień adres IP");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonwyjscie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonusun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonedytuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combowybor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonWyszukaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonprint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonwykonajwizyte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelimie)
                            .addComponent(labelnazwisko)
                            .addComponent(labeladres))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textadres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(textimie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textnazwisko, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textimie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelimie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textnazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelnazwisko))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textadres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeladres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Combowybor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(ButtonWyszukaj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonprint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonwykonajwizyte, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(buttonedytuj, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonusun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonwyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textimieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textimieActionPerformed
        ButtonWyszukajActionPerformed(evt);
    }//GEN-LAST:event_textimieActionPerformed

    private void Wyszukianiewizyt()     
    {
        
        licznikpol=0;
        String imie = textimie.getText();
        String nazwisko = textnazwisko.getText();
        String adres = textadres.getText();

        Connection conn = vertica.run();
        try{
            Statement stmt = conn.createStatement();
            String SQL = "SELECT pacjenci.imie AS imiepacjenta, pacjenci.nazwisko AS nazwiskopacjenta, \n" +
                "lekarze.imie AS imielekarza, lekarze.nazwisko AS nazwiskolekarza, wizyty.nr_wizyty, \n" +
                 "wizyty.data_wizyty, wizyty.objawy, wizyty.notatki, choroby.nazwa_choroby AS nazwachoroby  \n" +
                 "FROM wizyty JOIN lekarze ON wizyty.nr_lekarza=lekarze.nr_lekarza JOIN pacjenci ON pacjenci.nr_ubezpieczenia= wizyty.nr_ubezpieczenia \n" +
                  "JOIN recepta ON wizyty.nr_wizyty=recepta.nr_wizyty JOIN lekarstwa ON lekarstwa.kod_lekarstwa=recepta.kod_lekarstwa \n" +
                "JOIN leczenie ON lekarstwa.kod_lekarstwa=leczenie.kod_lekarstwa JOIN choroby ON choroby.kod_choroby=leczenie.kod_choroby \n"                    
                + " WHERE pacjenci.imie LIKE '%" + imie + "%' AND pacjenci.nazwisko LIKE '%" + nazwisko + "%' AND pacjenci.adres LIKE '%" + adres + "%'";
           
            System.out.println(SQL);
            ResultSet rs = stmt.executeQuery(SQL);

            DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
            model.setColumnIdentifiers(new Object[]{"Dane pacjenta", "Dane lekarza", "Nazwa choroby","Objawy","Notatki","Data wizyty","nr wizyty"});

            model.setRowCount(0);

            while (rs.next()) 
            {
                

               String danepacjenta = rs.getString("imiepacjenta") +" "+ rs.getString("nazwiskopacjenta");      
               String danelekarza = rs.getString("imielekarza") +" "+ rs.getString("nazwiskolekarza"); 
               String nazwachoroby = rs.getString("nazwachoroby");
               String objawy = rs.getString("objawy");
               String notatki= rs.getString("notatki");
               //String dawka = rs.getString("dawka")+"x "+ rs.getString("jednostka")+" "+ rs.getString("dawkowanie")+"x dziennie przez "+rs.getString("okres");
               String data = rs.getString("data_wizyty");
               int nrwizyty = rs.getInt("nr_wizyty");         

                model.addRow(new Object[]{danepacjenta,danelekarza,nazwachoroby,objawy,notatki,data,nrwizyty});
                licznikpol++;
            }
            // wypełanianie nullami -dla wyglądu
            while (model.getRowCount() < wielkosctable) {
                model.addRow(new Object[]{"", "", "", "", ""});
            }
             Tablewyszukiwanie.getColumnModel().removeColumn(Tablewyszukiwanie.getColumnModel().getColumn(6));
        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Combowybor.setSelectedIndex(0);      
    }
        
    private void Wyszukiwanie(String wybor, String tab1, String tab2, String tab3, String tab4) //nazwy kolumn w jtable
    {
        licznikpol=0;
        String imie = textimie.getText();
        String nazwisko = textnazwisko.getText();
        String adres = textadres.getText();

        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            //String SQL =SQLzapytanie(imie, nazwisko, adres, wybor);
            String SQL = null;
            if ("lekarstwa".equals(wybor)) {
                SQL = "SELECT * FROM " + wybor + " WHERE nazwa LIKE '%" + adres + "%'"; //adres to nazwa
            } else {
                SQL = "SELECT * FROM " + wybor + " WHERE imie LIKE '%" + imie + "%' AND nazwisko LIKE '%" + nazwisko + "%' AND adres LIKE '%" + adres + "%'";
            }

            System.out.println(SQL);
            ResultSet rs = stmt.executeQuery(SQL);

            DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                //DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();

                String imiee = rs.getString(tab1); //imie //nazwa
                String nazwiskoo = rs.getString(tab2); //nazwisko //przeciwskazania
                String adress = rs.getString(tab3); //adres //skutki uboczen
                String telefonn = rs.getString(tab4); //telefon // sklad

                int uniwersal = 0; //nr_ubezpieczenia oraz nr_lekarza
                switch (combowybrane) {
                    case 0:
                        model.setColumnIdentifiers(new Object[]{"Imie", "Nazwisko", "Adres", "Telefon", "Nr ubezpieczenia"});
                        uniwersal = rs.getInt("nr_ubezpieczenia");
                        break;

                    case 1:
                        model.setColumnIdentifiers(new Object[]{"Imie", "Nazwisko", "Adres", "Telefon", "Nr lekarza"});
                        uniwersal = rs.getInt("nr_lekarza");

                        //ukrycie kolumny z id
                        Tablewyszukiwanie.getColumnModel().removeColumn(Tablewyszukiwanie.getColumnModel().getColumn(4));

                        break;

                    case 2:
                        model.setColumnIdentifiers(new Object[]{"Nazwa", "Przeciwwskazania", "Skutki uboczne", "Skład", "Kod_lekarstwa"});
                        uniwersal = rs.getInt("kod_lekarstwa");

                        //ukrycie kolumny z id
                        Tablewyszukiwanie.getColumnModel().removeColumn(Tablewyszukiwanie.getColumnModel().getColumn(4));

                        break;

                }

                model.addRow(new Object[]{imiee, nazwiskoo, adress, telefonn, uniwersal});
                licznikpol++;
            }
            // wypełanianie nullami -dla wyglądu
            while (model.getRowCount() < wielkosctable) {
                model.addRow(new Object[]{"", "", "", "", ""});
            }

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }


        //Combowybor.setSelectedIndex(0);

    }

    private void Wyszukiwanieleczenia() {
        String adres = textadres.getText();
        licznikpol=0;
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            String SQL = ("SELECT leczenie.kod_lekarstwa,leczenie.kod_choroby, lekarstwa.nazwa, choroby.nazwa_choroby, leczenie.typowa_jednostka, leczenie.typowe_dawkowanie, leczenie.typowy_okres, leczenie.typowa_dawka FROM lekarstwa JOIN leczenie ON lekarstwa.kod_lekarstwa=leczenie.kod_lekarstwa JOIN choroby ON choroby.kod_choroby=leczenie.kod_choroby WHERE choroby.nazwa_choroby LIKE '%" + adres + "%' ;");

            System.out.println(SQL);
            ResultSet rs = stmt.executeQuery(SQL);

            DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
            model.setColumnIdentifiers(new Object[]{"Nazwa lekarstwa", "Nazwa choroby", "Jednostka", "Dawkowanie", "Okres", "Dawka", "idlekarstwa", "idchoroby",});

            model.setRowCount(0);

            while (rs.next()) {

                String nazwalekarstwa = rs.getString("nazwa");
                int kodlekarstwa = rs.getInt("kod_lekarstwa");
                String nazwachoroby = rs.getString("nazwa_choroby");
                int kodchoroby = rs.getInt("kod_choroby");
                String jednostka = rs.getString("typowa_jednostka");
                String dawkowanie = rs.getString("typowe_dawkowanie");
                String okres = rs.getString("typowy_okres");
                String dawka = rs.getString("typowa_dawka");

                model.addRow(new Object[]{nazwalekarstwa, nazwachoroby, jednostka, dawkowanie, okres, dawka, kodlekarstwa, kodchoroby});
                licznikpol++;
            }
            // wypełanianie nullami -dla wyglądu
            while (model.getRowCount() < wielkosctable) {
                model.addRow(new Object[]{"", "", "", "", "", "", ""});
            }

            Tablewyszukiwanie.getColumnModel().removeColumn(Tablewyszukiwanie.getColumnModel().getColumn(7));
            Tablewyszukiwanie.getColumnModel().removeColumn(Tablewyszukiwanie.getColumnModel().getColumn(6));

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        //Combowybor.setSelectedIndex(0);

    }
    private void Wyszukiwaniechorob() {
        Connection conn = vertica.run();
        try {
            licznikpol=0;
            String nazwa = textadres.getText();          
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM choroby WHERE nazwa_choroby LIKE '%"+nazwa+"%';");

            DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(new Object[]{"Nazwa", "Objawy", "Leczenie", "Kod choroby"});

           
            while (rs.next()) {
                int kod_chorobyy = rs.getInt("kod_choroby");
                String nazwa_chorobyy = rs.getString("nazwa_choroby");
                String objawyy = rs.getString("objawy");
                String leczeniee = rs.getString("leczenie");

                model.addRow(new Object[]{nazwa_chorobyy, objawyy, leczeniee, kod_chorobyy});
                licznikpol++;
            }
            //wypełanianie nullami -dla wyglądu
            while (model.getRowCount() < wielkosctable) {
                model.addRow(new Object[]{" ", " ", " ", " "});
            }

            Tablewyszukiwanie.getColumnModel().removeColumn(Tablewyszukiwanie.getColumnModel().getColumn(3));

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void ButtonWyszukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWyszukajActionPerformed

        
        switch (combowybrane) {
            case 0:
                Wyszukiwanie("pacjenci", "imie", "nazwisko", "adres", "telefon");
                break;
            case 1:               
                Wyszukiwanie("lekarze", "imie", "nazwisko", "adres", "telefon");
                break;
            case 2:          
                Wyszukiwanie("lekarstwa", "nazwa", "przeciwwskazania", "skutki_uboczne", "sklad");
                break;
            case 3:             
                Wyszukiwanieleczenia();
                break;
            case 4: 
                Wyszukianiewizyt();       
                break;
            case 5:
                Wyszukiwaniechorob();
        }


    }//GEN-LAST:event_ButtonWyszukajActionPerformed

    private void buttonwyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwyjscieActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonwyjscieActionPerformed

    private void menudodajpacjentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudodajpacjentaActionPerformed

        DElekarzapacjenta dodajpacjenta = new DElekarzapacjenta();
        dodajpacjenta.run("pacjenci", "INSERT"); //nazwa tabeli

    }//GEN-LAST:event_menudodajpacjentaActionPerformed

    private void menudodajlekarzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudodajlekarzaActionPerformed
        DElekarzapacjenta dodajlekarza = new DElekarzapacjenta();
        dodajlekarza.run("lekarze", "INSERT"); //nazwa tabeli     

    }//GEN-LAST:event_menudodajlekarzaActionPerformed

    private void buttonwykonajwizyteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonwykonajwizyteActionPerformed
        if ( wyboruser != -1) {
            System.out.println("pacjent: " + a);

            Wizyta nowawizyta = new Wizyta();
            nowawizyta.run(a);
        } else {
            //błędnie wprowadzone dane- komunikat
            JOptionPane.showMessageDialog(null, "Wybierz pacjenta! ", "Błąd", 0);

        }
    }//GEN-LAST:event_buttonwykonajwizyteActionPerformed

    private void CombowyborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombowyborActionPerformed
       
        combowybrane = Combowybor.getSelectedIndex();
        
        switch (combowybrane) {
  
            case 0:
                textimie.setEnabled(true);
                textnazwisko.setEnabled(true);
                labelimie.setEnabled(true);
                labelnazwisko.setEnabled(true);
                labeladres.setText("adres: ");
                buttonedytuj.setText("Edytuj");
                buttonwykonajwizyte.setEnabled(true);
                buttonedytuj.setEnabled(true);
                buttonusun.setEnabled(true);
                buttonprint.setEnabled(false);
                break;
                
            case 1:
                textimie.setEnabled(true);
                textnazwisko.setEnabled(true);
                labelimie.setEnabled(true);
                labelnazwisko.setEnabled(true);
                labeladres.setText("adres: ");
                buttonedytuj.setText("Edytuj");
                buttonedytuj.setEnabled(true);
                buttonusun.setEnabled(true);
                buttonwykonajwizyte.setEnabled(false);
                buttonprint.setEnabled(false);
                break;
            case 2:   
                buttonprint.setEnabled(true);
                buttonedytuj.setText("Pokaż podobne");
                textimie.setEnabled(false);
                textnazwisko.setEnabled(false);
                labelimie.setEnabled(false);
                labelnazwisko.setEnabled(false);
                labeladres.setText("nazwa: ");
                buttonedytuj.setEnabled(true);
                buttonusun.setEnabled(true);
                buttonwykonajwizyte.setEnabled(false);
                break;
            case 3:
                buttonprint.setEnabled(true);
                textimie.setEnabled(false);
                textnazwisko.setEnabled(false);
                labelimie.setEnabled(false);
                labelnazwisko.setEnabled(false);
                labeladres.setText("nazwa: ");
                buttonedytuj.setText("Edytuj");
                buttonedytuj.setEnabled(true);
                buttonusun.setEnabled(true);
                buttonwykonajwizyte.setEnabled(false);
                break;
            case 4:
                buttonprint.setEnabled(true);
                textimie.setEnabled(true);
                textnazwisko.setEnabled(true);
                labelimie.setEnabled(true);
                labelnazwisko.setEnabled(true);
                labeladres.setText("adres: ");
                buttonedytuj.setEnabled(false);
                buttonusun.setEnabled(false);
                buttonwykonajwizyte.setEnabled(false);
                break;
            case 5:
                buttonprint.setEnabled(true);
                textimie.setEnabled(true);
                textnazwisko.setEnabled(true);
                labelimie.setEnabled(false);
                labelnazwisko.setEnabled(false);
                labeladres.setText("nazwa: ");
                buttonedytuj.setEnabled(false);
                buttonusun.setEnabled(false);
                buttonwykonajwizyte.setEnabled(false);
                break;

        }
        textimie.setText("");
        textnazwisko.setText("");
        textadres.setText("");
        
        ButtonWyszukajActionPerformed(evt);

    }//GEN-LAST:event_CombowyborActionPerformed

    private void buttonprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonprintActionPerformed

        if (wyboruser!=-1)
        {
      DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();  
      HashMap mapa = new HashMap();
      String jasperFileName = null;
      String jrxmlFileName = null;
      switch (combowybrane) {
          case 2:    
                mapa.put("kod_lekarstwa",a);
                jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\ulotka.jrxml";
                jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\ulotka.jasper";
                 break;
          case 3:
                mapa.put("kod_lekarstwa",a);
                mapa.put("kod_choroby",b);
                jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\sposobleczenia.jrxml";
                jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\sposobleczenia.jasper";
              break;   
          case 4:
              mapa.put("numer",a);
              jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\podsumowaniewizyty.jrxml";
              jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\podsumowaniewizyty.jasper";
              break;
          case 5:           
                mapa.put("kod_choroby",a);
                jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\lekarstwa.jrxml";
                jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\lekarstwa.jasper";
              break;
      }
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
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wybierz rekord!", "Błąd", 0);
        }

    }//GEN-LAST:event_buttonprintActionPerformed

    private void raportlekarstwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raportlekarstwActionPerformed
        
        HashMap mapa = new HashMap();
        String jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\reportlekarstw.jrxml";
        String jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\reportlekarstw.jasper";
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

    }//GEN-LAST:event_raportlekarstwActionPerformed

    private void RaportWizytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaportWizytActionPerformed

        HashMap mapa = new HashMap();

        String jrxmlFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\reportwizyt.jrxml";
        String jasperFileName = "D:\\STUDIA\\rok 2 semestr 1\\BAZY DANYCH\\Przychodnia\\src\\przychodnia\\reportwizyt.jasper";
        try {
            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
        } catch (JRException ex) {
            Logger.getLogger(OknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }

        Properties myProp = new Properties();
        myProp.put("user", "dbadmin");
        myProp.put("password", "password");
        myProp.put("loginTimeout", "35");
        myProp.put("binaryBatchInsert", "true");

        Connection connn = vertica.run();
   
        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(jasperFileName, mapa, connn);
        } catch (JRException ex) {
            Logger.getLogger(OknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperViewer.viewReport(jp);
    }//GEN-LAST:event_RaportWizytActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed

    }//GEN-LAST:event_infoActionPerformed

    private void menuwyswietlinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuwyswietlinfoActionPerformed
        Info informacja = new Info();
        informacja.run();
    }//GEN-LAST:event_menuwyswietlinfoActionPerformed

    private void buttonusunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonusunActionPerformed

        String SQL = null;
        if (wyboruser != -1 ) {
            switch (combowybrane) {
                // pacjent
                case 0: {
                    SQL = "DELETE FROM pacjenci WHERE nr_ubezpieczenia=" + a;
                    break;
                }
                // lekarz
                case 1: {
                    SQL = "DELETE FROM  lekarze WHERE nr_lekarza=" + a;
                    break;
                }
                // lekarstwa
                case 2: {
                    SQL = "DELETE FROM  lekarstwa WHERE kod_lekarstwa=" + a;
                    break;
                }
                case 3: {
                    SQL = "DELETE FROM leczenie WHERE kod_lekarstwa=" + a + " AND kod_choroby=" + b + ";";
                }
                break;
            }
            metody.WykonanieSQL(SQL);
            ButtonWyszukajActionPerformed(evt);
        } else {
            //błędnie wprowadzone dane- komunikat
            JOptionPane.showMessageDialog(null, "Wybierz kogo chcesz usunąć!", "Błąd", 0);

        }

    }//GEN-LAST:event_buttonusunActionPerformed

    private void wyswietlpodobne(String b) {
        if(wyboruser!=-1)
        {
        DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
        licznikpol=0;
        Connection conn = vertica.run();
        try {
            Statement stmt = conn.createStatement();
            String SQL = ("SELECT lekarstwa.kod_lekarstwa, lekarstwa.nazwa, lekarstwa.sklad, lekarstwa.przeciwwskazania, lekarstwa.skutki_uboczne FROM lekarstwa JOIN interakcje ON lekarstwa.kod_lekarstwa=interakcje.kod_lekarstwa2 OR lekarstwa.kod_lekarstwa=interakcje.kod_lekarstwa1 WHERE interakcje.kod_lekarstwa2=" + b + " OR interakcje.kod_lekarstwa1=" + b + " ;");
            System.out.println(SQL);
            ResultSet rs = stmt.executeQuery(SQL);
            model.setRowCount(0);

            while (rs.next()) {
                String text1 = rs.getString("nazwa");
                String text2 = rs.getString("przeciwwskazania");
                String text3 = rs.getString("skutki_uboczne");
                String text4 = rs.getString("sklad");
                int text5 = rs.getInt("kod_lekarstwa");

                model.addRow(new Object[]{text1, text2, text3, text4, text5});
                licznikpol++;
            }

            // wypełanianie nullami -dla wyglądu
            while (model.getRowCount() < wielkosctable) {
                model.addRow(new Object[]{"", "", "", "", ""});
            }

        } catch (SQLException ex) {
            Logger.getLogger(Przychodnia.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wybierz lekarstwo", "Błąd", 0);
        }
    }
    private void buttonedytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonedytujActionPerformed

        if(wyboruser!=-1)
        {
            DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
            String stra = Integer.toString(a);
            switch (combowybrane) {
                // pacjent

                case 0: {                
                    DElekarzapacjenta edytujpacjenta = new DElekarzapacjenta();
                    edytujpacjenta.run("pacjenci", stra);
                    break;
                }
                // lekarz
                case 1: {
                    DElekarzapacjenta edytujlekarza = new DElekarzapacjenta();
                    edytujlekarza.run("lekarze", stra);

                    break;
                }
                case 2: {                
                    wyswietlpodobne(stra);
                    break;
                }
                case 3: {
                    edycjaleczenia zmienleczenie = new edycjaleczenia();
                    zmienleczenie.run(b, a); //zmien
                    break;
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wybierz rekord!", "Błąd", 0);
        }
    }//GEN-LAST:event_buttonedytujActionPerformed

    private void menudodajlekarstwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudodajlekarstwoActionPerformed
        DLekarstwaChoroby oknolekarstwa = new DLekarstwaChoroby();
        oknolekarstwa.run("lekarstwo");


    }//GEN-LAST:event_menudodajlekarstwoActionPerformed

    private void menudodajleczenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudodajleczenieActionPerformed
        DLeczenie oknoleczenie = new DLeczenie();
        oknoleczenie.run();

    }//GEN-LAST:event_menudodajleczenieActionPerformed

    private void textadresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textadresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textadresActionPerformed

    private void TablewyszukiwanieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablewyszukiwanieMouseClicked

              DefaultTableModel model = (DefaultTableModel) Tablewyszukiwanie.getModel();
              wyboruser = Tablewyszukiwanie.getSelectedRow();
              if (wyboruser<licznikpol)
              {
              switch (combowybrane)
              {
                  case 3:
                  {
                     a = (int) model.getValueAt(wyboruser, 6);
                     b = (int) model.getValueAt(wyboruser, 7);
                     break;
                  }
                  case 4:
                  {
                     a = (int) model.getValueAt(wyboruser, 6);
                     break;
                  }
                  case 5:
                  {
                      a = (int) model.getValueAt(wyboruser, 3);
                      break;
                  }
                  default:
                  {
                      a = (int) model.getValueAt(wyboruser, 4);
                  }
              }
              System.out.println("wybrales: "+a+" drugie: "+b+" ----------------------------------------");
              }
              else
              {
                 JOptionPane.showMessageDialog(null, "Wybierz rekord!", "Błąd", 0); 
              }
    }//GEN-LAST:event_TablewyszukiwanieMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        vertica.zmiana();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void dodawaniechorobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodawaniechorobyActionPerformed
        DLekarstwaChoroby oknochoroby = new DLekarstwaChoroby();
        oknochoroby.run("chorobe");
    }//GEN-LAST:event_dodawaniechorobyActionPerformed

    protected void run() {
        //test();
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
            java.util.logging.Logger.getLogger(OknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()
                -> {
            new OknoGlowne().setVisible(true);
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonWyszukaj;
    private javax.swing.JComboBox<String> Combowybor;
    private javax.swing.JMenuItem RaportWizyt;
    private javax.swing.JTable Tablewyszukiwanie;
    private javax.swing.JButton buttonedytuj;
    private javax.swing.JButton buttonprint;
    private javax.swing.JButton buttonusun;
    private javax.swing.JButton buttonwyjscie;
    private javax.swing.JButton buttonwykonajwizyte;
    private javax.swing.JMenu dodaj;
    private javax.swing.JMenuItem dodawaniechoroby;
    private javax.swing.JMenu info;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeladres;
    private javax.swing.JLabel labelimie;
    private javax.swing.JLabel labelnazwisko;
    private javax.swing.JMenuItem menudodajleczenie;
    private javax.swing.JMenuItem menudodajlekarstwo;
    private javax.swing.JMenuItem menudodajlekarza;
    private javax.swing.JMenuItem menudodajpacjenta;
    private javax.swing.JMenuItem menuwyswietlinfo;
    private javax.swing.JMenuItem raportlekarstw;
    private javax.swing.JTextField textadres;
    private javax.swing.JTextField textimie;
    private javax.swing.JTextField textnazwisko;
    // End of variables declaration//GEN-END:variables

}
