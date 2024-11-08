
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Kho extends javax.swing.JFrame {

    DefaultTableModel tblModel_Kho;

    public Kho() {
        initComponents();
        tblModel_Kho = new DefaultTableModel(
                new String[]{"Mã Kho", "Tên Kho", "Địa Chỉ Kho"}, 0);
        tbl_Kho.setModel(tblModel_Kho);
        loadKho();
        this.setTitle("Kho");
    }

    private void loadKho() {
        tblModel_Kho.setRowCount(0);
        String sql = "SELECT MaKho, TenKho, DiaChiKho FROM Kho";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);
                ResultSet rs = psta.executeQuery();) {
            while (rs.next()) {
                String maKho = rs.getString("MaKho");
                String tenKho = rs.getString("TenKho");
                String diaChiKho = rs.getString("DiaChiKho");
                tblModel_Kho.addRow(new Object[]{maKho, tenKho, diaChiKho});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu kho!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Kho = new javax.swing.JTable();
        btn_QLMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        btn_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        btn_Add.setText("Thêm");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btn_Edit.setText("Sửa");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N
        btn_reset.setText("Tải Lại");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timkiem.png"))); // NOI18N
        btn_TimKiem.setText("Tim Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        tbl_Kho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Kho);

        btn_QLMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_QLMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_QLMenu.setText("Quay Lại");
        btn_QLMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý kho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btn_QLMenu)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_reset))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_QLMenu))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QLMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLMenuActionPerformed
        Menu fMN = new Menu();
        fMN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_QLMenuActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        JTextField txtMaKho = new JTextField();
        JTextField txtTenKho = new JTextField();
        JTextField txtDiaChiKho = new JTextField();
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Mã Kho:"));
        panel.add(txtMaKho);
        panel.add(new JLabel("Tên Kho:"));
        panel.add(txtTenKho);
        panel.add(new JLabel("Địa Chỉ Kho:"));
        panel.add(txtDiaChiKho);
        int result = JOptionPane.showConfirmDialog(null, panel, "Thêm Kho", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String maKho = txtMaKho.getText();
            String tenKho = txtTenKho.getText();
            String diaChiKho = txtDiaChiKho.getText();
            if (maKho.isEmpty() || tenKho.isEmpty() || diaChiKho.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (int i = 0; i < tblModel_Kho.getRowCount(); i++) {
                if (tblModel_Kho.getValueAt(i, 0).toString().equals(maKho)) {
                    JOptionPane.showMessageDialog(null, "Mã Kho đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            String sql = "INSERT INTO Kho (MaKho, TenKho, DiaChiKho) VALUES (?, ?, ?)";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, maKho);
                psta.setString(2, tenKho);
                psta.setString(3, diaChiKho);
                int rows = psta.executeUpdate();
                if (rows > 0) {
                    tblModel_Kho.addRow(new Object[]{maKho, tenKho, diaChiKho});
                    loadKho();
                    JOptionPane.showMessageDialog(null, "Thêm kho thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi khi thêm dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int selectedRow = tbl_Kho.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String maKho = tblModel_Kho.getValueAt(selectedRow, 0).toString();
        String sql = "DELETE FROM Kho WHERE MaKho = ?";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);) {
            psta.setString(1, maKho);
            int rows = psta.executeUpdate();
            if (rows > 0) {
                tblModel_Kho.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        int selectedRow = tbl_Kho.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String maKho = tblModel_Kho.getValueAt(selectedRow, 0).toString();
        String tenKho = tblModel_Kho.getValueAt(selectedRow, 1).toString();
        String diaChiKho = tblModel_Kho.getValueAt(selectedRow, 2).toString();
        JTextField txtMaKho = new JTextField(maKho);
        JTextField txtTenKho = new JTextField(tenKho);
        JTextField txtDiaChiKho = new JTextField(diaChiKho);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Mã Kho:"));
        panel.add(txtMaKho);
        txtMaKho.disable();
        panel.add(new JLabel("Tên Kho:"));
        panel.add(txtTenKho);
        panel.add(new JLabel("Địa Chỉ Kho:"));
        panel.add(txtDiaChiKho);
        int result = JOptionPane.showConfirmDialog(null, panel, "Sửa Kho", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            tenKho = txtTenKho.getText();
            diaChiKho = txtDiaChiKho.getText();
            if (tenKho.isEmpty() || diaChiKho.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Connection con = Connect.openConnection();
                String sql = "UPDATE Kho SET TenKho = ?, DiaChiKho = ? WHERE MaKho = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, tenKho);
                pstmt.setString(2, diaChiKho);
                pstmt.setString(3, maKho);
                pstmt.executeUpdate();
                pstmt.close();
                con.close();
                loadKho();
                JOptionPane.showMessageDialog(this, "Sửa kho thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi sửa kho!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        loadKho();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String tenKho = JOptionPane.showInputDialog(this, "Nhập tên kho cần tìm:");
        if (tenKho == null || tenKho.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên kho!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "SELECT MaKho, TenKho, DiaChiKho FROM Kho WHERE TenKho LIKE ?";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);) {
            psta.setString(1, "%" + tenKho + "%");
            ResultSet rs = psta.executeQuery();
            tblModel_Kho.setRowCount(0);
            while (rs.next()) {
                String maKho = rs.getString("MaKho");
                String tenKhoResult = rs.getString("TenKho");
                String diaChiKho = rs.getString("DiaChiKho");
                tblModel_Kho.addRow(new Object[]{maKho, tenKhoResult, diaChiKho});
            }

            if (tblModel_Kho.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kho!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm kho!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_TimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_QLMenu;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Kho;
    // End of variables declaration//GEN-END:variables
}
