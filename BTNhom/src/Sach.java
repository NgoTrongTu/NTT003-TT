
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Sach extends javax.swing.JFrame {

    private DefaultTableModel tblModel_Sach;
        private JComboBox<String> cboMaKho;

    public Sach() {
        initComponents();
        initTable();
        loadDataToTable();
        this.setTitle("Sách");
    }

    private void initTable() {
        tblModel_Sach = new DefaultTableModel();
        tblModel_Sach.setColumnIdentifiers(new String[]{"Mã Sách", "Tên Sách", "Thể Loại", "Tác Giả", "Giá", "Nhà XB", "Mã Kho"});
        tbl_Sach.setModel(tblModel_Sach);
    }

    private void loadDataToTable() {
        try {
            Connection con = Connect.openConnection();
            String sql = "SELECT MaSach, TenSach, TheLoai, TacGia, Gia, NhaXB, MaKho FROM Sach";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            tblModel_Sach.setRowCount(0);
            while (rs.next()) {
                String maSach = rs.getString("MaSach");
                String tenSach = rs.getString("TenSach");
                String theLoai = rs.getString("TheLoai");
                String tacGia = rs.getString("TacGia");
                int gia = rs.getInt("Gia");
                String nhaXB = rs.getString("NhaXB");
                String maKho = rs.getString("MaKho");
                tblModel_Sach.addRow(new Object[]{maSach, tenSach, theLoai, tacGia, gia, nhaXB, maKho});
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu lên bảng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Load = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Sach = new javax.swing.JTable();
        btn_QLMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        btn_Them.setBackground(new java.awt.Color(0, 153, 0));
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setBackground(new java.awt.Color(255, 255, 0));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timkiem.png"))); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_Xoa.setBackground(new java.awt.Color(0, 0, 255));
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N
        btn_Load.setText("Reset");
        btn_Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoadActionPerformed(evt);
            }
        });

        tbl_Sach.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_Sach);

        btn_QLMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_QLMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_QLMenu.setText("Quay Lại");
        btn_QLMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý Sách ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_TimKiem)
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addGap(163, 163, 163)
                .addComponent(btn_Load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(328, 328, 328)
                .addComponent(btn_QLMenu))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Load, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_QLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QLMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLMenuActionPerformed
        Menu fMN = new Menu();
        fMN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_QLMenuActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
  JDialog dialog = new JDialog();
        dialog.setTitle("Thêm Sách");
        dialog.setSize(400, 300);
        dialog.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(7, 2));
        inputPanel.add(new JLabel("Mã Sách:"));
        JTextField txtMaSach = new JTextField();
        inputPanel.add(txtMaSach);
        inputPanel.add(new JLabel("Tên Sách:"));
        JTextField txtTenSach = new JTextField();
        inputPanel.add(txtTenSach);
        inputPanel.add(new JLabel("Thể Loại:"));
        JTextField txtTheLoai = new JTextField();
        inputPanel.add(txtTheLoai);
        inputPanel.add(new JLabel("Tác Giả:"));
        JTextField txtTacGia = new JTextField();
        inputPanel.add(txtTacGia);
        inputPanel.add(new JLabel("Giá:"));
        JTextField txtGia = new JTextField();
        inputPanel.add(txtGia);
        inputPanel.add(new JLabel("Nhà Xuất Bản:"));
        JTextField txtNhaXB = new JTextField();
        inputPanel.add(txtNhaXB);
        inputPanel.add(new JLabel("Mã Kho:"));
        JTextField txtMaKho = new JTextField();
        inputPanel.add(txtMaKho);
        JButton btnThem = new JButton("Thêm");
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maSach = txtMaSach.getText();
                String tenSach = txtTenSach.getText();
                String theLoai = txtTheLoai.getText();
                String tacGia = txtTacGia.getText();
                int gia = Integer.parseInt(txtGia.getText());
                String nhaXB = txtNhaXB.getText();
                String maKho = txtMaKho.getText();
                if (maSach.isEmpty() || tenSach.isEmpty() || theLoai.isEmpty() || tacGia.isEmpty() || nhaXB.isEmpty() || maKho.isEmpty()) {
                    JOptionPane.showMessageDialog(dialog, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    Connection con = Connect.openConnection();
                    String checkSql = "SELECT COUNT(*) FROM Sach WHERE MaSach = ?";
                    PreparedStatement checkPstmt = con.prepareStatement(checkSql);
                    checkPstmt.setString(1, maSach);
                    ResultSet rs = checkPstmt.executeQuery();
                    if (rs.next() && rs.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(dialog, "Mã Sách đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        rs.close();
                        checkPstmt.close();
                        con.close();
                        return;
                    }
                    rs.close();
                    checkPstmt.close();
                    String sql = "INSERT INTO Sach (MaSach, TenSach, TheLoai, TacGia, Gia, NhaXB, MaKho) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, maSach);
                    pstmt.setString(2, tenSach);
                    pstmt.setString(3, theLoai);
                    pstmt.setString(4, tacGia);
                    pstmt.setInt(5, gia);
                    pstmt.setString(6, nhaXB);
                    pstmt.setString(7, maKho);
                    pstmt.executeUpdate();
                    pstmt.close();
                    con.close();
                    loadDataToTable();
                    JOptionPane.showMessageDialog(dialog, "Thêm sách thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    dialog.dispose(); 
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(dialog, "Lỗi khi thêm sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });
        dialog.add(inputPanel, BorderLayout.CENTER);
        dialog.add(btnThem, BorderLayout.SOUTH);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
    int selectedRow = tbl_Sach.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String maSach = tblModel_Sach.getValueAt(selectedRow, 0).toString();
    String tenSach = tblModel_Sach.getValueAt(selectedRow, 1).toString();
    String theLoai = tblModel_Sach.getValueAt(selectedRow, 2).toString();
    String tacGia = tblModel_Sach.getValueAt(selectedRow, 3).toString();
    String gia = tblModel_Sach.getValueAt(selectedRow, 4).toString();
    String nhaXB = tblModel_Sach.getValueAt(selectedRow, 5).toString();
    String maKho = tblModel_Sach.getValueAt(selectedRow, 6).toString();
    JDialog dialog = new JDialog(this, "Sửa thông tin sách", true);
    JLabel lblMaSach = new JLabel("Mã Sách:");
    JTextField txtMaSach = new JTextField(maSach);
    txtMaSach.setEditable(false); // Mã sách không thể chỉnh sửa
    JLabel lblTenSach = new JLabel("Tên Sách:");
    JTextField txtTenSach = new JTextField(tenSach);
    JLabel lblTheLoai = new JLabel("Thể Loại:");
    JTextField txtTheLoai = new JTextField(theLoai);
    JLabel lblTacGia = new JLabel("Tác Giả:");
    JTextField txtTacGia = new JTextField(tacGia);
    JLabel lblGia = new JLabel("Giá:");
    JTextField txtGia = new JTextField(gia);
    JLabel lblNhaXB = new JLabel("Nhà Xuất Bản:");
    JTextField txtNhaXB = new JTextField(nhaXB);
    JLabel lblMaKho = new JLabel("Mã Kho:");
    JTextField txtMaKho = new JTextField(maKho);
    JButton btnCapNhat = new JButton("Cập Nhật");
    btnCapNhat.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String tenSachMoi = txtTenSach.getText();
            String theLoaiMoi = txtTheLoai.getText();
            String tacGiaMoi = txtTacGia.getText();
            String giaMoi = txtGia.getText();
            String nhaXBMoi = txtNhaXB.getText();
            String maKhoMoi = txtMaKho.getText();
            if (tenSachMoi.isEmpty() || theLoaiMoi.isEmpty() || tacGiaMoi.isEmpty() || giaMoi.isEmpty() || nhaXBMoi.isEmpty() || maKhoMoi.isEmpty()) {
                JOptionPane.showMessageDialog(dialog, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Connection con = Connect.openConnection();
                String sql = "UPDATE Sach SET TenSach = ?, TheLoai = ?, TacGia = ?, Gia = ?, NhaXB = ?, MaKho = ? WHERE MaSach = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, tenSachMoi);
                pstmt.setString(2, theLoaiMoi);
                pstmt.setString(3, tacGiaMoi);
                pstmt.setString(4, giaMoi);
                pstmt.setString(5, nhaXBMoi);
                pstmt.setString(6, maKhoMoi);
                pstmt.setString(7, maSach);
                pstmt.executeUpdate();
                pstmt.close();
                con.close();
                loadDataToTable();
                JOptionPane.showMessageDialog(dialog, "Sửa sách thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                dialog.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(dialog, "Lỗi khi sửa sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    });
    dialog.setLayout(new GridLayout(8, 2));
    dialog.add(lblMaSach);
    dialog.add(txtMaSach);
    txtMaSach.disable();
    dialog.add(lblTenSach);
    dialog.add(txtTenSach);
    dialog.add(lblTheLoai);
    dialog.add(txtTheLoai);
    dialog.add(lblTacGia);
    dialog.add(txtTacGia);
    dialog.add(lblGia);
    dialog.add(txtGia);
    dialog.add(lblNhaXB);
    dialog.add(txtNhaXB);
    dialog.add(lblMaKho);
    dialog.add(txtMaKho);
    dialog.add(btnCapNhat);
    dialog.pack();
    dialog.setLocationRelativeTo(this); 
    dialog.setVisible(true);
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int selectedRow = tbl_Sach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String maSach = tblModel_Sach.getValueAt(selectedRow, 0).toString();
        try {
            Connection con = Connect.openConnection();
            String sql = "DELETE FROM Sach WHERE MaSach = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maSach);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Xóa sách thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoadActionPerformed
        loadDataToTable();
    }//GEN-LAST:event_btn_LoadActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String keyword = JOptionPane.showInputDialog(this, "Nhập từ khóa tìm kiếm:");
        if (keyword != null && !keyword.trim().isEmpty()) {
            try {
                Connection con = Connect.openConnection();
                String sql = "SELECT MaSach, TenSach, TheLoai, TacGia, Gia, NhaXB, MaKho FROM Sach WHERE MaSach LIKE ? OR TenSach LIKE ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, "%" + keyword + "%");
                pstmt.setString(2, "%" + keyword + "%");
                ResultSet rs = pstmt.executeQuery();
                tblModel_Sach.setRowCount(0);
                while (rs.next()) {
                    String maSach = rs.getString("MaSach");
                    String tenSach = rs.getString("TenSach");
                    String theLoai = rs.getString("TheLoai");
                    String tacGia = rs.getString("TacGia");
                    int gia = rs.getInt("Gia");
                    String nhaXB = rs.getString("NhaXB");
                    String maKho = rs.getString("MaKho");
                    tblModel_Sach.addRow(new Object[]{maSach, tenSach, theLoai, tacGia, gia, nhaXB, maKho});
                }
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Load;
    private javax.swing.JButton btn_QLMenu;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Sach;
    // End of variables declaration//GEN-END:variables
}
