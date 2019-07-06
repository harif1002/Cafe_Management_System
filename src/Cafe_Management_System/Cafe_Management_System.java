/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe_Management_System;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author B3
 */
public class Cafe_Management_System extends javax.swing.JFrame {

    int refs = 1325 + (int) (Math.random() * 4238);
    java.util.Date currDate = new java.util.Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    String d;

    /**
     * Creates new form Cafe_Management_System
     */
    public Cafe_Management_System() {

        d = sdf.format(currDate);

        initComponents();
        loadCombo();
        loadCombo1();

    }
//     private void printRecord() {
//        int reference = refs;
//        String iteam1 = jComboBoxM.getSelectedItem().toString();
//        String iteam2 =jComboBoxD.getSelectedItem().toString();
//        String q1 = jTextFieldQuantityM.getText();
//        String q2 = jTextFieldQuantityD.getText();
//        String t1 = jTextFieldMeals.getText();
//        String t2 = jTextFieldDrinks.getText();
//        String sub = jTextFieldSubTotal.getText();
//        String s_chrg = jTextFieldCharge.getText();
//        String tax = jTextFieldTax.getText();
//        String email = jTextFieldTotal.getText();
//        String total = d;
//
//        String path = "";
//        JFileChooser j = new JFileChooser();
//        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int x = j.showSaveDialog(this);
//
//        if (x == JFileChooser.APPROVE_OPTION) {
//            path = j.getSelectedFile().getPath();
//        }
//
//        Document doc = new Document();
//
//        try {
//            PdfWriter.getInstance(doc, new FileOutputStream(path + "saleInfo.pdf"));
//
//            doc.open();
//
//            doc.add(new Paragraph(CENTER_ALIGNMENT, "                     Mahi Enterprise", FontFactory.getFont(FontFactory.TIMES_BOLD, 30, Font.BOLD, BaseColor.BLACK)));
//            doc.add(new Paragraph("                                                         "));
//            doc.add(new Paragraph(CENTER_ALIGNMENT, "                                           Ga-85, Gulshan Badda Link Road, Middle Badda, Dhaka-1212", FontFactory.getFont(FontFactory.HELVETICA, 10, Font.PLAIN, BaseColor.DARK_GRAY)));
//            doc.add(new Paragraph("                                                          "));
//            doc.add(new Paragraph(CENTER_ALIGNMENT, "                                           Phone: +88 02 9860222 | +88 02 9860456 | +88 09614 820020", FontFactory.getFont(FontFactory.HELVETICA, 10, Font.PLAIN, BaseColor.DARK_GRAY)));
//            doc.add(new Paragraph("                                                          "));
//            doc.add(new Paragraph(CENTER_ALIGNMENT, "                                                                             E-mail: info@mebd.net", FontFactory.getFont(FontFactory.HELVETICA, 10, Font.PLAIN, BaseColor.DARK_GRAY)));
//            doc.add(new Paragraph("                                                          "));
//            doc.add(new Paragraph("                                                          "));
//            doc.add(new Paragraph(CENTER_ALIGNMENT, "                                            User Information", FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLACK)));
//
//            doc.add(new Paragraph(new Date().toString()));
//            doc.add(new Paragraph("                                                          "));
//
//            PdfPTable tbl = new PdfPTable(2);
//
//            //Adding Header 
//            tbl.addCell("UserId:");
//            tbl.addCell(id);
//            tbl.addCell("Password:");
//            tbl.addCell(pas);
//            tbl.addCell("Protocol:");
//            tbl.addCell(proto);
//            tbl.addCell("Package:");
//            tbl.addCell(pack);
//            tbl.addCell("Billing Profile:");
//            tbl.addCell(profil);
//            tbl.addCell("Bill Amount:");
//            tbl.addCell(bil);
//            tbl.addCell("UserName:");
//            tbl.addCell(fuln);
//            tbl.addCell("Mobile Number:");
//            tbl.addCell(mobile);
//            tbl.addCell("Address:");
//            tbl.addCell(addr);
//            tbl.addCell("NID Number:");
//            tbl.addCell(nd);
//            tbl.addCell("Email Address:");
//            tbl.addCell(email);
//            tbl.addCell("Connection Date:");
//            tbl.addCell(condate);
//
//            doc.add(tbl);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(userList.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DocumentException ex) {
//            Logger.getLogger(userList.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        JOptionPane.showMessageDialog(this, "User Information Print Succesfully");
//        doc.close();
//
//    }


