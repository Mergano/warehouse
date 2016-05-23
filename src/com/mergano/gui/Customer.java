package com.mergano.gui;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Customer extends javax.swing.JFrame {

    public Customer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_customer_panel = new javax.swing.JPanel();
        ScrollPanelForUserQueryTable = new javax.swing.JScrollPane();
        user_query_table = new javax.swing.JTable();
        customer_manager_input_group = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        customer_name_edit_input = new javax.swing.JTextField();
        company_name_edit_input = new javax.swing.JTextField();
        contact_edit_input = new javax.swing.JTextField();
        cutomer_manager_btn_group = new javax.swing.JPanel();
        edit_customer_btn = new javax.swing.JButton();
        save_customer_btn = new javax.swing.JButton();
        delete_customer_btn = new javax.swing.JButton();
        cancel_customer_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Manager");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/com/mergano/gui/_static/pic/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(750, 569));
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(750, 569));

        edit_customer_panel.setLayout(new java.awt.BorderLayout());

        ScrollPanelForUserQueryTable.setBorder(null);
        ScrollPanelForUserQueryTable.setPreferredSize(new java.awt.Dimension(500, 400));

        user_query_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_query_table.setDragEnabled(true);
        user_query_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_query_tableMouseClicked(evt);
            }
        });
        user_query_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_query_tableKeyPressed(evt);
            }
        });
        ScrollPanelForUserQueryTable.setViewportView(user_query_table);

        edit_customer_panel.add(ScrollPanelForUserQueryTable, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        jLabel1.setText("Name");
        jPanel2.add(jLabel1);

        jLabel2.setText("Company name");
        jPanel2.add(jLabel2);

        jLabel3.setText("Contact");
        jPanel2.add(jLabel3);

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 10, 10));
        jPanel1.add(customer_name_edit_input);
        jPanel1.add(company_name_edit_input);
        jPanel1.add(contact_edit_input);

        javax.swing.GroupLayout customer_manager_input_groupLayout = new javax.swing.GroupLayout(customer_manager_input_group);
        customer_manager_input_group.setLayout(customer_manager_input_groupLayout);
        customer_manager_input_groupLayout.setHorizontalGroup(
            customer_manager_input_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_manager_input_groupLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        customer_manager_input_groupLayout.setVerticalGroup(
            customer_manager_input_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_manager_input_groupLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(customer_manager_input_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        edit_customer_panel.add(customer_manager_input_group, java.awt.BorderLayout.CENTER);

        cutomer_manager_btn_group.setMinimumSize(new java.awt.Dimension(306, 30));
        cutomer_manager_btn_group.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        edit_customer_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        edit_customer_btn.setText("Edit");
        edit_customer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_customer_btnActionPerformed(evt);
            }
        });
        cutomer_manager_btn_group.add(edit_customer_btn);

        save_customer_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        save_customer_btn.setText("Save");
        save_customer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_customer_btnActionPerformed(evt);
            }
        });
        cutomer_manager_btn_group.add(save_customer_btn);

        delete_customer_btn.setForeground(new java.awt.Color(204, 0, 0));
        delete_customer_btn.setText("Delete");
        cutomer_manager_btn_group.add(delete_customer_btn);

        cancel_customer_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cancel_customer_btn.setText("Cancel");
        cancel_customer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_customer_btnActionPerformed(evt);
            }
        });
        cutomer_manager_btn_group.add(cancel_customer_btn);

        edit_customer_panel.add(cutomer_manager_btn_group, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_customer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_customer_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_customer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_customer_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancel_customer_btnActionPerformed

    private void user_query_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_query_tableMouseClicked
        //   this.fillDataField();
    }//GEN-LAST:event_user_query_tableMouseClicked

    private void user_query_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_query_tableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            //    this.fillDataField();
        }
    }//GEN-LAST:event_user_query_tableKeyPressed

    private void edit_customer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_customer_btnActionPerformed
        enable_customer_edit_input(true);
    }//GEN-LAST:event_edit_customer_btnActionPerformed

    private void save_customer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_customer_btnActionPerformed
        enable_customer_edit_input(false);
    }//GEN-LAST:event_save_customer_btnActionPerformed

    private void enable_customer_edit_input(boolean b) {
        customer_name_edit_input.setEditable(b);
        company_name_edit_input.setEditable(b);
        contact_edit_input.setEditable(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPanelForUserQueryTable;
    private javax.swing.JButton cancel_customer_btn;
    private javax.swing.JTextField company_name_edit_input;
    private javax.swing.JTextField contact_edit_input;
    private javax.swing.JPanel customer_manager_input_group;
    private javax.swing.JTextField customer_name_edit_input;
    private javax.swing.JPanel cutomer_manager_btn_group;
    private javax.swing.JButton delete_customer_btn;
    private javax.swing.JButton edit_customer_btn;
    private javax.swing.JPanel edit_customer_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton save_customer_btn;
    public javax.swing.JTable user_query_table;
    // End of variables declaration//GEN-END:variables
}
