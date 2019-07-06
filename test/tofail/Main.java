
package tofail;

import java.sql.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    private java.util.Date currDate = new java.util.Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String d;

    /** Creates new form Main */
    public Main() {
        initComponents();
        loadCombo();
        d = sdf.format(currDate);
        txtdate.setText(d);
    }

    public void loadCombo() {

        Connection con = null;
        Statement stm = null;
        try {
            con = Database.getConnection();
            stm = con.createStatement();

            List plist = new ArrayList();
            ResultSet rs1 = stm.executeQuery("select pname from inventory order by pname");
            while (rs1.next()) {
                plist.add(rs1.getString("pname"));
            }
            cbmItem.setModel(new javax.swing.DefaultComboBoxModel(plist.toArray()));
            cbmItem.insertItemAt("Select One", 0);
            cbmItem.setSelectedIndex(0);

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtaqty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbmItem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpprice = new javax.swing.JTextField();
        txtsprice = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel1.setText("Item Name");

        txtaqty.setEditable(false);
        txtaqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaqtyActionPerformed(evt);
            }
        });

        jLabel2.setText("Available Qty");

        cbmItem.setEditable(true);
        cbmItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbmItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmItemItemStateChanged(evt);
            }
        });
        cbmItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmItemActionPerformed(evt);
            }
        });

        jLabel3.setText("Purchase/Sale Qty");

        txtqty.setText("0");

        jLabel4.setText("Purchase Price");

        jLabel5.setText("Sale Price");

        jLabel6.setText("Date");

        txtpprice.setText("0");

        txtsprice.setText("0");

        txtdate.setText("2012-03-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdate)
                    .addComponent(txtsprice)
                    .addComponent(txtpprice)
                    .addComponent(txtqty)
                    .addComponent(cbmItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtaqty, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbmItem)
                        .addGap(18, 18, 18)
                        .addComponent(txtaqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtpprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 5, true));

        btnSave.setText("purchase");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnupdate.setText("Sale");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnView.setText("View Table");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnupdate)
                .addGap(29, 29, 29)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(62, 62, 62)
                .addComponent(btnExit)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnExit)
                    .addComponent(btnClear)
                    .addComponent(btnupdate)
                    .addComponent(btnView))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int c = cbmItem.getSelectedIndex();
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        int prevqty = 0, newqty = 0, finalqty = 0;
        if (c < 0) {
            try {
                con = Database.getConnection();
                stm = con.createStatement();
                stm.executeUpdate("insert into inventory "
                        + " (pname, pprice, sprice, qty, pdate) "
                        + " values ('" + cbmItem.getSelectedItem().toString() + "',"
                        + " '" + txtpprice.getText() + "',"
                        + " '" + txtsprice.getText() + "', "
                        + " '" + txtqty.getText() + "', "
                        + " '" + txtdate.getText() + "')");
                JOptionPane.showMessageDialog(rootPane, "Saved");
                loadCombo();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            try {
                con = Database.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery("select qty from inventory "
                     + " where pname='" + cbmItem.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    prevqty = rs.getInt("qty");
                }
                newqty = Integer.parseInt(txtqty.getText());
                finalqty = prevqty + newqty;
                String q = String.valueOf(finalqty);
                stm.executeUpdate("update inventory set qty='" + q + "' where "
                        + " pname='" + cbmItem.getSelectedItem().toString() + "'");

                JOptionPane.showMessageDialog(rootPane, "Updated");
                //loadCombo();

            } catch (Exception e1) {
                Database.close(con);
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        int prevqty = 0, newqty = 0, finalqty = 0;
        if (Integer.parseInt(txtqty.getText()) > 0) {
            try {
                con = Database.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery("select qty from inventory where pname='" + cbmItem.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    prevqty = rs.getInt("qty");
                }
                newqty = Integer.parseInt(txtqty.getText());
                finalqty = prevqty - newqty;
                String q = String.valueOf(finalqty);
                stm.executeUpdate("update inventory set qty='" + q + "' where pname='" + cbmItem.getSelectedItem().toString() + "'");

                JOptionPane.showMessageDialog(rootPane, "Updated");
                loadCombo();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sale Item qty must be greater then zero");
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void cbmItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmItemItemStateChanged
        if (cbmItem.getSelectedIndex() > 0) {
            Connection con = null;
            Statement stm = null;
            ResultSet rs = null;
            try {
                con = Database.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery("select * from inventory where pname='" + cbmItem.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    txtaqty.setText(rs.getString("qty"));
                    txtpprice.setText(rs.getString("pprice"));
                    txtsprice.setText(rs.getString("sprice"));
                    txtdate.setText(rs.getString("pdate"));
                }


            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbmItemItemStateChanged

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
//        Viewintable vt = new Viewintable();
//        vt.setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void cbmItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmItemActionPerformed

    private void txtaqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaqtyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cbmItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtaqty;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtpprice;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsprice;
    // End of variables declaration//GEN-END:variables
}
