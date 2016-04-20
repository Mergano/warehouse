package com.mergano.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public static boolean session;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_title = new javax.swing.JLabel();
        close_buttom = new javax.swing.JButton();
        login_buttom = new javax.swing.JButton();
        username_box = new javax.swing.JTextField();
        password_box = new javax.swing.JPasswordField();
        username_login = new javax.swing.JLabel();
        password_login = new javax.swing.JLabel();
        reset_buttom = new javax.swing.JButton();
        login_pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("base"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));

        login_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        login_title.setText("Administrator Login");

        close_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_buttom.setText("Cancel");
        close_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttomActionPerformed(evt);
            }
        });

        login_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_buttom.setText("Login");
        login_buttom.setToolTipText("");
        login_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttomActionPerformed(evt);
            }
        });

        username_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_boxActionPerformed(evt);
            }
        });

        username_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username_login.setText("Username");

        password_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password_login.setText("Password");

        reset_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reset_buttom.setText("Reset");
        reset_buttom.setToolTipText("");
        reset_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttomActionPerformed(evt);
            }
        });

        login_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/pic/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_pic)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_login)
                            .addComponent(login_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(reset_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(close_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(password_login))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(username_box, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(password_box, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(login_title))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_pic)
                .addGap(14, 14, 14)
                .addComponent(login_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_login)
                    .addComponent(username_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttomActionPerformed
        if (evt.getSource() == close_buttom) {
            this.dispose();
        }
    }//GEN-LAST:event_close_buttomActionPerformed

    private void login_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttomActionPerformed
        String user;
        char[] pwd;
        if (evt.getSource() == login_buttom) {
            user = username_box.getText();
            pwd = password_box.getPassword();

            if (user.equals("admin")) {
                session = true;
                new main().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password incorrect!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            username_box.setText("");
            password_box.setText("");
        }
    }//GEN-LAST:event_login_buttomActionPerformed

    private void reset_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttomActionPerformed
        if (evt.getSource() == reset_buttom) {
            username_box.setText("");
            password_box.setText("");
        }
    }//GEN-LAST:event_reset_buttomActionPerformed

    private void username_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_boxActionPerformed

    public boolean CurrentSession() {
        return session;
    }

    public void SetCurrentSession(boolean a) {
        session = a;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_buttom;
    private javax.swing.JButton login_buttom;
    private javax.swing.JLabel login_pic;
    private javax.swing.JLabel login_title;
    private javax.swing.JPasswordField password_box;
    private javax.swing.JLabel password_login;
    private javax.swing.JButton reset_buttom;
    private javax.swing.JTextField username_box;
    private javax.swing.JLabel username_login;
    // End of variables declaration//GEN-END:variables
}
