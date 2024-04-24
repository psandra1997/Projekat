
package forma.otpremnica;

import domen.Aparat;
import domen.JedinicaMere;
import domen.Magacin;
import domen.MobilniTelefon;
import domen.Otpremnica;
import domen.Prodavnica;
import domen.Radnik;
import domen.StavkaOtpremnice;
import domen.TipGarancije;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;
import mode.ModeForme;
import modeli.ModelTabeleStavkiOtpremnice;

/**
 * @author Sandra
 */
public class DijalogOtpremnice extends javax.swing.JDialog {
private int mode;
private BigDecimal ukupno=new BigDecimal("0.00");
    /**
     * Creates new form DijalogOtpremnice
     */
    public DijalogOtpremnice(java.awt.Frame parent, boolean modal,int mode) {
        super(parent, modal);
        initComponents();
        this.mode=mode;
        setLocationRelativeTo(null);
        srediFormu();
        popuniPoljaForme();
        srediTabeluStavki();
        
       //  otpremnica ukupna vrednost
        int brRedova = tabelaStavkiOtpremnice.getModel().getRowCount();
        for (int i = 0; i < brRedova; i++) {
            String string = String.valueOf(tabelaStavkiOtpremnice.getModel().getValueAt(i, 5));
            BigDecimal st = BigDecimal.valueOf(Double.valueOf(string));
            ukupno = ukupno.add(st);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBrojOtpremnice = new javax.swing.JLabel();
        lblBrojOtpremniceIzBaze = new javax.swing.JLabel();
        lblIznosStavki = new javax.swing.JLabel();
        lblPDV = new javax.swing.JLabel();
        lblUkupnaVrednost = new javax.swing.JLabel();
        lblRadnik = new javax.swing.JLabel();
        lblMagacin = new javax.swing.JLabel();
        lblProdavnica = new javax.swing.JLabel();
        txtUkupanIznosStavki = new javax.swing.JTextField();
        txtUkupno = new javax.swing.JTextField();
        comboRadnik = new javax.swing.JComboBox();
        comboMagacin = new javax.swing.JComboBox();
        comboProdavnica = new javax.swing.JComboBox();
        btnNazad = new javax.swing.JButton();
        btnOmoguciIzmenu = new javax.swing.JButton();
        btnPromeni = new javax.swing.JButton();
        btnSacuvajOtpremnicu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaStavkiOtpremnice = new javax.swing.JTable();
        txtKolicina = new javax.swing.JTextField();
        comboJM = new javax.swing.JComboBox();
        lblMob = new javax.swing.JLabel();
        lblCena = new javax.swing.JLabel();
        txtUkupnoZaStavku = new javax.swing.JTextField();
        lblDostupnost = new javax.swing.JLabel();
        lblKolicina = new javax.swing.JLabel();
        comboDostupnost = new javax.swing.JComboBox<>();
        comboMobilni = new javax.swing.JComboBox();
        lblUkupnoo = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();
        lblBarcode = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        lblJM = new javax.swing.JLabel();
        btnDodajStavku = new javax.swing.JButton();
        btnObrisiStavku = new javax.swing.JButton();
        rb10 = new javax.swing.JRadioButton();
        rb20 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUnostStavke = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBrojOtpremnice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBrojOtpremnice.setText("Broj otpremnice:");

        lblIznosStavki.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIznosStavki.setText("Ukupan iznos stavki:");

        lblPDV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPDV.setText("PDV:");

        lblUkupnaVrednost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUkupnaVrednost.setText("Ukupna vrednost:");

        lblRadnik.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRadnik.setText("Radnik:");

        lblMagacin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMagacin.setText("Magacin:");

        lblProdavnica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblProdavnica.setText("Prodavnica:");

        txtUkupanIznosStavki.setEditable(false);

        txtUkupno.setEditable(false);

        comboRadnik.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMagacin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboProdavnica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        btnOmoguciIzmenu.setText("Omoguci izmenu");
        btnOmoguciIzmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmoguciIzmenuActionPerformed(evt);
            }
        });

        btnPromeni.setText("Promeni");
        btnPromeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromeniActionPerformed(evt);
            }
        });

        btnSacuvajOtpremnicu.setText("Sacuvaj");
        btnSacuvajOtpremnicu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajOtpremnicuActionPerformed(evt);
            }
        });

        tabelaStavkiOtpremnice.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaStavkiOtpremnice);

        txtKolicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKolicinaActionPerformed(evt);
            }
        });

        lblMob.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMob.setText("Mobilni telefon:");

        lblCena.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCena.setText("Cena:");

        txtUkupnoZaStavku.setEditable(false);

        lblDostupnost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDostupnost.setText("Garancija:");

        lblKolicina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblKolicina.setText("Kolicina:");

        comboMobilni.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMobilniItemStateChanged(evt);
            }
        });

        lblUkupnoo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUkupnoo.setText("Ukupno:");

        txtCena.setEditable(false);

        lblBarcode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBarcode.setText("Barkod:");

        lblJM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblJM.setText("Jedinica mere:");

        btnDodajStavku.setText("Dodaj stavku");
        btnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajStavkuActionPerformed(evt);
            }
        });

        btnObrisiStavku.setText("Obrisi stavku");
        btnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiStavkuActionPerformed(evt);
            }
        });

        rb10.setText("10");
        rb10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb10ItemStateChanged(evt);
            }
        });

        rb20.setText("20");
        rb20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb20ItemStateChanged(evt);
            }
        });

        jLabel1.setText("%");

        jLabel2.setText("%");

        lblUnostStavke.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lblUnostStavke.setText("Unos stavke:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDodajStavku)
                        .addGap(28, 28, 28)
                        .addComponent(btnObrisiStavku))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProdavnica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUkupnaVrednost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIznosStavki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrojOtpremnice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMagacin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUkupanIznosStavki, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboMagacin, 0, 215, Short.MAX_VALUE)
                                .addComponent(comboRadnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboProdavnica, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUkupno, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblBrojOtpremniceIzBaze, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(rb20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblJM)
                                            .addComponent(lblKolicina)
                                            .addComponent(lblCena)
                                            .addComponent(lblUkupnoo)
                                            .addComponent(lblBarcode)
                                            .addComponent(lblDostupnost))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtKolicina)
                                                .addComponent(comboDostupnost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBarcode)
                                                .addComponent(txtUkupnoZaStavku)
                                                .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(comboJM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMob)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboMobilni, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(lblUnostStavke, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNazad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOmoguciIzmenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromeni, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnSacuvajOtpremnicu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBrojOtpremnice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBrojOtpremniceIzBaze, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIznosStavki)
                            .addComponent(txtUkupanIznosStavki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPDV)
                            .addComponent(rb10)
                            .addComponent(rb20)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUkupnaVrednost)
                            .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRadnik)
                            .addComponent(comboRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMagacin)
                            .addComponent(comboMagacin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdavnica)
                            .addComponent(comboProdavnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUnostStavke)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblMob))
                            .addComponent(comboMobilni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJM)
                            .addComponent(comboJM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCena))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKolicina)
                            .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUkupnoZaStavku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUkupnoo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBarcode)
                            .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDostupnost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDostupnost, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajStavku)
                    .addComponent(btnObrisiStavku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOmoguciIzmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromeni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSacuvajOtpremnicu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnNazadActionPerformed

    private void btnOmoguciIzmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmoguciIzmenuActionPerformed
        this.mode = ModeForme.FORM_EDIT_MODE;
        srediFormu();
        popuniPoljaForme();
    }//GEN-LAST:event_btnOmoguciIzmenuActionPerformed

    private void btnPromeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromeniActionPerformed
        Otpremnica otpremnica = vratiOtpremnicu();
        try {
            ModelTabeleStavkiOtpremnice mtso=(ModelTabeleStavkiOtpremnice) tabelaStavkiOtpremnice.getModel();
            if(mtso.getLista().isEmpty()){
                 JOptionPane.showMessageDialog(this, "Otpremnica mora da ima bar jednu stavku.","Greska.",JOptionPane.ERROR);
                 return;
            }
            otpremnica.setListaStavki(mtso.getLista());
            otpremnica.setUkupanIznosStavki(new BigDecimal(txtUkupanIznosStavki.getText()));
            otpremnica.setUkupnaVrednost(new BigDecimal(txtUkupno.getText()));
            ControllerKlijent.getInstanca().updateOtpremnica(otpremnica);
            JOptionPane.showMessageDialog(this, "Podaci o otpremnici su azurirani!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Podaci o otpremnici nisu azurirani!");
            Logger.getLogger(DijalogOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPromeniActionPerformed

    private void btnSacuvajOtpremnicuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajOtpremnicuActionPerformed
        try {
            Otpremnica otpremnica = vratiOtpremnicu();
            int maks = ControllerKlijent.getInstanca().vratiMaxBrojOtpremnice();
            otpremnica.setBrojOtpremnice(maks);
            ModelTabeleStavkiOtpremnice mtso=(ModelTabeleStavkiOtpremnice) tabelaStavkiOtpremnice.getModel();
            if(mtso.getLista().isEmpty()){
                 JOptionPane.showMessageDialog(this, "Otpremnica mora da ima bar jednu stavku.","Greska.",JOptionPane.ERROR_MESSAGE);
                 return;
            }
            otpremnica.setListaStavki(mtso.getLista());
            otpremnica.setUkupanIznosStavki(new BigDecimal(txtUkupanIznosStavki.getText()));
            otpremnica.setUkupnaVrednost(new BigDecimal(txtUkupno.getText()));
            
            ControllerKlijent.getInstanca().sacuvajOtpremnicu(otpremnica);
            JOptionPane.showMessageDialog(this, "Sistem je kreirao otpremnicu.","Informacije",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da kreira otpremnicu.","Greska",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DijalogOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSacuvajOtpremnicuActionPerformed

    private void btnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajStavkuActionPerformed
        
        StavkaOtpremnice stavka = new StavkaOtpremnice();
        MobilniTelefon mt = (MobilniTelefon) comboMobilni.getSelectedItem();
        ModelTabeleStavkiOtpremnice mts = (ModelTabeleStavkiOtpremnice) tabelaStavkiOtpremnice.getModel();
        stavka.setMobilniTelefon(mt);
        stavka.setJedinicaMere((JedinicaMere) comboJM.getSelectedItem());
        stavka.setKolicina(Integer.parseInt(txtKolicina.getText().trim()));
        stavka.setCena(BigDecimal.valueOf(Double.valueOf(txtCena.getText())));
        stavka.setUkupanIznos(BigDecimal.valueOf(Double.valueOf(txtUkupnoZaStavku.getText())));
        if (mts.postojiMobilni(mt)) {
            JOptionPane.showMessageDialog(this, "Stavka vec ima mobilni telefon koji ste izabrali.", "Greska.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        mts.dodajStavku(stavka);
        ukupno = ukupnoSveStavke();
        txtUkupanIznosStavki.setText(String.valueOf(ukupno));
        try {

            TipGarancije tip = (TipGarancije) comboDostupnost.getModel().getSelectedItem();
            Prodavnica p = (Prodavnica) comboProdavnica.getSelectedItem();
            Aparat aparat = new Aparat();
            aparat.setStavka(stavka.getRB());
            aparat.setTelefon(stavka.getMobilniTelefon().getSifraMT());
            aparat.setProdavnica(p.getMaticniBroj());
            aparat.setBarKod(txtBarcode.getText());
            aparat.setGarancija(tip);
            aparat.setOtpremnica(Integer.parseInt(lblBrojOtpremniceIzBaze.getText()));
            ControllerKlijent.getInstanca().saveAparat(aparat);
        } catch (Exception ex) {
            Logger.getLogger(DijalogOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDodajStavkuActionPerformed

    private void btnObrisiStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiStavkuActionPerformed
        int red = tabelaStavkiOtpremnice.getSelectedRow();
        if (red != -1) {
            ModelTabeleStavkiOtpremnice mtso = (ModelTabeleStavkiOtpremnice) tabelaStavkiOtpremnice.getModel();
            StavkaOtpremnice st = mtso.getStavka(red);
            mtso.obrisiStavku(red);
            ukupno = ukupno.subtract(st.getUkupanIznos());
            txtUkupanIznosStavki.setText(String.valueOf(ukupno));
            try {
                Aparat aparat = new Aparat();
                aparat.setOtpremnica(Integer.parseInt(lblBrojOtpremniceIzBaze.getText()));
                aparat.setStavka(st.getRB());
                aparat.setTelefon(st.getMobilniTelefon().getSifraMT());
                Prodavnica p = (Prodavnica) comboProdavnica.getSelectedItem();
                aparat.setProdavnica(p.getMaticniBroj());
                ControllerKlijent.getInstanca().deleteAparat(aparat);
            } catch (Exception ex) {
                Logger.getLogger(DijalogOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnObrisiStavkuActionPerformed

    private void rb10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb10ItemStateChanged
        if (!txtUkupanIznosStavki.getText().isEmpty()) {
            if (rb10.isSelected()) {
                double ukupnoStavke = Double.valueOf(txtUkupanIznosStavki.getText());
                ukupnoStavke += ukupnoStavke * 0.1;
                txtUkupno.setText(String.valueOf(ukupnoStavke));
            }
        }
    }//GEN-LAST:event_rb10ItemStateChanged

    private void txtKolicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKolicinaActionPerformed
       if (!txtKolicina.getText().isEmpty() && !txtCena.getText().isEmpty()) {
                 int kol = Integer.parseInt(txtKolicina.getText().trim());
                 double cena = Double.valueOf(txtCena.getText().trim());
                 double novaCena = cena * kol;
                 txtUkupnoZaStavku.setText(String.valueOf(novaCena));
             }
    }//GEN-LAST:event_txtKolicinaActionPerformed

    private void comboMobilniItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMobilniItemStateChanged
        if (comboMobilni.getSelectedItem() != null) {
            MobilniTelefon mt = (MobilniTelefon) comboMobilni.getSelectedItem();
            txtCena.setText(mt.getCenaTelefona().toString());
        }
    }//GEN-LAST:event_comboMobilniItemStateChanged

    private void rb20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb20ItemStateChanged
        if(!txtUkupanIznosStavki.getText().isEmpty()){
            if(rb20.isSelected()){
                double ukupnoStavke=Double.valueOf(txtUkupanIznosStavki.getText());
                ukupnoStavke+=ukupnoStavke*0.2;
                txtUkupno.setText(String.valueOf(ukupnoStavke));
            }
        }
    }//GEN-LAST:event_rb20ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajStavku;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnObrisiStavku;
    private javax.swing.JButton btnOmoguciIzmenu;
    private javax.swing.JButton btnPromeni;
    private javax.swing.JButton btnSacuvajOtpremnicu;
    private javax.swing.JComboBox<TipGarancije> comboDostupnost;
    private javax.swing.JComboBox comboJM;
    private javax.swing.JComboBox comboMagacin;
    private javax.swing.JComboBox comboMobilni;
    private javax.swing.JComboBox comboProdavnica;
    private javax.swing.JComboBox comboRadnik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblBrojOtpremnice;
    private javax.swing.JLabel lblBrojOtpremniceIzBaze;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblDostupnost;
    private javax.swing.JLabel lblIznosStavki;
    private javax.swing.JLabel lblJM;
    private javax.swing.JLabel lblKolicina;
    private javax.swing.JLabel lblMagacin;
    private javax.swing.JLabel lblMob;
    private javax.swing.JLabel lblPDV;
    private javax.swing.JLabel lblProdavnica;
    private javax.swing.JLabel lblRadnik;
    private javax.swing.JLabel lblUkupnaVrednost;
    private javax.swing.JLabel lblUkupnoo;
    private javax.swing.JLabel lblUnostStavke;
    private javax.swing.JRadioButton rb10;
    private javax.swing.JRadioButton rb20;
    private javax.swing.JTable tabelaStavkiOtpremnice;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtUkupanIznosStavki;
    private javax.swing.JTextField txtUkupno;
    private javax.swing.JTextField txtUkupnoZaStavku;
    // End of variables declaration//GEN-END:variables
private void srediFormu() {

        btnPromeni.setEnabled(true);
        comboJM.setEditable(true);
        comboMobilni.setEditable(true);
        //stavka
        lblBarcode.setEnabled(true);
        lblUnostStavke.setEnabled(true);
        lblKolicina.setEnabled(true);
        lblCena.setEnabled(true);
        lblUkupnoo.setEnabled(true);
        lblDostupnost.setEnabled(true);
        lblMob.setEnabled(true);
        lblJM.setEnabled(true);
        txtKolicina.setEnabled(true);
        txtCena.setEnabled(true);
        txtBarcode.setEnabled(true);
        txtUkupnoZaStavku.setEnabled(true);
        comboDostupnost.setEnabled(true);
        comboMobilni.setEnabled(true);
        comboJM.setEnabled(true);
        comboJM.setEditable(true);
        comboMobilni.setEditable(true);
        if (mode == ModeForme.FORM_EDIT_MODE) {
            this.setTitle("Izmena otpremnice...");
            lblBrojOtpremniceIzBaze.setVisible(true);
            btnSacuvajOtpremnicu.setEnabled(false);
            btnOmoguciIzmenu.setEnabled(false);
            btnDodajStavku.setEnabled(true);
            btnObrisiStavku.setEnabled(true);
            comboMagacin.setEditable(true);
            comboProdavnica.setEditable(true);
            comboRadnik.setEditable(true);
            comboJM.setEditable(true);
            comboMobilni.setEditable(true);
            comboDostupnost.setEditable(true);

            //stavka
            lblBarcode.setVisible(true);
            lblKolicina.setVisible(true);
            lblCena.setVisible(true);
            lblUkupnoo.setVisible(true);
            lblDostupnost.setVisible(true);
            lblMob.setVisible(true);
            lblJM.setVisible(true);
            lblUnostStavke.setVisible(true);

            txtKolicina.setEditable(true);
            txtCena.setVisible(true);
            txtBarcode.setEditable(true);
            txtUkupnoZaStavku.setVisible(true);
            comboDostupnost.setEditable(true);
            comboMobilni.setEditable(true);
            comboJM.setEditable(true);
            rb10.setEnabled(true);
            rb20.setEnabled(true);
        }
        if (mode == ModeForme.FORM_ADD_MODE) {
            this.setTitle("Dodaj novu otpremnicu...");
            btnOmoguciIzmenu.setEnabled(false);
            btnPromeni.setEnabled(false);
            btnDodajStavku.setEnabled(true);
            btnObrisiStavku.setEnabled(true);

            comboMagacin.setEditable(true);
            comboProdavnica.setEditable(true);
            comboRadnik.setEditable(true);
            lblBrojOtpremniceIzBaze.setVisible(true);
            comboJM.setEditable(true);
            comboMobilni.setEditable(true);
            //stavka
            lblBarcode.setVisible(true);
            lblUnostStavke.setVisible(true);
            lblKolicina.setVisible(true);
            lblCena.setVisible(true);
            lblUkupnoo.setVisible(true);
            lblDostupnost.setVisible(true);
            lblMob.setVisible(true);
            lblJM.setVisible(true);
            txtKolicina.setEnabled(true);
            txtCena.setEnabled(true);
            txtBarcode.setEnabled(true);
            txtUkupnoZaStavku.setEnabled(true);
            comboDostupnost.setEnabled(true);
            comboMobilni.setEnabled(true);
            comboJM.setEnabled(true);
        }
        if (mode == ModeForme.FORM_VIEW_MODE) {
            this.setTitle("Pregled otpremnice...");
            lblBrojOtpremniceIzBaze.setVisible(true);
            btnSacuvajOtpremnicu.setEnabled(false);
            btnPromeni.setEnabled(false);
            btnDodajStavku.setEnabled(false);
            btnObrisiStavku.setEnabled(false);

            rb10.setEnabled(false);
            rb20.setEnabled(false);
            comboMagacin.setEditable(false);
            comboProdavnica.setEditable(false);
            comboRadnik.setEditable(false);

            //stavka
            lblBarcode.setEnabled(false);
            lblKolicina.setEnabled(false);
            lblCena.setEnabled(false);
            lblUkupnoo.setEnabled(false);
            lblDostupnost.setEnabled(false);
            lblMob.setEnabled(false);
            lblJM.setEnabled(false);
            lblUnostStavke.setEnabled(false);
            txtKolicina.setEnabled(false);
            txtCena.setEnabled(false);
            txtBarcode.setEnabled(false);
            txtUkupnoZaStavku.setEnabled(false);
            comboDostupnost.setEnabled(false);
            comboMobilni.setEnabled(false);
            comboJM.setEnabled(false);
        }
    }

    private void popuniPoljaForme() {
     try {
         Otpremnica otpremnica=(Otpremnica) ControllerKlijent.getInstanca().getValue("selektovanaOtpremnica");
 
         ArrayList<JedinicaMere> listaJM=ControllerKlijent.getInstanca().getJedinicaMere();
         for (JedinicaMere jM : listaJM) {
             comboJM.addItem(jM);
         }
         ArrayList<MobilniTelefon> listaMT=ControllerKlijent.getInstanca().getMobilniTelefoni();
         for (MobilniTelefon mobilniTelefon : listaMT) {
             comboMobilni.addItem(mobilniTelefon);
         }
      
         comboDostupnost.setModel(new DefaultComboBoxModel<>(TipGarancije.values()));
         
         if(mode== ModeForme.FORM_VIEW_MODE ){          
             lblBrojOtpremniceIzBaze.setText(otpremnica.getBrojOtpremnice()+"");
             txtUkupanIznosStavki.setText(String.valueOf(otpremnica.getUkupanIznosStavki()));
             String pdv=String.valueOf(otpremnica.getPDV());
             if(pdv.equals("10")){
                 rb10.setSelected(true);
                 rb20.setSelected(false);
             }
             if(pdv.equals("20")){
                 rb10.setSelected(false);
                 rb20.setSelected(true);
             }
            txtUkupno.setText(String.valueOf(otpremnica.getUkupnaVrednost()));

             comboRadnik.removeAllItems();
             comboMagacin.removeAllItems();
             comboProdavnica.removeAllItems();
             comboRadnik.addItem(otpremnica.getRadnik());
             comboMagacin.addItem(otpremnica.getMagacin());
             comboProdavnica.addItem(otpremnica.getProdavnica());

         }else if(mode== ModeForme.FORM_EDIT_MODE ){
             String pdv=String.valueOf(otpremnica.getPDV());
             if(pdv.equals("10")){
                 rb10.setSelected(true);
                 rb20.setSelected(false);
             }
           txtUkupno.setText(otpremnica.getUkupnaVrednost()+"");
           
             ArrayList<Radnik> listaRadnika = ControllerKlijent.getInstanca().getRadnici();
             comboRadnik.removeAllItems();
             comboRadnik.addItem(otpremnica.getRadnik());
             for (Radnik radnik : listaRadnika) {
                 if (radnik.getSifraRadnika() != (otpremnica.getRadnik().getSifraRadnika())) {
                     comboRadnik.addItem(radnik);
                 }
             }
             ArrayList<Magacin> listaMagacina = ControllerKlijent.getInstanca().getMagacin();
             comboMagacin.removeAllItems();
             comboMagacin.addItem(otpremnica.getMagacin());
             for (Magacin mg : listaMagacina) {
                 if (mg.getSifraMagacina() != otpremnica.getMagacin().getSifraMagacina()) {
                     comboMagacin.addItem(mg);
                 }
             }
             ArrayList<Prodavnica> listaProdavnica = ControllerKlijent.getInstanca().getProdavnica();
             comboProdavnica.removeAllItems();
             comboProdavnica.addItem(otpremnica.getProdavnica());
             for (Prodavnica pr : listaProdavnica) {
                 if (!pr.getMaticniBroj().equals(otpremnica.getProdavnica().getMaticniBroj())) {
                     comboProdavnica.addItem(pr);
                 }
             }

         }else{
                //mode==ModeForme.FORM_ADD_MODE

                ArrayList<Radnik> listaRadnika = ControllerKlijent.getInstanca().getRadnici();
                comboRadnik.removeAllItems();
                for (Radnik radnik : listaRadnika) {
                    comboRadnik.addItem(radnik);
                }
                ArrayList<Magacin> listaMagacina = ControllerKlijent.getInstanca().getMagacin();
                comboMagacin.removeAllItems();
                for (Magacin mg : listaMagacina) {
                    comboMagacin.addItem(mg);
                }
                ArrayList<Prodavnica> listaProdavnica = ControllerKlijent.getInstanca().getProdavnica();
                comboProdavnica.removeAllItems();
                for (Prodavnica pr : listaProdavnica) {
                    comboProdavnica.addItem(pr);
                }
                comboMobilni.removeAllItems();
                for (MobilniTelefon mobilniTelefon : listaMT) {
                    comboMobilni.addItem(mobilniTelefon);
                }
                comboJM.removeAllItems();
                for (JedinicaMere jm : listaJM) {
                    comboJM.addItem(jm);
                }
                int brOtpremnice = ControllerKlijent.getInstanca().vratiMaxBrojOtpremnice();
                lblBrojOtpremniceIzBaze.setText(String.valueOf(brOtpremnice));

                if (!txtKolicina.getText().isEmpty()) {
                    int kolicina = Integer.parseInt(txtKolicina.getText().trim());
                    double cenaJednogMobilnog = Double.valueOf(txtCena.getText());
                    double ukupnoMobilni = kolicina * cenaJednogMobilnog;
                    txtUkupnoZaStavku.setText(String.valueOf(ukupnoMobilni));
                } else {
                    txtUkupnoZaStavku.setText(String.valueOf("0.00"));
                }

                if (txtUkupanIznosStavki.getText().isEmpty()) {
                    txtUkupanIznosStavki.setText(String.valueOf("0.00"));
                    txtUkupno.setText(String.valueOf("0.00"));
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DijalogOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Otpremnica vratiOtpremnicu() {
        Otpremnica otpremnica = new Otpremnica();
        if (!lblBrojOtpremniceIzBaze.getText().isEmpty()) {
            otpremnica.setBrojOtpremnice(Integer.parseInt(lblBrojOtpremniceIzBaze.getText()));
        }
        if (!txtUkupanIznosStavki.getText().isEmpty() || !rb10.getText().isEmpty() || !rb20.getText().isEmpty() || !txtUkupno.getText().isEmpty()) {
            otpremnica.setUkupanIznosStavki(BigDecimal.valueOf(Double.valueOf("0.00")));
            otpremnica.setUkupnaVrednost(BigDecimal.valueOf(Double.valueOf("0.00")));
        }
        if (rb10.isSelected()) {
            otpremnica.setPDV(10);
        } else {
            otpremnica.setPDV(20);
        }

        Radnik radnik = (Radnik) comboRadnik.getSelectedItem();
        Magacin magacin = (Magacin) comboMagacin.getSelectedItem();
        Prodavnica prodavnica = (Prodavnica) comboProdavnica.getSelectedItem();
        otpremnica.setRadnik(radnik);
        otpremnica.setMagacin(magacin);
        otpremnica.setProdavnica(prodavnica);
        try {
            ArrayList<StavkaOtpremnice> listaStavki = ControllerKlijent.getInstanca().vratiStavkeZaOtpremnicu(otpremnica);
            otpremnica.setListaStavki(listaStavki);
        } catch (Exception ex) {
            Logger.getLogger(DijalogOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return otpremnica;
    }

    private void srediTabeluStavki() {
        Otpremnica o = vratiOtpremnicu();
        tabelaStavkiOtpremnice.setModel(new ModelTabeleStavkiOtpremnice(o));
    }

    private BigDecimal ukupnoSveStavke() {
        BigDecimal u = new BigDecimal("0.00");
        int brRedova = tabelaStavkiOtpremnice.getModel().getRowCount();
        for (int i = 0; i < brRedova; i++) {
            String string = String.valueOf(tabelaStavkiOtpremnice.getModel().getValueAt(i, 5));
            BigDecimal st = BigDecimal.valueOf(Double.valueOf(string));
            u = ukupno.add(st);
        }
        return u;
    }
}
