/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.mobilniTelefon;

import domen.MobilniTelefon;
import forma.prodavnica.DijalogProdavnica;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.ControllerKlijent;
import mode.ModeForme;
import modeli.ModelTabeleMT;

/**
 *
 * @author Sandra
 */
public class DijalogMobilniTelefon extends javax.swing.JDialog {
//private int mode;
    /**
     * Creates new form DijalogMobilniTelefon
     */
    public DijalogMobilniTelefon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       // this.mode=mode;
        setTitle("Pregled mobilnih telefona...");
        setLocationRelativeTo(null);
        popuniFormu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMobilnihTelefona = new javax.swing.JTable();
        btnDetaljiMobilniTelefon = new javax.swing.JButton();
        txtPretragaMT = new javax.swing.JTextField();
        lblPretragaMT = new javax.swing.JLabel();
        btnPretragaMT = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();
        btnNoviMobilniTelefon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mobilni telefoni"));

        tabelaMobilnihTelefona.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaMobilnihTelefona);

        btnDetaljiMobilniTelefon.setText("Detalji");
        btnDetaljiMobilniTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiMobilniTelefonActionPerformed(evt);
            }
        });

        lblPretragaMT.setText("Pretraga telefona po nazivu:");

        btnPretragaMT.setText("Pretrazi");
        btnPretragaMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaMTActionPerformed(evt);
            }
        });

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        btnNoviMobilniTelefon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNoviMobilniTelefon.setText("+Novi");
        btnNoviMobilniTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoviMobilniTelefonActionPerformed(evt);
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
                        .addComponent(btnNazad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNoviMobilniTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnDetaljiMobilniTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPretragaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPretragaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPretragaMT)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPretragaMT)
                    .addComponent(txtPretragaMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretragaMT))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNoviMobilniTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDetaljiMobilniTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNazad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnPretragaMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaMTActionPerformed
      String pretraga = txtPretragaMT.getText();
        if (!pretraga.isEmpty()) {
            ModelTabeleMT mt = (ModelTabeleMT) tabelaMobilnihTelefona.getModel();
            mt.setParametarPretrage(pretraga);
            
        } else {
            popuniFormu();
         }
         
         
    }//GEN-LAST:event_btnPretragaMTActionPerformed

    private void btnDetaljiMobilniTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiMobilniTelefonActionPerformed
        int selectedRow = tabelaMobilnihTelefona.getSelectedRow();
        if (selectedRow != -1) {
            MobilniTelefon mt = ((ModelTabeleMT) tabelaMobilnihTelefona.getModel()).getLista().get(selectedRow);
            ControllerKlijent.getInstanca().addValue("telefon", mt);
            //this.dispose();
            DijalogMobilniDetalji dijalogMT = new DijalogMobilniDetalji(null, true, ModeForme.FORM_VIEW_MODE);
            dijalogMT.pack();
            dijalogMT.setVisible(true);
             } else {
            JOptionPane.showMessageDialog(this, "Niste izabrali mobilni telefon!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDetaljiMobilniTelefonActionPerformed

    private void btnNoviMobilniTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoviMobilniTelefonActionPerformed
        DijalogMobilniDetalji dijalogMobilni= new DijalogMobilniDetalji(null, true, ModeForme.FORM_ADD_MODE);
        dijalogMobilni.pack();
        dijalogMobilni.setVisible(true);
        popuniFormu();
    }//GEN-LAST:event_btnNoviMobilniTelefonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetaljiMobilniTelefon;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnNoviMobilniTelefon;
    private javax.swing.JButton btnPretragaMT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPretragaMT;
    private javax.swing.JTable tabelaMobilnihTelefona;
    private javax.swing.JTextField txtPretragaMT;
    // End of variables declaration//GEN-END:variables

 private void popuniFormu() {
    ArrayList<MobilniTelefon> lista;
        try {
            lista = ControllerKlijent.getInstanca().getMobilniTelefoni();
          tabelaMobilnihTelefona.setModel(new ModelTabeleMT(lista));
        } catch (Exception ex) {
            Logger.getLogger(DijalogProdavnica.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    }

}
