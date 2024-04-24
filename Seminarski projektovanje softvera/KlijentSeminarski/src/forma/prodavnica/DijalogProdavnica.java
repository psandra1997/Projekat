/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.prodavnica;

import domen.Prodavnica;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;
import mode.ModeForme;
import modeli.ModelTabeleProdavnice;

/**
 *
 * @author Sandra
 */
public class DijalogProdavnica extends javax.swing.JDialog {
//private int mode;
    /**
     * Creates new form DijalogProdavnica
     */
    public DijalogProdavnica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.mode=mode;
        setTitle("Pregled prodavnica...");
        setLocationRelativeTo(null);
        popuniFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdavnice = new javax.swing.JTable();
        btnDetaljiProdavnice = new javax.swing.JButton();
        lblPretragaProdavnice = new javax.swing.JLabel();
        txtPretragaProdavnice = new javax.swing.JTextField();
        btnPretragaProdavnice = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();
        btnNovaProdavnica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Prodavnice"));

        tabelaProdavnice.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaProdavnice);

        btnDetaljiProdavnice.setText("Detalji");
        btnDetaljiProdavnice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiProdavniceActionPerformed(evt);
            }
        });

        lblPretragaProdavnice.setText("Pretraga prodavnice po nazivu:");

        btnPretragaProdavnice.setText("Pretrazi");
        btnPretragaProdavnice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaProdavniceActionPerformed(evt);
            }
        });

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        btnNovaProdavnica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNovaProdavnica.setText("+Nova");
        btnNovaProdavnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaProdavnicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNazad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovaProdavnica, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnDetaljiProdavnice, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPretragaProdavnice, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPretragaProdavnice, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPretragaProdavnice)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPretragaProdavnice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPretragaProdavnice))
                    .addComponent(lblPretragaProdavnice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovaProdavnica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDetaljiProdavnice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNazad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnPretragaProdavniceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaProdavniceActionPerformed
        String pretraga = txtPretragaProdavnice.getText();
        if (!pretraga.isEmpty()) {
            ModelTabeleProdavnice mt = (ModelTabeleProdavnice) tabelaProdavnice.getModel();
            mt.setParametarPretrage(pretraga);
        } else {
            popuniFormu();
         }
    }//GEN-LAST:event_btnPretragaProdavniceActionPerformed

    private void btnDetaljiProdavniceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiProdavniceActionPerformed
        int selectedRow = tabelaProdavnice.getSelectedRow();
        if (selectedRow != -1) {
            
            Prodavnica p = ((ModelTabeleProdavnice) tabelaProdavnice.getModel()).getLista().get(selectedRow);
            ControllerKlijent.getInstanca().addValue("prodavnica", p);
            //this.dispose();
            DijalogProdavniceDetalji dijalogP = new DijalogProdavniceDetalji(null, true, ModeForme.FORM_VIEW_MODE);
            dijalogP.pack();
            dijalogP.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Niste izabrali prodavnicu!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDetaljiProdavniceActionPerformed

    private void btnNovaProdavnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaProdavnicaActionPerformed
       DijalogProdavniceDetalji dijalogProdavnica=new DijalogProdavniceDetalji(null, true, ModeForme.FORM_ADD_MODE);
       dijalogProdavnica.pack();
       dijalogProdavnica.setVisible(true);
       popuniFormu();
    }//GEN-LAST:event_btnNovaProdavnicaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetaljiProdavnice;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnNovaProdavnica;
    private javax.swing.JButton btnPretragaProdavnice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPretragaProdavnice;
    private javax.swing.JTable tabelaProdavnice;
    private javax.swing.JTextField txtPretragaProdavnice;
    // End of variables declaration//GEN-END:variables

    private void popuniFormu() {
        ArrayList<Prodavnica> lista;
        try {
            lista = ControllerKlijent.getInstanca().getProdavnica();
            tabelaProdavnice.setModel(new ModelTabeleProdavnice(lista));
        } catch (Exception ex) {
            Logger.getLogger(DijalogProdavnica.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}