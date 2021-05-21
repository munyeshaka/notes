/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controle.dbConn;
import controle.factory;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modele.notesM;

/**
 *
 * @author aimab
 */
public class notesV extends javax.swing.JFrame {

    public int id;
    private DefaultTableModel model=null;
    private static Connection conn = null;
    private static Statement stm;
    private PreparedStatement pstm = null;
    private ResultSet rs = null;
    
    public notesV(int i) {
        this.id = i;
        this.model = new DefaultTableModel();
        initComponents();
        AfficherNotes();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanelFormTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNotesTitle = new javax.swing.JTable();
        jBnModify = new javax.swing.JButton();
        jBnSupprimer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneNote = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jTextTitle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLDate = new javax.swing.JLabel();
        jLNum = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelRecherche = new javax.swing.JLabel();
        ComboRecherche = new javax.swing.JComboBox();
        txtRecherche = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(17, 29, 48));
        jLabelTitle.setText("NOTES");

        jPanelFormTable.setBackground(new java.awt.Color(17, 29, 48));
        jPanelFormTable.setForeground(new java.awt.Color(255, 255, 255));

        jTableNotesTitle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Note", "Date", "num"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNotesTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNotesTitleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNotesTitle);

        jBnModify.setBackground(new java.awt.Color(255, 255, 255));
        jBnModify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/modify1.png"))); // NOI18N
        jBnModify.setText("Modifier");
        jBnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnModifyActionPerformed(evt);
            }
        });

        jBnSupprimer.setBackground(new java.awt.Color(255, 255, 255));
        jBnSupprimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/delete2.png"))); // NOI18N
        jBnSupprimer.setText("Supprimer");
        jBnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSupprimerActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Add-icon.png"))); // NOI18N
        jButton3.setText("Nouvelle note");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextPaneNote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPaneNote);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Note:");

        jTextTitle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTitleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titre:");

        jLDate.setForeground(new java.awt.Color(255, 255, 255));
        jLDate.setText(" ");

        jLNum.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelRecherche.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRecherche.setText("Recherche par");

        ComboRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Title", "Note", "Date", " " }));

        txtRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechercheActionPerformed(evt);
            }
        });
        txtRecherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRechercheFocusGained(evt);
            }
        });
        txtRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRechercheKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRechercheKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanelFormTableLayout = new javax.swing.GroupLayout(jPanelFormTable);
        jPanelFormTable.setLayout(jPanelFormTableLayout);
        jPanelFormTableLayout.setHorizontalGroup(
            jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                        .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNum, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                        .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                                .addComponent(jBnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jBnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jButton3))
                            .addComponent(jLabel2))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(27, 27, 27))))
        );
        jPanelFormTableLayout.setVerticalGroup(
            jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormTableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNum))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormTableLayout.createSequentialGroup()
                        .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1)
                        .addGap(36, 36, 36)
                        .addGroup(jPanelFormTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnModify)
                            .addComponent(jBnSupprimer)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logout.png"))); // NOI18N
        jButton4.setText("Deconnexion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 29, 48));
        jLabel3.setText("CopyRight@2021_Develloped by Aimable from DukoreTech");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(324, 324, 324))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/color_wheel_30px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121)
                        .addComponent(jButton4))
                    .addComponent(jPanelFormTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanelFormTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSupprimerActionPerformed
        notesM n = new notesM();
        n.setTitle(jTextTitle.getText());
        n.setTextfoto(jTextPaneNote.getText());
        n.setIdNote(jLNum.getText());
        n.setUser(id);
  
        factory.deleteNotes(n);
        notesV nV = new notesV(id);
        nV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBnSupprimerActionPerformed

    private void jTextTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTitleActionPerformed

    private void jBnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnModifyActionPerformed
        notesM n = new notesM();
        n.setTitle(jTextTitle.getText());
        n.setTextfoto(jTextPaneNote.getText());
        n.setIdNote(jLNum.getText());
        n.setUser(id);
  
       factory.updateNotes(n);
       notesV nV = new notesV(id);
       nV.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jBnModifyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ajouterNotes a = new ajouterNotes(id);
        a.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LoginV l = new LoginV();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTableNotesTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNotesTitleMouseClicked
        int jt = jTableNotesTitle.getSelectedRow();
        recupererNote(jt);
    }//GEN-LAST:event_jTableNotesTitleMouseClicked

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed
        //textRecherche.setText("");
    }//GEN-LAST:event_txtRechercheActionPerformed

    private void txtRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRechercheFocusGained
        txtRecherche.setText("");
    }//GEN-LAST:event_txtRechercheFocusGained

    private void txtRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRechercheKeyReleased
        try {
            if(txtRecherche.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Entrer ce que recherchez - vous SVP ! ");
            }else{

                DefaultTableModel md = new DefaultTableModel();
                md.setColumnIdentifiers(new String []{
                    "Title",
                    "Note",
                    "Date"});

            boolean test = true;

            md.setRowCount(0);
            stm = conn.createStatement();
            
            notesV nV = new notesV(id); //help me to use id in sql requete for getting id_user
            nV.setVisible(false);
            //this.setVisible(false);
            
            rs = stm.executeQuery("select title, txtfoto, date_note, id_note from notes where "+comboRech()+" LIKE '%" +txtRecherche.getText()+"%' and user = '" +id+"' ORDER BY id_note DESC ");

            while(rs.next()){
                test = false;
                md.addRow(new Object[]{
                    rs.getObject("title"),
                    rs.getObject("txtfoto"),
                    rs.getObject("date_note")

                });

                if(test){
                    JOptionPane.showMessageDialog(null," Desolez il n' y a aucun resultat sur votre recherche, reformuler votre recherche !!!");// afficher la boite de dialogue car il y a aucun résultat
                }
                jTableNotesTitle.setModel(md);

            }
        }
        } catch (HeadlessException | SQLException eaf) {
            JOptionPane.showConfirmDialog(null, "Erreur de recherche " + eaf.getLocalizedMessage());

        }
    }//GEN-LAST:event_txtRechercheKeyReleased

    private void txtRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRechercheKeyTyped
        ActualiserAffichage(id);
    }//GEN-LAST:event_txtRechercheKeyTyped

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

