package gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class keyboard extends javax.swing.JFrame {


    public keyboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_title = new javax.swing.JLabel();
        about_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Keyboard Shortcuts");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("base"); // NOI18N
        setResizable(false);

        about_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        about_title.setText("Keyboard Shortcuts");

        about_close.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        about_close.setText("Close");
        about_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(about_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(about_close, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(about_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(about_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void about_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_about_closeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_close;
    private javax.swing.JLabel about_title;
    // End of variables declaration//GEN-END:variables
}
