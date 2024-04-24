/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.prodavnica;

import domen.Mesto;
import domen.Prodavnica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;
import mode.ModeForme;

/**
 * @author Sandra
 */
public class DijalogProdavniceDetalji extends javax.swing.JDialog {
private int mode;
    /**
     * Creates new form DijalogProdavniceDetalji
     */
    public DijalogProdavniceDetalji(java.awt.Frame parent, boolean modal,int mode) {
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
        lblMaticniBroj = new javax.swing.JLabel();
        txtMaticniBroj = new javax.swing.JTextField();
        lblPIB = new javax.swing.JLabel();
        txtPIB = new javax.swing.JTextField();
        lblNazivProdavnice = new javax.swing.JLabel();
        txtNazivProdavnice = new javax.swing.JTextField();
        lblAdresa = new javax.swing.JLabel();
        txtAdresa = new javax.swing.JTextField();
        lblTekuciRacun = new javax.swing.JLabel();
        txtTekuciRacun = new javax.swing.JTextField();
        lblBrojTelefona = new javax.swing.JLabel();
        txtBrojTelefona = new javax.swing.JTextField();
        lblDelatnost = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        txtDatumOsnivanja = new javax.swing.JTextField();
        lblMesto = new javax.swing.JLabel();
        comboMesto = new javax.swing.JComboBox();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        rb52450 = new javax.swing.JRadioButton();
        rb52480 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Prodavnica"));

        lblMaticniBroj.setText("Maticni broj:");

        lblPIB.setText("PIB:");

        lblNazivProdavnice.setText("Naziv:");

        lblAdresa.setText("Adresa:");

        lblTekuciRacun.setText("Tekuci racun:");

        lblBrojTelefona.setText("Broj telefona:");

        lblDelatnost.setText("Sifra delatnosti:");

        lblDatum.setText("Datum osnivanja (yyyy-MM-dd):");

        lblMesto.setText("Mesto:");

        btnEdit.setText("Omoguci izmenu");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setText("Azuriraj");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Sacuvaj");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        rb52450.setText("52450");

        rb52480.setText("52480");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaticniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPIB)
                    .addComponent(lblNazivProdavnice)
                    .addComponent(lblAdresa)
                    .addComponent(lblTekuciRacun)
                    .addComponent(lblBrojTelefona)
                    .addComponent(lblDelatnost)
                    .addComponent(lblDatum)
                    .addComponent(lblMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaticniBroj)
                            .addComponent(txtPIB)
                            .addComponent(txtNazivProdavnice)
                            .addComponent(txtAdresa)
                            .addComponent(txtTekuciRacun)
                            .addComponent(txtBrojTelefona)
                            .addComponent(txtDatumOsnivanja)
                            .addComponent(comboMesto, 0, 254, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb52450)
                        .addGap(32, 32, 32)
                        .addComponent(rb52480)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaticniBroj)
                            .addComponent(txtMaticniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPIB)
                            .addComponent(txtPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNazivProdavnice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNazivProdavnice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdresa)
                            .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTekuciRacun)
                            .addComponent(txtTekuciRacun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrojTelefona)
                            .addComponent(txtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDelatnost)
                            .addComponent(rb52450)
                            .addComponent(rb52480))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDatum)
                            .addComponent(txtDatumOsnivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesto)
                            .addComponent(comboMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.mode = ModeForme.FORM_EDIT_MODE;
        srediFormu();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        try {
            Prodavnica prodavnica = getProdavnica();
            ControllerKlijent.getInstanca().updateProdavnica(prodavnica);
            JOptionPane.showMessageDialog(this, "Sistem je zapamtio prodavnicu!", "Informacije", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti prodavnicu!", "Greska", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DijalogProdavniceDetalji.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Prodavnica prodavnica = getProdavnica();
        try {
             String regex = "[0-9]+";
             String sifra=txtMaticniBroj.getText().trim();
            ArrayList<Prodavnica> lista = ControllerKlijent.getInstanca().getProdavnica();
            for (Prodavnica p : lista) {
                if (prodavnica.getMaticniBroj().equals(p.getMaticniBroj())) {
                    JOptionPane.showMessageDialog(this, "Prodavnica sa maticnim brojem " + prodavnica.getMaticniBroj() + " vec postoji", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!sifra.matches(regex)) {
                    JOptionPane.showMessageDialog(this, "Maticni broj mora biti broj!", "Greska", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            if (txtAdresa.getText().isEmpty() || txtBrojTelefona.getText().isEmpty() || txtMaticniBroj.getText().isEmpty() || txtNazivProdavnice.getText().isEmpty()
                    || txtTekuciRacun.getText().isEmpty() || txtPIB.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Popunite sva polja.", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ControllerKlijent.getInstanca().saveProdavnica(prodavnica);
            JOptionPane.showMessageDialog(this, "Sistem je kreirao prodavnicu.","Informacije.",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da kreira prodavnicu.","Greska.",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DijalogProdavniceDetalji.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comboMesto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdresa;
    private javax.swing.JLabel lblBrojTelefona;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDelatnost;
    private javax.swing.JLabel lblMaticniBroj;
    private javax.swing.JLabel lblMesto;
    private javax.swing.JLabel lblNazivProdavnice;
    private javax.swing.JLabel lblPIB;
    private javax.swing.JLabel lblTekuciRacun;
    private javax.swing.JRadioButton rb52450;
    private javax.swing.JRadioButton rb52480;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtBrojTelefona;
    private javax.swing.JTextField txtDatumOsnivanja;
    private javax.swing.JTextField txtMaticniBroj;
    private javax.swing.JTextField txtNazivProdavnice;
    private javax.swing.JTextField txtPIB;
    private javax.swing.JTextField txtTekuciRacun;
    // End of variables declaration//GEN-END:variables
    private void popuniFormu() {
        try {
            if (mode == ModeForme.FORM_VIEW_MODE || mode == ModeForme.FORM_EDIT_MODE) {
                Prodavnica prodavnica = (Prodavnica) ControllerKlijent.getInstanca().getValue("prodavnica");

                txtMaticniBroj.setText(prodavnica.getMaticniBroj());
                txtPIB.setText(prodavnica.getPIB());
                txtNazivProdavnice.setText(prodavnica.getNaziv());
                txtAdresa.setText(prodavnica.getAdresa());
                txtBrojTelefona.setText(prodavnica.getBrojTelefona());
                txtTekuciRacun.setText(prodavnica.getTekuciRacun());
                txtDatumOsnivanja.setText(prodavnica.getDatumOsnivanja().toString());

                comboMesto.addItem(prodavnica.getMesto());

                if (prodavnica.getDelatnost().equals(rb52450.getText())) {
                    rb52450.setSelected(true);
                } else {
                    rb52480.setSelected(true);
                }

                      } else {
                ArrayList<Mesto> listaMesta = ControllerKlijent.getInstanca().getMesto();
                if (mode == ModeForme.FORM_ADD_MODE) {
                    if (mode == ModeForme.FORM_ADD_MODE) {
                        for (Mesto m : listaMesta) {
                            comboMesto.addItem(m);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DijalogProdavniceDetalji.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Prodavnica getProdavnica() {
        Prodavnica prodavnica = new Prodavnica();
        if (!txtMaticniBroj.getText().isEmpty()) {
            prodavnica.setMaticniBroj(txtMaticniBroj.getText());
        }
        prodavnica.setPIB(txtPIB.getText().trim());
        prodavnica.setNaziv(txtNazivProdavnice.getText().trim());
        prodavnica.setBrojTelefona(txtBrojTelefona.getText().trim());
        prodavnica.setTekuciRacun(txtTekuciRacun.getText().trim());
        prodavnica.setAdresa(txtAdresa.getText().trim());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            prodavnica.setDatumOsnivanja(sdf.parse(txtDatumOsnivanja.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Datum nije u dobrom formatu! {yyyy-MM-dd}", "Greska", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DijalogProdavniceDetalji.class.getName()).log(Level.SEVERE, null, ex);
        }

        Mesto mesto = (Mesto) comboMesto.getSelectedItem();
        prodavnica.setMesto(mesto);

        if (rb52450.isSelected()) {
            prodavnica.setDelatnost(rb52450.getText());
        } else {
            prodavnica.setDelatnost(rb52480.getText());
        }
        return prodavnica;
    }

    private void srediFormu() {
        lblMaticniBroj.setVisible(true);
        txtMaticniBroj.setVisible(true);

        txtNazivProdavnice.setEditable(true);
        txtAdresa.setEditable(true);
        txtBrojTelefona.setEditable(true);
        txtDatumOsnivanja.setEditable(true);
        txtPIB.setEditable(true);
        txtTekuciRacun.setEditable(true);
        rb52450.setEnabled(true);
        rb52480.setEnabled(true);
        comboMesto.setEnabled(true);

        btnSave.setEnabled(true);

        btnUpdate.setEnabled(true);
        btnEdit.setEnabled(true);

        if (mode == ModeForme.FORM_ADD_MODE) {
            this.setTitle("Dodaj novu prodavnicu...");
            btnUpdate.setEnabled(false);
            btnEdit.setEnabled(false);
        } else if (mode == ModeForme.FORM_VIEW_MODE) {
            this.setTitle("Pregled prodavnice...");
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(false);

            txtMaticniBroj.setEditable(false);
            txtNazivProdavnice.setEditable(false);
            txtAdresa.setEditable(false);
            txtBrojTelefona.setEditable(false);
            txtDatumOsnivanja.setEditable(false);
            txtPIB.setEditable(false);
            txtTekuciRacun.setEditable(false);
            rb52450.setEnabled(false);
            rb52480.setEnabled(false);
            comboMesto.setEnabled(false);

        } else {
            //izmena
            this.setTitle("Izmena prodavnice...");
            txtMaticniBroj.setEditable(false);
            comboMesto.setEnabled(false);
            btnSave.setEnabled(false);
            btnEdit.setEnabled(false);
        }
    }
}
