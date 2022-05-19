/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author johannilsson
 */
public class ÄndraInfoOmAlien extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form ÄndraInfoOmAlien
     */
    public ÄndraInfoOmAlien() {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVilketAlienID = new javax.swing.JTextField();
        txtRegistreringsdatum = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtPlats = new javax.swing.JTextField();
        txtAnsvarigagent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSök = new javax.swing.JButton();
        btnLäggtill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtVilketAlienID.setText("...");

        txtRegistreringsdatum.setText("...");
        txtRegistreringsdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistreringsdatumActionPerformed(evt);
            }
        });

        txtLosenord.setText("...");

        txtNamn.setText("...");

        txtTelefon.setText("...");

        txtPlats.setText("...");

        txtAnsvarigagent.setText("...");

        jLabel2.setText("Reg. Datum");

        jLabel3.setText("Lösenord");

        jLabel4.setText("Namn");

        jLabel5.setText("Telefon");

        jLabel6.setText("Plats");

        jLabel7.setText("Ansvarig Agent");

        jLabel8.setText("Ändra information om Alien");

        jLabel9.setText("Ange AlienID:");

        btnSök.setText("OK");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        btnLäggtill.setText("Verkställ");
        btnLäggtill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggtillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVilketAlienID, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtRegistreringsdatum)
                    .addComponent(txtLosenord)
                    .addComponent(txtNamn)
                    .addComponent(txtTelefon)
                    .addComponent(txtPlats)
                    .addComponent(txtAnsvarigagent))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSök, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(btnLäggtill, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVilketAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSök))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnsvarigagent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLäggtill)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistreringsdatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistreringsdatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistreringsdatumActionPerformed

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
                                    
    try {
     
        
     int AlienIDtal = Integer.parseInt(txtVilketAlienID.getText());
     String fraga ="Select Registreringsdatum from Alien where Alien_ID=" + AlienIDtal; 
     String datum = idb.fetchSingle(fraga);
     txtRegistreringsdatum.setText(datum);
     
     //String losenordet = txtLosenord.getText();
     String fraga1 = "Select Losenord from Alien where Alien_ID=" + AlienIDtal;
     String losen = idb.fetchSingle(fraga1);
     txtLosenord.setText(losen);
     
     String fraga2= "Select Namn from Alien where Alien_ID=" + AlienIDtal;
     String namnet=idb.fetchSingle(fraga2);
     txtNamn.setText(namnet);
     
     String fraga3 = "Select Telefon from Alien where Alien_ID=" + AlienIDtal;
     String telefonen = idb.fetchSingle(fraga3);
     txtTelefon.setText(telefonen);
     
     String fraga4 = "Select Plats from Alien where Alien_ID=" + AlienIDtal;
     String platsen = idb.fetchSingle(fraga4);
     txtPlats.setText(platsen);
     
     String fraga5 = "Select Ansvarig_Agent from Alien where Alien_ID=" + AlienIDtal;
     String ansvariga = idb.fetchSingle(fraga5);
     txtAnsvarigagent.setText(ansvariga);
    }catch (InfException e)
    {
    
    }
    

    }//GEN-LAST:event_btnSökActionPerformed

    private void btnLäggtillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggtillActionPerformed
    try {
         String uppdatera = "Update Alien "
                 + "set Registreringsdatum='" + txtRegistreringsdatum.getText() +"',"
                 + " Losenord='" + txtLosenord.getText() + "'," 
                 + " Namn ='" + txtNamn.getText() + "'," 
                 + " Telefon='" + txtTelefon.getText() + "',"
                 + " Plats=" + txtPlats.getText() + ", "
                 + " Ansvarig_Agent=" + txtAnsvarigagent.getText()
                 + " where Alien_ID= " + txtVilketAlienID.getText();
         System.out.println(uppdatera);
         idb.update(uppdatera);
         String test = idb.fetchSingle("Select namn from alien where Alien_ID=" + txtVilketAlienID.getText());
         JOptionPane.showMessageDialog(null, "Ändringen lyckades!");
         
         }catch(InfException e) 
         {
             
             System.out.println(e.getMessage());
    }

    }//GEN-LAST:event_btnLäggtillActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ÄndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÄndraInfoOmAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggtill;
    private javax.swing.JButton btnSök;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAnsvarigagent;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRegistreringsdatum;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtVilketAlienID;
    // End of variables declaration//GEN-END:variables
        }
