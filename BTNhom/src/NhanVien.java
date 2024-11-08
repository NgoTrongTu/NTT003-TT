
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
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

public class NhanVien extends javax.swing.JFrame {

    DefaultTableModel tblModel;

    public NhanVien() {
        initComponents();
        initTable();
        loadEmployees();
        setTitle("Nhân Viên");
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã", "Tên", "Giới Tính", "DiaChi", "SDTNV", " NgaySinh"});
        tblNhanVien.setModel(tblModel);
    }

    private void loadEmployees() {
        String sql = "SELECT * FROM NhanVien";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);) {
            ResultSet rs = psta.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("MaNV"),
                    rs.getString("TenNV"),
                    rs.getString("GioiTinh"),
                    rs.getString("DiaChi"),
                    rs.getString("SDTNV"),
                    rs.getString("NgaySinh")
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
        tblNhanVien = new javax.swing.JTable();
        btn_SuaNV = new javax.swing.JButton();
        btn_ADDNV = new javax.swing.JButton();
        btn_XoaNV = new javax.swing.JButton();
        btn_Load = new javax.swing.JButton();
        btn_QLMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_TimNV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblNhanVien);

        btn_SuaNV.setBackground(new java.awt.Color(255, 255, 102));
        btn_SuaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btn_SuaNV.setText("Sửa");
        btn_SuaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaNVActionPerformed(evt);
            }
        });

        btn_ADDNV.setBackground(new java.awt.Color(102, 255, 102));
        btn_ADDNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ADDNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        btn_ADDNV.setText("Thêm");
        btn_ADDNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADDNVActionPerformed(evt);
            }
        });

        btn_XoaNV.setBackground(new java.awt.Color(0, 51, 204));
        btn_XoaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_XoaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_XoaNV.setText("Xóa");
        btn_XoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaNVActionPerformed(evt);
            }
        });

        btn_Load.setBackground(new java.awt.Color(0, 204, 102));
        btn_Load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N
        btn_Load.setText("Tải Lại");
        btn_Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoadActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        btn_TimNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TimNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timkiem.png"))); // NOI18N
        btn_TimNV.setText("Tìm kiếm");
        btn_TimNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_TimNV)
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(btn_QLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_ADDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_XoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Load, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_QLMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_TimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ADDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Load, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
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

    private void btn_ADDNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ADDNVActionPerformed
        JTextField maNVField = new JTextField();
        JTextField tenNVField = new JTextField();
        JRadioButton namButton = new JRadioButton("Boy");
        JRadioButton nuButton = new JRadioButton("Girl");
        ButtonGroup gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(namButton);
        gioiTinhGroup.add(nuButton);
        JTextField diaChiField = new JTextField();
        JTextField sdtNVField = new JTextField();
        JTextField ngaySinhField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Mã nhân viên:"));
        panel.add(maNVField);
        panel.add(new JLabel("Tên nhân viên:"));
        panel.add(tenNVField);
        panel.add(new JLabel("Giới tính:"));
        JPanel gioiTinhPanel = new JPanel();
        gioiTinhPanel.add(namButton);
        gioiTinhPanel.add(nuButton);
        panel.add(gioiTinhPanel);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(diaChiField);
        panel.add(new JLabel("Số điện thoại:"));
        panel.add(sdtNVField);
        panel.add(new JLabel("Ngày sinh (YYYY-MM-DD):"));
        panel.add(ngaySinhField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Nhập thông tin nhân viên",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String maNV = maNVField.getText();
            String tenNV = tenNVField.getText();
            String gioiTinh = namButton.isSelected() ? "Boy" : (nuButton.isSelected() ? "Girl" : null);
            String diaChi = diaChiField.getText();
            String sdtNV = sdtNVField.getText();
            String ngaySinh = ngaySinhField.getText();

            if (gioiTinh == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement checkStmt = con.prepareStatement("SELECT COUNT(*) FROM NhanVien WHERE MaNV = ?");) {
                checkStmt.setString(1, maNV);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi kiểm tra mã nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }

            String sql = "INSERT INTO NhanVien (MaNV, TenNV, GioiTinh, DiaChi, SDTNV, NgaySinh) VALUES (?, ?, ?, ?, ?, ?)";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, maNV);
                psta.setString(2, tenNV);
                psta.setString(3, gioiTinh);
                psta.setString(4, diaChi);
                psta.setString(5, sdtNV);
                psta.setString(6, ngaySinh);

                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
                    loadEmployees();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ADDNVActionPerformed

    private void btn_XoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaNVActionPerformed
        int selectedRow = tblNhanVien.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String maNV = tblModel.getValueAt(selectedRow, 0).toString();
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM NhanVien WHERE MaNV = ?";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, maNV);
                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!");
                    loadEmployees();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_XoaNVActionPerformed

    private void btn_SuaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaNVActionPerformed
        int selectedRow = tblNhanVien.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân viên để sửa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String maNV = (String) tblModel.getValueAt(selectedRow, 0);
        String tenNV = (String) tblModel.getValueAt(selectedRow, 1);
        String gioiTinh = (String) tblModel.getValueAt(selectedRow, 2);
        String diaChi = (String) tblModel.getValueAt(selectedRow, 3);
        String sdtNV = (String) tblModel.getValueAt(selectedRow, 4);
        String ngaySinh = (String) tblModel.getValueAt(selectedRow, 5);
        JTextField maNVField = new JTextField(maNV);
        JTextField tenNVField = new JTextField(tenNV);
        JRadioButton namButton = new JRadioButton("Boy");
        JRadioButton nuButton = new JRadioButton("Girl");
        if ("Boy".equals(gioiTinh)) {
            namButton.setSelected(true);
        } else if ("Girl".equals(gioiTinh)) {
            nuButton.setSelected(true);
        }
        ButtonGroup gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(namButton);
        gioiTinhGroup.add(nuButton);

        JTextField diaChiField = new JTextField(diaChi);
        JTextField sdtNVField = new JTextField(sdtNV);
        JTextField ngaySinhField = new JTextField(ngaySinh);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Mã nhân viên:"));
        panel.add(maNVField);
        maNVField.disable();
        panel.add(new JLabel("Tên nhân viên:"));
        panel.add(tenNVField);
        panel.add(new JLabel("Giới tính:"));
        JPanel gioiTinhPanel = new JPanel();
        gioiTinhPanel.add(namButton);
        gioiTinhPanel.add(nuButton);
        panel.add(gioiTinhPanel);
        panel.add(new JLabel("Địa chỉ:"));
        panel.add(diaChiField);
        panel.add(new JLabel("Số điện thoại:"));
        panel.add(sdtNVField);
        panel.add(new JLabel("Ngày sinh (YYYY-MM-DD):"));
        panel.add(ngaySinhField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Sửa thông tin nhân viên",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String tenNVNew = tenNVField.getText();
            String gioiTinhNew = namButton.isSelected() ? "Boy" : (nuButton.isSelected() ? "Girl" : null);
            String diaChiNew = diaChiField.getText();
            String sdtNVNew = sdtNVField.getText();
            String ngaySinhNew = ngaySinhField.getText();

            if (gioiTinhNew == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "UPDATE NhanVien SET TenNV = ?, GioiTinh = ?, DiaChi = ?, SDTNV = ?, NgaySinh = ? WHERE MaNV = ?";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, tenNVNew);
                psta.setString(2, gioiTinhNew);
                psta.setString(3, diaChiNew);
                psta.setString(4, sdtNVNew);
                psta.setString(5, ngaySinhNew);
                psta.setString(6, maNV);

                int rowsAffected = psta.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Sửa thông tin nhân viên thành công!");
                    loadEmployees();
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa thông tin nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi sửa thông tin nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btn_SuaNVActionPerformed

    private void btn_TimNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimNVActionPerformed
        String maNV = JOptionPane.showInputDialog(this, "Nhập mã nhân viên cần tìm:");

        if (maNV != null && !maNV.trim().isEmpty()) {
            String sql = "SELECT * FROM NhanVien WHERE MaNV = ?";
            try (
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, maNV);
                ResultSet rs = psta.executeQuery();
                tblModel.setRowCount(0);
                if (rs.next()) {
                    String[] row = new String[]{
                        rs.getString("MaNV"),
                        rs.getString("TenNV"),
                        rs.getString("GioiTinh"),
                        rs.getString("DiaChi"),
                        rs.getString("SDTNV"),
                        rs.getString("NgaySinh")
                    };
                    tblModel.addRow(row);
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên với mã: " + maNV, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_TimNVActionPerformed

    private void btn_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoadActionPerformed
        loadEmployees();
    }//GEN-LAST:event_btn_LoadActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ADDNV;
    private javax.swing.JButton btn_Load;
    private javax.swing.JButton btn_QLMenu;
    private javax.swing.JButton btn_SuaNV;
    private javax.swing.JButton btn_TimNV;
    private javax.swing.JButton btn_XoaNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanVien;
    // End of variables declaration//GEN-END:variables
}
