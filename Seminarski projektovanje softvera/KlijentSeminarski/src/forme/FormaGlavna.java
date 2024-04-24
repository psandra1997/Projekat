/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Otpremnica;
import domen.Prodavac;
import forma.mobilniTelefon.DijalogMobilniTelefon;
import forma.otpremnica.DijalogOtpremnice;
import forma.otpremnica.DijalogStampanje;
import forma.prodavnica.DijalogProdavnica;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;
import mode.ModeForme;
import modeli.ModelTabeleOtpremnice;

/**
 *
 * @author Sandra
 */
public class FormaGlavna extends javax.swing.JDialog {
    Prodavac prodavac;
            
    public FormaGlavna(java.awt.Frame parent, boolean modal,Prodavac prodavac) {
        super(parent, modal);
        this.prodavac=prodavac;
        initComponents();
        setLocationRelativeTo(null);
        ModelTabeleOtpremnice model=new ModelTabeleOtpremnice();
        Thread thread=new Thread(model);
        thread.start();
        srediTabelu();
        srediFormu();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUlogovani = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaOtpremnica = new javax.swing.JTable();
        btnDetaljiOtpremnica = new javax.swing.JButton();
        txtPretragaOtpremnica = new javax.swing.JTextField();
        lblPretraga = new javax.swing.JLabel();
        btnNovaOtpremnica = new javax.swing.JButton();
        btnPretraga = new javax.swing.JButton();
        lblUlogovaniProdavac = new javax.swing.JLabel();
        btnStampanje = new javax.swing.JButton();
        meni = new javax.swing.JMenuBar();
        meniProdavnice = new javax.swing.JMenu();
        meniItemProdavnice = new javax.swing.JMenuItem();
        meniMobilniTelefoni = new javax.swing.JMenu();
        meniItemTelefoni = new javax.swing.JMenuItem();
        meniOdjava = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblUlogovani.setText("Ulogovani/a:");

        tabelaOtpremnica.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaOtpremnica);