    public void loadCombo() {
        Connection con = null;
        Statement stm = null;

        try {
            con = DBconnection.getConnection();
            stm = con.createStatement();

            List plist = new ArrayList();
            ResultSet rsl = stm.executeQuery("select item from meals order by item");
            while (rsl.next()) {
                plist.add(rsl.getString("item"));
            }
            jComboBoxM.setModel(new javax.swing.DefaultComboBoxModel(plist.toArray()));
            jComboBoxM.insertItemAt("Select one", 0);
            jComboBoxM.setSelectedIndex(0);
        } catch (Exception el) {
            el.printStackTrace();
        }

    }

    public void loadCombo1() {
        Connection con = null;
        Statement stm = null;

        try {
            con = DBconnection.getConnection();
            stm = con.createStatement();

            List plist = new ArrayList();
            ResultSet rsl = stm.executeQuery("select item from drinks order by item");
            while (rsl.next()) {
                plist.add(rsl.getString("item"));
            }
            jComboBoxD.setModel(new javax.swing.DefaultComboBoxModel(plist.toArray()));
            jComboBoxD.insertItemAt("Select one", 0);
            jComboBoxD.setSelectedIndex(0);
        } catch (Exception el) {
            el.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxM = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldQuantityM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPriceM = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxD = new javax.swing.JComboBox<String>();
        jTextFieldQuantityD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPriceD = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jlblCoastMeals = new javax.swing.JLabel();
        jlblCoastDrinks = new javax.swing.JLabel();
        jlblService = new javax.swing.JLabel();
        jTextFieldMeals = new javax.swing.JTextField();
        jTextFieldDrinks = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jlblTax = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jTextFieldCharge = new javax.swing.JTextField();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonTotal = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaR = new javax.swing.JTextArea();
        jButtonPrint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jbtnSave = new javax.swing.JButton();
        jbtnReceipt = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true), "Meals", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century", 1, 24), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");

