
import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class HoaDon extends javax.swing.JFrame {

    DefaultTableModel tblModel_HoaDon;
    DefaultTableModel tblModel_Sach;

    public HoaDon() {
        initComponents();
        tblModel_HoaDon = new DefaultTableModel(
                new String[]{"Mã KH", "Mã Đơn Hàng", "Tổng Tiền", "Tình Trạng HĐ", "Mã NV"}, 0);
        tbl_HoaDon.setModel(tblModel_HoaDon);
        loadHoaDon();
        this.setTitle("Hóa Đơn");
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Mã Sách", "Số Lượng"}, 0);
        tbl_dsSachThem.setModel(model);

    }

    private JComboBox<String> createComboBoxKhachHang() {
        try {
            Connection con = Connect.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT MaKH FROM KhachHang");
            ResultSet rs = stmt.executeQuery();
            JComboBox<String> comboBoxMaKH = new JComboBox<>();
            while (rs.next()) {
                comboBoxMaKH.addItem(rs.getString("MaKH"));
            }
            stmt.close();
            rs.close();
            con.close();
            return comboBoxMaKH;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new JComboBox<>();
        }
    }

    private JComboBox<String> createComboBoxNhanVien() {
        try {
            Connection con = Connect.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT MaNV FROM NhanVien");
            ResultSet rs = stmt.executeQuery();
            JComboBox<String> comboBoxMaNV = new JComboBox<>();
            while (rs.next()) {
                comboBoxMaNV.addItem(rs.getString("MaNV"));
            }
            stmt.close();
            rs.close();
            con.close();
            return comboBoxMaNV;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new JComboBox<>();
        }
    }

    private void loadHoaDon() {
        tblModel_HoaDon.setRowCount(0);
        String sql = "SELECT MaKH, MaHoaDon, TongTien, TrangThaiTT, MaNV FROM HoaDon";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);
                ResultSet rs = psta.executeQuery();) {
            while (rs.next()) {
                String maKH = rs.getString("MaKH");
                String maDonHang = rs.getString("MaHoaDon");
                int tongTien = rs.getInt("TongTien");
                String tinhTrangHD = rs.getString("TrangThaiTT");
                String maNV = rs.getString("MaNV");
                tblModel_HoaDon.addRow(new Object[]{maKH, maDonHang, tongTien, tinhTrangHD, maNV});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        btn_Tim = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_XCT = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_QuayLai = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dsSachThem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_HoaDon);

        btn_Tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timkiem.png"))); // NOI18N
        btn_Tim.setText("Tìm");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        btn_Sua.setBackground(new java.awt.Color(255, 255, 51));
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_XCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChiTiet.png"))); // NOI18N
        btn_XCT.setText("Xem Chi Tiết");
        btn_XCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XCTActionPerformed(evt);
            }
        });

        btn_Xoa.setBackground(new java.awt.Color(102, 102, 255));
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_QuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_QuayLai.setText("Quay Lại");
        btn_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuayLaiActionPerformed(evt);
            }
        });

        btn_Them.setBackground(new java.awt.Color(204, 255, 204));
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý hóa đơn");

        tbl_dsSachThem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_dsSachThem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_XCT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_QuayLai)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Tim)
                        .addComponent(btn_XCT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_Reset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuayLaiActionPerformed
        Menu mn = new Menu();
        this.setVisible(false);
        mn.setVisible(true);
    }//GEN-LAST:event_btn_QuayLaiActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        try {
            JPanel panelHoaDon = new JPanel(new GridLayout(7, 2));
            JComboBox<String> comboBoxMaKH = createComboBoxKhachHang();
            JComboBox<String> comboBoxMaNV = createComboBoxNhanVien();
            JTextField txtMaHD = new JTextField(10);
            Connection con = Connect.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT MaSach, Gia FROM Sach");
            ResultSet rs = stmt.executeQuery();

            JComboBox<String> comboBoxSach = new JComboBox<>();
            while (rs.next()) {
                String maSach = rs.getString("MaSach");
                int gia = rs.getInt("Gia");
                comboBoxSach.addItem(maSach + " - Giá: " + gia);
            }
            stmt.close();
            rs.close();
            JTextField txtSoLuong = new JTextField(10);
            JComboBox<String> comboBoxTinhTrangThanhToan = new JComboBox<>();
            comboBoxTinhTrangThanhToan.addItem("Chưa thanh toán");
            comboBoxTinhTrangThanhToan.addItem("Đã thanh toán");
            List<String> bookDetails = new ArrayList<>();
            JButton btnAddBook = new JButton("Thêm sách vào danh sách");
            btnAddBook.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedSach = comboBoxSach.getSelectedItem().toString();
                    String maSach = selectedSach.split(" - ")[0];
                    int gia = Integer.parseInt(selectedSach.split(" - ")[1].substring(6));
                    int soLuong = Integer.parseInt(txtSoLuong.getText());
                    bookDetails.add(maSach + "," + soLuong + "," + gia);
                    updateTblDsSachThem(bookDetails);
                    JOptionPane.showMessageDialog(null, "Đã thêm sách: " + selectedSach + " với số lượng: " + soLuong);
                }
            });

            panelHoaDon.add(new JLabel("Mã KH:"));
            panelHoaDon.add(comboBoxMaKH);
            panelHoaDon.add(new JLabel("Mã Hóa Đơn:"));
            panelHoaDon.add(txtMaHD);
            panelHoaDon.add(new JLabel("Mã NV:"));
            panelHoaDon.add(comboBoxMaNV);
            panelHoaDon.add(new JLabel("Chọn sách:"));
            panelHoaDon.add(comboBoxSach);
            panelHoaDon.add(new JLabel("Nhập số lượng:"));
            panelHoaDon.add(txtSoLuong);
            panelHoaDon.add(btnAddBook);
            panelHoaDon.add(new JLabel("Tình trạng thanh toán:"));
            panelHoaDon.add(comboBoxTinhTrangThanhToan);

            int result = JOptionPane.showConfirmDialog(null, panelHoaDon, "Nhập thông tin hóa đơn", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String maKH = comboBoxMaKH.getSelectedItem().toString();
                String maHD = txtMaHD.getText();
                String maNV = comboBoxMaNV.getSelectedItem().toString();
                String tinhTrangThanhToan = comboBoxTinhTrangThanhToan.getSelectedItem().toString();
                int tongTienHoaDon = 0;
                for (String bookDetail : bookDetails) {
                    String[] parts = bookDetail.split(",");
                    String maSach = parts[0];
                    int soLuong = Integer.parseInt(parts[1]);
                    int gia = Integer.parseInt(parts[2]);
                    tongTienHoaDon += soLuong * gia;
                    stmt = con.prepareStatement("INSERT INTO ChiTietHoaDon VALUES (?, ?, ?, ?)");
                    stmt.setString(1, maHD);
                    stmt.setString(2, maSach);
                    stmt.setInt(3, soLuong);
                    stmt.setInt(4, gia);
                    stmt.executeUpdate();
                    stmt.close();
                }
                stmt = con.prepareStatement("INSERT INTO HoaDon VALUES (?, ?, ?, ?, ?)");
                stmt.setString(1, maHD);
                stmt.setString(2, maKH);
                stmt.setString(3, maNV);
                stmt.setInt(4, tongTienHoaDon);
                stmt.setString(5, tinhTrangThanhToan);
                stmt.executeUpdate();
                stmt.close();
                loadHoaDon();
                JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công!");
            }
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm hóa đơn: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_ThemActionPerformed
    private void updateTblDsSachThem(List<String> bookDetails) {
        DefaultTableModel model = (DefaultTableModel) tbl_dsSachThem.getModel();
        model.setRowCount(0);
        for (String bookDetail : bookDetails) {
            String[] parts = bookDetail.split(",");
            String maSach = parts[0];
            int soLuong = Integer.parseInt(parts[1]);
            model.addRow(new Object[]{maSach, soLuong});
        }
    }
    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        ((DefaultTableModel) tbl_dsSachThem.getModel()).setRowCount(0);
        try {
            Connection con = Connect.openConnection();
            String sqlUpdateChiTietHoaDon = "UPDATE ChiTietHoaDon "
                    + "SET Gia = Sach.Gia "
                    + "FROM ChiTietHoaDon "
                    + "INNER JOIN Sach ON ChiTietHoaDon.MaSach = Sach.MaSach";
            PreparedStatement pstmtUpdateChiTietHoaDon = con.prepareStatement(sqlUpdateChiTietHoaDon);
            pstmtUpdateChiTietHoaDon.executeUpdate();
            String sqlUpdateChiTietDonHang = "UPDATE ChiTietDonHang "
                    + "SET Gia = Sach.Gia "
                    + "FROM ChiTietDonHang "
                    + "INNER JOIN Sach ON ChiTietDonHang.MaSach = Sach.MaSach";
            PreparedStatement pstmtUpdateChiTietDonHang = con.prepareStatement(sqlUpdateChiTietDonHang);
            pstmtUpdateChiTietDonHang.executeUpdate();
            loadHoaDon();
            JOptionPane.showMessageDialog(null, "Reset thành công!");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        int selectedRowIndex = tbl_HoaDon.getSelectedRow();
        if (selectedRowIndex != -1) {
            String maHoaDon = tblModel_HoaDon.getValueAt(selectedRowIndex, 1).toString();
            try {
                Connection con = Connect.openConnection();
                String sql = "UPDATE HoaDon SET TrangThaiTT = ? WHERE MaHoaDon = ? AND TrangThaiTT = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, "Đã thanh toán");
                pstmt.setString(2, maHoaDon);
                pstmt.setString(3, "Chưa thanh toán");
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Đã cập nhật trạng thái thanh toán thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    tblModel_HoaDon.setValueAt("Đã thanh toán", selectedRowIndex, 3);
                } else {
                    JOptionPane.showMessageDialog(null, "Hóa đơn đã được thanh toán không thể sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
                pstmt.close();
                con.close();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để sửa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        JTextField txtSearch = new JTextField();
        Object[] message = {
            "Nhập mã khách hàng:", txtSearch
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Tìm kiếm", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String searchName = txtSearch.getText().trim();
            if (!searchName.isEmpty()) {
                try {
                    tblModel_HoaDon.setRowCount(0);
                    String sql = "SELECT * FROM HoaDon WHERE MaKH LIKE ?";
                    Connection con = Connect.openConnection();
                    PreparedStatement psta = con.prepareStatement(sql);
                    psta.setString(1, "%" + searchName + "%");
                    ResultSet rs = psta.executeQuery();
                    while (rs.next()) {
                        String maKH = rs.getString("MaKH");
                        String maDonHang = rs.getString("MaHoaDon");
                        int tongTien = rs.getInt("TongTien");
                        String tinhTrangHD = rs.getString("TrangThaiTT");
                        String maNV = rs.getString("MaNV");
                        tblModel_HoaDon.addRow(new Object[]{maKH, maDonHang, tongTien, tinhTrangHD, maNV});
                    }
                    rs.close();
                    psta.close();
                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã khách hàng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_TimActionPerformed

    private void btn_XCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XCTActionPerformed
        int selectedRowIndex = tbl_HoaDon.getSelectedRow();
        if (selectedRowIndex != -1) {
            String maHoaDon = tblModel_HoaDon.getValueAt(selectedRowIndex, 1).toString();
            showChiTietHoaDonDialog(maHoaDon);
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hóa đơn để xem chi tiết!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_XCTActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int selectedRow = tbl_HoaDon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn một hóa đơn để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hóa đơn này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String maHD = tblModel_HoaDon.getValueAt(selectedRow, 1).toString();
            Connection con = null;
            PreparedStatement pstaCTHD = null;
            PreparedStatement pstaHD = null;
            try {
                con = Connect.openConnection();
                con.setAutoCommit(false);

                String sqlCTHD = "DELETE FROM ChiTietHoaDon WHERE MaHoaDon = ?";
                pstaCTHD = con.prepareStatement(sqlCTHD);
                pstaCTHD.setString(1, maHD);
                pstaCTHD.executeUpdate();

                String sqlHD = "DELETE FROM HoaDon WHERE MaHoaDon = ?";
                pstaHD = con.prepareStatement(sqlHD);
                pstaHD.setString(1, maHD);
                pstaHD.executeUpdate();

                con.commit();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                loadHoaDon();
            } catch (Exception e) {
                try {
                    if (con != null) {
                        con.rollback();
                    }
                } catch (SQLException se) {
                    se.printStackTrace();
                }
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } finally {
                try {
                    if (pstaCTHD != null) {
                        pstaCTHD.close();
                    }
                    if (pstaHD != null) {
                        pstaHD.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed
    private void showChiTietHoaDonDialog(String maHoaDon) {
        try {
            Connection con = Connect.openConnection();
            String sql = "SELECT MaSach, SoLuong, Gia FROM ChiTietHoaDon WHERE MaHoaDon = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maHoaDon);
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tblModel_ChiTiet = new DefaultTableModel(
                    new String[]{"Mã Sách", "Số Lượng", "Giá"}, 0);
            JTable tbl_ChiTiet = new JTable(tblModel_ChiTiet);

            while (rs.next()) {
                String maSach = rs.getString("MaSach");
                int soLuong = rs.getInt("SoLuong");
                int gia = rs.getInt("Gia");
                tblModel_ChiTiet.addRow(new Object[]{maSach, soLuong, gia});
            }
            rs.close();
            pstmt.close();
            con.close();
            JPanel panel = new JPanel(new GridLayout(1, 1));
            panel.add(new JScrollPane(tbl_ChiTiet));
            JOptionPane.showMessageDialog(this, panel, "Chi tiết hóa đơn " + maHoaDon, JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_QuayLai;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_XCT;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_HoaDon;
    private javax.swing.JTable tbl_dsSachThem;
    // End of variables declaration//GEN-END:variables
}
