package com.mergano.gui;

import com.mergano.core.dbManager.ConnectDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connects extends javax.swing.JFrame implements ActionListener {

    public boolean session;
    public boolean remember;
    ConnectDB cv = new ConnectDB();

    public connects() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_title = new javax.swing.JLabel();
        login_pic = new javax.swing.JLabel();
        database_connection_panel = new javax.swing.JPanel();
        hostname_box = new javax.swing.JTextField();
        hostname_title = new javax.swing.JLabel();
        port_box = new javax.swing.JTextField();
        port_title = new javax.swing.JLabel();
        database_title = new javax.swing.JLabel();
        database_box = new javax.swing.JTextField();
        username_title = new javax.swing.JLabel();
        username_box = new javax.swing.JTextField();
        password_login = new javax.swing.JLabel();
        password_box = new javax.swing.JPasswordField();
        remember_me_checkbox = new javax.swing.JCheckBox();
        setas_default_db_checkbox = new javax.swing.JCheckBox();
        database_title1 = new javax.swing.JLabel();
        close_buttom = new javax.swing.JButton();
        test_buttom = new javax.swing.JButton();
        add_buttom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Database");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("base"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));

        login_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        login_title.setText("Add Database");

        login_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/pic/login.png"))); // NOI18N

        database_connection_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Connection", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        hostname_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        hostname_box.addActionListener((java.awt.event.ActionEvent evt) -> {
        });

        hostname_title.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        hostname_title.setText("Hostname:");

        port_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        port_box.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        port_box.addActionListener((java.awt.event.ActionEvent evt) -> {
        });

        port_title.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        port_title.setText("Port:");

        database_title.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        database_title.setText("Database name:");

        database_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        username_title.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username_title.setText("Username:");

        username_box.setFont(new java.awt.Font("Segoe UI", 0, 12));

        password_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password_login.setText("Password");

        remember_me_checkbox.setText("Remember me");

        setas_default_db_checkbox.setText("Set as default database");

        database_title1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        database_title1.setText("Database Type:");

        javax.swing.GroupLayout database_connection_panelLayout = new javax.swing.GroupLayout(database_connection_panel);
        database_connection_panel.setLayout(database_connection_panelLayout);
        database_connection_panelLayout.setHorizontalGroup(
                database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(database_connection_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password_box)
                                .addComponent(username_box)
                                .addGroup(database_connection_panelLayout.createSequentialGroup()
                                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(hostname_box, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(hostname_title))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(database_connection_panelLayout.createSequentialGroup()
                                                        .addComponent(port_title)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(port_box)))
                                .addGroup(database_connection_panelLayout.createSequentialGroup()
                                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(password_login)
                                                .addComponent(remember_me_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(setas_default_db_checkbox)
                                                .addComponent(username_title)
                                                .addComponent(database_title)
                                                .addComponent(database_box))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(database_title1))))
                        .addContainerGap())
        );
        database_connection_panelLayout.setVerticalGroup(
                database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(database_connection_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hostname_title)
                                .addComponent(port_title))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hostname_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(port_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(database_title)
                                .addComponent(database_title1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(database_connection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(database_box, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(password_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remember_me_checkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setas_default_db_checkbox))
        );

        close_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_buttom.setText("Cancel");
        close_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttomActionPerformed(evt);
            }
        });

        test_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        test_buttom.setText("Test");
        test_buttom.setToolTipText("");
        test_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test_buttomActionPerformed(evt);
            }
        });

        add_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_buttom.setText("Add");
        add_buttom.setToolTipText("");
        add_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(login_pic)
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(database_connection_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(add_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(test_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(close_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)))
                        .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(login_title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(login_pic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(database_connection_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(test_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(close_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttomActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_buttomActionPerformed

    private void add_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttomActionPerformed
        boolean isSelected = remember_me_checkbox.isSelected();
        if (isSelected) {
            remember_me_checkbox.setSelected(true);
            cv.setHostname(hostname_box.getText());
            cv.setPort(Integer.valueOf(port_box.getText()));
            cv.setDatabaseName(database_box.getText());
            cv.setUsername(username_box.getText());
            cv.setPassword(password_box.getText());
            cv.setUrl("jdbc:mysql://" + hostname_box.getText() + ":" + Integer.valueOf(port_box.getText()) + "/" + database_box.getText() + "?useCompression=true");

            if (setas_default_db_checkbox.isSelected()) {
                System.out.println("Remember me value is " + remember_me_checkbox.isSelected());
                System.out.println("Set as default DB value is " + setas_default_db_checkbox.isSelected());
            } else {
                System.out.println("Remember me value is " + remember_me_checkbox.isSelected());
                System.out.println("Set as default DB value is " + setas_default_db_checkbox.isSelected());
            }

            add_buttom.addActionListener(this);
            this.dispose();
        } else {
            remember_me_checkbox.setSelected(false);

        }

    }//GEN-LAST:event_add_buttomActionPerformed

    private void StoreDatabase(String hostname, int port, String database, String username, String password) {

        try {
            Properties p = new Properties();
            p.load(new FileInputStream("database.ini"));
            System.out.println("user = " + p.getProperty("DBuser"));
            System.out.println("password = " + p.getProperty("DBpassword"));
            System.out.println("location = " + p.getProperty("DBlocation"));
            p.list(System.out);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void test_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test_buttomActionPerformed
        if (evt.getSource() == test_buttom) {
            if (hostname_box.getText().equals("")
                    || port_box.getText().equals("")
                    || database_box.getText().equals("")
                    || username_box.getText().equals("")
                    || password_box.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill out all boxs.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else if (!isNumeric(port_box.getText())) {
                JOptionPane.showMessageDialog(this, "Port number must be an integer format only.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    cv.getconnection();
                } catch (Exception ex) {
                    Logger.getLogger(connects.class.getName()).log(Level.SEVERE, null, ex);
                }
                String test_result = cv.getError();
                if (test_result.equals("Error Database Connection Failed")) {
                    JOptionPane.showMessageDialog(this, "Error Database Connection Failed.", "Connection Failed", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Database Connected Successfully.", "Connection Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_test_buttomActionPerformed

    public boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private void remember_me_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remember_me_checkboxActionPerformed
        if (evt.getSource() == test_buttom) {
            if (remember_me_checkbox.isSelected()) {
                remember = true;
            } else {
                remember = false;
            }
        }
    }//GEN-LAST:event_remember_me_checkboxActionPerformed

    public boolean CurrentSession() {
        return session;
    }

    public void SetCurrentSession(boolean a) {
        session = a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_buttom;
    private javax.swing.JButton close_buttom;
    private javax.swing.JTextField database_box;
    private javax.swing.JPanel database_connection_panel;
    private javax.swing.JLabel database_title;
    private javax.swing.JLabel database_title1;
    private javax.swing.JTextField hostname_box;
    private javax.swing.JLabel hostname_title;
    private javax.swing.JLabel login_pic;
    private javax.swing.JLabel login_title;
    private javax.swing.JPasswordField password_box;
    private javax.swing.JLabel password_login;
    private javax.swing.JTextField port_box;
    private javax.swing.JLabel port_title;
    private javax.swing.JCheckBox remember_me_checkbox;
    private javax.swing.JCheckBox setas_default_db_checkbox;
    private javax.swing.JButton test_buttom;
    private javax.swing.JTextField username_box;
    private javax.swing.JLabel username_title;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
