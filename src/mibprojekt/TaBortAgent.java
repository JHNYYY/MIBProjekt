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
public class TaBortAgent extends javax.swing.JFrame {
    
    private InfDB idb;


    /**
     * Creates new form TaBortAgent
     */
    public TaBortAgent() {
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
        taBortAgentNamnsFält = new javax.swing.JTextField();
        taBortAgentKnapp = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Ange namn på agenten:");

        taBortAgentNamnsFält.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taBortAgentNamnsFält.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentNamnsFältActionPerformed(evt);
            }
        });

        taBortAgentKnapp.setText("Ta Bort");
        taBortAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentKnappActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Ta bort en agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBortAgentNamnsFält, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBortAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel2))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBortAgentKnapp)
                    .addComponent(taBortAgentNamnsFält)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(205, 205, 205))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taBortAgentNamnsFältActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentNamnsFältActionPerformed
        
    }//GEN-LAST:event_taBortAgentNamnsFältActionPerformed

    private void taBortAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentKnappActionPerformed
       
        
        if (Validering.textFaltHarVarde(taBortAgentNamnsFält))
            if (Validering.inteSpace(taBortAgentNamnsFält))
        
            
            
            
        try {
            
           
            String agentNamn = taBortAgentNamnsFält.getText();
            String fraga2 = "SELECT Namn FROM Agent WHERE Namn='" + agentNamn + "'";
            String svar2 = idb.fetchSingle(fraga2);
            
            String fraga1 = "DELETE FROM Agent WHERE Namn='" + agentNamn + "'";
    
            
            
            String tabortAgent = "SELECT Agent_ID from Agent WHERE namn ='" + taBortAgentNamnsFält.getText() +"'";
            String svartaBortAgent = idb.fetchSingle(tabortAgent);
            String fraga3 = "DELETE FROM omradeschef WHERE Agent_ID=" + svartaBortAgent + "";
            
           

            if (agentNamn.equals(svar2)) {
                JOptionPane.showMessageDialog(null, "Agenten har tagits bort!");
                 idb.fetchSingle(fraga3);
                 idb.fetchSingle(fraga1);
            }
            
            
            else if (!agentNamn.equals(svar2)) {
                JOptionPane.showMessageDialog(null, "Det finns ingen Agent som heter så");

            }

          

        } catch (InfException e) {
            System.out.println(e);
        }
          

        
    }//GEN-LAST:event_taBortAgentKnappActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton taBortAgentKnapp;
    private javax.swing.JTextField taBortAgentNamnsFält;
    // End of variables declaration//GEN-END:variables
}
