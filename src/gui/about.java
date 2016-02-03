package gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class about extends javax.swing.JFrame {


    public about() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        about_picture = new javax.swing.JLabel();
        about_close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("base"); // NOI18N
        setResizable(false);

        about_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        about_title.setText("About Mergano Project");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("5713500244 Chukkrit Visitsaktavorn");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Our Develop Team");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Product version:");

        about_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/about.png"))); // NOI18N
        about_picture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about_picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_pictureMouseClicked(evt);
            }
        });

        about_close.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        about_close.setText("Close");
        about_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_closeActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\"Mergano Project develop for using in stock management / monitor production / \nsummary product revenue. \n\nThis project is also a part of CSC105 Programming II in Computer Science SIT @ KMUTT \nFor more information please visit: www.mergano.com  Copyright 2015 @ JukLab\"");
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("1.0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(about_picture)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(about_title)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(about_close, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(about_picture)
                .addGap(18, 18, 18)
                .addComponent(about_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(about_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void about_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_about_closeActionPerformed

    private void about_pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_pictureMouseClicked
        try 
        {
            Desktop.getDesktop().browse(new URL("https://github.com/Juklab/mergano").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_about_pictureMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_close;
    private javax.swing.JLabel about_picture;
    private javax.swing.JLabel about_title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
