/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author johannilsson
 */
public class RegistreraAgent extends javax.swing.JFrame {
    private static InfDB idb;

    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAgent() {
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

        jLabel1 = new javax.swing.JLabel();
        Agent_IDtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namnagenttxt = new javax.swing.JTextField();
        telefontxt = new javax.swing.JTextField();
        anställningsdatumtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        administratorComboBox = new javax.swing.JComboBox<>();
        lösenordsfälttxt = new javax.swing.JTextField();
        områdeComboBox = new javax.swing.JComboBox<>();
        registreraAgentKnapp = new javax.swing.JButton();
        agentIDlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registrera en agent ");

        jLabel2.setText("Agent-ID:");

        jLabel3.setText("Namn:");

        jLabel4.setText("Telefon:");

        jLabel5.setText("Anställningsdatum:");

        jButton1.setText("Generera ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Administrator:");

        jLabel7.setText("Lösenord:");

        jLabel8.setText("Område:");

        administratorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));
        administratorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administratorComboBoxActionPerformed(evt);
            }
        });

        områdeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Götaland", "Norrland", "Svealand" }));

        registreraAgentKnapp.setText("Registrera");
        registreraAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentKnappActionPerformed(evt);
            }
        });

        agentIDlabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        agentIDlabel.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anställningsdatumtxt)
                            .addComponent(telefontxt)
                            .addComponent(namnagenttxt)
                            .addComponent(Agent_IDtxt)
                            .addComponent(lösenordsfälttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(administratorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(områdeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registreraAgentKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(agentIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agent_IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namnagenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agentIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anställningsdatumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(administratorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lösenordsfälttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(områdeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registreraAgentKnapp))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try
     {
     String fraga1 = "SELECT Agent_ID FROM Agent";
     ArrayList svar = idb.fetchRows(fraga1);
     int visadID = (svar.size() + 1);
     
     agentIDlabel.setText(String.valueOf(visadID));
     
     
     }
        catch (InfException e)
        {
           JOptionPane.showMessageDialog(null, "Ett fel uppstod.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void administratorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administratorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_administratorComboBoxActionPerformed

    private void registreraAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentKnappActionPerformed
        
                  boolean alltokej=false;
                  
                    if (Validering.textFaltHarVarde(namnagenttxt)){
                  
                      if (Validering.kollaTelefonnummerTextField(telefontxt)){
                  
                        if (Validering.kollaDatumTextField(anställningsdatumtxt)){ 
                  
                        
                              if (Validering.inteSpace(Agent_IDtxt)){
                              if (Validering.inteSpace(namnagenttxt)){
                              if (Validering.inteSpace(telefontxt))
                                  if (Validering.inteSpace(anställningsdatumtxt)){
                                  if (Validering.inteSpace(lösenordsfälttxt)){
                                  
                                  }
                                  }
                              }
                              }
                    
                      }
                        }
                         }
                            
                      
                   
                    alltokej=true;
                       
                     if (alltokej==true){
        try {
            
            
            String ValtOmradesID = idb.fetchSingle("Select Omrades_ID from Omrade WHERE benamning = '" + områdeComboBox.getSelectedItem().toString() + "'");
            
            String uppdatera = "INSERT INTO Agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Losenord, Omrade) VALUES("
                    + agentIDlabel.getText() + ", '"
                    + namnagenttxt.getText() + "', '"
                    + telefontxt.getText() + "', '"
                    + anställningsdatumtxt.getText() + "', '" 
                    + lösenordsfälttxt.getText() + "', "
                    + ValtOmradesID + ")";
            
            String admin = "UPDATE Agent SET Administrator='J' WHERE Namn='" + namnagenttxt.getText() + "'";
            String inteAdmin = "UPDATE Agent SET Administrator='N' WHERE Namn='" + namnagenttxt.getText() + "'";
        

 
            if(administratorComboBox.getSelectedItem().toString().equals("Ja") && (alltokej==true) ) {
                idb.fetchSingle(uppdatera);
                idb.fetchSingle(admin);
                JOptionPane.showMessageDialog(null, "Du har registrerat en agent med administratörsstatus!");
            }
            
            
            else if(administratorComboBox.getSelectedItem().toString().equals("Nej") && (alltokej==true)){
                JOptionPane.showMessageDialog(null, "Du har registrerat en agent utan administratörsstatus!");
                idb.fetchSingle(uppdatera);
                idb.fetchSingle(inteAdmin);
            
            }
            
            else {
                JOptionPane.showMessageDialog(null, "Du har inte lyckats registrera en admin!");
            }

        } catch (InfException e) {
            System.out.println(e);

        }
        
      }

    }//GEN-LAST:event_registreraAgentKnappActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agent_IDtxt;
    private javax.swing.JComboBox<String> administratorComboBox;
    private javax.swing.JLabel agentIDlabel;
    private javax.swing.JTextField anställningsdatumtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lösenordsfälttxt;
    private javax.swing.JTextField namnagenttxt;
    private javax.swing.JComboBox<String> områdeComboBox;
    private javax.swing.JButton registreraAgentKnapp;
    private javax.swing.JTextField telefontxt;
    // End of variables declaration//GEN-END:variables
}
