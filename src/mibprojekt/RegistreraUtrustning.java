/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author johannilsson
 */
public class RegistreraUtrustning extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form RegistreraUtrustning
     */
    public RegistreraUtrustning() {
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

        uNamn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        registrerautrustningsknapp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        skapaIDKnapp = new javax.swing.JButton();
        idlabel = new javax.swing.JLabel();
        comboboxvapentyp = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtrutaförvaldtyp = new javax.swing.JTextField();
        labelVisaTextOmTypVapen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        uNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNamnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registrera Utrustning ");

        registrerautrustningsknapp.setText("Registrera");
        registrerautrustningsknapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrerautrustningsknappActionPerformed(evt);
            }
        });

        jLabel2.setText("Namn:");

        skapaIDKnapp.setText("Generera ID");
        skapaIDKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skapaIDKnappActionPerformed(evt);
            }
        });

        idlabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        idlabel.setText("....");

        comboboxvapentyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Vapen", "Kommunikation", "Teknik" }));
        comboboxvapentyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxvapentypActionPerformed(evt);
            }
        });

        jLabel3.setText("Välj typ:");

        labelVisaTextOmTypVapen.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(skapaIDKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(comboboxvapentyp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelVisaTextOmTypVapen)
                                .addGap(43, 43, 43)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(uNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(registrerautrustningsknapp, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                        .addComponent(txtrutaförvaldtyp))
                                    .addGap(21, 21, 21))))))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skapaIDKnapp)
                    .addComponent(idlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboboxvapentyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrutaförvaldtyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVisaTextOmTypVapen))
                .addGap(18, 18, 18)
                .addComponent(registrerautrustningsknapp)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrerautrustningsknappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrerautrustningsknappActionPerformed
            
        if (Validering.textFaltHarVarde(uNamn)) {
            if (Validering.inteSpace(uNamn))
                
            
             
             
             try {

                String namnet = uNamn.getText();
                int nummer = Integer.parseInt(idlabel.getText());

                if (comboboxvapentyp.getSelectedItem().toString().equals("Vapen")) {
                    int nummer1 = Integer.parseInt(txtrutaförvaldtyp.getText());
                    String fraga1 = "INSERT INTO Utrustning VALUES (" + nummer + ",'" + namnet + "')";
                    idb.fetchSingle(fraga1);

                    String fraga2 = "INSERT INTO Vapen VALUES (" + nummer + "," + txtrutaförvaldtyp.getText() + ")";
                    idb.fetchSingle(fraga2);

                    JOptionPane.showMessageDialog(null, "Du har registrerat: " + uNamn.getText() + ""
                            + "\nAntal Kaliber: " + txtrutaförvaldtyp.getText() + "");

                } else if (comboboxvapentyp.getSelectedItem().toString().equals("Kommunikation")) {
                    JOptionPane.showMessageDialog(null, "Du har registrerat: " + uNamn.getText() + ""
                            + "\nÖverföringsteknik: " + txtrutaförvaldtyp.getText() + "");
                    String fraga1 = "INSERT INTO Utrustning VALUES (" + nummer + ",'" + namnet + "')";
                    idb.fetchSingle(fraga1);
                    String fraga2 = "INSERT INTO Kommunikation VALUES (" + nummer + ",'" + txtrutaförvaldtyp.getText() + "')";
                    idb.fetchSingle(fraga2);
                } else if (comboboxvapentyp.getSelectedItem().toString().equals("Teknik")) {
                    JOptionPane.showMessageDialog(null, "Du har registrerat: " + uNamn.getText() + ""
                            + "\nKraftkälla: " + txtrutaförvaldtyp.getText() + "");
                    String fraga1 = "INSERT INTO Utrustning VALUES (" + nummer + ",'" + namnet + "')";
                    idb.fetchSingle(fraga1);
                    String fraga2 = "INSERT INTO Teknik VALUES (" + nummer + ",'" + txtrutaförvaldtyp.getText() + "')";
                    idb.fetchSingle(fraga2);
                } else {
                    JOptionPane.showMessageDialog(null, "Vänligen välj en utrustningstyp!");
                }

            } catch (InfException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Vänligen skriv in en siffra i kaliber");

            }
        }




    }//GEN-LAST:event_registrerautrustningsknappActionPerformed

    private void skapaIDKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skapaIDKnappActionPerformed
   try
     {
     String fraga1 = "SELECT Utrustnings_ID FROM utrustning";
     ArrayList svar = idb.fetchRows(fraga1);
     int visadID = (svar.size() + 1);
     
     idlabel.setText(String.valueOf(visadID));

     }
        catch (InfException e)
        {
           JOptionPane.showMessageDialog(null, "Ett fel uppstod.");
        }
    }//GEN-LAST:event_skapaIDKnappActionPerformed

    private void comboboxvapentypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxvapentypActionPerformed
    switch (comboboxvapentyp.getSelectedItem().toString()) {
        case "Vapen":
            labelVisaTextOmTypVapen.setText("Kaliber: ");
            break;
        case "Kommunikation":
            labelVisaTextOmTypVapen.setText("Överföringsteknik: ");
            break;
        case "Teknik":
            labelVisaTextOmTypVapen.setText("Kraftkälla: ");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Vänligen välj en vapentyp");
            break;
    }
    }//GEN-LAST:event_comboboxvapentypActionPerformed

    private void uNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNamnActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraUtrustning().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboboxvapentyp;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelVisaTextOmTypVapen;
    private javax.swing.JButton registrerautrustningsknapp;
    private javax.swing.JButton skapaIDKnapp;
    private javax.swing.JTextField txtrutaförvaldtyp;
    private javax.swing.JTextField uNamn;
    // End of variables declaration//GEN-END:variables

}