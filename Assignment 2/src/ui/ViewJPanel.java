/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import model.Product;
import model.ProductHistory;



/**
 *
 * @author kiranreddy
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */

    ProductHistory history;
    
    public ViewJPanel(ProductHistory history) {
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        ViewPanel = new javax.swing.JPanel();
        btnCompany = new javax.swing.JButton();
        btnAvailable = new javax.swing.JButton();
        btnModel = new javax.swing.JButton();
        btnYear = new javax.swing.JButton();
        btnSeating = new javax.swing.JButton();
        btnSerial = new javax.swing.JButton();
        btnUber = new javax.swing.JButton();
        btnUpdated = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnExpiry = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();
        ControlPanel = new javax.swing.JPanel();

        ViewPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnCompany.setText("Company");
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });

        btnAvailable.setText("Available");
        btnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableActionPerformed(evt);
            }
        });

        btnModel.setText("Model");
        btnModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelActionPerformed(evt);
            }
        });

        btnYear.setText(" Year");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        btnSeating.setText("Seating");
        btnSeating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatingActionPerformed(evt);
            }
        });

        btnSerial.setText("Serial");
        btnSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialActionPerformed(evt);
            }
        });

        btnUber.setText("Uber Cars");
        btnUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUberActionPerformed(evt);
            }
        });

        btnUpdated.setText("Updated");
        btnUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Search");

        btnExpiry.setText("Expired");
        btnExpiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiryActionPerformed(evt);
            }
        });

        btnCity.setText("City");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCompany, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAvailable, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addComponent(btnSerial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdated, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExpiry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(btnCompany)
                .addGap(18, 18, 18)
                .addComponent(btnAvailable)
                .addGap(18, 18, 18)
                .addComponent(btnModel)
                .addGap(18, 18, 18)
                .addComponent(btnYear)
                .addGap(18, 18, 18)
                .addComponent(btnSeating)
                .addGap(18, 18, 18)
                .addComponent(btnSerial)
                .addGap(18, 18, 18)
                .addComponent(btnUber)
                .addGap(18, 18, 18)
                .addComponent(btnUpdated)
                .addGap(18, 18, 18)
                .addComponent(btnExpiry)
                .addGap(18, 18, 18)
                .addComponent(btnCity)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(ViewPanel);

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(ControlPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableActionPerformed
        // TODO add your handling code here:
        AvaliableJPanel availPanel = new AvaliableJPanel(history);
        jSplitPane1.setRightComponent(availPanel);
        
       
    }//GEN-LAST:event_btnAvailableActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
        // TODO add your handling code here:
        YearJPanel yearpanel = new YearJPanel(history);
        jSplitPane1.setRightComponent(yearpanel);
    }//GEN-LAST:event_btnYearActionPerformed

    private void btnUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatedActionPerformed
        // TODO add your handling code here:
        UpdatedJPanel updatePanel = new UpdatedJPanel(history);
        jSplitPane1.setRightComponent(updatePanel);
    }//GEN-LAST:event_btnUpdatedActionPerformed

    private void btnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyActionPerformed
        // TODO add your handling code here:

           CompanyJPanel companyPanel = new CompanyJPanel(history);
           jSplitPane1.setRightComponent(companyPanel);
        
        
    }//GEN-LAST:event_btnCompanyActionPerformed

    private void btnModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelActionPerformed
        // TODO add your handling code here:
        ModelJPanel modelPanel = new ModelJPanel(history);
        jSplitPane1.setRightComponent(modelPanel);
    }//GEN-LAST:event_btnModelActionPerformed

    private void btnSeatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatingActionPerformed
        // TODO add your handling code here:
        SeatingJPanel seatingPanel = new SeatingJPanel(history);
        jSplitPane1.setRightComponent(seatingPanel);
    }//GEN-LAST:event_btnSeatingActionPerformed

    private void btnSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialActionPerformed
        // TODO add your handling code here:
        SerialJPanel serialpanel = new SerialJPanel(history);
        jSplitPane1.setRightComponent(serialpanel);
    }//GEN-LAST:event_btnSerialActionPerformed

    private void btnUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUberActionPerformed
        // TODO add your handling code here:
        UberJPanel uberPanel = new UberJPanel(history);
        jSplitPane1.setRightComponent(uberPanel);
    }//GEN-LAST:event_btnUberActionPerformed

    private void btnExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpiryActionPerformed
        // TODO add your handling code here:
        ExpiredJPanel expiredPanel = new ExpiredJPanel(history);
        jSplitPane1.setRightComponent(expiredPanel);
    }//GEN-LAST:event_btnExpiryActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
                // TODO add your handling code here:
            CityJPanel citypanel = new CityJPanel(history);
            jSplitPane1.setRightComponent(citypanel);
    }//GEN-LAST:event_btnCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnCompany;
    private javax.swing.JButton btnExpiry;
    private javax.swing.JButton btnModel;
    private javax.swing.JButton btnSeating;
    private javax.swing.JButton btnSerial;
    private javax.swing.JButton btnUber;
    private javax.swing.JButton btnUpdated;
    private javax.swing.JButton btnYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
