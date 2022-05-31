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
        valdRastxtfält.setVisible(false);
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
        labelAlienID = new javax.swing.JLabel();
        valdRastxtfält = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        valdRasLabel = new javax.swing.JLabel();
        valdRasComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtRegistreringsdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistreringsdatumActionPerformed(evt);
            }
        });

        jLabel2.setText("Reg. Datum:");

        jLabel3.setText("Lösenord:");

        jLabel4.setText("Ange namn på alien:");

        jLabel5.setText("Telefon:");

        jLabel6.setText("Plats:");

        jLabel7.setText("Ansvarig Agent:");

        jLabel8.setText("Ändra information om Alien");

        jLabel9.setText("Alien_ID:");

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

        labelAlienID.setText("...");

        valdRasLabel.setText(".");

        valdRasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Boglodite", "Squid", "Worm" }));
        valdRasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valdRasComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setText("Välj Ras:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(valdRasLabel)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valdRastxtfält, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegistreringsdatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlats, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnsvarigagent, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valdRasComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                .addComponent(btnLäggtill, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSök, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSök)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valdRasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valdRastxtfält, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valdRasLabel))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRegistreringsdatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
     
     String alienNamn = txtNamn.getText();

     String fraga ="Select Registreringsdatum from Alien where Namn='" + alienNamn +"'"; 
     String datum = idb.fetchSingle(fraga);
     txtRegistreringsdatum.setText(datum);
     

     String fraga1 = "Select Losenord from Alien where Namn='" + alienNamn+ "'";
     String losen = idb.fetchSingle(fraga1);
     txtLosenord.setText(losen);
     
     String fraga2= "Select Alien_ID from Alien where Namn='" + alienNamn + "'";
     String namnet=idb.fetchSingle(fraga2);
     labelAlienID.setText(namnet);
     
     String fraga3 = "Select Telefon from Alien where Namn='" + alienNamn + "'";
     String telefonen = idb.fetchSingle(fraga3);
     txtTelefon.setText(telefonen);
     
     String fraga4 = "Select Plats from Alien where Namn='" + alienNamn + "'";
     String platsen = idb.fetchSingle(fraga4);
     txtPlats.setText(platsen);
     
     String fraga5 = "Select Ansvarig_Agent from Alien where Namn='" + alienNamn + "'";
     String ansvariga = idb.fetchSingle(fraga5);
     txtAnsvarigagent.setText(ansvariga);
    }catch (InfException e)
    {
    
    }
    

    }//GEN-LAST:event_btnSökActionPerformed

    private void btnLäggtillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggtillActionPerformed
               
        
        if (Validering.textFaltHarVarde(txtNamn))
          if (Validering.textFaltHarVarde(valdRastxtfält))
            if (Validering.losenordetharvarde(txtLosenord))
                if (Validering.isPlats(txtPlats))
                    if (Validering.kollaDatumTextField(txtRegistreringsdatum))
                        if (Validering.AnsvarigAgent(txtAnsvarigagent))
                            if (Validering.kollaTelefonnummerTextField(txtTelefon))
                            if (Validering.inteSpace(txtLosenord))
                                if (Validering.inteSpace(txtNamn))
                                    if (Validering.inteSpace(valdRastxtfält))
                                    if (Validering.inteSpace(txtPlats))
                                        if (Validering.inteSpace(txtRegistreringsdatum))
                                            if (Validering.inteSpace(txtAnsvarigagent))
                                                if (Validering.inteSpace(txtTelefon))
                                                    if(Validering.arDetHeltal(valdRastxtfält))
                                                        if(Validering.arDetHeltal(txtPlats))
                                                            if(Validering.arDetHeltal(txtAnsvarigagent))
                                                            
                                            
        
        try {
         String uppdatera = "Update Alien "
                 + "set Registreringsdatum='" + txtRegistreringsdatum.getText() +"',"
                 + " Losenord='" + txtLosenord.getText() + "'," 
                 + " Namn ='" + txtNamn.getText() + "'," 
                 + " Telefon='" + txtTelefon.getText() + "',"
                 + " Plats=" + txtPlats.getText() + ", "
                 + " Ansvarig_Agent=" + txtAnsvarigagent.getText()
                 + " where Alien_ID= " + labelAlienID.getText();
         
         
         String valdRasBoglodite = "INSERT INTO Boglodite (Alien_ID, Antal_Boogies) VALUES(" + labelAlienID.getText() + "," 
                 +valdRastxtfält.getText()+") ON DUPLICATE KEY UPDATE Alien_ID=" 
                 + labelAlienID.getText() + ", antal_Boogies="+valdRastxtfält.getText()+ "";
         
         String valdRasSquid = "INSERT INTO Squid (Alien_ID, Antal_Armar) VALUES(" + labelAlienID.getText() + "," 
                 +valdRastxtfält.getText()+") ON DUPLICATE KEY UPDATE Alien_ID=" 
                 + labelAlienID.getText() + ", Antal_Armar="+valdRastxtfält.getText()+ "";
         
         String valdRasWorm = "INSERT INTO Worm (Alien_ID) VALUES(" + labelAlienID.getText() + ") ON DUPLICATE KEY "
                 + "UPDATE Alien_ID=" + labelAlienID.getText() + "";
         
         
         if(valdRasComboBox.getSelectedItem().toString().equals("Boglodite")) {
             idb.update(uppdatera);
             idb.fetchSingle(valdRasBoglodite);
             JOptionPane.showMessageDialog(null, "Ändringen lyckades!");
             
         }
         
         else if(valdRasComboBox.getSelectedItem().toString().equals("Squid")) {
             idb.update(uppdatera);
             idb.fetchSingle(valdRasSquid);
             JOptionPane.showMessageDialog(null, "Ändringen lyckades!");
             
         }
         
         else if(valdRasComboBox.getSelectedItem().toString().equals("Worm")) {
             idb.update(uppdatera);
             idb.fetchSingle(valdRasWorm);
             JOptionPane.showMessageDialog(null, "Ändringen lyckades!");
             
         }
         
         else {
             JOptionPane.showMessageDialog(null, "Vänligen välj en ras");
         }
         
         
         
         } catch(InfException e)  {
            System.out.println(e);
        }
        
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dubbelkolla om du angett en siffra för plats eller ansvarig agent");
        }

    }//GEN-LAST:event_btnLäggtillActionPerformed

    private void valdRasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valdRasComboBoxActionPerformed
        if(valdRasComboBox.getSelectedItem().toString().equals("Boglodite")) {
             valdRastxtfält.setVisible(true);
             valdRasLabel.setText("Antal Boogies: ");
         }
        
        else if(valdRasComboBox.getSelectedItem().toString().equals("Squid")) {
             valdRastxtfält.setVisible(true);
             valdRasLabel.setText("Antal armar: ");
         }
        
        else {
            valdRastxtfält.setVisible(false);
            valdRasLabel.setText("");
        }
    }//GEN-LAST:event_valdRasComboBoxActionPerformed

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
    private javax.swing.JLabel labelAlienID;
    private javax.swing.JTextField txtAnsvarigagent;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRegistreringsdatum;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JComboBox<String> valdRasComboBox;
    private javax.swing.JLabel valdRasLabel;
    private javax.swing.JTextField valdRastxtfält;
    // End of variables declaration//GEN-END:variables
        }
