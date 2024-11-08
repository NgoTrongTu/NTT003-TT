
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setTitle("Menu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Kho = new javax.swing.JButton();
        btn_Bill = new javax.swing.JButton();
        btn_KhachHang = new javax.swing.JButton();
        btn_Book = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        btn_NhanVien = new javax.swing.JButton();
        btn_DMK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        btn_Kho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Kho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btn_Kho.setText("Kho");
        btn_Kho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KhoActionPerformed(evt);
            }
        });

        btn_Bill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bill.png"))); // NOI18N
        btn_Bill.setText("Bill");
        btn_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BillActionPerformed(evt);
            }
        });

        btn_KhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KhachHang.png"))); // NOI18N
        btn_KhachHang.setText("Khách Hàng");
        btn_KhachHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KhachHangActionPerformed(evt);
            }
        });

        btn_Book.setBackground(new java.awt.Color(255, 255, 255));
        btn_Book.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sach.png"))); // NOI18N
        btn_Book.setText("Sách ");
        btn_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BookActionPerformed(evt);
            }
        });

        btn_Thoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_Thoat.setText(" ");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_NhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/staff.png"))); // NOI18N
        btn_NhanVien.setText("Nhân Viên");
        btn_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVienActionPerformed(evt);
            }
        });

        btn_DMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fp.png"))); // NOI18N
        btn_DMK.setText("Đổi mật khẩu");
        btn_DMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DMKActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loi-nhuan-kinh-doanh-sach-bao-nhieu-ban-sach-co-lai-khong-bytuong-com-1024x683.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Quản lý bán sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Kho, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_DMK, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_KhachHang)
                        .addGap(29, 29, 29)
                        .addComponent(btn_NhanVien)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Kho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Book)
                        .addGap(30, 30, 30)
                        .addComponent(btn_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_DMK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Thoat))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVienActionPerformed
        NhanVien fNV = new NhanVien();
        fNV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_NhanVienActionPerformed

    private void btn_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KhachHangActionPerformed
        KhachHang fKH = new KhachHang();
        fKH.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_KhachHangActionPerformed

    private void btn_KhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KhoActionPerformed
        Kho fK = new Kho();
        fK.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_KhoActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        DangNhap fDN = new DangNhap();
        fDN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BillActionPerformed
        HoaDon fHD = new HoaDon();
        fHD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BillActionPerformed

    private void btn_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookActionPerformed
        Sach fBook = new Sach();
        fBook.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BookActionPerformed

    private void btn_DMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DMKActionPerformed
        JPasswordField txtOldPassword = new JPasswordField(20);
        JTextField txtEmail = new JTextField(20);
        JPasswordField txtNewPassword = new JPasswordField(20);
        JPasswordField txtConfirmPassword = new JPasswordField(20);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Mật khẩu cũ:"));
        panel.add(txtOldPassword);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(new JLabel("Mật khẩu mới:"));
        panel.add(txtNewPassword);
        panel.add(new JLabel("Xác nhận mật khẩu mới:"));
        panel.add(txtConfirmPassword);

        int result = JOptionPane.showConfirmDialog(null, panel, "Đổi mật khẩu", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String oldPassword = new String(txtOldPassword.getPassword());
            String email = txtEmail.getText().trim();
            String newPassword = new String(txtNewPassword.getPassword());
            String confirmPassword = new String(txtConfirmPassword.getPassword());
            if (oldPassword.isEmpty() || email.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!newPassword.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Mật khẩu mới và xác nhận mật khẩu không khớp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "SELECT * FROM TaiKhoan WHERE Email = ? AND Pass = ?";
            try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);) {
                psta.setString(1, email);
                psta.setString(2, oldPassword);
                try (ResultSet rs = psta.executeQuery()) {
                    if (rs.next()) {
                        String updateSql = "UPDATE TaiKhoan SET Pass = ? WHERE Email = ?";
                        try (PreparedStatement updatePsta = con.prepareStatement(updateSql)) {
                            updatePsta.setString(1, newPassword);
                            updatePsta.setString(2, email);
                            int rows = updatePsta.executeUpdate();
                            if (rows > 0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Mật khẩu cũ hoặc email không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi đổi mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_DMKActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bill;
    private javax.swing.JButton btn_Book;
    private javax.swing.JButton btn_DMK;
    private javax.swing.JButton btn_KhachHang;
    private javax.swing.JButton btn_Kho;
    private javax.swing.JButton btn_NhanVien;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
