
package projectdb_2022_23;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

public class eventFrame extends javax.swing.JFrame {
    
    private static final String username = "root";
    private static final String password = "123456";
    private static final String dataB = "jdbc:mysql://localhost:3306/travel_agency";
    
    Connection sqlConn = null;
    PreparedStatement ps = null;
    
    String evtripid = null;
    String evstartdt = null;
    String evenddt = null;
    String evdesc = null;
    
    public eventFrame() {
        initComponents();
    }

    public void updateAddDelEvent(){
        try{
             evtripid = evtripidtxt.getText();
             evstartdt = evstartdatetxt.getText();
             evenddt = evenddatetxt.getText();
             evdesc = evdescriptiontxt.getText();
 
             Class.forName("com.mysql.jdbc.Driver");
             sqlConn = DriverManager.getConnection(dataB,username,password);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        btnRESETbr = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReturnbr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        evtripidtxt = new javax.swing.JTextField();
        btnUPDATEbr = new javax.swing.JButton();
        btnADDbr = new javax.swing.JButton();
        btnResetbr = new javax.swing.JButton();
        btnDELETEbr = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        evstartdatetxt = new javax.swing.JTextField();
        evenddatetxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        evdescriptiontxt = new javax.swing.JTextField();
        btnViewEv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRESETbr.setBackground(new java.awt.Color(0, 0, 0));
        btnRESETbr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 8));
        btnRESETbr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Event Table");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRESETbr.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 380, 70));

