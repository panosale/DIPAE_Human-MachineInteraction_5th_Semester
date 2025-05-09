/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ergastirio3;

/**
 *
 * @author Panagiotis
 */
public class Askisi3 extends javax.swing.JFrame {

    /**
     * Creates new form Askisi3
     */
    public Askisi3() {
        initComponents();
        lbl_Aksia.setText(previousSelectedHousePrice);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp_Houses = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfld_Kefalaio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfld_Epitokio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfld_Diarkeia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtn_House1 = new javax.swing.JRadioButton();
        rbtn_House2 = new javax.swing.JRadioButton();
        rbtn_House3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_Aksia = new javax.swing.JLabel();
        btn_YpologismosDosis = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_DosiAnaMina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Αγορά Σπιτιού");
        setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Στοιχεία Δανείου"));
        jPanel2.setForeground(new java.awt.Color(220, 220, 220));

        jLabel1.setDisplayedMnemonic('K');
        jLabel1.setLabelFor(txtfld_Kefalaio);
        jLabel1.setText("Κεφάλαιο:");
        jLabel1.setDisplayedMnemonicIndex(0);

        txtfld_Kefalaio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfld_Kefalaio.setText("0");

        jLabel2.setDisplayedMnemonic('E');
        jLabel2.setLabelFor(txtfld_Epitokio);
        jLabel2.setText("Επιτόκιο:");
        jLabel2.setDisplayedMnemonicIndex(0);

        txtfld_Epitokio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfld_Epitokio.setText("0");

        jLabel3.setDisplayedMnemonic('D');
        jLabel3.setLabelFor(txtfld_Diarkeia);
        jLabel3.setText("Διάρκεια:");
        jLabel3.setDisplayedMnemonicIndex(0);

        txtfld_Diarkeia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfld_Diarkeia.setText("0");

        jLabel4.setText("μήνες");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfld_Diarkeia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtfld_Epitokio)
                        .addComponent(txtfld_Kefalaio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfld_Kefalaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfld_Epitokio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfld_Diarkeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Διαθέσιμα Σπίτια"));

        btngrp_Houses.add(rbtn_House1);
        rbtn_House1.setMnemonic('1');
        rbtn_House1.setSelected(true);
        rbtn_House1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtn_House1.setBorderPainted(true);
        rbtn_House1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/ChatsworthHouse.jpg"))); // NOI18N
        rbtn_House1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/ChatsworthHousePressed.jpg"))); // NOI18N
        rbtn_House1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/ChatsworthHousePressed.jpg"))); // NOI18N
        rbtn_House1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/ChatsworthHousePressed.jpg"))); // NOI18N
        rbtn_House1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtn_House1ItemStateChanged(evt);
            }
        });
        rbtn_House1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbtn_House1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbtn_House1MouseExited(evt);
            }
        });

        btngrp_Houses.add(rbtn_House2);
        rbtn_House2.setMnemonic('2');
        rbtn_House2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtn_House2.setBorderPainted(true);
        rbtn_House2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/queen_house.jpg"))); // NOI18N
        rbtn_House2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/queen_housePressed.jpg"))); // NOI18N
        rbtn_House2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/queen_housePressed.jpg"))); // NOI18N
        rbtn_House2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/queen_housePressed.jpg"))); // NOI18N
        rbtn_House2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtn_House2ItemStateChanged(evt);
            }
        });
        rbtn_House2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbtn_House2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbtn_House2MouseExited(evt);
            }
        });

        btngrp_Houses.add(rbtn_House3);
        rbtn_House3.setMnemonic('3');
        rbtn_House3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtn_House3.setBorderPainted(true);
        rbtn_House3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/white_house.jpg"))); // NOI18N
        rbtn_House3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/white_housePressed.jpg"))); // NOI18N
        rbtn_House3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/white_housePressed.jpg"))); // NOI18N
        rbtn_House3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ergastirio3/white_housePressed.jpg"))); // NOI18N
        rbtn_House3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtn_House3ItemStateChanged(evt);
            }
        });
        rbtn_House3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbtn_House3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbtn_House3MouseExited(evt);
            }
        });

        jLabel7.setText("Αξία:");

        lbl_Aksia.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Aksia))
                    .addComponent(rbtn_House2)
                    .addComponent(rbtn_House3)
                    .addComponent(rbtn_House1))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rbtn_House1)
                .addGap(18, 18, 18)
                .addComponent(rbtn_House2)
                .addGap(18, 18, 18)
                .addComponent(rbtn_House3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_Aksia))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btn_YpologismosDosis.setMnemonic('Y');
        btn_YpologismosDosis.setText("Υπολογισμός δόσης");
        btn_YpologismosDosis.setActionCommand("Υπολογισμός Δόσης");
        btn_YpologismosDosis.setDisplayedMnemonicIndex(0);
        btn_YpologismosDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_YpologismosDosisActionPerformed(evt);
            }
        });

        jLabel5.setText("Δόση ανά μήνα:");

        lbl_DosiAnaMina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_DosiAnaMina.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_YpologismosDosis)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_DosiAnaMina)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_YpologismosDosis)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbl_DosiAnaMina))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_House1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtn_House1ItemStateChanged
        // TODO add your handling code here:
        previousSelectedHousePrice = "3000000";
        lbl_Aksia.setText(previousSelectedHousePrice);
    }//GEN-LAST:event_rbtn_House1ItemStateChanged

    private void rbtn_House2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtn_House2ItemStateChanged
        // TODO add your handling code here:
        previousSelectedHousePrice = "5000000";
        lbl_Aksia.setText(previousSelectedHousePrice);
    }//GEN-LAST:event_rbtn_House2ItemStateChanged

    private void rbtn_House3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtn_House3ItemStateChanged
        // TODO add your handling code here:
        previousSelectedHousePrice = "4000000";
        lbl_Aksia.setText(previousSelectedHousePrice);
    }//GEN-LAST:event_rbtn_House3ItemStateChanged

    private void rbtn_House1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_House1MouseEntered
        // TODO add your handling code here:
        lbl_Aksia.setText("3000000");

    }//GEN-LAST:event_rbtn_House1MouseEntered

    private void rbtn_House1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_House1MouseExited
        // TODO add your handling code here:
        lbl_Aksia.setText(previousSelectedHousePrice);
    }//GEN-LAST:event_rbtn_House1MouseExited

    private void rbtn_House2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_House2MouseEntered
        // TODO add your handling code here:
        lbl_Aksia.setText("5000000");
    }//GEN-LAST:event_rbtn_House2MouseEntered

    private void rbtn_House2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_House2MouseExited
        // TODO add your handling code here:
        lbl_Aksia.setText(previousSelectedHousePrice);
    }//GEN-LAST:event_rbtn_House2MouseExited

    private void rbtn_House3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_House3MouseEntered
        // TODO add your handling code here:
        lbl_Aksia.setText("4000000");
    }//GEN-LAST:event_rbtn_House3MouseEntered

    private void rbtn_House3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_House3MouseExited
        // TODO add your handling code here:
        lbl_Aksia.setText(previousSelectedHousePrice);
    }//GEN-LAST:event_rbtn_House3MouseExited

    private void btn_YpologismosDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_YpologismosDosisActionPerformed
        // TODO add your handling code here:
        Double tmpAksia = Double.valueOf(lbl_Aksia.getText());
        Double tmpKefalaio = Double.valueOf(txtfld_Kefalaio.getText());
        Double tmpEpitokio = Double.valueOf(txtfld_Epitokio.getText());
        Integer tmpDiarkeia = Integer.valueOf(txtfld_Diarkeia.getText());
        Double tmpDosiAnaMina;
        if (tmpEpitokio != 0)
            tmpDosiAnaMina = ((tmpAksia - tmpKefalaio) * (1 + (tmpEpitokio / 100))) / tmpDiarkeia;
        else
            tmpDosiAnaMina = (tmpAksia - tmpKefalaio) / tmpDiarkeia;
        lbl_DosiAnaMina.setText(String.valueOf(tmpDosiAnaMina));
    }//GEN-LAST:event_btn_YpologismosDosisActionPerformed

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
            java.util.logging.Logger.getLogger(Askisi3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Askisi3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Askisi3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Askisi3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Askisi3().setVisible(true);
            }
        });
    }
    // Global Variables & Constants - START
    String previousSelectedHousePrice = "3000000";
    // Global Variables & Constants - END

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_YpologismosDosis;
    private javax.swing.ButtonGroup btngrp_Houses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Aksia;
    private javax.swing.JLabel lbl_DosiAnaMina;
    private javax.swing.JRadioButton rbtn_House1;
    private javax.swing.JRadioButton rbtn_House2;
    private javax.swing.JRadioButton rbtn_House3;
    private javax.swing.JTextField txtfld_Diarkeia;
    private javax.swing.JTextField txtfld_Epitokio;
    private javax.swing.JTextField txtfld_Kefalaio;
    // End of variables declaration//GEN-END:variables
}
