/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.mobilniTelefon;

import domen.Marka;
import domen.MobilniTelefon;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;
import mode.ModeForme;

/**
 *
 * @author Sandra
 */
public class DijalogMobilniDetalji extends javax.swing.JDialog {
private int mode;
    /**
     * Creates new form DijalogMobilniDetalji
     */
    public DijalogMobilniDetalji(java.awt.Frame parent, boolean modal,int mode) {
        super(parent, modal);
        initComponents();
        this.mode=mode;
        setLocationRelativeTo(null);
        srediFormu();
        popuniFormu();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblSifra = new javax.swing.JLabel();
        txtSifra = new javax.swing.JTextField();
        lblNazivMT = new javax.swing.JLabel();
        txtNazivMT = new javax.swing.JTextField();
        lblDimenzija = new javax.swing.JLabel();
        txtDimenzija = new javax.swing.JTextField();
        lblProcesor = new javax.swing.JLabel();
        lblBaterija = new javax.swing.JLabel();
        lblBrojKamera = new javax.swing.JLabel();
        lblMemorija = new javax.swing.JLabel();
        lblBoja = new javax.swing.JLabel();
        lblMarka = new javax.swing.JLabel();
        txtProcesor = new javax.swing.JTextField();
        txtBaterija = new javax.swing.JTextField();
        txtBoja = new javax.swing.JTextField();
        comboMarka = new javax.swing.JComboBox();
        rbCetiri = new javax.swing.JRadioButton();
        rbTri = new javax.swing.JRadioButton();
        rb16GB = new javax.swing.JRadioButton();
        rb32GB = new javax.swing.JRadioButton();
        rb64GB = new javax.swing.JRadioButton();
        rb128GB = new javax.swing.JRadioButton();
        rbPet = new javax.swing.JRadioButton();
        lblCenaTelefona = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mobilni telefon"));

        btnUpdate.setText("Azuriraj");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnEdit.setText("Omoguci izmenu");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Obrisi");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Sacuvaj");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblSifra.setText("Sifra:");

        lblNazivMT.setText("Naziv:");

        lblDimenzija.setText("Dimenzija: ");

        lblProcesor.setText("Procesor: ");

        lblBaterija.setText("Baterija: ");

        lblBrojKamera.setText("Broj kamera: ");

        lblMemorija.setText("Memorija: ");

        lblBoja.setText("Boja: ");

        lblMarka.setText("Marka:");

        rbCetiri.setText("4 kamere");

        rbTri.setText("3 kamere");

        rb16GB.setText("16 GB");

        rb32GB.setText("32 GB");

        rb64GB.setText("64 GB");

        rb128GB.setText("128 GB");

        rbPet.setText("5 kamera");

