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
public class AlienLosenordsAndringsRuta extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form AlienLosenordsAndringsRuta
     */
    public AlienLosenordsAndringsRuta() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alienNamnRuta = new javax.swing.JTextField();
        alienGammaltLösenordsRuta = new javax.swing.JPasswordField();
        alienNyttLösenordsRuta = new javax.swing.JPasswordField();
        alienÄndraLösenordsKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Ändra Lösenord");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Namn:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Gammalt Lösenord:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("Nytt Lösenord:");

        alienNamnRuta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        alienGammaltLösenordsRuta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        alienNyttLösenordsRuta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        alienÄndraLösenordsKnapp.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        alienÄndraLösenordsKnapp.setText("Ändra Lösenord");
        alienÄndraLösenordsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienÄndraLösenordsKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(alienÄndraLösenordsKnapp)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(alienNyttLösenordsRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(alienGammaltLösenordsRuta)
                                .addComponent(alienNamnRuta))
                            .addGap(14, 14, 14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alienNamnRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alienGammaltLösenordsRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(alienNyttLösenordsRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alienÄndraLösenordsKnapp)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alienÄndraLösenordsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienÄndraLösenordsKnappActionPerformed
        String anvandarnamn = alienNamnRuta.getText();
        String gammaltLosenord = alienGammaltLösenordsRuta.getText();
        String nyttLosenord = alienNyttLösenordsRuta.getText();

        try {

            String fraga1 = "SELECT Alien_ID FROM Alien where namn='" + anvandarnamn + "'";
            String svar1 = idb.fetchSingle(fraga1);

            String fraga2 = "SELECT losenord FROM Alien where Alien_ID=" + svar1;
            String svar2 = idb.fetchSingle(fraga2);
            

            if (gammaltLosenord.equals(svar2) && !gammaltLosenord.equals(nyttLosenord)) {
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
                idb.fetchSingle("UPDATE Alien SET Losenord = '" + nyttLosenord + "' WHERE Alien_ID = " + svar1);
                new AlienInloggningsVal().setVisible(true);

            } else if (gammaltLosenord.equals(nyttLosenord)) {
                JOptionPane.showMessageDialog(null, "Ville du inte byta lösenord?");
            } else {
                JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord!");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_alienÄndraLösenordsKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AlienLosenordsAndringsRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienLosenordsAndringsRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienLosenordsAndringsRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienLosenordsAndringsRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienLosenordsAndringsRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField alienGammaltLösenordsRuta;
    private javax.swing.JTextField alienNamnRuta;
    private javax.swing.JPasswordField alienNyttLösenordsRuta;
    private javax.swing.JButton alienÄndraLösenordsKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