        btnDetaljiOtpremnica.setText("Detalji");
        btnDetaljiOtpremnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiOtpremnicaActionPerformed(evt);
            }
        });

        lblPretraga.setText("Pretraga otpremnica po broju:");

        btnNovaOtpremnica.setText("Nova otpremnica");
        btnNovaOtpremnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaOtpremnicaActionPerformed(evt);
            }
        });

        btnPretraga.setText("Pretraga");
        btnPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaActionPerformed(evt);
            }
        });

        btnStampanje.setText("Stampanje");
        btnStampanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampanjeActionPerformed(evt);
            }
        });

        meni.setForeground(new java.awt.Color(0, 153, 153));

        meniProdavnice.setText("Prodavnice");

        meniItemProdavnice.setText("Sve prodavnice");
        meniItemProdavnice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemProdavniceActionPerformed(evt);
            }
        });
        meniProdavnice.add(meniItemProdavnice);

        meni.add(meniProdavnice);

        meniMobilniTelefoni.setText("Mobilni telefoni");

        meniItemTelefoni.setText("Svi telefoni");
        meniItemTelefoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemTelefoniActionPerformed(evt);
            }
        });
        meniMobilniTelefoni.add(meniItemTelefoni);

        meni.add(meniMobilniTelefoni);

        meniOdjava.setBackground(new java.awt.Color(204, 204, 204));
        meniOdjava.setBorder(null);
        meniOdjava.setText("Odjava");
        meniOdjava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meniOdjavaMouseClicked(evt);
            }
        });
        meni.add(meniOdjava);

        setJMenuBar(meni);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblUlogovani, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUlogovaniProdavac, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPretragaOtpremnica, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNovaOtpremnica, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(btnPretraga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStampanje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnDetaljiOtpremnica, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUlogovaniProdavac, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUlogovani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(btnNovaOtpremnica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPretraga)
                    .addComponent(txtPretragaOtpremnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretraga))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDetaljiOtpremnica, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnStampanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meniOdjavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meniOdjavaMouseClicked
        try {
            int odgovor = JOptionPane.showConfirmDialog(this, "Zalite da se odjavite?", "Odjava", JOptionPane.YES_NO_OPTION);
        if (odgovor == JOptionPane.YES_OPTION) {
            ControllerKlijent.getInstanca().odjava();
            this.dispose();
            System.exit(0);
        }
        } catch (Exception ex) {
            Logger.getLogger(FormaGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_meniOdjavaMouseClicked

    private void btnNovaOtpremnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaOtpremnicaActionPerformed
        DijalogOtpremnice dijalogOtpremnica=new DijalogOtpremnice(null, true, ModeForme.FORM_ADD_MODE);
        dijalogOtpremnica.pack();
        dijalogOtpremnica.setVisible(true);
    }//GEN-LAST:event_btnNovaOtpremnicaActionPerformed

    private void btnDetaljiOtpremnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiOtpremnicaActionPerformed
        int red=tabelaOtpremnica.getSelectedRow();
        if(red!=-1){
            ModelTabeleOtpremnice mto=(ModelTabeleOtpremnice) tabelaOtpremnica.getModel();
            Otpremnica o= mto.getListaOtpremnica().get(red);
            ControllerKlijent.getInstanca().addValue("selektovanaOtpremnica", o);
           
            DijalogOtpremnice dijalog=new DijalogOtpremnice(null, true,ModeForme.FORM_VIEW_MODE);
            dijalog.pack();
            dijalog.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Niste izabrali otpremnicu!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDetaljiOtpremnicaActionPerformed

    private void btnPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaActionPerformed
        String pretraga1 = txtPretragaOtpremnica.getText();
        if (!pretraga1.isEmpty()) {
            int pretraga = Integer.parseInt(pretraga1);
            ModelTabeleOtpremnice mto = (ModelTabeleOtpremnice) tabelaOtpremnica.getModel();
            mto.setParametarPretrage(pretraga);
        } else {
            srediTabelu();
        }
    }//GEN-LAST:event_btnPretragaActionPerformed

    private void meniItemTelefoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemTelefoniActionPerformed
        DijalogMobilniTelefon dmt = new DijalogMobilniTelefon(null, true);
        dmt.pack();
        dmt.setVisible(true);
    }//GEN-LAST:event_meniItemTelefoniActionPerformed

    private void meniItemProdavniceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemProdavniceActionPerformed
        DijalogProdavnica dp = new DijalogProdavnica(null, true);
        dp.pack();
        dp.setVisible(true);
    }//GEN-LAST:event_meniItemProdavniceActionPerformed

    private void btnStampanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampanjeActionPerformed
        int red = tabelaOtpremnica.getSelectedRow();
        ModelTabeleOtpremnice mto = (ModelTabeleOtpremnice) tabelaOtpremnica.getModel();
        Otpremnica o = mto.getListaOtpremnica().get(red);
        ControllerKlijent.getInstanca().setProdavac(prodavac);
        if (red != -1) {
            DijalogStampanje ds;
            try {
                ds = new DijalogStampanje(null, true, o);
                ds.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(FormaGlavna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnStampanjeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetaljiOtpremnica;
    private javax.swing.JButton btnNovaOtpremnica;
    private javax.swing.JButton btnPretraga;
    private javax.swing.JButton btnStampanje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPretraga;
    private javax.swing.JLabel lblUlogovani;
    private javax.swing.JLabel lblUlogovaniProdavac;
    private javax.swing.JMenuBar meni;
    private javax.swing.JMenuItem meniItemProdavnice;
    private javax.swing.JMenuItem meniItemTelefoni;
    private javax.swing.JMenu meniMobilniTelefoni;
    private javax.swing.JMenu meniOdjava;
    private javax.swing.JMenu meniProdavnice;
    private javax.swing.JTable tabelaOtpremnica;
    private javax.swing.JTextField txtPretragaOtpremnica;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu() {
        try {
            tabelaOtpremnica.setModel(new ModelTabeleOtpremnice());        
        } catch (Exception ex) {
            Logger.getLogger(FormaGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void srediFormu() {
        lblUlogovaniProdavac.setText(prodavac.getIme() + " " + prodavac.getPrezime());
    }
}
