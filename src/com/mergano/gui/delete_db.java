package com.mergano.gui;

public class delete_db extends javax.swing.JFrame {

    public static boolean session;

    public delete_db() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_title = new javax.swing.JLabel();
        close_buttom = new javax.swing.JButton();
        delete_db_buttom = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        login_pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Database");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setName("base"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));

        login_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        login_title.setText("Delete Database");

        close_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_buttom.setText("Cancel");
        close_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttomActionPerformed(evt);
            }
        });

        delete_db_buttom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        delete_db_buttom.setText("Delete");
        delete_db_buttom.setToolTipText("");
        delete_db_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_db_buttomActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Localhost", "Test1", "JukDB", "Digital_ocean" }));

        login_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/login.png"))); // NOI18N

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
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(delete_db_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(close_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(login_title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_pic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_db_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttomActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_buttomActionPerformed

    private void delete_db_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_db_buttomActionPerformed

    }//GEN-LAST:event_delete_db_buttomActionPerformed

    public boolean CurrentSession() {
        return session;
    }

    public void SetCurrentSession(boolean a) {
        session = a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_buttom;
    private javax.swing.JButton delete_db_buttom;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel login_pic;
    private javax.swing.JLabel login_title;
    // End of variables declaration//GEN-END:variables
}
