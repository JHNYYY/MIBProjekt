/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;



/**
 *
 * @author johannilsson
 */
public class Inloggningsfonster extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form Inloggning
     */
    public Inloggningsfonster() {
        
        
                
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        losenordsFalt = new javax.swing.JPasswordField();
        anvandarNamnsFalt = new javax.swing.JTextField();
        inloggningsKnapp = new javax.swing.JButton();
        avbrytsKnapp = new javax.swing.JButton();
        LoggaInSomText = new javax.swing.JLabel();
        AlienCheckBox = new javax.swing.JCheckBox();
        AgentCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        losenordsFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenordsFaltActionPerformed(evt);
            }
        });

        anvandarNamnsFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anvandarNamnsFaltActionPerformed(evt);
            }
        });

        inloggningsKnapp.setText("Logga in");
        inloggningsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inloggningsKnappActionPerformed(evt);
            }
        });

        avbrytsKnapp.setText("Avbryt");
        avbrytsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytsKnappActionPerformed(evt);
            }
        });

        LoggaInSomText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LoggaInSomText.setText("Logga in ");

        buttonGroup1.add(AlienCheckBox);
        AlienCheckBox.setText("Alien");
        AlienCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlienCheckBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(AgentCheckBox);
        AgentCheckBox.setText("Agent");
        AgentCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentCheckBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Lösenord:");

        jLabel2.setText("Namn:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anvandarNamnsFalt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(losenordsFalt)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(avbrytsKnapp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inloggningsKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(AgentCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(AlienCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(LoggaInSomText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(LoggaInSomText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlienCheckBox)
                    .addComponent(AgentCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anvandarNamnsFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenordsFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avbrytsKnapp)
                    .addComponent(inloggningsKnapp))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avbrytsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytsKnappActionPerformed
        // Gör så att man kan avbryta inloggningen
        System.exit(0);
    }//GEN-LAST:event_avbrytsKnappActionPerformed

    private void anvandarNamnsFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anvandarNamnsFaltActionPerformed
        
    }//GEN-LAST:event_anvandarNamnsFaltActionPerformed

    private void losenordsFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenordsFaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_losenordsFaltActionPerformed

    private void inloggningsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inloggningsKnappActionPerformed
        /* Gör så att man kan logga in */

        String fraga1 = "";
        String fraga2 = "";
        String fraga3 = "";
        String fraga4 = "";
        String fraga5 = "";
        String svar1 = "";
        String svar2 = "";
        String svar3 = "";
        String svar4 = "";
        String svar5 = "";
        
        if (Validering.textFaltHarVarde(anvandarNamnsFalt)) {
            
        if (Validering.textLösenordHarVärde(losenordsFalt))
        if (Validering.inteSpace(anvandarNamnsFalt))
            if (Validering.inteSpaceLosenord(losenordsFalt))
        try {

            fraga1 = "SELECT Agent_ID FROM Agent where namn='" + anvandarNamnsFalt.getText() + "'";
            svar1 = idb.fetchSingle(fraga1);
            fraga2 = "SELECT losenord FROM Agent where Agent_ID=" + svar1;
            svar2 = idb.fetchSingle(fraga2);

            fraga3 = "SELECT Alien_ID FROM Alien where namn='" + anvandarNamnsFalt.getText() + "'";
            svar3 = idb.fetchSingle(fraga3);
            fraga4 = "SELECT losenord FROM Alien where Alien_ID=" + svar3;
            svar4 = idb.fetchSingle(fraga4);
            
            

            
            fraga5 = "Select Administrator FROM agent WHERE Agent_ID =" + svar1;
            svar5 = idb.fetchSingle(fraga5);

            if (AgentCheckBox.isSelected() && losenordsFalt.getText().equals(svar2) && svar5.equals("N")) {
                JOptionPane.showMessageDialog(null, "Inloggningen lyckades!");
                new AgentInloggningsVal().setVisible(true);

            } else if (AlienCheckBox.isSelected() && losenordsFalt.getText().equals(svar4)) {
                JOptionPane.showMessageDialog(null, "Inloggningen lyckades!");
                new AlienInloggningsVal().setVisible(true);
                
            } else if (AgentCheckBox.isSelected() && losenordsFalt.getText().equals(svar2) && svar5.equals("J")) {
                JOptionPane.showMessageDialog(null, "Inloggningen lyckades!");
                new AdministratorInloggningsVal().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                anvandarNamnsFalt.requestFocus();

            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Du har tryckt i fel kategori");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Internt felmeddelande");

        }
        
       
} 
    }//GEN-LAST:event_inloggningsKnappActionPerformed

    private void AgentCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgentCheckBoxActionPerformed

    private void AlienCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlienCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlienCheckBoxActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AgentCheckBox;
    private javax.swing.JCheckBox AlienCheckBox;
    private javax.swing.JLabel LoggaInSomText;
    private javax.swing.JTextField anvandarNamnsFalt;
    private javax.swing.JButton avbrytsKnapp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton inloggningsKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField losenordsFalt;
    // End of variables declaration//GEN-END:variables
}
