
package projectdb_2022_23;

import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

public class driverFrame extends javax.swing.JFrame {
    private static final String username = "root";
    private static final String password = "123456";
    private static final String dataB = "jdbc:mysql://localhost:3306/travel_agency";
    
    Connection sqlConn = null;
    PreparedStatement ps = null;
    
    String driverAT = null;
    String drlicense = null;
    String drroute = null;
    String drexp = null;
    
    String drname = null;
    String drlname = null;
    String drsal = null;
    
    public driverFrame() {
        initComponents();
    }

    public void updateAddDelDriver(){
        try{
             driverAT = drdriverATtxt.getText();
             drlicense = drlicensetxt.getText();
             drroute = drroutetxt.getText();
             drexp = drexptxt.getText();
             
             drname = drnametxt.getText();
             drlname = drlasttxt.getText();
             drsal = drsaltxt.getText();
 
             Class.forName("com.mysql.jdbc.Driver");
             sqlConn = DriverManager.getConnection(dataB,username,password);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRESETbr3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReturnbr3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        drdriverATtxt = new javax.swing.JTextField();
        btnUPDATEbr = new javax.swing.JButton();
        btnADDbr = new javax.swing.JButton();
        btnResetbr = new javax.swing.JButton();
        btnDELETEbr = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        drlicensetxt = new javax.swing.JTextField();
        drroutetxt = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        drexptxt = new javax.swing.JTextField();
        btnViewDr = new javax.swing.JButton();
        drnametxt = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        drlasttxt = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        drsaltxt = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRESETbr3.setBackground(new java.awt.Color(0, 0, 0));
        btnRESETbr3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 8));
        btnRESETbr3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Driver Table");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRESETbr3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 380, 70));

