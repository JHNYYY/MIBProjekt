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
public class ÄndraInfoOmAgent extends javax.swing.JFrame {
    
       private InfDB idb;

    /**
     * Creates new form ÄndraInfoOmAgent
     */
    public ÄndraInfoOmAgent() {
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

        namnAgenttxt = new javax.swing.JTextField();
        anställningsdatumAgenttxt = new javax.swing.JTextField();
        telefonAgenttxt = new javax.swing.JTextField();
        lösenordAgenttxt = new javax.swing.JTextField();
        omradeAgenttxt = new javax.swing.JTextField();
        ändraInfoAgentKnapp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sökKnappAgentÄndraInfo = new javax.swing.JButton();
        AgentIDlabel = new javax.swing.JLabel();
        adminstatusComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        anställningsdatumAgenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anställningsdatumAgenttxtActionPerformed(evt);
            }
        });

        ändraInfoAgentKnapp.setText("Ändra ");
        ändraInfoAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraInfoAgentKnappActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Agent_ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Agentens namn:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Telefon:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Anställningsdatum:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Administratör:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Lösenord:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Område:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Ändra information om Agent");

        sökKnappAgentÄndraInfo.setText("Sök");
        sökKnappAgentÄndraInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökKnappAgentÄndraInfoActionPerformed(evt);
            }
        });

        AgentIDlabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        AgentIDlabel.setText("...");

        adminstatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(omradeAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(lösenordAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(178, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(telefonAgenttxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(namnAgenttxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(AgentIDlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(adminstatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(anställningsdatumAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ändraInfoAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sökKnappAgentÄndraInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sökKnappAgentÄndraInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namnAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AgentIDlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anställningsdatumAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminstatusComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lösenordAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omradeAgenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ändraInfoAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anställningsdatumAgenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anställningsdatumAgenttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anställningsdatumAgenttxtActionPerformed

    private void sökKnappAgentÄndraInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökKnappAgentÄndraInfoActionPerformed
           
        
     try {
     
     
     String namnAgent = namnAgenttxt.getText();
     String fraga ="Select Anstallningsdatum from Agent where Namn='" + namnAgent +"'"; 
     String datum = idb.fetchSingle(fraga);
     anställningsdatumAgenttxt.setText(datum);
     
     String fraga1 = "Select Losenord from Agent where Namn='" + namnAgent + "'";
     String losen = idb.fetchSingle(fraga1);
     lösenordAgenttxt.setText(losen);
     
     String fraga2= "Select Agent_ID from Agent where Namn='" + namnAgent + "'";
     String namnet=idb.fetchSingle(fraga2);
     AgentIDlabel.setText(namnet);
     
     String fraga3 = "Select Telefon from Agent where Namn='" + namnAgent + "'";
     String telefonen = idb.fetchSingle(fraga3);
     telefonAgenttxt.setText(telefonen);
     
     String fraga4 = "Select Omrade from Agent where Namn='" + namnAgent + "'";
     String platsen = idb.fetchSingle(fraga4);
     omradeAgenttxt.setText(platsen);
     
     
    }catch (InfException e)
    {
        JOptionPane.showMessageDialog(null, "Databasfel!");
    }
    }//GEN-LAST:event_sökKnappAgentÄndraInfoActionPerformed

    private void ändraInfoAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraInfoAgentKnappActionPerformed

        if (Validering.textFaltHarVarde(namnAgenttxt))
            if (Validering.losenordetharvarde(lösenordAgenttxt))
                if (Validering.isOmrade(omradeAgenttxt))
                    if (Validering.kollaTelefonnummerTextField(namnAgenttxt))
                        if (Validering.kollaDatumTextField(anställningsdatumAgenttxt))
                        if (Validering.inteSpace(namnAgenttxt))
                            if (Validering.inteSpace(lösenordAgenttxt))
                                if (Validering.inteSpace(omradeAgenttxt))
                                    if (Validering.inteSpace(telefonAgenttxt))
            
        

        
        try {
            
                    
            int agentid = Integer.parseInt(AgentIDlabel.getText());
            int omrade = Integer.parseInt(omradeAgenttxt.getText());

            String uppdatera = "Update Agent Set Anstallningsdatum='" + anställningsdatumAgenttxt.getText() + "',"
                    + " Losenord='" + lösenordAgenttxt.getText() + "',"
                    + " Namn='" + namnAgenttxt.getText() + "',"
                    + " Telefon='" + telefonAgenttxt.getText() + "',"
                    + " Omrade=" + omrade + ""
                    + " where Agent_ID=" + agentid;


            String admin = "UPDATE Agent SET Administrator='J' WHERE Namn='" + namnAgenttxt.getText() + "'";
            String inteAdmin = "UPDATE Agent SET Administrator='N' WHERE Namn='" + namnAgenttxt.getText() + "'";

            if (adminstatusComboBox.getSelectedItem().toString().equals("Ja")) {
                idb.fetchSingle(uppdatera);
                idb.fetchSingle(admin);
                JOptionPane.showMessageDialog(null, "Ändringen lyckades!");
                
            } else if (adminstatusComboBox.getSelectedItem().toString().equals("Nej")) {
                JOptionPane.showMessageDialog(null, "Ändringarna lyckades!");
                idb.fetchSingle(uppdatera);
                idb.fetchSingle(inteAdmin);

            } else {
                JOptionPane.showMessageDialog(null, "Du har inte lyckats registrera en admin!");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");

        }
        
          catch(NumberFormatException e) {
              JOptionPane.showMessageDialog(null, "Vänligen ange ett nummer i områdesrutan!");
          }
    }//GEN-LAST:event_ändraInfoAgentKnappActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÄndraInfoOmAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgentIDlabel;
    private javax.swing.JComboBox<String> adminstatusComboBox;
    private javax.swing.JTextField anställningsdatumAgenttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lösenordAgenttxt;
    private javax.swing.JTextField namnAgenttxt;
    private javax.swing.JTextField omradeAgenttxt;
    private javax.swing.JButton sökKnappAgentÄndraInfo;
    private javax.swing.JTextField telefonAgenttxt;
    private javax.swing.JButton ändraInfoAgentKnapp;
    // End of variables declaration//GEN-END:variables
}
