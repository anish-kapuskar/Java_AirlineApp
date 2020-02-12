/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Flight;

import Business.Airliner;
import Business.Flight;
import Interface.Airliner.ManageAirliner;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Interface.Airliner.ViewAirliner;

/**
 *
 * @author sumedhtelang
 */
public class ManageFlightSystem extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightSystem
     */

    private JPanel rightJPanel;
    private Airliner airliner;
    ManageFlightSystem(JPanel rightJPanel, Airliner airliner) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.airliner = airliner;
        txtAirlineCompany.setEnabled(false);
        txtAirlineCompany.setText(airliner.getAirlinerName());
        populateTable();
    }
    
    public void populateTable(){
        int rowCount = tblFlightDetails.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblFlightDetails.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Flight f : airliner.getFlightDir().getFlightDir()) {
            Object row[] = new Object[7];
            row[0] = f.getFlightNumber();
            row[1] = f;
            row[2] = f.getFlightSource();
            row[3] = f.getFlightDestination();
            row[4] = f.getFlightPrice();
            row[5] = f.getDuration();
            row[6] = f.getTiming();
            
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAirlineCompany = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlightDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAddFlight = new javax.swing.JButton();
        btnViewFlight = new javax.swing.JButton();
        btnRemoveFlight = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE COMPANY FLIGHTS");

        jLabel2.setText("Airline Company");

        tblFlightDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Flight Name", "Source", "Destination", "Price", "Duration", "Timing"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFlightDetails);
        if (tblFlightDetails.getColumnModel().getColumnCount() > 0) {
            tblFlightDetails.getColumnModel().getColumn(0).setResizable(false);
            tblFlightDetails.getColumnModel().getColumn(1).setResizable(false);
            tblFlightDetails.getColumnModel().getColumn(2).setResizable(false);
            tblFlightDetails.getColumnModel().getColumn(3).setResizable(false);
            tblFlightDetails.getColumnModel().getColumn(4).setResizable(false);
            tblFlightDetails.getColumnModel().getColumn(5).setResizable(false);
        }

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddFlight.setText("(+) Add New Flight");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        btnViewFlight.setText("View Flight Details");
        btnViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightActionPerformed(evt);
            }
        });

        btnRemoveFlight.setText("Delete Flight");
        btnRemoveFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewFlight)
                                    .addComponent(btnRemoveFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAirlineCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAirlineCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewFlight)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveFlight)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        // TODO add your handling code here:
        AddFlight addflight = new AddFlight(rightJPanel, airliner);
        rightJPanel.add("AddFlight", addflight);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightActionPerformed
        // TODO add your handling code here:
        int row = tblFlightDetails.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight flight = (Flight)tblFlightDetails.getValueAt(row, 1);
        ViewFlightDetails vf = new ViewFlightDetails(rightJPanel, flight);
        rightJPanel.add("ViewFlightsJPanel", vf);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnViewFlightActionPerformed

    private void btnRemoveFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFlightActionPerformed
        // TODO add your handling code here:
        int row = tblFlightDetails.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight flight = (Flight)tblFlightDetails.getValueAt(row, 1);
        airliner.getFlightDir().removeFlight(flight);
        populateTable();
    }//GEN-LAST:event_btnRemoveFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnAddFlight;
    javax.swing.JButton btnBack;
    javax.swing.JButton btnRemoveFlight;
    javax.swing.JButton btnViewFlight;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable tblFlightDetails;
    javax.swing.JTextField txtAirlineCompany;
    // End of variables declaration//GEN-END:variables
}