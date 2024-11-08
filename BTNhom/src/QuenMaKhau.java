
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuenMaKhau extends javax.swing.JFrame {

    private int soLanSai = 0;
    private long thoiGianKhoa = 0;

    public QuenMaKhau() {
        initComponents();
        setTitle("Quên mật khẩu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Gui = new javax.swing.JButton();
        btn_QuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        txt_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quên mật khẩu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        btn_Gui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Gui.setText("Xác nhận");
        btn_Gui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuiActionPerformed(evt);
            }
        });

        btn_QuayLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_QuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_QuayLai.setText("Quay lại");
        btn_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Gui, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_QuayLai)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Gui, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuiActionPerformed
        String email = txt_Email.getText().trim();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        long currentTime = System.currentTimeMillis();
        if (currentTime < thoiGianKhoa) {
            JOptionPane.showMessageDialog(this, "Vui lòng đợi " + ((thoiGianKhoa - currentTime) / 1000) + " giây trước khi thử lại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "SELECT * FROM TaiKhoan WHERE Email = ?";
        try (
                Connection con = Connect.openConnection();
                PreparedStatement psta = con.prepareStatement(sql);) {
            psta.setString(1, email);
            ResultSet rs = psta.executeQuery();
            if (rs.next()) {
                JTextField newPasswordField = new JTextField();
                JTextField confirmPasswordField = new JTextField();
                JPanel panel = new JPanel(new GridLayout(0, 1));
                panel.add(new JLabel("Mật khẩu mới:"));
                panel.add(newPasswordField);
                panel.add(new JLabel("Xác nhận mật khẩu mới:"));
                panel.add(confirmPasswordField);

                int result = JOptionPane.showConfirmDialog(null, panel, "Đặt lại mật khẩu",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    String newPassword = newPasswordField.getText().trim();
                    String confirmPassword = confirmPasswordField.getText().trim();

                    if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    if (!newPassword.equals(confirmPassword)) {
                        JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String updateSql = "UPDATE TaiKhoan SET Pass = ? WHERE Email = ?";
                    try (
                            PreparedStatement updatePsta = con.prepareStatement(updateSql);) {
                        updatePsta.setString(1, newPassword);
                        updatePsta.setString(2, email);
                        int rowsAffected = updatePsta.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(this, "Đặt lại mật khẩu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Đặt lại mật khẩu thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }
                }
            } else {
                soLanSai++;
                if (soLanSai >= 3) {
                    thoiGianKhoa = currentTime + 30000; 
                    JOptionPane.showMessageDialog(this, "Tài khoản đã bị tạm khóa trong 30 giây do nhập sai mật khẩu quá 3 lần!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Email chưa được đăng ký!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi kiểm tra email!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_GuiActionPerformed

    private void btn_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuayLaiActionPerformed
        DangNhap fDN = new DangNhap();
        fDN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_QuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(QuenMaKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMaKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMaKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMaKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMaKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Gui;
    private javax.swing.JButton btn_QuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_Email;
    // End of variables declaration//GEN-END:variables
}