        jComboBoxM.setEditable(true);
        jComboBoxM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select one", "Item 2", "Item 3", "Item 4" }));
        jComboBoxM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMItemStateChanged(evt);
            }
        });
        jComboBoxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Iteam List");

        jTextFieldQuantityM.setMaximumSize(new java.awt.Dimension(60, 17));
        jTextFieldQuantityM.setMinimumSize(new java.awt.Dimension(60, 17));
        jTextFieldQuantityM.setPreferredSize(new java.awt.Dimension(60, 17));
        jTextFieldQuantityM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityMActionPerformed(evt);
            }
        });
        jTextFieldQuantityM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityMKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Price");

        jTextFieldPriceM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxM, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldQuantityM, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jTextFieldPriceM))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantityM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPriceM, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 210));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true));

        jLabel1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Cafe Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true), "Drinks", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century", 1, 24), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Item List");
        jLabel10.setPreferredSize(new java.awt.Dimension(146, 23));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Quantity");

        jComboBoxD.setEditable(true);
        jComboBoxD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select one", "Item 2", "Item 3", "Item 4" }));
        jComboBoxD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDItemStateChanged(evt);
            }
        });
        jComboBoxD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDActionPerformed(evt);
            }
        });

        jTextFieldQuantityD.setMaximumSize(new java.awt.Dimension(60, 17));
        jTextFieldQuantityD.setMinimumSize(new java.awt.Dimension(60, 17));
        jTextFieldQuantityD.setPreferredSize(new java.awt.Dimension(60, 17));
        jTextFieldQuantityD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityDActionPerformed(evt);
            }
        });
        jTextFieldQuantityD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityDKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price");

        jTextFieldPriceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPriceD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jTextFieldQuantityD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantityD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPriceD, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 260, 210));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true));

        jlblCoastMeals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCoastMeals.setText("Cost of Meals");
        jlblCoastMeals.setPreferredSize(new java.awt.Dimension(105, 17));

        jlblCoastDrinks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCoastDrinks.setText("Cost of Drinks");
        jlblCoastDrinks.setPreferredSize(new java.awt.Dimension(105, 17));

        jlblService.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblService.setText("Sub Total");
        jlblService.setPreferredSize(new java.awt.Dimension(105, 17));

        jTextFieldMeals.setPreferredSize(new java.awt.Dimension(105, 17));
        jTextFieldMeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMealsActionPerformed(evt);
            }
        });

        jTextFieldDrinks.setPreferredSize(new java.awt.Dimension(105, 17));

        jTextFieldSubTotal.setPreferredSize(new java.awt.Dimension(105, 17));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblCoastDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCoastMeals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldMeals, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCoastMeals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCoastDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 300, 160));

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true));

        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblTax.setText("S.Charge");
        jlblTax.setPreferredSize(new java.awt.Dimension(30, 17));

        jlblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSubTotal.setText("Tax");

        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jButtonTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTotal.setText("Total");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jTextFieldTax)
                    .addComponent(jTextFieldCharge))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jlblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButtonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 240, 160));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true));

        jTextAreaR.setColumns(20);
        jTextAreaR.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaR.setRows(5);
        jScrollPane1.setViewportView(jTextAreaR);

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrint.setText("Print");
        jButtonPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jButtonPrint))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 340, 460));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true));

        jbtnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSave.setText("Save");
        jbtnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 2, true));
        jbtnSave.setMaximumSize(new java.awt.Dimension(73, 23));
        jbtnSave.setMinimumSize(new java.awt.Dimension(73, 23));
        jbtnSave.setPreferredSize(new java.awt.Dimension(73, 23));
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jbtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReceipt.setText("Receipt");
        jbtnReceipt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true));
        jbtnReceipt.setPreferredSize(new java.awt.Dimension(73, 23));
        jbtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReceiptActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        jbtnReset.setPreferredSize(new java.awt.Dimension(73, 23));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jbtnExit.setPreferredSize(new java.awt.Dimension(73, 23));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 550, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jComboBoxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMActionPerformed

    private void jComboBoxDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jTextFieldMeals.setText(null);
        jTextFieldDrinks.setText(null);
        jTextFieldSubTotal.setText(null);
        jTextFieldCharge.setText(null);
        jTextFieldTax.setText(null);
        jTextFieldTotal.setText(null);
        jTextFieldQuantityM.setText(null);
        jTextFieldQuantityD.setText(null);
        jTextAreaR.setText(null);
        jComboBoxM.setSelectedIndex(0);
        jComboBoxD.setSelectedIndex(0);
        jTextFieldPriceM.setText(null);
        jTextFieldPriceD.setText(null);


    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        // TODO add your handling code here:
        int c = jComboBoxM.getSelectedIndex();
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        int total = 0, qty = 0, finalqty = 0;
        if (c < 0) {
            try {
                con = DBconnection.getConnection();
                stm = con.createStatement();
                stm.executeUpdate("insert into meals "
                        + " (item, price,total) "
                        + " values ('" + jComboBoxM.getSelectedItem().toString() + "',"
                        + " '" + jTextFieldPriceM.getText() + "', "
                        + " '" + jTextFieldMeals.getText() + "')");

                JOptionPane.showMessageDialog(rootPane, "Saved");
                loadCombo();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            try {
                con = DBconnection.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery("select price from meals "
                        + " where item='" + jComboBoxM.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    total = rs.getInt("price");
                }
                qty = Integer.parseInt(jTextFieldQuantityM.getText());
                finalqty = total * qty;
                String q = String.valueOf(finalqty);
                stm.executeUpdate("update meals set total='" + q + "' where "
                        + " item='" + jComboBoxM.getSelectedItem().toString() + "'");

                // loadCombo();
            } catch (Exception e1) {
                DBconnection.close(con);
                e1.printStackTrace();
            }
        }
        int d = jComboBoxD.getSelectedIndex();
        Connection con2 = null;
        Statement stm2 = null;
        ResultSet rs2 = null;
        int total2 = 0, qty2 = 0, finalqty2 = 0;
        if (d < 0) {
            try {
                con2 = DBconnection.getConnection();
                stm2 = con2.createStatement();
                stm2.executeUpdate("insert into Drinks "
                        + " (item, price, total) "
                        + " values ('" + jComboBoxD.getSelectedItem().toString() + "',"
                        + " '" + jTextFieldPriceD.getText() + "', "
                        + " '" + jTextFieldDrinks.getText() + "')");

                JOptionPane.showMessageDialog(rootPane, "Saved");
                loadCombo1();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            try {
                con2 = DBconnection.getConnection();
                stm2 = con2.createStatement();
                rs2 = stm2.executeQuery("select price from drinks "
                        + " where item='" + jComboBoxD.getSelectedItem().toString() + "'");
                while (rs2.next()) {
                    total2 = rs2.getInt("price");
                }
                qty2 = Integer.parseInt(jTextFieldQuantityD.getText());
                finalqty2 = total2 * qty2;
                String q2 = String.valueOf(finalqty2);
                stm2.executeUpdate("update drinks set total='" + q2 + "' where "
                        + " item='" + jComboBoxD.getSelectedItem().toString() + "'");

                //JOptionPane.showMessageDialog(rootPane, "Updated");
                // loadCombo();
            } catch (Exception e1) {
                DBconnection.close(con2);
                e1.printStackTrace();
            }
        }

    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jComboBoxMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMItemStateChanged
        // TODO add your handling code here:
        if (jComboBoxM.getSelectedIndex() > 0) {
            Connection con = null;
            Statement stm = null;
            ResultSet rs = null;
            try {
                con = DBconnection.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery("select * from meals where item='" + jComboBoxM.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    jTextFieldPriceM.setText(rs.getString("price"));

                }

            } catch (Exception el) {
                el.printStackTrace();
            }

        }

    }//GEN-LAST:event_jComboBoxMItemStateChanged

    private void jComboBoxDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDItemStateChanged
        // TODO add your handling code here:
        if (jComboBoxD.getSelectedIndex() > 0) {
            Connection con = null;
            Statement stm = null;
            ResultSet rs = null;
            try {
                con = DBconnection.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery("select * from drinks where item='" + jComboBoxD.getSelectedItem().toString() + "'");
                while (rs.next()) {
                    jTextFieldPriceD.setText(rs.getString("price"));

                }

            } catch (Exception el) {
                el.printStackTrace();
            }

        }

    }//GEN-LAST:event_jComboBoxDItemStateChanged

    private void jTextFieldQuantityMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityMActionPerformed

    private void jTextFieldMealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMealsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMealsActionPerformed

    private void jTextFieldQuantityMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityMKeyReleased
        String quantity = jTextFieldQuantityM.getText();
        int qu = Integer.parseInt(quantity);
        String price = jTextFieldPriceM.getText();
        int pri = Integer.parseInt(price);
        String to = String.valueOf(qu * pri);
        jTextFieldMeals.setText(to);
    }//GEN-LAST:event_jTextFieldQuantityMKeyReleased

    private void jTextFieldQuantityDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityDKeyPressed

    }//GEN-LAST:event_jTextFieldQuantityDKeyPressed

    private void jTextFieldQuantityDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityDKeyReleased
        // TODO add your handling code here:
        String quantity2 = jTextFieldQuantityD.getText();
        int qu2 = Integer.parseInt(quantity2);
        String price2 = jTextFieldPriceD.getText();
        int pri2 = Integer.parseInt(price2);
        String to2 = String.valueOf(qu2 * pri2);
        jTextFieldDrinks.setText(to2);
    }//GEN-LAST:event_jTextFieldQuantityDKeyReleased

    private void jTextFieldPriceMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceMActionPerformed

    private void jTextFieldPriceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceDActionPerformed

    private void jTextFieldQuantityDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityDActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        int meals = Integer.parseInt(jTextFieldMeals.getText());
        int drinks = Integer.parseInt(jTextFieldDrinks.getText());
        String subTotal = String.valueOf(meals + drinks);
        jTextFieldSubTotal.setText(subTotal);
        int s_Total = Integer.parseInt(subTotal);
        String s_Charge = String.valueOf(s_Total * .10);
        jTextFieldCharge.setText(s_Charge);
        int tax = Integer.parseInt(subTotal);
        String Tax = String.valueOf(s_Total * .15);
        jTextFieldTax.setText(Tax);
        double charge = Double.parseDouble(jTextFieldCharge.getText());
        double t_tax = Double.parseDouble(jTextFieldTax.getText());
        String total = String.valueOf(charge + t_tax + meals + drinks);
        jTextFieldTotal.setText(total);
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaxActionPerformed

    private void jbtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReceiptActionPerformed

        jTextAreaR.append("\t\nCafe Management System:\n"
                + "Reference : " + refs
                + "\n\nIteam" + "\t\tQunatity" + "\tAmount"
                + "\n" + jComboBoxM.getSelectedItem() + "\t\t" + jTextFieldQuantityM.getText() + "\t\t" + jTextFieldMeals.getText()
                + "\n" + jComboBoxD.getSelectedItem() + "\t\t" + jTextFieldQuantityD.getText() + "\t\t" + jTextFieldDrinks.getText()
                + "\n======================================"
                + "\n Sub Total" + "\t\t\t" + jTextFieldSubTotal.getText()
                + "\n Service Charge" + "\t\t\t" + jTextFieldCharge.getText()
                + "\n Tax" + "\t\t\t\t" + jTextFieldTax.getText()
                + "\n======================================"
                + "\n Total" + "\t\t\t\t" + jTextFieldTotal.getText()
        );
    }//GEN-LAST:event_jbtnReceiptActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        // TODO add your handling code here:
       //  printRecord();
        MessageFormat header = new MessageFormat("Receipt print");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");
        try{
        jTextAreaR.print(header, footer);
        }catch(java.awt.print.PrinterException ex){
            System.err.format("can not print %s%n ", ex.getMessage());
        }
        