public void AfficherNotes(){
        model.addColumn("Title");
        model.addColumn("Note");
        model.addColumn("Date");
        model.addColumn("Num");
        
        ArrayList<notesM> rist = new ArrayList();
        //rist = factory.AfficherNotes();
        rist = factory.AfficherNotes(id);
        for(notesM pri:rist)
        {
           model.addRow(new Object[]{
                    
                 pri.getTitle(),
                 pri.getTextfoto(),
                 pri.getDate_note(),
                 pri.getIdNote(),
                   
        });
           jTableNotesTitle.setModel(model);
    }
}
    
public void recupererNote(int i){
            jTextTitle.setText(model.getValueAt(i,0).toString());
            jTextPaneNote.setText(model.getValueAt(i, 1).toString());
            jLDate.setText(model.getValueAt(i, 2).toString());
            jLNum.setText(model.getValueAt(i, 3).toString());
}

public void recuprerN(int i){
        try {
            ArrayList<notesM> noo = new ArrayList();
            noo = factory.AfficherNotes(i);
            for(notesM n:noo){
                
                jTextTitle.setText(n.getTitle());
                jTextPaneNote.setText(n.getTextfoto());
                jLDate.setText(n.getDate_note());
                jLNum.setText(n.getIdNote());
            }
        } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Probleme lors du clic sur la ligne du tableau ! " + e.getLocalizedMessage());
        }
}


  // ======Methode pour actualiser l'affichage======
public void ActualiserAffichage(int i){

    try{
        model.setRowCount(0);
        conn = dbConn.getConnection();
        stm = conn.createStatement();
        String sql = "select id_note, title,txtfoto, date_note from notes where user = '"+i+"' ORDER BY id_note DESC";

        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery();  //ResultSet declared up

        while(rs.next()){
            model.addRow(new Object[]{

                rs.getString("title"),
                rs.getString("txtfoto"),
                rs.getString("date_note"),
                rs.getString("id_note")});

        }

    } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Probleme d'actualisation d'affichage du tableau ! " + e.getLocalizedMessage());
            }
        jTableNotesTitle.setModel(model);

}  
     
// ===========Methode pour les combBox===========
public String comboRech(){
        switch (ComboRecherche.getSelectedIndex()) {
            case 0: return "title";
            case 1: return "txtfoto";
            case 2: return "date_note";
            case 3: return "id_note";

    }
    return "";
}    
    
    
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
            java.util.logging.Logger.getLogger(notesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notesV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new notesV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboRecherche;
    private javax.swing.JButton jBnModify;
    private javax.swing.JButton jBnSupprimer;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelRecherche;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelFormTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableNotesTitle;
    private javax.swing.JTextPane jTextPaneNote;
    private javax.swing.JTextField jTextTitle;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables


}