        lblCenaTelefona.setText("Cena:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMemorija)
                        .addGap(18, 18, 18)
                        .addComponent(rb16GB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb32GB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb64GB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb128GB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarka)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBoja)
                                    .addComponent(lblCenaTelefona))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCena, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(txtBoja)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblNazivMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSifra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblDimenzija))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDimenzija, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNazivMT, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboMarka, 0, 234, Short.MAX_VALUE)
                                        .addComponent(txtSifra))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProcesor)
                                    .addComponent(lblBaterija)
                                    .addComponent(lblBrojKamera))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbTri)
                                        .addGap(12, 12, 12)
                                        .addComponent(rbCetiri)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPet))
                                    .addComponent(txtBaterija, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProcesor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSifra)
                            .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNazivMT)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNazivMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarka)
                    .addComponent(comboMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDimenzija)
                    .addComponent(txtDimenzija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProcesor)
                    .addComponent(txtProcesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBaterija)
                            .addComponent(txtBaterija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrojKamera)
                            .addComponent(rbCetiri)
                            .addComponent(rbTri)
                            .addComponent(rbPet)))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMemorija)
                            .addComponent(rb16GB)
                            .addComponent(rb32GB)
                            .addComponent(rb64GB)
                            .addComponent(rb128GB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBoja)
                            .addComponent(txtBoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCenaTelefona)
                            .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try {
             MobilniTelefon telefon = getTelefon();
             ControllerKlijent.getInstanca().updateMobilniTelefon(telefon);
             JOptionPane.showMessageDialog(this, "Sistem je izmenio mobilni telefon! ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne može da izmeni mobilni telefon!");
            Logger.getLogger(DijalogMobilniDetalji.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.mode = ModeForme.FORM_EDIT_MODE;
         JOptionPane.showMessageDialog(this, "Sistem je učitao mobilni telefon.", "Informacije", JOptionPane.INFORMATION_MESSAGE);
      srediFormu();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            MobilniTelefon telefon = getTelefon();
            int response = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da obrisete telefon?", "Brisanje", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                ControllerKlijent.getInstanca().deleteMobilniTelefon(telefon);
                JOptionPane.showMessageDialog(this, "Sistem je obrisao mobilni telefon.", "Informacije", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da obrise mobilni telefon.", "Greska.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        MobilniTelefon telefon = getTelefon();
        System.out.println(telefon);
        try {
            String regex = "[0-9]+";
            String sifra=txtSifra.getText().trim();
            ArrayList<MobilniTelefon> lista = ControllerKlijent.getInstanca().getMobilniTelefoni();
            for (MobilniTelefon mobilniTelefon : lista) {
                if (mobilniTelefon.getSifraMT().equals(telefon.getSifraMT())) {
                    JOptionPane.showMessageDialog(this, "Sistem ne moze kreira mobilni telefon.\nSifra postoji.", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!sifra.matches(regex)) {
                    JOptionPane.showMessageDialog(this, "Sifra mora biti broj!", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (txtBaterija.getText().isEmpty() || txtBoja.getText().isEmpty() || txtDimenzija.getText().isEmpty() || txtNazivMT.getText().isEmpty()
                    || txtProcesor.getText().isEmpty() || txtSifra.getText().isEmpty()|| txtCena.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Popunite sva polja.", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ControllerKlijent.getInstanca().saveMobilniTelefon(telefon);
        } catch (Exception ex) {
            Logger.getLogger(DijalogMobilniDetalji.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Sistem ne moze kreira mobilni telefon.");
            return;
        }
        JOptionPane.showMessageDialog(this, "Sistem je kreirao mobilni telefon.");

    }//GEN-LAST:event_btnSaveActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comboMarka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBaterija;
    private javax.swing.JLabel lblBoja;
    private javax.swing.JLabel lblBrojKamera;
    private javax.swing.JLabel lblCenaTelefona;
    private javax.swing.JLabel lblDimenzija;
    private javax.swing.JLabel lblMarka;
    private javax.swing.JLabel lblMemorija;
    private javax.swing.JLabel lblNazivMT;
    private javax.swing.JLabel lblProcesor;
    private javax.swing.JLabel lblSifra;
    private javax.swing.JRadioButton rb128GB;
    private javax.swing.JRadioButton rb16GB;
    private javax.swing.JRadioButton rb32GB;
    private javax.swing.JRadioButton rb64GB;
    private javax.swing.JRadioButton rbCetiri;
    private javax.swing.JRadioButton rbPet;
    private javax.swing.JRadioButton rbTri;
    private javax.swing.JTextField txtBaterija;
    private javax.swing.JTextField txtBoja;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtDimenzija;
    private javax.swing.JTextField txtNazivMT;
    private javax.swing.JTextField txtProcesor;
    private javax.swing.JTextField txtSifra;
    // End of variables declaration//GEN-END:variables

     private void popuniFormu() {
         try {
       
         if (mode == ModeForme.FORM_VIEW_MODE || mode == ModeForme.FORM_EDIT_MODE) {
             MobilniTelefon telefon = (MobilniTelefon) ControllerKlijent.getInstanca().getValue("telefon");
             
            txtSifra.setText(telefon.getSifraMT());
            txtNazivMT.setText(telefon.getNazivMT());
            txtDimenzija.setText(telefon.getDimenzija());
            txtProcesor.setText(telefon.getProcesor());
            txtBaterija.setText(telefon.getBaterija());
            txtBoja.setText(telefon.getBoja());
            txtCena.setText(telefon.getCenaTelefona().toString());

             comboMarka.removeAllItems();
             comboMarka.addItem(telefon.getMarka());
             
             if (telefon.getKamera().equals(rbCetiri.getText())) {
                 rbCetiri.setSelected(true);
             } else if (telefon.getKamera().equals(rbPet.getText())) {
                 rbPet.setSelected(true);
             }else  {
                 rbTri.setSelected(true);
             }
             
             if (telefon.getMemorija().equals(rb32GB.getText())) {
                 rb32GB.setSelected(true);
             } else if (telefon.getMemorija().equals(rb64GB.getText())) {
                 rb64GB.setSelected(true);
             } else if (telefon.getMemorija().equals(rb16GB.getText())) {
                 rb16GB.setSelected(true);
             } else {
                 rb128GB.setSelected(true);
             }

             } else {
              ArrayList<Marka> listaMarki = ControllerKlijent.getInstanca().getListaMarki();
                 if (mode == ModeForme.FORM_ADD_MODE) {
                      comboMarka.removeAllItems();
                     for (Marka marka : listaMarki) {
                         comboMarka.addItem(marka);
                     }
                 }
             }

    } catch (Exception ex) {
        Logger.getLogger(DijalogMobilniDetalji.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private MobilniTelefon getTelefon() {
        MobilniTelefon telefon = new MobilniTelefon();
        if (!txtSifra.getText().isEmpty()) {
            telefon.setSifraMT(txtSifra.getText());
        }
        telefon.setBoja(txtBoja.getText().trim());
        telefon.setDimenzija(txtDimenzija.getText().trim());
        telefon.setProcesor(txtProcesor.getText().trim());
        telefon.setNazivMT(txtNazivMT.getText().trim());
        telefon.setBaterija(txtBaterija.getText().trim());
        if(!txtCena.getText().isEmpty()){
            telefon.setCenaTelefona(new BigDecimal(txtCena.getText()));
        }else{
            telefon.setCenaTelefona(new BigDecimal("0.00"));
        }
              
        Marka marka = (Marka) comboMarka.getSelectedItem();
        telefon.setMarka(marka);

        if (rbTri.isSelected()) {
            telefon.setKamera(rbTri.getText());
        } else if (rbCetiri.isSelected()) {
            telefon.setKamera(rbCetiri.getText());
        } else {
            telefon.setKamera(rbPet.getText());
        }

        if (rb16GB.isSelected()) {
            telefon.setMemorija(rb16GB.getText());
        } else if (rb32GB.isSelected()) {
            telefon.setMemorija(rb32GB.getText());
        } else if (rb64GB.isSelected()) {
            telefon.setMemorija(rb64GB.getText());
        } else {
            telefon.setMemorija(rb128GB.getText());
        }
        
        return telefon;
    }

    private void srediFormu() {
        lblSifra.setVisible(true);
        txtSifra.setVisible(true);

        txtNazivMT.setEditable(true);
        txtProcesor.setEditable(true);
        txtBaterija.setEditable(true);
        txtBoja.setEditable(true);
        txtCena.setEditable(true);
        txtDimenzija.setEditable(true);
        rb128GB.setEnabled(true);
        rb32GB.setEnabled(true);
        rb16GB.setEnabled(true);
        rb64GB.setEnabled(true);
        rbTri.setEnabled(true);
        rbCetiri.setEnabled(true);
        rbPet.setEnabled(true);
        comboMarka.setEnabled(true);

        btnSave.setEnabled(true);

        btnUpdate.setEnabled(true);
        btnEdit.setEnabled(true);

        btnDelete.setEnabled(true);

        if (mode == ModeForme.FORM_ADD_MODE) {
            this.setTitle("Dodaj novi mobilni telefon...");
            btnUpdate.setEnabled(false);
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
        } else if (mode == ModeForme.FORM_VIEW_MODE) {
            this.setTitle("Pregled mobilnog telefona...");
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(false);

            txtNazivMT.setEditable(false);
            txtProcesor.setEditable(false);
            txtBaterija.setEditable(false);
            txtBoja.setEditable(false);
            txtCena.setEditable(false);
            txtDimenzija.setEditable(false);
            txtSifra.setEditable(false);
            rb128GB.setEnabled(false);
            rb32GB.setEnabled(false);
            rb16GB.setEnabled(false);
            rb64GB.setEnabled(false);
            rbTri.setEnabled(false);
            rbCetiri.setEnabled(false);
            rbPet.setEnabled(false);
            comboMarka.setEnabled(false);

        } else {
            //izmena
            this.setTitle("Izmena mobilnog telefona...");
            comboMarka.setEnabled(false);
            btnSave.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
        }
    }

}
