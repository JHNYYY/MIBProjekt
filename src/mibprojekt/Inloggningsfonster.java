/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

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

        losenordsFalt = new javax.swing.JPasswordField();
        anvandarNamnsFalt = new javax.swing.JTextField();
        inloggningsKnapp = new javax.swing.JButton();
        avbrytsKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        losenordsFalt.setText("jPasswordField1");
        losenordsFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenordsFaltActionPerformed(evt);
            }
        });

        anvandarNamnsFalt.setText("Användarnamn");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(anvandarNamnsFalt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avbrytsKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inloggningsKnapp))
                    .addComponent(losenordsFalt))
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(anvandarNamnsFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(losenordsFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inloggningsKnapp)
                    .addComponent(avbrytsKnapp))
                .addContainerGap(115, Short.MAX_VALUE))
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
        /* Gör så att man kan logga in, när man inte skriver in något får man 
        felmeddelande samt vid fel användarnamn eller lösenord
        */
       
        String fraga1 = "";
        String fraga2 = "";
        String svar1 = "";
        String svar2 = "";

        /* if (anvandare.isEmpty() && losenord.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prova skriv igen, rutorna är tomma");
        } */
        
        try {

            fraga1 = "SELECT Agent_ID FROM Agent where namn='" + anvandarNamnsFalt.getText() + "'";

            svar1 = idb.fetchSingle(fraga1);
            fraga2 = "SELECT losenord FROM Agent where Agent_ID=" + svar1;
            svar2 = idb.fetchSingle(fraga2);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internt felmeddelande");

        }

        if (losenordsFalt.getText().equals(svar2)) {
            JOptionPane.showMessageDialog(null, "Inloggningen lyckades!");
            // Loggas in i nytt fönster 
            new AgentInloggningsVal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
            anvandarNamnsFalt.requestFocus();

        }
    }//GEN-LAST:event_inloggningsKnappActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anvandarNamnsFalt;
    private javax.swing.JButton avbrytsKnapp;
    private javax.swing.JButton inloggningsKnapp;
    private javax.swing.JPasswordField losenordsFalt;
    // End of variables declaration//GEN-END:variables
}
