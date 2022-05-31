/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author johannilsson
 */
public class RegistreraAlien extends javax.swing.JFrame {

    private static InfDB idb;
  
    public RegistreraAlien() {
        initComponents();
        valdRas.setVisible(false);
        
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

        registreraAlienKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        registreringsdatumAlien = new javax.swing.JTextField();
        LosenordAlien = new javax.swing.JTextField();
        namnAlien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ÄndraPlatsComboBox = new javax.swing.JComboBox<>();
        ÄndraAnsvarigAgentComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        OkKnappPlats = new javax.swing.JButton();
        OkKnappAnsvarigAgent = new javax.swing.JButton();
        txtPlatsAgent = new javax.swing.JTextField();
        txtAnsvarigAgent = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        genereraIDAlien = new javax.swing.JButton();
        telefonAlien = new javax.swing.JTextField();
        alienIDlabel = new javax.swing.JLabel();
        rasLabel = new javax.swing.JLabel();
        valdRas = new javax.swing.JTextField();
        cbRas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registreraAlienKnapp.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        registreraAlienKnapp.setText("Registrera");
        registreraAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAlienKnappActionPerformed(evt);
            }
        });
        getContentPane().add(registreraAlienKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 600, 148, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registrera en Alien");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 118, -1, 26));

        registreringsdatumAlien.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        registreringsdatumAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreringsdatumAlienActionPerformed(evt);
            }
        });
        getContentPane().add(registreringsdatumAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 217, 148, 32));

        LosenordAlien.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        LosenordAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LosenordAlienActionPerformed(evt);
            }
        });
        getContentPane().add(LosenordAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 275, 148, 32));

        namnAlien.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        namnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnAlienActionPerformed(evt);
            }
        });
        getContentPane().add(namnAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 326, 148, 32));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("AlienID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 166, -1, 39));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Plats:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 457, -1, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Lösenord:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 271, -1, 39));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Namn:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 322, -1, 39));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Telefon:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 373, -1, 39));

        ÄndraPlatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Borås", "Vilhelmina", "Västerås", "Örebro", " " }));
        ÄndraPlatsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraPlatsComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ÄndraPlatsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 429, 148, -1));

        ÄndraAnsvarigAgentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent O", "Agent K", "Agent J", "Agent Z" }));
        getContentPane().add(ÄndraAnsvarigAgentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 509, 148, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Ansvarig Agent:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 543, -1, 39));

        OkKnappPlats.setText("Ok");
        OkKnappPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkKnappPlatsActionPerformed(evt);
            }
        });
        getContentPane().add(OkKnappPlats, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 467, -1, -1));

        OkKnappAnsvarigAgent.setText("Ok");
        OkKnappAnsvarigAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkKnappAnsvarigAgentActionPerformed(evt);
            }
        });
        getContentPane().add(OkKnappAnsvarigAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 552, -1, -1));

        txtPlatsAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlatsAgentActionPerformed(evt);
            }
        });
        getContentPane().add(txtPlatsAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 462, 148, 32));
        getContentPane().add(txtAnsvarigAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 547, 148, 32));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Registreringsdatum:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 217, -1, 30));

        genereraIDAlien.setText("Generera ID");
        genereraIDAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genereraIDAlienActionPerformed(evt);
            }
        });
        getContentPane().add(genereraIDAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 166, -1, 39));

        telefonAlien.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        telefonAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonAlienActionPerformed(evt);
            }
        });
        getContentPane().add(telefonAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 377, 148, 32));

        alienIDlabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        alienIDlabel.setText("...");
        getContentPane().add(alienIDlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 176, 148, -1));

        rasLabel.setText("Antal:");
        getContentPane().add(rasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        valdRas.setText(".");
        getContentPane().add(valdRas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        cbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Boglodite", "Worm", "Squid" }));
        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });
        getContentPane().add(cbRas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registreringsdatumAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreringsdatumAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registreringsdatumAlienActionPerformed

    private void LosenordAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LosenordAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LosenordAlienActionPerformed

    private void namnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namnAlienActionPerformed

    private void OkKnappPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkKnappPlatsActionPerformed
        txtPlatsAgent.setText(ÄndraPlatsComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_OkKnappPlatsActionPerformed

    private void OkKnappAnsvarigAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkKnappAnsvarigAgentActionPerformed
        txtAnsvarigAgent.setText(ÄndraAnsvarigAgentComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_OkKnappAnsvarigAgentActionPerformed

    private void registreraAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAlienKnappActionPerformed
        
             
        boolean alltokej=false;
                  
                    if (Validering.textFaltHarVarde(namnAlien)){
                  
                      if (Validering.kollaTelefonnummerTextField(telefonAlien)){
                  
                        if (Validering.kollaDatumTextField(registreringsdatumAlien)){ 

                      }
                        }
                         }
                          
                      
                   
                    alltokej=true;
                       
                    
        try {
        
            String valdPlats = idb.fetchSingle("SELECT Plats_ID from Plats WHERE benamning = '" + txtPlatsAgent.getText() + "'");
            
                    
            String valdAgent = idb.fetchSingle("SELECT Agent_ID from Agent WHERE Namn = '" + txtAnsvarigAgent.getText() + "'"); 
            
            String uppdatera = "INSERT INTO Alien (Alien_ID, Registreringsdatum, Losenord, Namn, "
                    + "Telefon, Plats, Ansvarig_Agent) VALUES(" 
                    + alienIDlabel.getText() + ", '"
                    + registreringsdatumAlien.getText() + "', '"
                    + LosenordAlien.getText() + "', '"
                    + namnAlien.getText() + "', '"
                    + telefonAlien.getText() + "', "
                    + valdPlats + ", "
                    + valdAgent + ")";
            
            //int antal = Integer.parseInt(valdRas.getText());

            //String uppdateraBog = "INSERT INTO boglodite (Alien_ID, Antal_Boogies) VALUES(" + alienIDlabel.getText() + ", " + valdRas.getText() +")";
            String uppdateraSquid = "INSERT INTO squid (Alien_ID, Antal_Armar) VALUES (" + alienIDlabel.getText() + ", " + valdRas.getText() +")";
            String uppdateraWorm = "Insert INTO worm (Alien_ID) VALUES (" + alienIDlabel.getText() + ")";
                // System.out.println(uppdateraBog);
                 System.out.println(uppdatera);
            if(cbRas.getSelectedItem().toString().equals("Boglodite"))
                    {
                    idb.fetchSingle(uppdatera);
                    idb.fetchSingle("INSERT INTO boglodite (Alien_ID, Antal_Boogies) VALUES(" + alienIDlabel.getText() + ", " + valdRas.getText() +")");
                    
                    }
                    else if(cbRas.getSelectedItem().toString().equals("Squid"))
                    {
                        idb.update(uppdatera);
                        idb.update(uppdateraSquid);
                    }
                    else if(cbRas.getSelectedItem().toString().equals("Worm"))
                    {
                        idb.update(uppdatera);
                        idb.update(uppdateraWorm);
                     
                    }
         
        
        } catch (InfException e) {
            System.out.println(e);
        }
        
            
        
        
        
                                                 
    
                                                  
    }//GEN-LAST:event_registreraAlienKnappActionPerformed

    private void ÄndraPlatsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraPlatsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÄndraPlatsComboBoxActionPerformed

    private void txtPlatsAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlatsAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlatsAgentActionPerformed

    private void genereraIDAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genereraIDAlienActionPerformed
        try {
            
            String fraga1 = "SELECT Alien_ID FROM Alien";
            ArrayList svar = idb.fetchRows(fraga1);
            int visadID = (svar.size() + 1);

            alienIDlabel.setText(String.valueOf(visadID));

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel uppstod.");
        }
    }//GEN-LAST:event_genereraIDAlienActionPerformed

    private void telefonAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonAlienActionPerformed

    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed
if(cbRas.getSelectedItem().toString().equals("Boglodite")) {
             valdRas.setVisible(true);
             rasLabel.setText("Antal Boogies: ");
         }
       
        else if(cbRas.getSelectedItem().toString().equals("Squid")) {
             valdRas.setVisible(true);
             rasLabel.setText("Antal armar: ");
         }
       
        else {
            valdRas.setVisible(false);
            rasLabel.setText("");
        }
    }//GEN-LAST:event_cbRasActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LosenordAlien;
    private javax.swing.JButton OkKnappAnsvarigAgent;
    private javax.swing.JButton OkKnappPlats;
    private javax.swing.JLabel alienIDlabel;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JButton genereraIDAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField namnAlien;
    private javax.swing.JLabel rasLabel;
    private javax.swing.JButton registreraAlienKnapp;
    private javax.swing.JTextField registreringsdatumAlien;
    private javax.swing.JTextField telefonAlien;
    private javax.swing.JTextField txtAnsvarigAgent;
    private javax.swing.JTextField txtPlatsAgent;
    private javax.swing.JTextField valdRas;
    private javax.swing.JComboBox<String> ÄndraAnsvarigAgentComboBox;
    private javax.swing.JComboBox<String> ÄndraPlatsComboBox;
    // End of variables declaration//GEN-END:variables
}