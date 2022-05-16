/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

/**
 *
 * @author johannilsson
 */
public class AgentInloggningsVal extends javax.swing.JFrame {

    /**
     * Creates new form AgentInloggningsVal
     */
    public AgentInloggningsVal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VisaRegistreringAlienKnapp = new javax.swing.JButton();
        andraLosenOrdKnapp = new javax.swing.JButton();
        ÄndraInfoAlien = new javax.swing.JButton();
        PlatsSök = new javax.swing.JButton();
        RegAlienAvRas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        alienInfoSök = new javax.swing.JButton();
        RegistreraUtrustning = new javax.swing.JButton();
        OmrådeschefSök = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        VisaRegistreringAlienKnapp.setText("Registrera en alien");
        VisaRegistreringAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaRegistreringAlienKnappActionPerformed(evt);
            }
        });

        andraLosenOrdKnapp.setBackground(new java.awt.Color(204, 204, 255));
        andraLosenOrdKnapp.setText("Ändra Lösenord");
        andraLosenOrdKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenOrdKnappActionPerformed(evt);
            }
        });

        ÄndraInfoAlien.setText("Ändra information om alien");
        ÄndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraInfoAlienActionPerformed(evt);
            }
        });

        PlatsSök.setText("Plats över aliens");
        PlatsSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatsSökActionPerformed(evt);
            }
        });

        RegAlienAvRas.setText("Sök Registrerade Aliens (Ras)");
        RegAlienAvRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAlienAvRasActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kontoinställningar");
        jLabel2.setToolTipText("Klicka på knapparna under för att ändra dina kontoinställningar.");

        alienInfoSök.setText("Sök information om Alien");
        alienInfoSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienInfoSökActionPerformed(evt);
            }
        });

        RegistreraUtrustning.setText("Registrera Utrustning");
        RegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraUtrustningActionPerformed(evt);
            }
        });

        OmrådeschefSök.setText("Sök områdeschef för kontor");
        OmrådeschefSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmrådeschefSökActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VisaRegistreringAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RegAlienAvRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(andraLosenOrdKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RegistreraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PlatsSök, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alienInfoSök, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ÄndraInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OmrådeschefSök, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(407, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(andraLosenOrdKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VisaRegistreringAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegAlienAvRas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlatsSök, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistreraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OmrådeschefSök, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ÄndraInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alienInfoSök, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ÄndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraInfoAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÄndraInfoAlienActionPerformed

    private void andraLosenOrdKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenOrdKnappActionPerformed
        new LosenordsAndringsRuta().setVisible(true);
    }//GEN-LAST:event_andraLosenOrdKnappActionPerformed

    private void VisaRegistreringAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaRegistreringAlienKnappActionPerformed
        new RegistreraAlien().setVisible(true);
    }//GEN-LAST:event_VisaRegistreringAlienKnappActionPerformed

    private void PlatsSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatsSökActionPerformed
        new AlienPlatsSök().setVisible(true);
    }//GEN-LAST:event_PlatsSökActionPerformed

    private void RegAlienAvRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAlienAvRasActionPerformed
<<<<<<< HEAD
        new AlienRasSök().setVisible(true);
=======
    new AlienRasSök().setVisible(true);
>>>>>>> c10099b0e355fa54689351ab7d16ff8655ee6b51
    }//GEN-LAST:event_RegAlienAvRasActionPerformed

    private void alienInfoSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienInfoSökActionPerformed
        new AlienInfoSök().setVisible(true);
    }//GEN-LAST:event_alienInfoSökActionPerformed

    private void OmrådeschefSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmrådeschefSökActionPerformed
        new OmrådesChefSök().setVisible(true);
    }//GEN-LAST:event_OmrådeschefSökActionPerformed

    private void RegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraUtrustningActionPerformed
        new RegistreraUtrustning().setVisible(true);
    }//GEN-LAST:event_RegistreraUtrustningActionPerformed

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
            java.util.logging.Logger.getLogger(AgentInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentInloggningsVal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OmrådeschefSök;
    private javax.swing.JButton PlatsSök;
    private javax.swing.JButton RegAlienAvRas;
    private javax.swing.JButton RegistreraUtrustning;
    private javax.swing.JButton VisaRegistreringAlienKnapp;
    private javax.swing.JButton alienInfoSök;
    private javax.swing.JButton andraLosenOrdKnapp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ÄndraInfoAlien;
    // End of variables declaration//GEN-END:variables
}