//     Toolkit tkp = jTextAreaR.getToolkit();
//PrintJob pjp = tkp.getPrintJob(this, null, null);
//Graphics g = pjp.getGraphics();
//jTextAreaR.print(g);
//g.dispose();
//pjp.end();
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        
        Daily_Sale ds = new Daily_Sale();
        ds.setVisible(true);
        setVisible(false);

        try {
            con = DBconnection.getConnection();
            stm = con.createStatement();
            stm.executeUpdate("insert into daily_sale"
                    + "(reference,cost_meals,cost_drinks,s_charge,tax,amount,date)"
                    + "values('" + refs + "','" + jTextFieldMeals.getText() + "',"
                    + "'" + jTextFieldDrinks.getText() + "',"
                    + "'" + jTextFieldCharge.getText() + "',"
                    + "'" + jTextFieldTax.getText() + "',"
                    + "'" + jTextFieldTotal.getText() + "','" + d + "')");
            
            
              
            
        } catch (Exception e1) {
            e1.printStackTrace();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Cafe_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafe_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafe_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafe_Management_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafe_Management_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JComboBox<String> jComboBoxD;
    private javax.swing.JComboBox<String> jComboBoxM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaR;
    private javax.swing.JTextField jTextFieldCharge;
    private javax.swing.JTextField jTextFieldDrinks;
    private javax.swing.JTextField jTextFieldMeals;
    private javax.swing.JTextField jTextFieldPriceD;
    private javax.swing.JTextField jTextFieldPriceM;
    private javax.swing.JTextField jTextFieldQuantityD;
    private javax.swing.JTextField jTextFieldQuantityM;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReceipt;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JLabel jlblCoastDrinks;
    private javax.swing.JLabel jlblCoastMeals;
    private javax.swing.JLabel jlblService;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblTax;
    // End of variables declaration//GEN-END:variables
}
