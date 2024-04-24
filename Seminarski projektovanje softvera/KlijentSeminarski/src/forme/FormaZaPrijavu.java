/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Prodavac;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;

/**
 *
 * @author Sandra
 */
public class FormaZaPrijavu extends javax.swing.JFrame {

    
    public FormaZaPrijavu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKorisnickoIme = new javax.swing.JLabel();
        lblLozinka = new javax.swing.JLabel();
        txtKorisnickoIme = new javax.swing.JTextField();
        txtLozinka = new javax.swing.JPasswordField();
        btnPrijava = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prijava prodavca");
        setResizable(false);

        lblKorisnickoIme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblKorisnickoIme.setText("Korisnicko ime: ");

        lblLozinka.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLozinka.setText("Lozinka:");

        btnPrijava.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnPrijava.setText("Prijava");
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });

        btnOdustani.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKorisnickoIme)
                    .addComponent(lblLozinka))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKorisnickoIme, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(txtLozinka)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOdustani)
                        .addGap(36, 36, 36)
                        .addComponent(btnPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKorisnickoIme)
                    .addComponent(txtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLozinka)
                    .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrijava)
                    .addComponent(btnOdustani))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        try {
            String korisnickoIme = txtKorisnickoIme.getText().trim();
            String lozinka = String.valueOf(txtLozinka.getPassword()).trim();

            Prodavac prodavac = new Prodavac();
            prodavac.setKorisnickoIme(korisnickoIme);
            prodavac.setLozinka(lozinka);

            Prodavac prodavac1 = ControllerKlijent.getInstanca().prijava(prodavac);
            if (prodavac1 != null) {
                FormaGlavna forma = new FormaGlavna(this, true, prodavac1);
                forma.setVisible(true);
                this.dispose();
                //this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Prodavac ne postoji.", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, "Prodavac ne postoji.", "Greska", JOptionPane.ERROR_MESSAGE);
           // ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPrijavaActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnPrijava;
    private javax.swing.JLabel lblKorisnickoIme;
    private javax.swing.JLabel lblLozinka;
    private javax.swing.JTextField txtKorisnickoIme;
    private javax.swing.JPasswordField txtLozinka;
    // End of variables declaration//GEN-END:variables
}
