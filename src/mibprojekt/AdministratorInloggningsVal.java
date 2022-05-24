/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibprojekt;

/**
 *
 * @author johannilsson
 */
public class AdministratorInloggningsVal extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorInloggningsVal
     */
    public AdministratorInloggningsVal() {
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

        AndraLosenordAdminKnapp = new javax.swing.JButton();
        TextKontoInstallningar = new javax.swing.JLabel();
        TaBortAlienKnapp = new javax.swing.JToggleButton();
        TaBortUtrustningsKnapp = new javax.swing.JToggleButton();
        SökInfoAgentKnapp = new javax.swing.JToggleButton();
        ÄndraInfoAlienKnapp = new javax.swing.JToggleButton();
        RegistreraAgentKnapp = new javax.swing.JToggleButton();
        RegistreraAlienKnapp = new javax.swing.JToggleButton();
        ÄndraInfoAgentKnapp = new javax.swing.JToggleButton();
        AdminStatusAgentKnapp = new javax.swing.JToggleButton();
        TaBortAgentKnapp = new javax.swing.JToggleButton();
        ÄndraOmrådeschefsKnapp = new javax.swing.JToggleButton();
        ÄndraKontorsChefsKnapp = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AndraLosenordAdminKnapp.setBackground(new java.awt.Color(204, 204, 255));
        AndraLosenordAdminKnapp.setText("Ändra Lösenord");
        AndraLosenordAdminKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraLosenordAdminKnappActionPerformed(evt);
            }
        });

        TextKontoInstallningar.setBackground(new java.awt.Color(255, 255, 255));
        TextKontoInstallningar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextKontoInstallningar.setForeground(new java.awt.Color(255, 255, 255));
        TextKontoInstallningar.setText("Kontoinställningar");
        TextKontoInstallningar.setToolTipText("Klicka på knapparna under för att ändra dina kontoinställningar.");

        TaBortAlienKnapp.setText("Ta bort Alien");
        TaBortAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortAlienKnappActionPerformed(evt);
            }
        });

        TaBortUtrustningsKnapp.setText("Ta bort Utrustning");
        TaBortUtrustningsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortUtrustningsKnappActionPerformed(evt);
            }
        });

        SökInfoAgentKnapp.setText("Sök Information om Agent");
        SökInfoAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SökInfoAgentKnappActionPerformed(evt);
            }
        });

        ÄndraInfoAlienKnapp.setText("Ändra Information om Alien");
        ÄndraInfoAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraInfoAlienKnappActionPerformed(evt);
            }
        });

        RegistreraAgentKnapp.setText("Registrera en Agent");
        RegistreraAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraAgentKnappActionPerformed(evt);
            }
        });

        RegistreraAlienKnapp.setText("Registrera en Alien");
        RegistreraAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraAlienKnappActionPerformed(evt);
            }
        });

        ÄndraInfoAgentKnapp.setText("Ändra information om Agent");
        ÄndraInfoAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraInfoAgentKnappActionPerformed(evt);
            }
        });

        AdminStatusAgentKnapp.setText("Ge Adminstatus till Agent");
        AdminStatusAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminStatusAgentKnappActionPerformed(evt);
            }
        });

        TaBortAgentKnapp.setText("Ta bort Agent");
        TaBortAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortAgentKnappActionPerformed(evt);
            }
        });

        ÄndraOmrådeschefsKnapp.setText("Ändra områdeschef ");
        ÄndraOmrådeschefsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraOmrådeschefsKnappActionPerformed(evt);
            }
        });

        ÄndraKontorsChefsKnapp.setText("Ändra kontorschef");
        ÄndraKontorsChefsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraKontorsChefsKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SökInfoAgentKnapp)
                        .addGap(56, 56, 56)
                        .addComponent(TaBortAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AndraLosenordAdminKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ÄndraInfoAgentKnapp)
                            .addComponent(ÄndraOmrådeschefsKnapp)
                            .addComponent(ÄndraKontorsChefsKnapp)
                            .addComponent(RegistreraAgentKnapp))
                        .addContainerGap(477, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegistreraAlienKnapp)
                            .addComponent(AdminStatusAgentKnapp)
                            .addComponent(ÄndraInfoAlienKnapp))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TaBortUtrustningsKnapp)
                            .addComponent(TaBortAlienKnapp))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextKontoInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(TextKontoInstallningar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AndraLosenordAdminKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SökInfoAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegistreraAlienKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ÄndraInfoAlienKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegistreraAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ÄndraInfoAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdminStatusAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ÄndraOmrådeschefsKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ÄndraKontorsChefsKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TaBortAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaBortAlienKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaBortUtrustningsKnapp)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AndraLosenordAdminKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraLosenordAdminKnappActionPerformed
        new AgentOchAdminLosenordsAndringsRuta().setVisible(true);
    }//GEN-LAST:event_AndraLosenordAdminKnappActionPerformed

    private void SökInfoAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SökInfoAgentKnappActionPerformed
       new SökInformationOmAgent().setVisible(true);
    }//GEN-LAST:event_SökInfoAgentKnappActionPerformed

    private void ÄndraInfoAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraInfoAlienKnappActionPerformed
        new ÄndraInfoOmAlien().setVisible(true);
    }//GEN-LAST:event_ÄndraInfoAlienKnappActionPerformed

    private void RegistreraAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraAgentKnappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistreraAgentKnappActionPerformed

    private void TaBortAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaBortAgentKnappActionPerformed
        new TaBortAgent().setVisible(true);
    }//GEN-LAST:event_TaBortAgentKnappActionPerformed

    private void TaBortAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaBortAlienKnappActionPerformed
        new TaBortAlien().setVisible(true);
    }//GEN-LAST:event_TaBortAlienKnappActionPerformed

    private void TaBortUtrustningsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaBortUtrustningsKnappActionPerformed
        new TaBortUtrustning().setVisible(true);
    }//GEN-LAST:event_TaBortUtrustningsKnappActionPerformed

    private void ÄndraKontorsChefsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraKontorsChefsKnappActionPerformed
    new ÄndraKontorsChef().setVisible(true);
    }//GEN-LAST:event_ÄndraKontorsChefsKnappActionPerformed

    private void ÄndraOmrådeschefsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraOmrådeschefsKnappActionPerformed
    new ÄndraOmrådesChef().setVisible(true);
    }//GEN-LAST:event_ÄndraOmrådeschefsKnappActionPerformed

    private void AdminStatusAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminStatusAgentKnappActionPerformed
    new GeAgentAdminStatus().setVisible(true);
    }//GEN-LAST:event_AdminStatusAgentKnappActionPerformed

    private void ÄndraInfoAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraInfoAgentKnappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÄndraInfoAgentKnappActionPerformed

    private void RegistreraAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraAlienKnappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistreraAlienKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorInloggningsVal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorInloggningsVal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AdminStatusAgentKnapp;
    private javax.swing.JButton AndraLosenordAdminKnapp;
    private javax.swing.JToggleButton RegistreraAgentKnapp;
    private javax.swing.JToggleButton RegistreraAlienKnapp;
    private javax.swing.JToggleButton SökInfoAgentKnapp;
    private javax.swing.JToggleButton TaBortAgentKnapp;
    private javax.swing.JToggleButton TaBortAlienKnapp;
    private javax.swing.JToggleButton TaBortUtrustningsKnapp;
    private javax.swing.JLabel TextKontoInstallningar;
    private javax.swing.JToggleButton ÄndraInfoAgentKnapp;
    private javax.swing.JToggleButton ÄndraInfoAlienKnapp;
    private javax.swing.JToggleButton ÄndraKontorsChefsKnapp;
    private javax.swing.JToggleButton ÄndraOmrådeschefsKnapp;
    // End of variables declaration//GEN-END:variables
}
