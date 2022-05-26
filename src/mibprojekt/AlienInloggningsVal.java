/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author johannilsson
 */
public class AlienInloggningsVal extends javax.swing.JFrame {
    //Menyval efter inloggning av en alien.
    private static InfDB idb;


    /**
     * Creates new form AlienInloggningsVal
     */
    public AlienInloggningsVal() {
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

        andralosenordAlien = new javax.swing.JButton();
        VisaInfoAnsvarigAgent = new javax.swing.JButton();
        TextKontoInstallningar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextKontoInstallningar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        andralosenordAlien.setBackground(new java.awt.Color(204, 204, 255));
        andralosenordAlien.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        andralosenordAlien.setForeground(new java.awt.Color(255, 255, 255));
        andralosenordAlien.setText("Ändra Lösenord");
        andralosenordAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andralosenordAlienActionPerformed(evt);
            }
        });

        VisaInfoAnsvarigAgent.setBackground(new java.awt.Color(0, 153, 153));
        VisaInfoAnsvarigAgent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        VisaInfoAnsvarigAgent.setForeground(new java.awt.Color(255, 255, 255));
        VisaInfoAnsvarigAgent.setText("Visa information om ansvarig agent");
        VisaInfoAnsvarigAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaInfoAnsvarigAgentActionPerformed(evt);
            }
        });

        TextKontoInstallningar.setBackground(new java.awt.Color(255, 255, 255));
        TextKontoInstallningar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextKontoInstallningar.setForeground(new java.awt.Color(255, 255, 255));
        TextKontoInstallningar.setText("Användarval:");
        TextKontoInstallningar.setToolTipText("Klicka på knapparna under för att ändra dina kontoinställningar.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mibprojekt/alienicon.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        TextKontoInstallningar1.setBackground(new java.awt.Color(255, 255, 255));
        TextKontoInstallningar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextKontoInstallningar1.setForeground(new java.awt.Color(255, 255, 255));
        TextKontoInstallningar1.setText("Kontoinställningar");
        TextKontoInstallningar1.setToolTipText("Klicka på knapparna under för att ändra dina kontoinställningar.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextKontoInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VisaInfoAnsvarigAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(andralosenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(508, Short.MAX_VALUE)
                    .addComponent(TextKontoInstallningar1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TextKontoInstallningar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andralosenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VisaInfoAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(TextKontoInstallningar1)
                    .addContainerGap(284, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andralosenordAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andralosenordAlienActionPerformed
        new AlienLosenordsAndringsRuta().setVisible(true);
    }//GEN-LAST:event_andralosenordAlienActionPerformed

    private void VisaInfoAnsvarigAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaInfoAnsvarigAgentActionPerformed
        new AlienVisaInfoOmAnsvarigAgent().setVisible(true);
    }//GEN-LAST:event_VisaInfoAnsvarigAgentActionPerformed

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
            java.util.logging.Logger.getLogger(AlienInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienInloggningsVal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextKontoInstallningar;
    private javax.swing.JLabel TextKontoInstallningar1;
    private javax.swing.JButton VisaInfoAnsvarigAgent;
    private javax.swing.JButton andralosenordAlien;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
