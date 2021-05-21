/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controle.factory;
import java.awt.Color;
import javax.swing.JColorChooser;
import modele.notesM;

/**
 *
 * @author aimab
 */
public class ajouterNotes extends javax.swing.JFrame {
    public int id ;
    public ajouterNotes(int i) {
        this.id = i;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jBnDeconnexion = new javax.swing.JButton();
        jPanelFormTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPnote = new javax.swing.JTextPane();
        jTFtitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBnAjouter = new javax.swing.JButton();
        jBnAnnuler = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(17, 29, 48));
        jLabelTitle.setText("AJOUTER NOTE");

        jBnDeconnexion.setBackground(new java.awt.Color(255, 255, 255));
        jBnDeconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logout.png"))); // NOI18N
        jBnDeconnexion.setText("Deconnexion");
        jBnDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnDeconnexionActionPerformed(evt);
            }
        });

        jPanelFormTable.setBackground(new java.awt.Color(17, 29, 48));

        jTPnote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jTPnote);

        jTFtitle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Note:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titre:");

        jBnAjouter.setBackground(new java.awt.Color(255, 255, 255));
        jBnAjouter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Add-icon.png"))); // NOI18N
        jBnAjouter.setText("Ajouter");
        jBnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnAjouterActionPerformed(evt);
            }
        });

        jBnAnnuler.setBackground(new java.awt.Color(255, 255, 255));
        jBnAnnuler.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBnAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/clear.png"))); // NOI18N
        jBnAnnuler.setText("Annuler");
        jBnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormTableLayout = new javax.swing.GroupLayout(jPanelFormTable);
        jPanelFormTable.setLayout(jPanelFormTableLayout);
        jPanelFormTableLayout.setHorizontalGroup(
            jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTFtitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFormTableLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                                        .addComponent(jBnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jBnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        jPanelFormTableLayout.setVerticalGroup(
            jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnAjouter)
                    .addComponent(jBnAnnuler))
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 29, 48));
        jLabel3.setText("CopyRight@2021_Develloped by Aimable from DukoreTech");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGap(324, 324, 324))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("<  retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/color_wheel_30px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jBnDeconnexion))
                    .addComponent(jPanelFormTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitle)
                            .addComponent(jBnDeconnexion))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanelFormTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnAjouterActionPerformed
       notesM n = new notesM();
       n.setTitle(jTFtitle.getText());
       n.setTextfoto(jTPnote.getText());
       n.setUser(id);
  
      factory.insertNote(n);
      notesV nV = new notesV(id);
      nV.setVisible(true);
      this.setVisible(false);
       
        
    }//GEN-LAST:event_jBnAjouterActionPerformed

    private void jBnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnAnnulerActionPerformed
        ajouterNotes n = new ajouterNotes(id);
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBnAnnulerActionPerformed

    private void jBnDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnDeconnexionActionPerformed
        LoginV l = new LoginV();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBnDeconnexionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        notesV l = new notesV(id);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Color colorz = Color.decode("#111D30");
        colorz = JColorChooser.showDialog(this, "selectionnez la couleur ", colorz);
        if(colorz==null){
            colorz=colorz.decode("#111D30");
            jPanelFormTable.setBackground(colorz);
            jLabelTitle.setForeground(colorz);
        }
        jPanelFormTable.setBackground(colorz);
        jLabelTitle.setForeground(colorz);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(ajouterNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ajouterNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnAjouter;
    private javax.swing.JButton jBnAnnuler;
    private javax.swing.JButton jBnDeconnexion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelFormTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFtitle;
    private javax.swing.JTextPane jTPnote;
    // End of variables declaration//GEN-END:variables
}
