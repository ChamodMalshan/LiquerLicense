/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MiniProject;

/**
 *
 * @author ASUS
 */
public class EmpOptions extends javax.swing.JFrame {

    /**
     * Creates new form EmpOptions
     */
    public EmpOptions() {
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

        ModeUser = new javax.swing.JPanel();
        CheckStatusB = new javax.swing.JButton();
        CheckStatusB1 = new javax.swing.JButton();
        CheckStatusB2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ModeUser.setBackground(new java.awt.Color(255, 255, 255));
        ModeUser.setPreferredSize(new java.awt.Dimension(1920, 1080));

        CheckStatusB.setBackground(new java.awt.Color(204, 204, 204));
        CheckStatusB.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        CheckStatusB.setText("Assistant Commissioner of Excise");
        CheckStatusB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckStatusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStatusBActionPerformed(evt);
            }
        });

        CheckStatusB1.setBackground(new java.awt.Color(204, 204, 204));
        CheckStatusB1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        CheckStatusB1.setText("Superintendent of Excise");
        CheckStatusB1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckStatusB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStatusB1ActionPerformed(evt);
            }
        });

        CheckStatusB2.setBackground(new java.awt.Color(204, 204, 204));
        CheckStatusB2.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        CheckStatusB2.setText("Excise inspector");
        CheckStatusB2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckStatusB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStatusB2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModeUserLayout = new javax.swing.GroupLayout(ModeUser);
        ModeUser.setLayout(ModeUserLayout);
        ModeUserLayout.setHorizontalGroup(
            ModeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModeUserLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addGroup(ModeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckStatusB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckStatusB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckStatusB2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(768, Short.MAX_VALUE))
        );
        ModeUserLayout.setVerticalGroup(
            ModeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModeUserLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(CheckStatusB2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(CheckStatusB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(CheckStatusB1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckStatusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStatusBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckStatusBActionPerformed

    private void CheckStatusB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStatusB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckStatusB1ActionPerformed

    private void CheckStatusB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStatusB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckStatusB2ActionPerformed

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
            java.util.logging.Logger.getLogger(EmpOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckStatusB;
    private javax.swing.JButton CheckStatusB1;
    private javax.swing.JButton CheckStatusB2;
    private javax.swing.JPanel ModeUser;
    // End of variables declaration//GEN-END:variables
}
