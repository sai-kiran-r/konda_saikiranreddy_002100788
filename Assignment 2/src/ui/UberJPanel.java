/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Product;
import model.ProductHistory;

/**
 *
 * @author kiranreddy
 */
public class UberJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UberJPanel
     */
    ProductHistory history;
    public UberJPanel(ProductHistory history) {
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
        btnUber = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUber = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 93, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Uber Car Manufacturer's");

        btnUber.setText("Search");
        btnUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUberActionPerformed(evt);
            }
        });

        tblUber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Company"
            }
        ));
        jScrollPane2.setViewportView(tblUber);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addGap(0, 220, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnUber)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addComponent(btnUber)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUberActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblUber.getModel();
        model.setRowCount(0);
        
        for(Product vs : history.getHistory())
        {
            
                Object[] row = new Object[1];
            row[0] = vs;
//            row[1] = vs.getCarYear();
//            row[2] = vs.getCarSeats();
//            row[3] = vs.getCarSerialnum();
//            row[4] = vs.getCarModelnum();
//            row[5] = vs.getCarAvaliablity();
//            row[6] = vs.getCarCity();
//            row[7] = vs.getCarExpired();
            
            model.addRow(row);
            
        }
    }//GEN-LAST:event_btnUberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblUber;
    // End of variables declaration//GEN-END:variables
}
