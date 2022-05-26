/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Anton
 */
public class AlienRasSök extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form ListaAliensRas
     */
    public AlienRasSök() {
            initComponents();
            
        
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void fyllRuta()
    {
    //oanvänd metod, sparar ifall den behövs senare.
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
        cbValjRasNamn = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfoRas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Välj ras att söka information om:");

        cbValjRasNamn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worm", "Squid", "Boglodite" }));
        cbValjRasNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjRasNamnActionPerformed(evt);
            }
        });

        txtAreaVisaInfoRas.setColumns(20);
        txtAreaVisaInfoRas.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfoRas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbValjRasNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValjRasNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbValjRasNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjRasNamnActionPerformed
        
       
        
        txtAreaVisaInfoRas.setText("");
        
        try {
            
        String fraga1 = "SELECT * FROM Worm GROUP BY Alien_ID";
        String sokt1 = idb.fetchSingle(fraga1);
        String svar1 = "SELECT Namn from Alien Where Alien_ID = "+sokt1;
        String resultat1 = idb.fetchSingle(svar1);
        
        String fraga2 = "SELECT Alien_ID FROM Squid";
        String sokt2 = idb.fetchSingle(fraga2);
        String svar2 = "SELECT Namn from Alien Where Alien_ID = "+sokt2;
        String resultat2 = idb.fetchSingle(svar2);

        String fraga3 = "SELECT Alien_ID FROM Boglodite";
        String sokt3 = idb.fetchSingle(fraga3);
        String svar3 = "SELECT Namn from Alien Where Alien_ID = "+sokt3;
        String resultat3 = idb.fetchSingle(svar3);
        
        if(cbValjRasNamn.getSelectedItem().toString().equals("Worm")) {
           txtAreaVisaInfoRas.append("Aliens: " +resultat1 + "\n" + "AlienID: " +sokt1);
        }
        
        else if(cbValjRasNamn.getSelectedItem().toString().equals("Squid")) {
            txtAreaVisaInfoRas.append("Aliens: " +resultat2 + "\n" + "AlienID: " +sokt2);
            
        }
        
        else if (cbValjRasNamn.getSelectedItem().toString().equals("Boglodite")) {
           txtAreaVisaInfoRas.append("Aliens: " +resultat3 + "\n" + "AlienID: " +sokt3);
           
            
        }
        
        } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        

        
        
    }//GEN-LAST:event_cbValjRasNamnActionPerformed

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
            java.util.logging.Logger.getLogger(AlienRasSök.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienRasSök.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienRasSök.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienRasSök.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienRasSök().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValjRasNamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVisaInfoRas;
    // End of variables declaration//GEN-END:variables
}
