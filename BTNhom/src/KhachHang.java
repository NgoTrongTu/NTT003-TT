
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class KhachHang extends javax.swing.JFrame {

    DefaultTableModel tblModel;

    public KhachHang() {
        initComponents();
        initTable();
        loadKhachHang();
        setTitle("Khách Hàng");
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã", "Tên", "Giới Tính", "DiaChi", "SDTKH", " Email"});
        tbl_KH.setModel(tblModel);
    }

    private void loadKhachHang() {
        String sql = "SELECT * FROM KhachHang";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);) {
            ResultSet rs = psta.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("MaKH"),
                    rs.getString("TenKH"),
                    rs.getString("GioiTinh"),
                    rs.getString("DiaChi"),
                    rs.getString("SDTKH"),
                    rs.getString("Email")
                };
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi kết nối cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy driver: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_KH = new javax.swing.JTable();
        btn_Edit = new javax.swing.JButton();
        btn_reser = new javax.swing.JButton();
        btn_TimKH = new javax.swing.JButton();
        btn_ADDKH = new javax.swing.JButton();
        btn_XoaKH = new javax.swing.JButton();
        btn_QLMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));

        tbl_KH.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_KH);

        btn_Edit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btn_Edit.setText("Sửa");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        btn_reser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N
        btn_reser.setText("Tải Lại");
        btn_reser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reserActionPerformed(evt);
            }
        });

        btn_TimKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timkiem.png"))); // NOI18N
        btn_TimKH.setText("Tìm kiếm");
        btn_TimKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKHActionPerformed(evt);
            }
        });

        btn_ADDKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ADDKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        btn_ADDKH.setText("Thêm");
        btn_ADDKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADDKHActionPerformed(evt);
            }
        });

        btn_XoaKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_XoaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_XoaKH.setText("Xóa");
        btn_XoaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaKHActionPerformed(evt);
            }
        });

        btn_QLMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_QLMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_QLMenu.setText("Quay Lại");
        btn_QLMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btn_TimKH)
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(125, 125, 125)
                .addComponent(btn_QLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_ADDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_XoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btn_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_TimKH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_QLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ADDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_XoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_reser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ADDKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ADDKHActionPerformed
        JTextField maKHField = new JTextField();
        JTextField tenKHField = new JTextField();
        JRadioButton boyButton = new JRadioButton("Boy");
        JRadioButton girlButton = new JRadioButton("Girl");
        ButtonGroup gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(boyButton);
        gioiTinhGroup.add(girlButton);
        JTextField diaChiField = new JTextField();
        JTextField sdtKHField = new JTextField();
        JTextField emailField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Mã khách hàng:"));
        panel.add(maKHField);
        panel.add(new JLabel("Tên khách hàng:"));
        panel.add(tenKHField);
        panel.add(new JLabel("Giới tính:"));
        JPanel gioiTinhPanel = new JPanel();
        gioiTinhPanel.add(boyButton);
        gioiTinhPanel.add(girlButton);
        panel.add(gioiTinhPanel);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(diaChiField);
        panel.add(new JLabel("Số điện thoại:"));
        panel.add(sdtKHField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Nhập thông tin khách hàng",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String maKH = maKHField.getText();
            String tenKH = tenKHField.getText();
            String gioiTinh = boyButton.isSelected() ? "Boy" : (girlButton.isSelected() ? "Girl" : null);
            String diaChi = diaChiField.getText();
            String sdtKH = sdtKHField.getText();
            String email = emailField.getText();

            if (gioiTinh == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO KhachHang (MaKH, TenKH, GioiTinh, DiaChi, SDTKH, Email) VALUES (?, ?, ?, ?, ?, ?)";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, maKH);
                psta.setString(2, tenKH);
                psta.setString(3, gioiTinh);
                psta.setString(4, diaChi);
                psta.setString(5, sdtKH);
                psta.setString(6, email);

                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
                    loadKhachHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ADDKHActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        int selectedRow = tbl_KH.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để sửa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String maKH = (String) tblModel.getValueAt(selectedRow, 0);
        String tenKH = (String) tblModel.getValueAt(selectedRow, 1);
        String gioiTinh = (String) tblModel.getValueAt(selectedRow, 2);
        String diaChi = (String) tblModel.getValueAt(selectedRow, 3);
        String sdtKH = (String) tblModel.getValueAt(selectedRow, 4);
        String email = (String) tblModel.getValueAt(selectedRow, 5);
        JTextField maKHField = new JTextField(maKH);
        JTextField tenKHField = new JTextField(tenKH);
        JRadioButton boyButton = new JRadioButton("Boy");
        JRadioButton girlButton = new JRadioButton("Girl");
        if (gioiTinh.equals("Boy")) {
            boyButton.setSelected(true);
        } else {
            girlButton.setSelected(true);
        }
        ButtonGroup gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(boyButton);
        gioiTinhGroup.add(girlButton);
        JTextField diaChiField = new JTextField(diaChi);
        JTextField sdtKHField = new JTextField(sdtKH);
        JTextField emailField = new JTextField(email);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Mã khách hàng:"));
        maKHField.disable();
        panel.add(maKHField);
        panel.add(new JLabel("Tên khách hàng:"));
        panel.add(tenKHField);
        panel.add(new JLabel("Giới tính:"));
        JPanel gioiTinhPanel = new JPanel();
        gioiTinhPanel.add(boyButton);
        gioiTinhPanel.add(girlButton);
        panel.add(gioiTinhPanel);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(diaChiField);
        panel.add(new JLabel("Số điện thoại:"));
        panel.add(sdtKHField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Sửa thông tin khách hàng",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            tenKH = tenKHField.getText();
            gioiTinh = boyButton.isSelected() ? "Boy" : "Girl";
            diaChi = diaChiField.getText();
            sdtKH = sdtKHField.getText();
            email = emailField.getText();

            String sql = "UPDATE KhachHang SET TenKH = ?, GioiTinh = ?, DiaChi = ?, SDTKH = ?, Email = ? WHERE MaKH = ?";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, tenKH);
                psta.setString(2, gioiTinh);
                psta.setString(3, diaChi);
                psta.setString(4, sdtKH);
                psta.setString(5, email);
                psta.setString(6, maKH);

                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Sửa thông tin khách hàng thành công!");
                    loadKhachHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa thông tin khách hàng thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi sửa thông tin khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_XoaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaKHActionPerformed
        int selectedRow = tbl_KH.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String maKH = tblModel.getValueAt(selectedRow, 0).toString();
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa khách hàng này và các hóa đơn liên quan?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            String sqlDeleteCustomer = "DELETE FROM KhachHang WHERE MaKH = ?";
            String sqlDeleteInvoices = "DELETE FROM HoaDon WHERE MaKH = ?";
            String sqlDeleteInvoices1 = "DELETE FROM ChiTietHoaDon WHERE MaKH = ?";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement pstaDeleteInvoices1 = con.prepareStatement(sqlDeleteInvoices1);
                    PreparedStatement pstaDeleteInvoices = con.prepareStatement(sqlDeleteInvoices);                   
                    PreparedStatement pstaDeleteCustomer = con.prepareStatement(sqlDeleteCustomer);) {
                con.setAutoCommit(false);  
                pstaDeleteInvoices.setString(1, maKH);
                int rowsInvoicesAffected = pstaDeleteInvoices.executeUpdate();
                pstaDeleteCustomer.setString(1, maKH);
                int rowsCustomerAffected = pstaDeleteCustomer.executeUpdate();
                con.commit();
                if (rowsCustomerAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng và các hóa đơn liên quan thành công!");
                    loadKhachHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_XoaKHActionPerformed

    private void btn_TimKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKHActionPerformed
        JTextField tenKHField = new JTextField();
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Nhập tên khách hàng:"));
        panel.add(tenKHField);
        int result = JOptionPane.showConfirmDialog(null, panel, "Tìm kiếm khách hàng", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String tenKH = tenKHField.getText().trim();

            if (tenKH.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên khách hàng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String sql = "SELECT MaKH, TenKH, GioiTinh, DiaChi, SDTKH, Email FROM KhachHang WHERE TenKH LIKE ?";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, "%" + tenKH + "%");
                ResultSet rs = psta.executeQuery();
                tblModel.setRowCount(0);
                if (rs.next()) {
                    do {
                        String maKH = rs.getString("MaKH");
                        String ten = rs.getString("TenKH");
                        String gioiTinh = rs.getString("GioiTinh");
                        String diaChi = rs.getString("DiaChi");
                        String sdtKH = rs.getString("SDTKH");
                        String emailKH = rs.getString("Email");
                        tblModel.addRow(new Object[]{maKH, ten, gioiTinh, diaChi, sdtKH, emailKH});
                    } while (rs.next());
                } else {
                    JOptionPane.showMessageDialog(this, "Tên khách hàng chưa đăng ký!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_TimKHActionPerformed

    private void btn_QLMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLMenuActionPerformed
        Menu fMN = new Menu();
        fMN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_QLMenuActionPerformed

    private void btn_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reserActionPerformed
        loadKhachHang();
    }//GEN-LAST:event_btn_reserActionPerformed

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
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ADDKH;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_QLMenu;
    private javax.swing.JButton btn_TimKH;
    private javax.swing.JButton btn_XoaKH;
    private javax.swing.JButton btn_reser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_KH;
    // End of variables declaration//GEN-END:variables
}
