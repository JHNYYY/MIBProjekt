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
//Klassen för inloggningsval efter inloggning med administratörkonto.
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
        TaBortAgentKnapp = new javax.swing.JToggleButton();
        ÄndraOmrådeschefsKnapp = new javax.swing.JToggleButton();
        ÄndraKontorsChefsKnapp = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(204, 255, 204));

        AndraLosenordAdminKnapp.setBackground(new java.awt.Color(204, 204, 255));
        AndraLosenordAdminKnapp.setForeground(new java.awt.Color(255, 255, 255));
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

        TaBortAlienKnapp.setBackground(new java.awt.Color(0, 153, 153));
        TaBortAlienKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TaBortAlienKnapp.setForeground(new java.awt.Color(204, 204, 204));
        TaBortAlienKnapp.setText("Ta bort Alien");
        TaBortAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortAlienKnappActionPerformed(evt);
            }
        });

        TaBortUtrustningsKnapp.setBackground(new java.awt.Color(0, 153, 153));
        TaBortUtrustningsKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TaBortUtrustningsKnapp.setForeground(new java.awt.Color(204, 204, 204));
        TaBortUtrustningsKnapp.setText("Ta bort Utrustning");
        TaBortUtrustningsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortUtrustningsKnappActionPerformed(evt);
            }
        });

        SökInfoAgentKnapp.setBackground(new java.awt.Color(0, 153, 153));
        SökInfoAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        SökInfoAgentKnapp.setForeground(new java.awt.Color(204, 204, 204));
        SökInfoAgentKnapp.setText("Sök Information om Agent");
        SökInfoAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SökInfoAgentKnappActionPerformed(evt);
            }
        });

        ÄndraInfoAlienKnapp.setBackground(new java.awt.Color(0, 153, 153));
        ÄndraInfoAlienKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ÄndraInfoAlienKnapp.setForeground(new java.awt.Color(204, 204, 204));
        ÄndraInfoAlienKnapp.setText("Ändra Information om Alien");
        ÄndraInfoAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraInfoAlienKnappActionPerformed(evt);
            }
        });

        RegistreraAgentKnapp.setBackground(new java.awt.Color(0, 153, 153));
        RegistreraAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        RegistreraAgentKnapp.setForeground(new java.awt.Color(204, 204, 204));
        RegistreraAgentKnapp.setText("Registrera en Agent");
        RegistreraAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraAgentKnappActionPerformed(evt);
            }
        });

        RegistreraAlienKnapp.setBackground(new java.awt.Color(0, 153, 153));
        RegistreraAlienKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        RegistreraAlienKnapp.setForeground(new java.awt.Color(204, 204, 204));
        RegistreraAlienKnapp.setText("Registrera en Alien");
        RegistreraAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraAlienKnappActionPerformed(evt);
            }
        });

        ÄndraInfoAgentKnapp.setBackground(new java.awt.Color(0, 153, 153));
        ÄndraInfoAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ÄndraInfoAgentKnapp.setForeground(new java.awt.Color(204, 204, 204));
        ÄndraInfoAgentKnapp.setText("Ändra information om Agent");
        ÄndraInfoAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraInfoAgentKnappActionPerformed(evt);
            }
        });

        TaBortAgentKnapp.setBackground(new java.awt.Color(0, 153, 153));
        TaBortAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TaBortAgentKnapp.setForeground(new java.awt.Color(204, 204, 204));
        TaBortAgentKnapp.setText("Ta bort Agent");
        TaBortAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortAgentKnappActionPerformed(evt);
            }
        });

        ÄndraOmrådeschefsKnapp.setBackground(new java.awt.Color(0, 153, 153));
        ÄndraOmrådeschefsKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ÄndraOmrådeschefsKnapp.setForeground(new java.awt.Color(204, 204, 204));
        ÄndraOmrådeschefsKnapp.setText("Ändra områdeschef ");
        ÄndraOmrådeschefsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraOmrådeschefsKnappActionPerformed(evt);
            }
        });

        ÄndraKontorsChefsKnapp.setBackground(new java.awt.Color(0, 153, 153));
        ÄndraKontorsChefsKnapp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ÄndraKontorsChefsKnapp.setForeground(new java.awt.Color(204, 204, 204));
        ÄndraKontorsChefsKnapp.setText("Ändra kontorschef");
        ÄndraKontorsChefsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraKontorsChefsKnappActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Användarhantering");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Användarinformation");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mibprojekt/agenticon1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ÄndraInfoAlienKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SökInfoAgentKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ÄndraInfoAgentKnapp)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RegistreraAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RegistreraAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TaBortUtrustningsKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ÄndraOmrådeschefsKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ÄndraKontorsChefsKnapp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TaBortAgentKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(TaBortAlienKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AndraLosenordAdminKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextKontoInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ÄndraKontorsChefsKnapp)
                            .addComponent(SökInfoAgentKnapp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ÄndraOmrådeschefsKnapp)
                            .addComponent(ÄndraInfoAlienKnapp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaBortAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaBortAlienKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaBortUtrustningsKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegistreraAgentKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextKontoInstallningar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AndraLosenordAdminKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)))
                .addComponent(RegistreraAlienKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ÄndraInfoAgentKnapp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        new RegistreraAgent().setVisible(true);
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

    private void ÄndraInfoAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraInfoAgentKnappActionPerformed
        new ÄndraInfoOmAgent().setVisible(true);
    }//GEN-LAST:event_ÄndraInfoAgentKnappActionPerformed

    private void RegistreraAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraAlienKnappActionPerformed
        new RegistreraAlien().setVisible(true);
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
    private javax.swing.JButton AndraLosenordAdminKnapp;
    private javax.swing.JToggleButton RegistreraAgentKnapp;
    private javax.swing.JToggleButton RegistreraAlienKnapp;
    private javax.swing.JToggleButton SökInfoAgentKnapp;
    private javax.swing.JToggleButton TaBortAgentKnapp;
    private javax.swing.JToggleButton TaBortAlienKnapp;
    private javax.swing.JToggleButton TaBortUtrustningsKnapp;
    private javax.swing.JLabel TextKontoInstallningar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton ÄndraInfoAgentKnapp;
    private javax.swing.JToggleButton ÄndraInfoAlienKnapp;
    private javax.swing.JToggleButton ÄndraKontorsChefsKnapp;
    private javax.swing.JToggleButton ÄndraOmrådeschefsKnapp;
    // End of variables declaration//GEN-END:variables
}