        btnReturnbr.setFont(new java.awt.Font("Segoe UI Semibold", 1, 26)); // NOI18N
        btnReturnbr.setText("Return");
        btnReturnbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnbrActionPerformed(evt);
            }
        });
        btnRESETbr.add(btnReturnbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 670, 130, 50));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ev_tr_id", "ev_start", "ev_end", "ev_descr"
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

        btnRESETbr.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 800, 250));

        evtripidtxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        evtripidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtripidtxtActionPerformed(evt);
            }
        });
        btnRESETbr.add(evtripidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 460, 30));

        btnUPDATEbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnUPDATEbr.setText("UPDATE");
        btnUPDATEbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUPDATEbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEbrActionPerformed(evt);
            }
        });
        btnRESETbr.add(btnUPDATEbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 130, 50));

        btnADDbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnADDbr.setText("ADD");
        btnADDbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADDbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDbrActionPerformed(evt);
            }
        });
        btnRESETbr.add(btnADDbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 130, 50));

        btnResetbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnResetbr.setText("RESET");
        btnResetbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetbrActionPerformed(evt);
            }
        });
        btnRESETbr.add(btnResetbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 130, 50));

        btnDELETEbr.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnDELETEbr.setText("DELETE");
        btnDELETEbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDELETEbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEbrActionPerformed(evt);
            }
        });
        btnRESETbr.add(btnDELETEbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 130, 50));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("trip id");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, 30));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("start date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        evstartdatetxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        evstartdatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evstartdatetxtActionPerformed(evt);
            }
        });
        btnRESETbr.add(evstartdatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 460, 30));

        evenddatetxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        evenddatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evenddatetxtActionPerformed(evt);
            }
        });
        btnRESETbr.add(evenddatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 460, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("description");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRESETbr.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("end date");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnRESETbr.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        evdescriptiontxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        evdescriptiontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evdescriptiontxtActionPerformed(evt);
            }
        });
        btnRESETbr.add(evdescriptiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 460, 30));

        btnViewEv.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnViewEv.setText("View Data");
        btnViewEv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewEv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEvActionPerformed(evt);
            }
        });
        btnRESETbr.add(btnViewEv, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 130, 40));

        getContentPane().add(btnRESETbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnbrActionPerformed
        // TODO add your handling code here:
        IT_operationsFrame s = new IT_operationsFrame();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnbrActionPerformed

    private void evtripidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evtripidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evtripidtxtActionPerformed

    private void btnResetbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetbrActionPerformed
        // TODO add your handling code here:
        evtripidtxt.setText("");
        evenddatetxt.setText("");
        evdescriptiontxt.setText("");
        evstartdatetxt.setText("");
    }//GEN-LAST:event_btnResetbrActionPerformed

    private void evstartdatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evstartdatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evstartdatetxtActionPerformed

    private void evenddatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evenddatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evenddatetxtActionPerformed

    private void evdescriptiontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evdescriptiontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evdescriptiontxtActionPerformed

    private void btnADDbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDbrActionPerformed
        // TODO add your handling code here:
        
        try{
            updateAddDelEvent();
            
            ps = sqlConn.prepareStatement("insert into event(ev_tr_id,ev_start,en_end,ev_descr)values(?,?,?,?)");

            ps.setString(1, evtripid);
            ps.setString(2,evstartdt);
            ps.setString(3, evenddt);
            ps.setString(4, evdesc);
            
            ps.executeUpdate();
            evtripidtxt.setText("");
            evenddatetxt.setText("");
            evdescriptiontxt.setText("");
            evstartdatetxt.setText("");
            JOptionPane.showMessageDialog(this, "Added Successfully!");
        }catch(Exception e){
            //java.util.logging.Logger.getLogger(branchFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnADDbrActionPerformed

    private void btnUPDATEbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEbrActionPerformed
        // TODO add your handling code here:
        
        try{
            updateAddDelEvent();
            
            if(!(evstartdt.isEmpty()) && evenddt.isEmpty() && evdesc.isEmpty()){
                ps = sqlConn.prepareStatement("UPDATE event set ev_start=? WHERE ev_tr_id=?");
                ps.setString(1, evstartdt);
                ps.setString(2, evtripid);
                ps.executeUpdate();
            }else if(evstartdt.isEmpty() && !(evenddt.isEmpty()) && evdesc.isEmpty()){
                ps = sqlConn.prepareStatement("UPDATE event set en_end=? WHERE ev_tr_id=?");
                ps.setString(1, evenddt);
                ps.setString(2, evtripid);
                ps.executeUpdate();
            }else if(evstartdt.isEmpty() && evenddt.isEmpty() && !(evdesc.isEmpty())){
                ps = sqlConn.prepareStatement("UPDATE event set ev_descr? WHERE ev_tr_id=?");
                ps.setString(1, evdesc);
                ps.setString(2, evtripid);
                ps.executeUpdate();
            }else{
                ps = sqlConn.prepareStatement("UPDATE event set ev_start=?,en_end=?,ev_descr? WHERE ev_tr_id=?");
                ps.setString(4,evtripid);
                ps.setString(1, evstartdt);
                ps.setString(2, evenddt);
                ps.setString(3, evdesc);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
        }catch(Exception e){
            //java.util.logging.Logger.getLogger(branchFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUPDATEbrActionPerformed

    private void btnDELETEbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEbrActionPerformed
        // TODO add your handling code here:
        
        try{
            updateAddDelEvent();
            
            if(!(evstartdt.isEmpty()) && evenddt.isEmpty() && evdesc.isEmpty()){
                ps = sqlConn.prepareStatement("DELETE FROM event WHERE ev_tr_id=? AND (ev_start=?)");
                ps.setString(1, evtripid);
                ps.setString(2, evstartdt);
                ps.executeUpdate();
            }else if(evstartdt.isEmpty() && !(evenddt.isEmpty()) && evdesc.isEmpty()){
                ps = sqlConn.prepareStatement("DELETE FROM event WHERE ev_tr_id=? AND (en_end=?)");
                ps.setString(1, evtripid);
                ps.setString(2, evenddt);
                ps.executeUpdate();
            }else if(evstartdt.isEmpty() && evenddt.isEmpty() && !(evdesc.isEmpty())){
                ps = sqlConn.prepareStatement("DELETE FROM event WHERE ev_tr_id=? AND (ev_descr LIKE ?)");
                ps.setString(1, evtripid);
                ps.setString(2, evdesc);
                ps.executeUpdate();
            }else{
                ps = sqlConn.prepareStatement("DELETE FROM event WHERE ev_tr_id=?");
                ps.setString(1, evtripid);
                ps.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
        }catch(Exception e){
            //java.util.logging.Logger.getLogger(branchFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDELETEbrActionPerformed

    private void btnViewEvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEvActionPerformed
        // TODO add your handling code here:
        try{

            sqlConn = DriverManager.getConnection(dataB,username,password);
            PreparedStatement pst = sqlConn.prepareStatement("SELECT * FROM event");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnViewEvActionPerformed

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
            java.util.logging.Logger.getLogger(eventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eventFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDbr;
    private javax.swing.JButton btnDELETEbr;
    private javax.swing.JPanel btnRESETbr;
    private javax.swing.JButton btnResetbr;
    private javax.swing.JButton btnReturnbr;
    private javax.swing.JButton btnUPDATEbr;
    private javax.swing.JButton btnViewEv;
    private javax.swing.JTextField evdescriptiontxt;
    private javax.swing.JTextField evenddatetxt;
    private javax.swing.JTextField evstartdatetxt;
    private javax.swing.JTextField evtripidtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
