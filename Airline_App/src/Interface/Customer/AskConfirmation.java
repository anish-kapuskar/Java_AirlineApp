/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Customer;
import Business.Flight;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sumedhtelang
 */
public class AskConfirmation extends javax.swing.JPanel {

    /**
     * Creates new form AskConfirmation
     */
    private JPanel rightJPanel;
    private Flight flight;
    private Customer customer;

    AskConfirmation(JPanel rightJPanel, Flight flight, Customer customer) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.flight = flight;
        this.customer = customer;
        populateDetails();
       
                txtFlightNumber.setEnabled(false);
        txtAirlineCompanyName.setEnabled(false);
        txtSource.setEnabled(false);
        txtDestination.setEnabled(false);
        txtDuration.setEnabled(false);
        txtFare.setEnabled(false);
        txtTiming.setEnabled(false);
        txtCustName.setEnabled(false);
        txtSeatNumber.setEnabled(false);
        txtAddress.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
    }
    
    public void populateDetails(){
        txtFlightNumber.setText(String.valueOf(flight.getFlightNumber()));
        txtAirlineCompanyName.setText(flight.getFlightName());
        txtSource.setText(flight.getFlightSource());
        txtDestination.setText(flight.getFlightDestination());
        txtFare.setText(String.valueOf(flight.getFlightPrice()));
        txtCustName.setText(customer.getCustomerName());
        txtSeatNumber.setText(customer.getSeatNo());
        txtAddress.setText(customer.getAddr());
        txtDuration.setText(String.valueOf(flight.getDuration()));
        txtPhoneNumber.setText(Integer.toString(customer.getContactNo()));
        txtTiming.setText(flight.getTiming());
        txtDate.setText(customer.getDate());
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
        txtFlightNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAirlineCompanyName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFare = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtSeatNumber = new javax.swing.JTextField();
        btnConfirmBooking = new javax.swing.JButton();
        cancelBooking = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTiming = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("BOOKING CONFIRMATION");

        jLabel2.setText("Flight Number");

        jLabel3.setText("Airline Company");

        txtAirlineCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlineCompanyNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Source");

        jLabel5.setText("Destination");

        jLabel6.setText("Fare");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("CUSTOMER DETAILS");

        jLabel8.setText("Name");

        jLabel9.setText("Address");

        jLabel10.setText("Phone Number");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel11.setText("Seat Number");

        txtSeatNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatNumberActionPerformed(evt);
            }
        });

        btnConfirmBooking.setText("CONFIRM BOOKING");
        btnConfirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookingActionPerformed(evt);
            }
        });

        cancelBooking.setText("CANCEL BOOKING");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        jLabel12.setText("Duration");

        jLabel13.setText("Timing");

        txtTiming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimingActionPerformed(evt);
            }
        });

        jLabel14.setText("Date");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtSource)
                                    .addComponent(txtFare)
                                    .addComponent(txtDate))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAirlineCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtDestination)
                                    .addComponent(txtDuration)
                                    .addComponent(txtTiming)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirmBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAirlineCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAirlineCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlineCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlineCompanyNameActionPerformed

    private void btnConfirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBookingActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Your booking is confirmed.", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        txtFlightNumber.setText("");
        txtAirlineCompanyName.setText("");
        txtSource.setText("");
        txtDestination.setText("");
        txtFare.setText("");
          txtDuration.setText("");
        txtCustName.setText("");
        txtSeatNumber.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtTiming.setText("");
    }//GEN-LAST:event_btnConfirmBookingActionPerformed

    private void txtSeatNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatNumberActionPerformed

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
        // TODO add your handling code here:
            txtFlightNumber.setText("");
        txtAirlineCompanyName.setText("");
        txtSource.setText("");
        txtDestination.setText("");
        txtFare.setText("");
        txtCustName.setText("");
        txtSeatNumber.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtDuration.setText("");
        txtTiming.setText("");
        btnConfirmBooking.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Booking Cancelled!");
    }//GEN-LAST:event_cancelBookingActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtTimingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimingActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnConfirmBooking;
    javax.swing.JButton cancelBooking;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextArea txtAddress;
    javax.swing.JTextField txtAirlineCompanyName;
    javax.swing.JTextField txtCustName;
    javax.swing.JTextField txtDate;
    javax.swing.JTextField txtDestination;
    javax.swing.JTextField txtDuration;
    javax.swing.JTextField txtFare;
    javax.swing.JTextField txtFlightNumber;
    javax.swing.JTextField txtPhoneNumber;
    javax.swing.JTextField txtSeatNumber;
    javax.swing.JTextField txtSource;
    javax.swing.JTextField txtTiming;
    // End of variables declaration//GEN-END:variables
}