        btnReturnbr3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 26)); // NOI18N
        btnReturnbr3.setText("Return");
        btnReturnbr3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnbr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnbr3ActionPerformed(evt);
            }
        });
        btnRESETbr3.add(btnReturnbr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 680, 130, 50));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "drv_AT", "drv_license", "drv_route", "drv_experience"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnRESETbr3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 800, 250));

        drdriverATtxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drdriverATtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drdriverATtxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drdriverATtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 460, 30));

        btnUPDATEbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnUPDATEbr.setText("UPDATE");
        btnUPDATEbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUPDATEbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEbrActionPerformed(evt);
            }
        });
        btnRESETbr3.add(btnUPDATEbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 230, 130, 50));

        btnADDbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnADDbr.setText("ADD");
        btnADDbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADDbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDbrActionPerformed(evt);
            }
        });
        btnRESETbr3.add(btnADDbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 160, 130, 50));

        btnResetbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnResetbr.setText("RESET");
        btnResetbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetbrActionPerformed(evt);
            }
        });
        btnRESETbr3.add(btnResetbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 370, 130, 50));

        btnDELETEbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnDELETEbr.setText("DELETE");
        btnDELETEbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDELETEbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEbrActionPerformed(evt);
            }
        });
        btnRESETbr3.add(btnDELETEbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 300, 130, 50));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("driver AT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, 30));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("license");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        drlicensetxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drlicensetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drlicensetxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drlicensetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 460, 30));

        drroutetxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drroutetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drroutetxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drroutetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 460, 30));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("experience");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("route");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnRESETbr3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        drexptxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drexptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drexptxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drexptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 460, 30));

        btnViewDr.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnViewDr.setText("View Data");
        btnViewDr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewDr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrActionPerformed(evt);
            }
        });
        btnRESETbr3.add(btnViewDr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 440, 130, 40));

        drnametxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drnametxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 460, 30));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("Lastname");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnRESETbr3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        drlasttxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drlasttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drlasttxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drlasttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 460, 30));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setText("Salary");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

        drsaltxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        drsaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drsaltxtActionPerformed(evt);
            }
        });
        btnRESETbr3.add(drsaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 460, 30));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 0));
        jLabel11.setText("Name");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        getContentPane().add(btnRESETbr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnbr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnbr3ActionPerformed
        // TODO add your handling code here:
        IT_operationsFrame s = new IT_operationsFrame();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnbr3ActionPerformed

    private void drdriverATtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drdriverATtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drdriverATtxtActionPerformed

    private void btnUPDATEbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEbrActionPerformed
        // TODO add your handling code here:

        try{
            updateAddDelDriver();
            
            if(!(drlicense.isEmpty()) && drroute.isEmpty() && drexp.isEmpty()){
                ps = sqlConn.prepareStatement("UPDATE driver set drv_license=? WHERE drv_AT=?");
                ps.setString(2, driverAT);
                ps.setString(1, drlicense);
                ps.executeUpdate();
            }else if(drlicense.isEmpty() && !(drroute.isEmpty()) && drexp.isEmpty()){
                ps = sqlConn.prepareStatement("UPDATE driver set drv_route=? WHERE drv_AT=?");
                ps.setString(2, driverAT);
                ps.setString(1, drroute);
                ps.executeUpdate();
            }else if(drlicense.isEmpty() && !(drexp.isEmpty()) && drroute.isEmpty()){
                ps = sqlConn.prepareStatement("UPDATE driver set drv_experience=? WHERE drv_AT=?");
                ps.setString(2, driverAT);
                ps.setString(1, drexp);
                ps.executeUpdate();
            }else{
                ps = sqlConn.prepareStatement("UPDATE driver set drv_license=?,drv_route=?,drv_experience=? WHERE drv_AT=?");
                ps.setString(1,drlicense);
                ps.setString(2, drroute);
                ps.setString(3, drexp);
                ps.setString(3, driverAT);
                ps.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
        }catch(Exception e){
            //java.util.logging.Logger.getLogger(branchFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUPDATEbrActionPerformed

    private void btnADDbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDbrActionPerformed
        // TODO add your handling code here:

        try{
            updateAddDelDriver();
            
            if(drname.isEmpty() && drlname.isEmpty() && drsal.isEmpty() && !(driverAT.isEmpty()) && !(drlicense.isEmpty()) && !(drroute.isEmpty()) && !(drexp.isEmpty())){
                ps = sqlConn.prepareStatement("insert into driver(drv_AT,drv_license,drv_route,drv_experience)values(?,?,?,?)");
                ps.setString(1, driverAT);
                ps.setString(2,drlicense);
                ps.setString(3, drroute);
                ps.setString(4, drexp);
                ps.executeUpdate();
            }
            else if(!(drname.isEmpty()) && !(drlname.isEmpty()) && !(drsal.isEmpty()) && !(driverAT.isEmpty()) && !(drlicense.isEmpty()) && !(drroute.isEmpty()) && !(drexp.isEmpty())){
                try{
                    sqlConn = DriverManager.getConnection(dataB,username,password);
                    CallableStatement cs = sqlConn.prepareCall("{call addDriver(?,?,?,?,?,?,?)}");
                    cs.setString(1, driverAT);
                    cs.setString(2, drname);
                    cs.setString(3, drlname);
                    cs.setString(4, drsal);
                    cs.setString(5, drlicense);
                    cs.setString(6, drroute);
                    cs.setString(7, drexp);
                    ResultSet rs = cs.executeQuery();
                }catch (java.sql.SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            } 
            drdriverATtxt.setText("");
            drroutetxt.setText("");
            drexptxt.setText("");
            drlicensetxt.setText("");
            JOptionPane.showMessageDialog(this, "Added Successfully!");
        }catch(Exception e){
            //java.util.logging.Logger.getLogger(branchFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnADDbrActionPerformed

    private void btnResetbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetbrActionPerformed
        // TODO add your handling code here:
        drdriverATtxt.setText("");
        drroutetxt.setText("");
        drexptxt.setText("");
        drlicensetxt.setText("");
    }//GEN-LAST:event_btnResetbrActionPerformed

    private void btnDELETEbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEbrActionPerformed
        // TODO add your handling code here:

        try{
            updateAddDelDriver();
            
            if(!(drlicense.isEmpty()) && drroute.isEmpty() && drexp.isEmpty()){
                ps = sqlConn.prepareStatement("DELETE FROM driver WHERE drv_AT=? AND (drv_license LIKE ?)");
                ps.setString(1, driverAT);
                ps.setString(2, drlicense);
                ps.executeUpdate();
            }else if(drlicense.isEmpty() && !(drroute.isEmpty()) && drexp.isEmpty()){
                ps = sqlConn.prepareStatement("DELETE FROM driver WHERE drv_AT=? AND (drv_route LIKE ?)");
                ps.setString(1, driverAT);
                ps.setString(2, drroute);
                ps.executeUpdate();
            }else if(drlicense.isEmpty() && drroute.isEmpty() && !(drexp.isEmpty())){
                ps = sqlConn.prepareStatement("DELETE FROM driver WHERE drv_AT=? AND (drv_experience LIKE ?)");
                ps.setString(1, driverAT);
                ps.setString(2, drexp);
                ps.executeUpdate();
            }else{
                ps = sqlConn.prepareStatement("DELETE FROM driver WHERE drv_AT=?");
                ps.setString(1, driverAT);
                ps.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
        }catch(Exception e){
            //java.util.logging.Logger.getLogger(branchFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDELETEbrActionPerformed

    private void drlicensetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drlicensetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drlicensetxtActionPerformed

    private void drroutetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drroutetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drroutetxtActionPerformed

    private void drexptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drexptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drexptxtActionPerformed

    private void btnViewDrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrActionPerformed
        // TODO add your handling code here:
        try{

            sqlConn = DriverManager.getConnection(dataB,username,password);
            PreparedStatement pst = sqlConn.prepareStatement("SELECT * FROM driver");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnViewDrActionPerformed

    private void drnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drnametxtActionPerformed

    private void drlasttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drlasttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drlasttxtActionPerformed

    private void drsaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drsaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drsaltxtActionPerformed

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
            java.util.logging.Logger.getLogger(driverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(driverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(driverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(driverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new driverFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDbr;
    private javax.swing.JButton btnDELETEbr;
    private javax.swing.JPanel btnRESETbr3;
    private javax.swing.JButton btnResetbr;
    private javax.swing.JButton btnReturnbr3;
    private javax.swing.JButton btnUPDATEbr;
    private javax.swing.JButton btnViewDr;
    private javax.swing.JTextField drdriverATtxt;
    private javax.swing.JTextField drexptxt;
    private javax.swing.JTextField drlasttxt;
    private javax.swing.JTextField drlicensetxt;
    private javax.swing.JTextField drnametxt;
    private javax.swing.JTextField drroutetxt;
    private javax.swing.JTextField drsaltxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
