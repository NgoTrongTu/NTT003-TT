
import java.awt.Color;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JFrame {

    private static final int SO_LAN_THU = 3;
    private static final long THOI_GIAN_KHOA = 30000; 
    
    private int soLanThu = 0;
    private long thoiGianMoKhoa = 0;
    public DangNhap() {
        initComponents();
        setTitle("Đăng nhập");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        btn_DN = new javax.swing.JButton();
        btn_fps = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("1");
        setBackground(new java.awt.Color(51, 255, 51));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 389, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pass.png"))); // NOI18N
        jLabel2.setText("Mật khẩu      :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Đăng nhập");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-50.png"))); // NOI18N
        jLabel1.setText("Tài khoản    :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txt_Pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 389, -1));

        btn_DN.setBackground(new java.awt.Color(255, 255, 153));
        btn_DN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_DN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogIn.png"))); // NOI18N
        btn_DN.setText("Đăng nhập");
        btn_DN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DNActionPerformed(evt);
            }
        });
        jPanel2.add(btn_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 190, 50));

        btn_fps.setBackground(new java.awt.Color(255, 255, 204));
        btn_fps.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_fps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fp.png"))); // NOI18N
        btn_fps.setText("Quên mật khẩu");
        btn_fps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fpsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_fps, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, 50));

        btn_Exit.setBackground(new java.awt.Color(255, 255, 204));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); // NOI18N
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 30));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 166, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1697e503709a859fe5c311fa54813017.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_fpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fpsActionPerformed
        QuenMaKhau fQMK = new QuenMaKhau();
        fQMK.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_fpsActionPerformed

    private void btn_DNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DNActionPerformed
        if (System.currentTimeMillis() < thoiGianMoKhoa) {
            long thoiGianConLai = (thoiGianMoKhoa - System.currentTimeMillis()) / 1000;
            JOptionPane.showMessageDialog(this, "Bạn đã đăng nhập sai quá 3 lần. Vui lòng thử lại sau " + thoiGianConLai + " giây.", "Bị khóa tài khoản", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tenDangNhap = txt_User.getText();
        String matKhau = String.valueOf(txt_Pass.getPassword());

        try (Connection con = Connect.openConnection()) {
            String sql = "SELECT * FROM TaiKhoan WHERE UserName = ? AND Pass = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenDangNhap);
            pst.setString(2, matKhau);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Menu menu = new Menu();
                menu.setVisible(true);
                this.dispose();
            } else {
                soLanThu++;
                if (soLanThu >= SO_LAN_THU) {
                    thoiGianMoKhoa = System.currentTimeMillis() + THOI_GIAN_KHOA;
                    JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mật khẩu quá 3 lần. Tài khoản sẽ bị khóa trong " + (THOI_GIAN_KHOA / 1000) + " giây.", "Bị khóa tài khoản", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_DNActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DN;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_fps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables

}
