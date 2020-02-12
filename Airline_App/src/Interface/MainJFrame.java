/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.AirlinerCompany;
import Business.FlightDirectory;
import Interface.Airliner.ManageAirliner;
import Interface.Customer.ManageCustomerSchedule;
import Interface.Customer.SelectAirlineCompany;
import Interface.Flight.ManageAgency;
import Interface.Flight.ManageFlight;
import java.awt.CardLayout;

/**
 *
 * @author sumedhtelang
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private AirlinerCompany airDir;
    public MainJFrame() {
        initComponents();
        airDir = new AirlinerCompany();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        rightJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftJPanel = new javax.swing.JPanel();
        btnAirlineManage = new javax.swing.JButton();
        btnAgencyManage = new javax.swing.JButton();
        btnCustomerManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightJPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("                                      AIRLINE MANAGEMENT AND BOOKING APP");
        rightJPanel.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(rightJPanel);

        leftJPanel.setBackground(new java.awt.Color(102, 255, 102));

        btnAirlineManage.setBackground(new java.awt.Color(204, 204, 204));
        btnAirlineManage.setText("Register Airline Company");
        btnAirlineManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlineManageActionPerformed(evt);
            }
        });

        btnAgencyManage.setBackground(new java.awt.Color(204, 204, 204));
        btnAgencyManage.setText("Manage Travel Agency");
        btnAgencyManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencyManageActionPerformed(evt);
            }
        });

        btnCustomerManager.setBackground(new java.awt.Color(204, 204, 204));
        btnCustomerManager.setText("Customer Booking");
        btnCustomerManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAirlineManage))
                    .addComponent(btnAgencyManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomerManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnAirlineManage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnAgencyManage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCustomerManager, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAirlineManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlineManageActionPerformed
        // TODO add your handling code here:
        ManageAirliner manageairliner = new ManageAirliner(rightJPanel, airDir);
        rightJPanel.add("ManageAirliner", manageairliner);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnAirlineManageActionPerformed

    private void btnAgencyManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencyManageActionPerformed
        // TODO add your handling code here:
        ManageAgency manageagency = new ManageAgency(rightJPanel, airDir);
        rightJPanel.add("ManageFlight", manageagency);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnAgencyManageActionPerformed

    private void btnCustomerManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagerActionPerformed
        SelectAirlineCompany selectcompany = new SelectAirlineCompany(rightJPanel, airDir);
        rightJPanel.add("SelectAirlineCompany", selectcompany);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnCustomerManagerActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnAgencyManage;
    javax.swing.JButton btnAirlineManage;
    javax.swing.JButton btnCustomerManager;
    javax.swing.JLabel jLabel1;
    javax.swing.JSplitPane jSplitPane1;
    javax.swing.JPanel leftJPanel;
    javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}