/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.ProductHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;

/**
 *
 * @author kiranreddy
 */
public class SeatingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeatingJPanel
     */
    ProductHistory history;
    public SeatingJPanel(ProductHistory history) {
        initComponents();
        this.history = history;
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
        txtSeatmin = new javax.swing.JTextField();
        btnSeating = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSeating = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtSeatmax = new javax.swing.JTextField();

        setBackground(new java.awt.Color(28, 93, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Search by Seating Capacity");

        jLabel2.setText("Minimum Seats");

        txtSeatmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatminActionPerformed(evt);
            }
        });

        btnSeating.setText("Search");
        btnSeating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatingActionPerformed(evt);
            }
        });

        tblSeating.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Year", "Seats", "Serial  ", "Model", "Availability", "City", "Expirey "
            }
        ));
        jScrollPane2.setViewportView(tblSeating);

        jLabel3.setText("Maximum Seats");

        txtSeatmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatmaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnSeating))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSeatmax, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSeatmin, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(213, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSeatmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSeatmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnSeating)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeatminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatminActionPerformed

    private void btnSeatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatingActionPerformed
        // TODO add your handling code here:
        String seatsTxt1 = txtSeatmin.getText();
        String seatsTxt2 = txtSeatmax.getText();
        if((seatsTxt1.isEmpty()) || (seatsTxt2.isEmpty())){
            JOptionPane.showMessageDialog(this, "Please  valid seats");
            return;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) tblSeating.getModel();
        model.setRowCount(0);
        
        for(Product vs : history.getHistory())
        {
            if((vs.getCarSeats() >= Integer.parseInt(seatsTxt1.trim())) && (vs.getCarSeats() <= Integer.parseInt(seatsTxt2.trim())))
            {
                Object[] row = new Object[8];
            row[0] = vs;
            row[1] = vs.getCarYear();
            row[2] = vs.getCarSeats();
            row[3] = vs.getCarSerialnum();
            row[4] = vs.getCarModelnum();
            row[5] = vs.getCarAvaliablity();
            row[6] = vs.getCarCity();
            row[7] = vs.getCarExpired();
            
            model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnSeatingActionPerformed

    private void txtSeatmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatmaxActionPerformed
        // TODO add your handling code here:
        
//        String seatsTxt1 = txtSeatmin.getText();
//        String seatsTxt2 = txtSeatmax.getText();
//        if((seatsTxt1.isEmpty()) || (seatsTxt2.isEmpty())){
//            JOptionPane.showMessageDialog(this, "Please  valid seats");
//            return;
//        }
//        
//        
//        DefaultTableModel model = (DefaultTableModel) tblSeating.getModel();
//        model.setRowCount(0);
//        
//        for(Product vs : history.getHistory())
//        {
//            if((vs.getCarSeats() >= Integer.parseInt(seatsTxt1.trim())) && (vs.getCarSeats() <= Integer.parseInt(seatsTxt2.trim())))
//            {
//                Object[] row = new Object[8];
//            row[0] = vs;
//            row[1] = vs.getCarYear();
//            row[2] = vs.getCarSeats();
//            row[3] = vs.getCarSerialnum();
//            row[4] = vs.getCarModelnum();
//            row[5] = vs.getCarAvaliablity();
//            row[6] = vs.getCarCity();
//            row[7] = vs.getCarExpired();
//            
//            model.addRow(row);
//            }
//        }
    }//GEN-LAST:event_txtSeatmaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeating;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSeating;
    private javax.swing.JTextField txtSeatmax;
    private javax.swing.JTextField txtSeatmin;
    // End of variables declaration//GEN-END:variables
}
