package com.mergano.gui;

import com.mergano.core.dbManager.*;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class main extends javax.swing.JFrame {

    private login lo = null;

    public main() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JTabbedPane();
        home_panel = new javax.swing.JPanel();
        welcome_bg = new javax.swing.JLabel();
        body_panel = new javax.swing.JPanel();
        home_icon_panel = new javax.swing.JPanel();
        da_button_wel = new javax.swing.JButton();
        sm_button_wel = new javax.swing.JButton();
        ord_button_wel = new javax.swing.JButton();
        trac_button_wel = new javax.swing.JButton();
        data_button_wel = new javax.swing.JButton();
        ser_button_wel = new javax.swing.JButton();
        rep_button_wel = new javax.swing.JButton();
        sta_button_wel = new javax.swing.JButton();
        bac_button_wel = new javax.swing.JButton();
        mai_button_wel = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        welcome_panel_pic = new javax.swing.JButton();
        dashboard_panel = new javax.swing.JPanel();
        management_panel = new javax.swing.JPanel();
        browse_button = new javax.swing.JButton();
        View_button = new javax.swing.JButton();
        pathname_box = new javax.swing.JTextField();
        product_information_panel = new javax.swing.JPanel();
        add_product_button = new javax.swing.JButton();
        remove_product_button = new javax.swing.JButton();
        edit_product_button = new javax.swing.JButton();
        save_product_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        description_input = new javax.swing.JTextArea();
        Type = new javax.swing.JLabel();
        product_img_panel = new javax.swing.JPanel();
        product_img = new javax.swing.JButton();
        name_input = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        productID_input = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        warranty_input = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        category_input = new javax.swing.JComboBox();
        manufacture_input = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        model_input = new javax.swing.JTextField();
        model_txt = new javax.swing.JLabel();
        model_txt1 = new javax.swing.JLabel();
        cost_input = new javax.swing.JTextField();
        model_txt2 = new javax.swing.JLabel();
        quantity_input = new javax.swing.JSpinner();
        model_txt3 = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        type_input = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        search_box = new javax.swing.JTextField();
        search_product_button = new javax.swing.JButton();
        filter_column = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        select_table_management = new javax.swing.JComboBox();
        ScrollPanelForQueryTable = new javax.swing.JScrollPane();
        query_table = new javax.swing.JTable();
        order_panel = new javax.swing.JPanel();
        order_confirm_btn = new javax.swing.JButton();
        order_pane = new javax.swing.JPanel();
        tracking_panel = new javax.swing.JPanel();
        database_panel = new javax.swing.JPanel();
        store_db_panel = new javax.swing.JPanel();
        localhost_db = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        db4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        db_manager_panel = new javax.swing.JPanel();
        add_database_button = new javax.swing.JButton();
        find_database_button = new javax.swing.JButton();
        delete_database_button1 = new javax.swing.JButton();
        db_info_panel = new javax.swing.JPanel();
        db_show_info_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        connect_status_box = new javax.swing.JTextField();
        database_name_show_box = new javax.swing.JTextField();
        hostname_show_box = new javax.swing.JTextField();
        database_type_show_box = new javax.swing.JTextField();
        port_show_box = new javax.swing.JTextField();
        driver_box = new javax.swing.JTextField();
        print_database_info_button = new javax.swing.JButton();
        test_connection_button = new javax.swing.JButton();
        set_as_default_button = new javax.swing.JButton();
        searching_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        search_box_searching = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        search_button = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        report_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        statistics_panel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jToggleButton7 = new javax.swing.JToggleButton();
        backlog_panel = new javax.swing.JPanel();
        ScrollPanelForBacklog = new javax.swing.JScrollPane();
        backlog_table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        status_bar_frame = new javax.swing.JPanel();
        db_name_box = new javax.swing.JTextField();
        status_label = new javax.swing.JLabel();
        status_label1 = new javax.swing.JLabel();
        status_box = new javax.swing.JTextField();
        db_type_box = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        port_box = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        url_box = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tool_bar_frame = new javax.swing.JPanel();
        main_toolbar = new javax.swing.JToolBar();
        Home_button = new javax.swing.JButton();
        Dashboard_button = new javax.swing.JButton();
        Search_Button = new javax.swing.JButton();
        Bookmark_button = new javax.swing.JButton();
        Reports_button = new javax.swing.JButton();
        User_button = new javax.swing.JButton();
        Print_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Options_button = new javax.swing.JButton();
        main_menubar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        open_menuitem = new javax.swing.JMenuItem();
        save_menuitem = new javax.swing.JMenuItem();
        saveas_menuitem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        welcome_menuitem = new javax.swing.JMenuItem();
        dashboard_menuitem = new javax.swing.JMenuItem();
        stock_management_menuitem = new javax.swing.JMenuItem();
        order_management_menuitem = new javax.swing.JMenuItem();
        tracking_menuitem = new javax.swing.JMenuItem();
        database_menuitem = new javax.swing.JMenuItem();
        searching_menuitem = new javax.swing.JMenuItem();
        report_menuitem = new javax.swing.JMenuItem();
        statistics_menuitem = new javax.swing.JMenuItem();
        backlog_menuitem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        print_menuitem = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        print_preview_menuitem = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        logout_menuitem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exit_program = new javax.swing.JMenuItem();
        edit_menu = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        view_menu = new javax.swing.JMenu();
        hint_menuitem = new javax.swing.JCheckBoxMenuItem();
        toolbar_menuitem = new javax.swing.JCheckBoxMenuItem();
        statusbar_menuitem = new javax.swing.JCheckBoxMenuItem();
        database_menu = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        new_db_menuitem = new javax.swing.JMenuItem();
        del_db_menuitem = new javax.swing.JMenuItem();
        find_db_menuitem = new javax.swing.JMenuItem();
        connect_menuitem = new javax.swing.JMenuItem();
        disconnect_menuitem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        import_menuitem = new javax.swing.JMenu();
        import_csv_menuitem = new javax.swing.JMenuItem();
        export_menuitem = new javax.swing.JMenu();
        export_csv_menuitem = new javax.swing.JMenuItem();
        export_txt_menuitem = new javax.swing.JMenuItem();
        export_sql_menuitem = new javax.swing.JMenuItem();
        tools_menu = new javax.swing.JMenu();
        search_menuitem = new javax.swing.JMenuItem();
        backup_menuitem = new javax.swing.JMenuItem();
        bookmark_menuitem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        options_menuitem = new javax.swing.JMenuItem();
        help_menu = new javax.swing.JMenu();
        help_contents_menuitem = new javax.swing.JMenuItem();
        online_docs_menuitem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        report_bug_menuitem = new javax.swing.JMenuItem();
        feedback_menuitem = new javax.swing.JMenuItem();
        website_menuitem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        check_for_update_menuitem = new javax.swing.JMenuItem();
        about_menuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/Bundle"); // NOI18N
        //setTitle(bundle.getString("title")); // NOI18N
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setName("main_frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 640));

        home_panel.setBackground(new java.awt.Color(255, 255, 255));
        home_panel.setLayout(new java.awt.BorderLayout());

        welcome_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/pic/welcome.png"))); // NOI18N
        home_panel.add(welcome_bg, java.awt.BorderLayout.NORTH);

        body_panel.setLayout(new java.awt.GridLayout(1, 2));

        home_icon_panel.setBackground(new java.awt.Color(255, 255, 255));
        home_icon_panel.setLayout(new java.awt.GridLayout(5, 2));

        da_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        da_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        da_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Dashboard.png"))); // NOI18N
        da_button_wel.setText("Dashboard");
        da_button_wel.setContentAreaFilled(false);
        da_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        da_button_wel.setIconTextGap(16);
        da_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        da_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Dashboard_roll.png"))); // NOI18N
        da_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Dashboard_roll.png"))); // NOI18N
        da_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                da_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(da_button_wel);

        sm_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sm_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        sm_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/notebook.png"))); // NOI18N
        sm_button_wel.setText("Stock Management");
        sm_button_wel.setBorderPainted(false);
        sm_button_wel.setContentAreaFilled(false);
        sm_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sm_button_wel.setIconTextGap(16);
        sm_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/notebook_roll.png"))); // NOI18N
        sm_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/notebook_roll.png"))); // NOI18N
        sm_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(sm_button_wel);

        ord_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ord_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        ord_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Clipboard_Full.png"))); // NOI18N
        ord_button_wel.setText("Order Management");
        ord_button_wel.setBorderPainted(false);
        ord_button_wel.setContentAreaFilled(false);
        ord_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ord_button_wel.setIconTextGap(16);
        ord_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        ord_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Clipboard_Full_roll.png"))); // NOI18N
        ord_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Clipboard_Full_roll.png"))); // NOI18N
        ord_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ord_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(ord_button_wel);

        trac_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        trac_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        trac_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Checkmark.png"))); // NOI18N
        trac_button_wel.setText("Tracking");
        trac_button_wel.setBorderPainted(false);
        trac_button_wel.setContentAreaFilled(false);
        trac_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        trac_button_wel.setIconTextGap(16);
        trac_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Checkmark_roll.png"))); // NOI18N
        trac_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Checkmark_roll.png"))); // NOI18N
        trac_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trac_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(trac_button_wel);

        data_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        data_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        data_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        data_button_wel.setText("Database");
        data_button_wel.setBorderPainted(false);
        data_button_wel.setContentAreaFilled(false);
        data_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data_button_wel.setIconTextGap(16);
        data_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        data_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32_roll.png"))); // NOI18N
        data_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32_roll.png"))); // NOI18N
        data_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(data_button_wel);

        ser_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ser_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        ser_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Search.png"))); // NOI18N
        ser_button_wel.setText("Searching");
        ser_button_wel.setBorderPainted(false);
        ser_button_wel.setContentAreaFilled(false);
        ser_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ser_button_wel.setIconTextGap(16);
        ser_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Search_roll.png"))); // NOI18N
        ser_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Search_roll.png"))); // NOI18N
        ser_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(ser_button_wel);

        rep_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rep_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        rep_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Chart_Graph.png"))); // NOI18N
        rep_button_wel.setText("Reporting");
        rep_button_wel.setBorderPainted(false);
        rep_button_wel.setContentAreaFilled(false);
        rep_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rep_button_wel.setIconTextGap(16);
        rep_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        rep_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Chart_Graph_roll.png"))); // NOI18N
        rep_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Chart_Graph_roll.png"))); // NOI18N
        rep_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(rep_button_wel);

        sta_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sta_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        sta_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Chart_Pie.png"))); // NOI18N
        sta_button_wel.setText("Statistics");
        sta_button_wel.setBorderPainted(false);
        sta_button_wel.setContentAreaFilled(false);
        sta_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sta_button_wel.setIconTextGap(16);
        sta_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Chart_Pie_roll.png"))); // NOI18N
        sta_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Chart_Pie_roll.png"))); // NOI18N
        sta_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sta_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(sta_button_wel);

        bac_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bac_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        bac_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Clock2.png"))); // NOI18N
        bac_button_wel.setText("Backlog");
        bac_button_wel.setBorderPainted(false);
        bac_button_wel.setContentAreaFilled(false);
        bac_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bac_button_wel.setIconTextGap(16);
        bac_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        bac_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Clock2_roll.png"))); // NOI18N
        bac_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/Clock2_roll.png"))); // NOI18N
        bac_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bac_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(bac_button_wel);

        mai_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mai_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        mai_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/cup.png"))); // NOI18N
        mai_button_wel.setText("Maintainance");
        mai_button_wel.setBorderPainted(false);
        mai_button_wel.setContentAreaFilled(false);
        mai_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mai_button_wel.setIconTextGap(16);
        mai_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/cup_roll.png"))); // NOI18N
        mai_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/cup_roll.png"))); // NOI18N
        mai_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mai_button_welActionPerformed(evt);
            }
        });
        home_icon_panel.add(mai_button_wel);

        body_panel.add(home_icon_panel);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        welcome_panel_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/pic/welcome_panel.png"))); // NOI18N
        welcome_panel_pic.setBorderPainted(false);
        welcome_panel_pic.setContentAreaFilled(false);
        welcome_panel_pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcome_panel_picActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(welcome_panel_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(welcome_panel_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        body_panel.add(panel);

        home_panel.add(body_panel, java.awt.BorderLayout.CENTER);

        body.addTab("Welcome", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/home.png")), home_panel); // NOI18N

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        body.addTab("Dashboard", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/dashboard.png")), dashboard_panel); // NOI18N

        browse_button.setText("Browse..");
        browse_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_buttonActionPerformed(evt);
            }
        });

        View_button.setText("Preview");
        View_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_buttonActionPerformed(evt);
            }
        });

        pathname_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_search_box(evt);
            }
        });

        product_information_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Information", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        product_information_panel.setPreferredSize(new java.awt.Dimension(393, 420));

        add_product_button.setText("Add");
        add_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        add_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_buttonActionPerformed(evt);
            }
        });

        remove_product_button.setText("Remove");
        remove_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        remove_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_product_buttonActionPerformed(evt);
            }
        });

        edit_product_button.setText("Edit..");
        edit_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        edit_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_product_buttonActionPerformed(evt);
            }
        });

        save_product_button.setText("Save");
        save_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        save_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_product_buttonActionPerformed(evt);
            }
        });

        description_input.setEditable(false);
        description_input.setColumns(20);
        description_input.setRows(5);
        jScrollPane3.setViewportView(description_input);

        Type.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Type.setText("Type");

        product_img_panel.setBackground(new java.awt.Color(255, 255, 255));
        product_img_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        product_img.setBackground(new java.awt.Color(255, 255, 255));
        product_img.setBorder(null);
        product_img.setContentAreaFilled(false);
        product_img.setMaximumSize(new java.awt.Dimension(150, 150));
        product_img.setMinimumSize(new java.awt.Dimension(150, 150));
        product_img.setOpaque(true);
        product_img.setPreferredSize(new java.awt.Dimension(150, 150));
        product_img.setRolloverEnabled(false);
        product_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_imgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout product_img_panelLayout = new javax.swing.GroupLayout(product_img_panel);
        product_img_panel.setLayout(product_img_panelLayout);
        product_img_panelLayout.setHorizontalGroup(
            product_img_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        product_img_panelLayout.setVerticalGroup(
            product_img_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        name_input.setEditable(false);
        name_input.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Product Name");

        productID_input.setEditable(false);
        productID_input.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Product ID");

        warranty_input.setEditable(false);
        warranty_input.setBackground(new java.awt.Color(255, 255, 255));
        warranty_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warranty_inputActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("Category");

        category_input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CPU", "RAM", "Software", "DVD", "Monitor", "Graphic Card", "Sound Card", "Mainboard", "UPS", "HDD", "SSD", "Case", "PWS" }));
        category_input.setEnabled(false);
        category_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_inputActionPerformed(evt);
            }
        });

        manufacture_input.setEditable(false);
        manufacture_input.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Manufacture");

        model_input.setEditable(false);
        model_input.setBackground(new java.awt.Color(255, 255, 255));

        model_txt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        model_txt.setText("Model");

        model_txt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        model_txt1.setText("Cost");

        cost_input.setEditable(false);
        cost_input.setBackground(new java.awt.Color(255, 255, 255));
        cost_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_inputActionPerformed(evt);
            }
        });

        model_txt2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        model_txt2.setText("Warranty");

        quantity_input.setEnabled(false);

        model_txt3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        model_txt3.setText("Quantity");

        id_input.setEditable(false);
        id_input.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setText("ID");

        type_input.setEditable(false);
        type_input.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout product_information_panelLayout = new javax.swing.GroupLayout(product_information_panel);
        product_information_panel.setLayout(product_information_panelLayout);
        product_information_panelLayout.setHorizontalGroup(
            product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_information_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_information_panelLayout.createSequentialGroup()
                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, product_information_panelLayout.createSequentialGroup()
                                .addComponent(product_img_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(category_input, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_information_panelLayout.createSequentialGroup()
                                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id_input)
                                            .addGroup(product_information_panelLayout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(productID_input, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(product_information_panelLayout.createSequentialGroup()
                                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Type)
                                            .addComponent(jLabel20))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(type_input))))
                        .addContainerGap())
                    .addGroup(product_information_panelLayout.createSequentialGroup()
                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(product_information_panelLayout.createSequentialGroup()
                                .addComponent(add_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(remove_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(save_product_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(product_information_panelLayout.createSequentialGroup()
                                    .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addGap(18, 18, 18)
                                    .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(manufacture_input, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(product_information_panelLayout.createSequentialGroup()
                                    .addComponent(model_txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quantity_input)
                                    .addGap(18, 18, 18)
                                    .addComponent(model_txt2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(warranty_input, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(product_information_panelLayout.createSequentialGroup()
                                    .addComponent(model_txt)
                                    .addGap(10, 10, 10)
                                    .addComponent(model_input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(model_txt1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cost_input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        product_information_panelLayout.setVerticalGroup(
            product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_information_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(product_img_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(product_information_panelLayout.createSequentialGroup()
                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productID_input, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(category_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(type_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacture_input, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(model_input, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cost_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(model_txt1))
                    .addComponent(model_txt))
                .addGap(18, 18, 18)
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warranty_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model_txt2)
                    .addComponent(quantity_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model_txt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(product_information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_product_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N

        search_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_boxActionPerformed(evt);
            }
        });
        search_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_boxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_boxKeyTyped(evt);
            }
        });

        search_product_button.setText("Search");
        search_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_product_buttonActionPerformed(evt);
            }
        });

        filter_column.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Product ID", "Category", "Type", "Manufacture", "Name", "Model", "Low Quantity" }));
        filter_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_columnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filter_column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(search_box)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_product_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter_column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_product_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton6.setText("Import");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 28));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        select_table_management.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "product" }));
        select_table_management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_table_managementActionPerformed(evt);
            }
        });

        ArrayList<MerganoBean> list = null;
        MerganoDAO db = new MerganoDAO();
        try {
            list = db.getData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        List<String[]> values = new ArrayList<String[]>();
        List<String> columns = new ArrayList<String>();
        columns.add("ID");
        columns.add("Product ID");
        columns.add("Category");
        columns.add("Type");
        columns.add("Manufacture");
        columns.add("Name");
        columns.add("Model");
        columns.add("Description");
        columns.add("Cost");
        columns.add("Warranty");
        columns.add("Quantity");
        columns.add("Import");
        for(int i =0; i< list.size(); i++) {
            values.add(new String[] {"" +
                list.get(i).getID(),
                list.get(i).getProductID(),
                list.get(i).getCategory(),
                list.get(i).getType(),
                list.get(i).getManufacture(),
                list.get(i).getName(),
                list.get(i).getModel(),
                list.get(i).getDescription(),
                list.get(i).getCost(),
                list.get(i).getWarranty(),
                list.get(i).getQuantity(),
                list.get(i).getImport()
            });
        }
        ScrollPanelForQueryTable.setBorder(null);

        query_table.setModel(new javax.swing.table.DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray())
            {public boolean isCellEditable(int row, int column){return false;}}
        );
        query_table.setDragEnabled(true);
        query_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        query_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query_tableMouseClicked(evt);
            }
        });
        query_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                query_tableKeyPressed(evt);
            }
        });
        ScrollPanelForQueryTable.setViewportView(query_table);

        javax.swing.GroupLayout management_panelLayout = new javax.swing.GroupLayout(management_panel);
        management_panel.setLayout(management_panelLayout);
        management_panelLayout.setHorizontalGroup(
            management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(management_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(management_panelLayout.createSequentialGroup()
                        .addComponent(browse_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathname_box, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(View_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select_table_management, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPanelForQueryTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(product_information_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        management_panelLayout.setVerticalGroup(
            management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, management_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_information_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, management_panelLayout.createSequentialGroup()
                        .addGroup(management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(browse_button)
                            .addComponent(pathname_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(View_button)
                            .addComponent(select_table_management, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPanelForQueryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        body.addTab("Stock Management", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/notebook.png")), management_panel); // NOI18N

        order_confirm_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        order_confirm_btn.setText("Order");

        order_pane.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Management"));

        javax.swing.GroupLayout order_paneLayout = new javax.swing.GroupLayout(order_pane);
        order_pane.setLayout(order_paneLayout);
        order_paneLayout.setHorizontalGroup(
            order_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
        );
        order_paneLayout.setVerticalGroup(
            order_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout order_panelLayout = new javax.swing.GroupLayout(order_panel);
        order_panel.setLayout(order_panelLayout);
        order_panelLayout.setHorizontalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_panelLayout.createSequentialGroup()
                .addGroup(order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(order_panelLayout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(order_confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(order_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(order_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        order_panelLayout.setVerticalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(order_confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        body.addTab("Order Management", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/clipboard.png")), order_panel); // NOI18N

        javax.swing.GroupLayout tracking_panelLayout = new javax.swing.GroupLayout(tracking_panel);
        tracking_panel.setLayout(tracking_panelLayout);
        tracking_panelLayout.setHorizontalGroup(
            tracking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        tracking_panelLayout.setVerticalGroup(
            tracking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        body.addTab("Tracking", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/checkmark.png")), tracking_panel); // NOI18N

        store_db_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stored Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        store_db_panel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        localhost_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        localhost_db.setText("Localhost");
        localhost_db.setBorder(null);
        localhost_db.setBorderPainted(false);
        localhost_db.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        localhost_db.setFocusPainted(false);
        localhost_db.setFocusable(false);
        localhost_db.setIconTextGap(12);
        localhost_db.setMargin(new java.awt.Insets(5, 5, 5, 5));
        localhost_db.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32_roll.png"))); // NOI18N
        localhost_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localhost_dbActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        jToggleButton2.setText("Database 2");
        jToggleButton2.setFocusPainted(false);
        jToggleButton2.setFocusable(false);
        jToggleButton2.setIconTextGap(12);
        jToggleButton2.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton2.setOpaque(true);
        jToggleButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32_roll.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        jToggleButton3.setText("Database 3");
        jToggleButton3.setFocusPainted(false);
        jToggleButton3.setFocusable(false);
        jToggleButton3.setIconTextGap(12);
        jToggleButton3.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton3.setOpaque(true);
        jToggleButton3.setRolloverEnabled(false);

        db4.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        db4.setText("Database 4");
        db4.setFocusPainted(false);
        db4.setFocusable(false);
        db4.setIconTextGap(12);
        db4.setMargin(new java.awt.Insets(5, 5, 5, 5));
        db4.setRolloverEnabled(false);
        db4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db4ActionPerformed(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        jToggleButton5.setText("Database 5");
        jToggleButton5.setFocusPainted(false);
        jToggleButton5.setFocusable(false);
        jToggleButton5.setIconTextGap(12);
        jToggleButton5.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton5.setRolloverEnabled(false);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_32.png"))); // NOI18N
        jToggleButton6.setText("Database 6");
        jToggleButton6.setFocusPainted(false);
        jToggleButton6.setFocusable(false);
        jToggleButton6.setIconTextGap(12);
        jToggleButton6.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton6.setRolloverEnabled(false);

        javax.swing.GroupLayout store_db_panelLayout = new javax.swing.GroupLayout(store_db_panel);
        store_db_panel.setLayout(store_db_panelLayout);
        store_db_panelLayout.setHorizontalGroup(
            store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(store_db_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(store_db_panelLayout.createSequentialGroup()
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(store_db_panelLayout.createSequentialGroup()
                        .addGroup(store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localhost_db, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(db4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        store_db_panelLayout.setVerticalGroup(
            store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, store_db_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localhost_db, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(db4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(store_db_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        db_manager_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Manager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        add_database_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_add_32.png"))); // NOI18N
        add_database_button.setText("Add Database");
        add_database_button.setIconTextGap(6);
        add_database_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_database_buttonActionPerformed(evt);
            }
        });

        find_database_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_search_32.png"))); // NOI18N
        find_database_button.setText("Edit Database");
        find_database_button.setActionCommand("Find Database");
        find_database_button.setIconTextGap(6);
        find_database_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_database_buttonActionPerformed(evt);
            }
        });

        delete_database_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico32/database_close_32.png"))); // NOI18N
        delete_database_button1.setText("Delete Database");
        delete_database_button1.setIconTextGap(6);
        delete_database_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_database_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout db_manager_panelLayout = new javax.swing.GroupLayout(db_manager_panel);
        db_manager_panel.setLayout(db_manager_panelLayout);
        db_manager_panelLayout.setHorizontalGroup(
            db_manager_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(db_manager_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_database_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(delete_database_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(find_database_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        db_manager_panelLayout.setVerticalGroup(
            db_manager_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, db_manager_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(db_manager_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add_database_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(db_manager_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(db_manager_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(find_database_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_database_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        db_info_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Infomation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        db_show_info_panel.setBackground(new java.awt.Color(255, 255, 255));
        db_show_info_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Connection Status");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Database Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Database Type");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Host name");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Port");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Driver");

        driver_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driver_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout db_show_info_panelLayout = new javax.swing.GroupLayout(db_show_info_panel);
        db_show_info_panel.setLayout(db_show_info_panelLayout);
        db_show_info_panelLayout.setHorizontalGroup(
            db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(db_show_info_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(27, 27, 27)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(database_name_show_box, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(connect_status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hostname_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(database_type_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(port_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(driver_box, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        db_show_info_panelLayout.setVerticalGroup(
            db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(db_show_info_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connect_status_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(database_name_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(19, 19, 19)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(database_type_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostname_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(port_show_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(driver_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        print_database_info_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        print_database_info_button.setText("Quick Connect");
        print_database_info_button.setIconTextGap(12);
        print_database_info_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_database_info_buttonActionPerformed(evt);
            }
        });

        test_connection_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_sync.png"))); // NOI18N
        test_connection_button.setText("Test Connection");
        test_connection_button.setIconTextGap(12);
        test_connection_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test_connection_buttonActionPerformed(evt);
            }
        });

        set_as_default_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/leaf.png"))); // NOI18N
        set_as_default_button.setText("Set as Default");
        set_as_default_button.setIconTextGap(12);
        set_as_default_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_as_default_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout db_info_panelLayout = new javax.swing.GroupLayout(db_info_panel);
        db_info_panel.setLayout(db_info_panelLayout);
        db_info_panelLayout.setHorizontalGroup(
            db_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(db_info_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(db_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(db_show_info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(db_info_panelLayout.createSequentialGroup()
                        .addComponent(print_database_info_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(set_as_default_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        db_info_panelLayout.setVerticalGroup(
            db_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(db_info_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(db_show_info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(db_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print_database_info_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(set_as_default_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout database_panelLayout = new javax.swing.GroupLayout(database_panel);
        database_panel.setLayout(database_panelLayout);
        database_panelLayout.setHorizontalGroup(
            database_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(database_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(store_db_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(database_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(db_manager_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(db_info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        database_panelLayout.setVerticalGroup(
            database_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(database_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(database_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(store_db_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(database_panelLayout.createSequentialGroup()
                        .addComponent(db_info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(db_manager_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        body.addTab("Database", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/database_32.png")), database_panel); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jLabel7.setText("Product ID");

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Quick Search");

        search_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/search.png"))); // NOI18N
        search_button.setText("Search");
        search_button.setIconTextGap(8);
        search_button.setMaximumSize(new java.awt.Dimension(140, 40));
        search_button.setMinimumSize(new java.awt.Dimension(140, 40));
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Deep Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(search_box_searching, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(search_box_searching, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jRadioButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        jLabel17.setText("Product ID");

        jLabel18.setText("Type");

        jLabel19.setText("Category");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searching_panelLayout = new javax.swing.GroupLayout(searching_panel);
        searching_panel.setLayout(searching_panelLayout);
        searching_panelLayout.setHorizontalGroup(
            searching_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searching_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        searching_panelLayout.setVerticalGroup(
            searching_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searching_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searching_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        body.addTab("Searching", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/search.png")), searching_panel); // NOI18N

        report_panel.setPreferredSize(new java.awt.Dimension(1024, 453));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Current Stock Information");

        jButton10.setText("Print Report");

        jButton11.setText("Save Report as..");

        javax.swing.GroupLayout report_panelLayout = new javax.swing.GroupLayout(report_panel);
        report_panel.setLayout(report_panelLayout);
        report_panelLayout.setHorizontalGroup(
            report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(report_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(report_panelLayout.createSequentialGroup()
                        .addGap(0, 709, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(report_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        report_panelLayout.setVerticalGroup(
            report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(report_panelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addGroup(report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        body.addTab("Reporting", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/chart_graph.png")), report_panel); // NOI18N

        jPanel8.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Months revenue", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jToggleButton7.setText("View");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statistics_panelLayout = new javax.swing.GroupLayout(statistics_panel);
        statistics_panel.setLayout(statistics_panelLayout);
        statistics_panelLayout.setHorizontalGroup(
            statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statistics_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton7)
                .addContainerGap(779, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statistics_panelLayout.setVerticalGroup(
            statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statistics_panelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7))
                .addContainerGap())
        );

        body.addTab("Statistics", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/statistics.png")), statistics_panel); // NOI18N

        ArrayList<MerganoBean> listb = null;
        try {
            listb = db.getBacklogData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String[]> valuesBL = new ArrayList<String[]>();
        List<String> columnsBL = new ArrayList<String>();
        columnsBL.add("ID");
        columnsBL.add("History");
        columnsBL.add("Time");

        for(int i =0; i< listb.size(); i++) {
            valuesBL.add(new String[] {"" +
                listb.get(i).getBLID(),
                listb.get(i).getHistory(),
                listb.get(i).getTime()
            });
        }
        backlog_table.setModel(
            new javax.swing.table.DefaultTableModel(valuesBL.toArray(new Object[][] {}), columnsBL.toArray())
            {public boolean isCellEditable(int row, int column){return false;}}
        );
        ScrollPanelForBacklog.setViewportView(backlog_table);

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backlog_panelLayout = new javax.swing.GroupLayout(backlog_panel);
        backlog_panel.setLayout(backlog_panelLayout);
        backlog_panelLayout.setHorizontalGroup(
            backlog_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backlog_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelForBacklog, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        backlog_panelLayout.setVerticalGroup(
            backlog_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backlog_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backlog_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPanelForBacklog, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addGroup(backlog_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        body.addTab("Backlog", new javax.swing.ImageIcon(getClass().getResource("_static/ico16/clock2.png")), backlog_panel); // NOI18N

        status_bar_frame.setPreferredSize(new java.awt.Dimension(176, 40));

        db_name_box.setEditable(false);
        db_name_box.setBackground(new java.awt.Color(255, 255, 255));
        db_name_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db_name_boxActionPerformed(evt);
            }
        });

        status_label.setText("Database status");

        status_label1.setText("Database name");

        status_box.setEditable(false);
        status_box.setBackground(new java.awt.Color(255, 255, 255));
        status_box.setForeground(new java.awt.Color(0, 153, 102));

        db_type_box.setEditable(false);
        db_type_box.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("Database Type");

        port_box.setEditable(false);
        port_box.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setText("Port");

        url_box.setEditable(false);
        url_box.setBackground(new java.awt.Color(255, 255, 255));
        url_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_boxActionPerformed(evt);
            }
        });

        jLabel28.setText("Hostname");

        javax.swing.GroupLayout status_bar_frameLayout = new javax.swing.GroupLayout(status_bar_frame);
        status_bar_frame.setLayout(status_bar_frameLayout);
        status_bar_frameLayout.setHorizontalGroup(
            status_bar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(status_bar_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(db_name_box, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(db_type_box, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(url_box)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(port_box, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        status_bar_frameLayout.setVerticalGroup(
            status_bar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, status_bar_frameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(status_bar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status_label)
                    .addComponent(db_name_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status_label1)
                    .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(db_type_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(port_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(url_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(14, 14, 14))
        );

        tool_bar_frame.setAlignmentX(0.0F);
        tool_bar_frame.setAlignmentY(0.0F);
        tool_bar_frame.setPreferredSize(new java.awt.Dimension(57, 24));

        main_toolbar.setFloatable(false);
        main_toolbar.setRollover(true);
        main_toolbar.setMaximumSize(new java.awt.Dimension(522, 28));
        main_toolbar.setPreferredSize(new java.awt.Dimension(100, 28));

        Home_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/home.png"))); // NOI18N
        Home_button.setText("Home");
        Home_button.setAlignmentX(0.5F);
        Home_button.setFocusable(false);
        Home_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Home_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home_button.setMaximumSize(new java.awt.Dimension(70, 30));
        Home_button.setMinimumSize(new java.awt.Dimension(60, 24));
        Home_button.setPreferredSize(new java.awt.Dimension(24, 24));
        Home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Home_button);

        Dashboard_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Dashboard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/dashboard.png"))); // NOI18N
        Dashboard_button.setText("Dashboard");
        Dashboard_button.setAlignmentX(0.5F);
        Dashboard_button.setFocusable(false);
        Dashboard_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Dashboard_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Dashboard_button.setMaximumSize(new java.awt.Dimension(80, 30));
        Dashboard_button.setMinimumSize(new java.awt.Dimension(62, 30));
        Dashboard_button.setPreferredSize(new java.awt.Dimension(80, 30));
        Dashboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Dashboard_button);

        Search_Button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Search_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/search.png"))); // NOI18N
        Search_Button.setText("Search");
        Search_Button.setAlignmentX(0.5F);
        Search_Button.setFocusable(false);
        Search_Button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Search_Button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Search_Button.setMaximumSize(new java.awt.Dimension(70, 30));
        Search_Button.setMinimumSize(new java.awt.Dimension(62, 30));
        Search_Button.setPreferredSize(new java.awt.Dimension(62, 30));
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });
        main_toolbar.add(Search_Button);

        Bookmark_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Bookmark_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/bookmark.png"))); // NOI18N
        Bookmark_button.setText("Bookmark");
        Bookmark_button.setAlignmentX(0.5F);
        Bookmark_button.setFocusable(false);
        Bookmark_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bookmark_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Bookmark_button.setMaximumSize(new java.awt.Dimension(80, 30));
        Bookmark_button.setMinimumSize(new java.awt.Dimension(62, 30));
        Bookmark_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Bookmark_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bookmark_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Bookmark_button);

        Reports_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Reports_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/project.png"))); // NOI18N
        Reports_button.setText("Reports");
        Reports_button.setAlignmentX(0.5F);
        Reports_button.setFocusable(false);
        Reports_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Reports_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Reports_button.setMaximumSize(new java.awt.Dimension(70, 30));
        Reports_button.setMinimumSize(new java.awt.Dimension(62, 30));
        Reports_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Reports_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reports_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Reports_button);

        User_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        User_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/user.png"))); // NOI18N
        User_button.setText("User");
        User_button.setAlignmentX(0.5F);
        User_button.setFocusable(false);
        User_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        User_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        User_button.setMaximumSize(new java.awt.Dimension(70, 30));
        User_button.setMinimumSize(new java.awt.Dimension(62, 30));
        User_button.setPreferredSize(new java.awt.Dimension(62, 30));
        User_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User_buttonMouseClicked(evt);
            }
        });
        User_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(User_button);

        Print_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Print_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/print.png"))); // NOI18N
        Print_button.setText("Print");
        Print_button.setAlignmentX(0.5F);
        Print_button.setFocusable(false);
        Print_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Print_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Print_button.setMaximumSize(new java.awt.Dimension(70, 30));
        Print_button.setMinimumSize(new java.awt.Dimension(62, 30));
        Print_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Print_button);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/folder_add.png"))); // NOI18N
        jButton1.setText("Import");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(8);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(80, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(62, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(70, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        main_toolbar.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/folder_upload.png"))); // NOI18N
        jButton2.setText("Export");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(8);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setMaximumSize(new java.awt.Dimension(80, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(70, 30));
        main_toolbar.add(jButton2);

        Options_button.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Options_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico/gear.png"))); // NOI18N
        Options_button.setText("Options");
        Options_button.setAlignmentX(0.5F);
        Options_button.setFocusable(false);
        Options_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Options_button.setIconTextGap(6);
        Options_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Options_button.setMaximumSize(new java.awt.Dimension(70, 30));
        Options_button.setMinimumSize(new java.awt.Dimension(62, 30));
        Options_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Options_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Options_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Options_button);

        javax.swing.GroupLayout tool_bar_frameLayout = new javax.swing.GroupLayout(tool_bar_frame);
        tool_bar_frame.setLayout(tool_bar_frameLayout);
        tool_bar_frameLayout.setHorizontalGroup(
            tool_bar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tool_bar_frameLayout.setVerticalGroup(
            tool_bar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        main_menubar.setBorder(null);
        main_menubar.setPreferredSize(new java.awt.Dimension(56, 23));

        file_menu.setText("File");

        open_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/folder_add.png"))); // NOI18N
        open_menuitem.setText("Open...");
        open_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(open_menuitem);

        save_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        save_menuitem.setText("Save");
        file_menu.add(save_menuitem);

        saveas_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        saveas_menuitem.setText("Save as...");
        saveas_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveas_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(saveas_menuitem);
        file_menu.add(jSeparator3);

        welcome_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        welcome_menuitem.setText("Welcome");
        welcome_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_buttonActionPerformed(evt);
            }
        });
        file_menu.add(welcome_menuitem);

        dashboard_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        dashboard_menuitem.setText("Dashboard");
        dashboard_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(dashboard_menuitem);

        stock_management_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        stock_management_menuitem.setText("Stock Management");
        stock_management_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_management_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(stock_management_menuitem);

        order_management_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        order_management_menuitem.setText("Order Management");
        order_management_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_management_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(order_management_menuitem);

        tracking_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        tracking_menuitem.setText("Tracking");
        tracking_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracking_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(tracking_menuitem);

        database_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        database_menuitem.setText("Database");
        database_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(database_menuitem);

        searching_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        searching_menuitem.setText("Searching");
        searching_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searching_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(searching_menuitem);

        report_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        report_menuitem.setText("Report");
        report_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(report_menuitem);

        statistics_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        statistics_menuitem.setLabel("Statistics");
        statistics_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistics_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(statistics_menuitem);

        backlog_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        backlog_menuitem.setLabel("Backlog");
        backlog_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backlog_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(backlog_menuitem);
        file_menu.add(jSeparator7);

        print_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        print_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        print_menuitem.setText("Print...");
        print_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(print_menuitem);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        jMenuItem16.setText("Page Setup...");
        file_menu.add(jMenuItem16);

        print_preview_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        print_preview_menuitem.setText("Print Preview...");
        print_preview_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_preview_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(print_preview_menuitem);
        file_menu.add(jSeparator10);

        logout_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        logout_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/archive.png"))); // NOI18N
        logout_menuitem.setText("Logout");
        logout_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(logout_menuitem);
        file_menu.add(jSeparator2);

        exit_program.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit_program.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/application_blueprint.png"))); // NOI18N
        exit_program.setText("Exit");
        exit_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_programActionPerformed(evt);
            }
        });
        file_menu.add(exit_program);

        main_menubar.add(file_menu);

        edit_menu.setText("Edit");

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setText("Undo");
        jMenuItem25.setEnabled(false);
        edit_menu.add(jMenuItem25);

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem26.setText("Redo");
        jMenuItem26.setEnabled(false);
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        edit_menu.add(jMenuItem26);
        edit_menu.add(jSeparator8);

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem27.setText("Cut");
        edit_menu.add(jMenuItem27);

        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem28.setText("Copy");
        edit_menu.add(jMenuItem28);

        jMenuItem30.setText("Paste");
        jMenuItem30.setEnabled(false);
        edit_menu.add(jMenuItem30);

        jMenuItem31.setText("Paste from History");
        jMenuItem31.setEnabled(false);
        edit_menu.add(jMenuItem31);

        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem33.setText("Delete");
        edit_menu.add(jMenuItem33);

        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem32.setText("Select All");
        edit_menu.add(jMenuItem32);
        edit_menu.add(jSeparator9);

        jMenuItem36.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem36.setText("Find/Replace...");
        edit_menu.add(jMenuItem36);

        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem34.setText("Find Next");
        edit_menu.add(jMenuItem34);

        jMenuItem35.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/blueprint.png"))); // NOI18N
        jMenuItem35.setText("Find Previous");
        edit_menu.add(jMenuItem35);

        main_menubar.add(edit_menu);

        view_menu.setText("View");
        view_menu.setToolTipText("");
        view_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_menuActionPerformed(evt);
            }
        });

        hint_menuitem.setText("Show hint");
        view_menu.add(hint_menuitem);

        toolbar_menuitem.setSelected(true);
        toolbar_menuitem.setText("Show Toolbar");
        toolbar_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbar_menuitemActionPerformed(evt);
            }
        });
        view_menu.add(toolbar_menuitem);

        statusbar_menuitem.setSelected(true);
        statusbar_menuitem.setText("Show Status bar");
        statusbar_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusbar_menuitemActionPerformed(evt);
            }
        });
        view_menu.add(statusbar_menuitem);

        main_menubar.add(view_menu);

        database_menu.setText("Database");
        database_menu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                database_menuStateChanged(evt);
            }
        });
        database_menu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                database_menuFocusGained(evt);
            }
        });
        database_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                database_menuMouseClicked(evt);
            }
        });
        database_menu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                database_menuComponentShown(evt);
            }
        });
        database_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_menuActionPerformed(evt);
            }
        });

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        jMenu7.setText("Connect..");

        new_db_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        new_db_menuitem.setText("New...");
        new_db_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_db_menuitemActionPerformed(evt);
            }
        });
        jMenu7.add(new_db_menuitem);

        del_db_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        del_db_menuitem.setText("Delete...");
        del_db_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_db_menuitemActionPerformed(evt);
            }
        });
        jMenu7.add(del_db_menuitem);

        find_db_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        find_db_menuitem.setText("Find...");
        jMenu7.add(find_db_menuitem);

        database_menu.add(jMenu7);

        connect_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        connect_menuitem.setText("Connect");
        connect_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_menuitemActionPerformed(evt);
            }
        });
        database_menu.add(connect_menuitem);

        disconnect_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        disconnect_menuitem.setText("Disconnect");
        disconnect_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnect_menuitemActionPerformed(evt);
            }
        });
        database_menu.add(disconnect_menuitem);
        database_menu.add(jSeparator1);

        import_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        import_menuitem.setText("Import...");

        import_csv_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        import_csv_menuitem.setText("From CSV");
        import_menuitem.add(import_csv_menuitem);

        database_menu.add(import_menuitem);

        export_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        export_menuitem.setText("Export...");

        export_csv_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        export_csv_menuitem.setText("To CSV");
        export_menuitem.add(export_csv_menuitem);

        export_txt_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        export_txt_menuitem.setText("To TXT");
        export_menuitem.add(export_txt_menuitem);

        export_sql_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/add.png"))); // NOI18N
        export_sql_menuitem.setText("To SQL");
        export_menuitem.add(export_sql_menuitem);

        database_menu.add(export_menuitem);

        main_menubar.add(database_menu);

        tools_menu.setText("Tools");

        search_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/application_blueprint.png"))); // NOI18N
        search_menuitem.setText("Search...");
        tools_menu.add(search_menuitem);

        backup_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/application_blueprint.png"))); // NOI18N
        backup_menuitem.setText("Backup");
        tools_menu.add(backup_menuitem);

        bookmark_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/application_blueprint.png"))); // NOI18N
        bookmark_menuitem.setText("Bookmarks");
        tools_menu.add(bookmark_menuitem);
        tools_menu.add(jSeparator6);

        options_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/application_blueprint.png"))); // NOI18N
        options_menuitem.setText("Options");
        options_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                options_menuitemActionPerformed(evt);
            }
        });
        tools_menu.add(options_menuitem);

        main_menubar.add(tools_menu);

        help_menu.setText("Help");

        help_contents_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        help_contents_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        help_contents_menuitem.setText("Help Contents");
        help_contents_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_contents_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(help_contents_menuitem);

        online_docs_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        online_docs_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        online_docs_menuitem.setText("Online Docs and Support");
        online_docs_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                online_docs_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(online_docs_menuitem);
        help_menu.add(jSeparator5);

        report_bug_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        report_bug_menuitem.setText("Report Bug...");
        report_bug_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_bug_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(report_bug_menuitem);

        feedback_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        feedback_menuitem.setText("Feedback...");
        feedback_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedback_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(feedback_menuitem);

        website_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        website_menuitem.setText("Website..");
        website_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(website_menuitem);
        help_menu.add(jSeparator4);

        check_for_update_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        check_for_update_menuitem.setText("Check for Updates");
        check_for_update_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_for_update_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(check_for_update_menuitem);

        about_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("_static/ico16/button_up.png"))); // NOI18N
        about_menuitem.setText("About");
        about_menuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_menuitemMouseClicked(evt);
            }
        });
        about_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(about_menuitem);

        main_menubar.add(help_menu);

        setJMenuBar(main_menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tool_bar_frame, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(status_bar_frame, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tool_bar_frame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status_bar_frame, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        body.getAccessibleContext().setAccessibleName("Body");

        getAccessibleContext().setAccessibleDescription("This is main windows");

        setSize(new java.awt.Dimension(1032, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("_static/pic/icon.png")));
    }

    private void about_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_menuitemActionPerformed
        about a = new about();
        a.setVisible(true);
    }//GEN-LAST:event_about_menuitemActionPerformed

    private void about_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_menuitemMouseClicked

    }//GEN-LAST:event_about_menuitemMouseClicked

    private void check_for_update_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_for_update_menuitemActionPerformed
        JOptionPane.showMessageDialog(this, "No new update found.", "Check for Updates", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_check_for_update_menuitemActionPerformed

    private void feedback_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedback_menuitemActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/Juklab/mergano").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_feedback_menuitemActionPerformed

    private void print_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_menuitemActionPerformed
        try {
            boolean complete = search_box.print();
            if (complete) {
                JOptionPane.showMessageDialog(null, "This job has been sent to the printer.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PrinterException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_print_menuitemActionPerformed

    private void saveas_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveas_menuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveas_menuitemActionPerformed

    private void print_preview_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_preview_menuitemActionPerformed

    }//GEN-LAST:event_print_preview_menuitemActionPerformed

    private void exit_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_programActionPerformed
        if (evt.getSource() == exit_program) {
            System.exit(0);
        }
    }//GEN-LAST:event_exit_programActionPerformed

    private void connect_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_menuitemActionPerformed
        if (lo == null) {
            lo = new login();
            lo.setVisible(true);
        }
    }//GEN-LAST:event_connect_menuitemActionPerformed

    private void disconnect_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnect_menuitemActionPerformed
        if (lo == null) {
            lo = new login();
            int logoutconfirm = JOptionPane.showConfirmDialog(this, "Are you sure do you want to Logout?", "Logout confirm", YES_NO_OPTION, QUESTION_MESSAGE);
            if (logoutconfirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Logout sucessfully");
                lo.SetCurrentSession(false);
            }
        }
    }//GEN-LAST:event_disconnect_menuitemActionPerformed

    private void db_name_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_name_boxActionPerformed

    }//GEN-LAST:event_db_name_boxActionPerformed

    private void database_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_menuActionPerformed

    }//GEN-LAST:event_database_menuActionPerformed

    private void database_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_database_menuMouseClicked
        login logs = new login();
        if (logs.CurrentSession() == true) {
            connect_menuitem.setEnabled(false);
            disconnect_menuitem.setEnabled(true);
            System.out.println(logs.CurrentSession());
        }

    }//GEN-LAST:event_database_menuMouseClicked

    private void database_menuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_database_menuComponentShown

    }//GEN-LAST:event_database_menuComponentShown

    private void database_menuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_database_menuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_database_menuFocusGained

    private void database_menuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_database_menuStateChanged

    }//GEN-LAST:event_database_menuStateChanged

    private void report_bug_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_bug_menuitemActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/Juklab/mergano/issues").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_report_bug_menuitemActionPerformed

    private void help_contents_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_contents_menuitemActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "E:\\Users\\Chukkrit\\OneDrive\\+ Documents +\\NetBeansProjects\\mergano\\src\\help.html");
        } catch (Exception e) {
            System.out.println("Error detail " + e);
        }
    }//GEN-LAST:event_help_contents_menuitemActionPerformed

    private void online_docs_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_online_docs_menuitemActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/Juklab/mergano/wiki").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_online_docs_menuitemActionPerformed

    private void open_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_menuitemActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
    }//GEN-LAST:event_open_menuitemActionPerformed

    private void statusbar_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusbar_menuitemActionPerformed
        if (evt.getSource().equals(statusbar_menuitem)) {
            boolean stb_state = statusbar_menuitem.isSelected();
            int stb_status = 1;
            if (stb_state == true) {
                stb_status = 1;
            }
            if (stb_state == false) {
                stb_status = 0;
            }
            switch (stb_status) {
                case 1:
                    status_bar_frame.setVisible(true);
                    break;
                case 0:
                    status_bar_frame.setVisible(false);
                    break;
                default:
                    status_bar_frame.setVisible(true);
            }
        }
    }//GEN-LAST:event_statusbar_menuitemActionPerformed

    private void view_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_menuActionPerformed

    }//GEN-LAST:event_view_menuActionPerformed

    private void toolbar_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbar_menuitemActionPerformed
        if (evt.getSource().equals(toolbar_menuitem)) {
            boolean tb_state = toolbar_menuitem.isSelected();
            int tb_status = 1;
            if (tb_state == true) {
                tb_status = 1;
            }
            if (tb_state == false) {
                tb_status = 0;
            }
            switch (tb_status) {
                case 1:
                    tool_bar_frame.setVisible(true);
                    break;
                case 0:
                    tool_bar_frame.setVisible(false);
                    break;
                default:
                    tool_bar_frame.setVisible(true);
            }
        }
    }//GEN-LAST:event_toolbar_menuitemActionPerformed

    private void Reports_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reports_buttonActionPerformed
        body.setSelectedIndex(7);
    }//GEN-LAST:event_Reports_buttonActionPerformed

    private void Home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_buttonActionPerformed
        body.setSelectedIndex(0);
    }//GEN-LAST:event_Home_buttonActionPerformed

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
        body.setSelectedIndex(6);
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_buttonActionPerformed
        print_menuitemActionPerformed(evt);
    }//GEN-LAST:event_Print_buttonActionPerformed

    private void Dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_buttonActionPerformed
        body.setSelectedIndex(1);
    }//GEN-LAST:event_Dashboard_buttonActionPerformed

    private void User_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_buttonActionPerformed
        connect_menuitemActionPerformed(evt);
    }//GEN-LAST:event_User_buttonActionPerformed

    private void Options_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Options_buttonActionPerformed

    }//GEN-LAST:event_Options_buttonActionPerformed

    private void Bookmark_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bookmark_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bookmark_buttonActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void website_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website_menuitemActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://juklab.com").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_website_menuitemActionPerformed

    private void save_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_product_buttonActionPerformed
        Random rand = new Random();
        int value = rand.nextInt(300000) + 150000;
        String id_in = id_input.getText();
        int id = Integer.parseInt(id_in);
        String productID = Integer.toString(value);
        String category = category_input.getSelectedItem().toString();
        String type = type_input.getText();
        String manufacture = manufacture_input.getText();
        String name = name_input.getText();
        String model = model_input.getText();
        String description = description_input.getText();
        String cost = cost_input.getText();
        String quantity = quantity_input.getValue().toString();
        String warranty = warranty_input.getText();
        int quan = (Integer) quantity_input.getValue();

        if (productID.equals("")
                || category.equals("")
                || manufacture.equals("")
                || name.equals("")
                || model.equals("")
                || cost.equals("")
                || warranty.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out request box", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (productID.length() > 13) {
            JOptionPane.showMessageDialog(this, "Product ID must less than or 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (cost.length() > 8) {
            JOptionPane.showMessageDialog(this, "Cost must less than or 8 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (warranty.length() > 3) {
            JOptionPane.showMessageDialog(this, "Warranty must less than or 3 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (quantity.length() > 8) {
            JOptionPane.showMessageDialog(this, "Quantity must less than or 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(quantity) || !isNumeric(warranty)) {
            JOptionPane.showMessageDialog(this, "Quantity Cost or Warranty must be an integer format only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {

            // Update query
            MerganoBean bean = new MerganoBean();
            bean.setID(Integer.parseInt(id_in));
            bean.setProductID(productID);
            bean.setCategory(category);
            bean.setType(type);
            bean.setManufacture(manufacture);
            bean.setName(name);
            bean.setModel(model);
            bean.setDescription(description);
            bean.setCost(cost);
            bean.setQuantity(quantity);
            bean.setWarranty(warranty);
            bean.setHistory("Edited product " + productID);
            int id_update = Integer.parseInt(id_input.getText());
            MerganoDAO dao = new MerganoDAO();
            try {
                boolean status = dao.updateData(bean, id_update);
                updateTable(dao.getData());
                updateBacklog(dao.getBacklogData());
                if (status) {
                    JOptionPane.showMessageDialog(this, "Updated data successfully", "Updated Success", JOptionPane.INFORMATION_MESSAGE);
                    id_input.setEditable(false);
                    category_input.setEditable(false);
                    category_input.setEnabled(false);
                    type_input.setEditable(false);
                    quantity_input.setEnabled(false);
                    name_input.setEditable(false);
                    manufacture_input.setEditable(false);
                    model_input.setEditable(false);
                    cost_input.setEditable(false);
                    warranty_input.setEditable(false);
                    description_input.setEditable(false);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Updated data failed", "Updated Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_save_product_buttonActionPerformed

    private void edit_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_product_buttonActionPerformed
        if (evt.getSource() == edit_product_button) {
            id_input.setEditable(true);
            category_input.setEditable(true);
            category_input.setEnabled(true);
            type_input.setEditable(true);
            name_input.setEditable(true);
            manufacture_input.setEditable(true);
            model_input.setEditable(true);
            cost_input.setEditable(true);
            warranty_input.setEditable(true);
            quantity_input.setEnabled(true);
            description_input.setEditable(true);
        }

    }//GEN-LAST:event_edit_product_buttonActionPerformed

    private void remove_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_product_buttonActionPerformed
        int DeleteConfirm = JOptionPane.showConfirmDialog(this, "Are you sure do you want to delete this row?", "Delete confirmation", YES_NO_OPTION, WARNING_MESSAGE);

        if (DeleteConfirm == JOptionPane.YES_OPTION) {
            int p_id = Integer.parseInt(id_input.getText());
            String id_in = id_input.getText();
            int id = Integer.parseInt(id_in);
            MerganoDAO dao = new MerganoDAO();
            MerganoBean bean = new MerganoBean();
            String productID = productID_input.getText();
            try {
                bean.setID(id);
                bean.setHistory("Delete product: " + productID);
                boolean status = dao.deleteData(bean, p_id);
                updateTable(dao.getData());
                updateBacklog(dao.getBacklogData());

                if (status) {
                    JOptionPane.showMessageDialog(this, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
            }
        }

    }//GEN-LAST:event_remove_product_buttonActionPerformed

    private void add_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_buttonActionPerformed
        Random rand = new Random();
        int value = rand.nextInt(900000) + 100000;
        String id_in = id_input.getText();
        int id = Integer.parseInt(id_in);
        String productID = Integer.toString(value);
        String category = category_input.getSelectedItem().toString();
        int categoryid = category_input.getSelectedIndex();

        String type = type_input.getText();
        String manufacture = manufacture_input.getText();
        String name = name_input.getText();
        String model = model_input.getText();
        String description = description_input.getText();
        String cost = cost_input.getText();
        String quantity = quantity_input.getValue().toString();
        String warranty = warranty_input.getText();
        int quan = (Integer) quantity_input.getValue();

        if (productID.equals("")
                || category.equals("")
                || manufacture.equals("")
                || name.equals("")
                || model.equals("")
                || cost.equals("")
                || warranty.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out request box", "Information is null", JOptionPane.WARNING_MESSAGE);
        } else if (productID.length() > 13) {
            JOptionPane.showMessageDialog(this, "Product ID must less than or 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (cost.length() > 8) {
            JOptionPane.showMessageDialog(this, "Cost must less than or 8 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (warranty.length() > 3) {
            JOptionPane.showMessageDialog(this, "Warranty must less than or 3 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (quantity.length() > 13) {
            JOptionPane.showMessageDialog(this, "Quantity must less than or 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(quantity) || !isNumeric(warranty)) {
            JOptionPane.showMessageDialog(this, "Quantity, Cost or Warranty must be an integer format only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            MerganoBean bean = new MerganoBean();
            bean.setID(Integer.parseInt(id_in));
            bean.setProductID(productID);
            bean.setCategory(category);
            bean.setType(type);
            bean.setManufacture(manufacture);
            bean.setName(name);
            bean.setModel(model);
            bean.setDescription(description);
            bean.setCost(cost);
            bean.setQuantity(quantity);
            bean.setWarranty(warranty);
            bean.setHistory("Insert product: " + productID);

            MerganoDAO dao = new MerganoDAO();
            try {
                boolean status = dao.insertData(bean);
                updateTable(dao.getData());
                updateBacklog(dao.getBacklogData());
                if (status) {
                    JOptionPane.showMessageDialog(this, "Added to database successfully", "Added Success", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (Exception ex) {
            }
        }

    }//GEN-LAST:event_add_product_buttonActionPerformed

    public static boolean isNumeric(String str) {
        return str.matches("^-?[0-9]+(\\.[0-9]+)?$");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void action_search_box(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_search_box
        // TODO add your handling code here:
    }//GEN-LAST:event_action_search_box

    private void search_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_boxActionPerformed

    private void View_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_buttonActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pathname_box.getText());
        } catch (Exception e) {
            System.out.println("Error detail " + e);
        }
    }//GEN-LAST:event_View_buttonActionPerformed

    private void browse_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_buttonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String pathname = f.getAbsolutePath();
        String filename = f.getName();
        pathname_box.setText(pathname);
        search_box.setText(filename);
    }//GEN-LAST:event_browse_buttonActionPerformed

    private void new_db_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_db_menuitemActionPerformed
        connects con = new connects();
        con.setVisible(true);
    }//GEN-LAST:event_new_db_menuitemActionPerformed

    private void del_db_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_db_menuitemActionPerformed
        delete_db del = new delete_db();
        del.setVisible(true);
    }//GEN-LAST:event_del_db_menuitemActionPerformed

    private void warranty_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warranty_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warranty_inputActionPerformed

    private void search_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_product_buttonActionPerformed
        int filter = filter_column.getSelectedIndex();
        String input_search = search_box.getText();
        MerganoDAO dao = new MerganoDAO();
        if (search_box.getText().isEmpty()) {
            updateTable(dao.getData());
        } else {
            switch (filter) {
                case 0: // ID
                    updateTable(dao.getDataID(Integer.parseInt(input_search)));
                    break;
                case 1: // ProductID
                    updateTable(dao.getDataProductID(input_search));
                    break;
                case 2: // Category
                    updateTable(dao.getDataCategory(input_search));
                    break;
                case 3: // Type
                    updateTable(dao.getDataType(input_search));
                    break;
                case 4: // Manufacture
                    updateTable(dao.getDataManufacture(input_search));
                    break;
                case 5: // Name
                    updateTable(dao.getDataName(input_search));
                    break;
                case 6: // Low quantity
                    updateTable(dao.getLowQuantity());
                    break;
                default:
                    updateTable(dao.getData());
            }
        }
    }//GEN-LAST:event_search_product_buttonActionPerformed

    private void stock_management_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_management_menuitemActionPerformed
        body.setSelectedIndex(2);
    }//GEN-LAST:event_stock_management_menuitemActionPerformed

    private void searching_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searching_menuitemActionPerformed
        body.setSelectedIndex(6);
    }//GEN-LAST:event_searching_menuitemActionPerformed

    private void dashboard_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_menuitemActionPerformed
        body.setSelectedIndex(1);
    }//GEN-LAST:event_dashboard_menuitemActionPerformed

    private void tracking_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tracking_menuitemActionPerformed
        body.setSelectedIndex(4);
    }//GEN-LAST:event_tracking_menuitemActionPerformed

    private void database_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_menuitemActionPerformed
        body.setSelectedIndex(5);
    }//GEN-LAST:event_database_menuitemActionPerformed

    private void report_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_menuitemActionPerformed
        body.setSelectedIndex(7);
    }//GEN-LAST:event_report_menuitemActionPerformed

    private void statistics_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistics_menuitemActionPerformed
        body.setSelectedIndex(8);
    }//GEN-LAST:event_statistics_menuitemActionPerformed

    private void backlog_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backlog_menuitemActionPerformed
        body.setSelectedIndex(9);
    }//GEN-LAST:event_backlog_menuitemActionPerformed

    private void add_database_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_database_buttonActionPerformed
        new_db_menuitemActionPerformed(evt);
    }//GEN-LAST:event_add_database_buttonActionPerformed

    private void delete_database_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_database_button1ActionPerformed
        del_db_menuitemActionPerformed(evt);
    }//GEN-LAST:event_delete_database_button1ActionPerformed

    private void filter_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_columnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filter_columnActionPerformed

    private void set_as_default_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_as_default_buttonActionPerformed
        set_as_default_button.setEnabled(false);
        // save connection setting to file then load as default
    }//GEN-LAST:event_set_as_default_buttonActionPerformed

    private void driver_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driver_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driver_boxActionPerformed

    private void localhost_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localhost_dbActionPerformed
        hostname_show_box.setText("localhost");
        database_name_show_box.setText("mergano_db");
        database_type_show_box.setText("MySQL");
        port_show_box.setText("3306");

    }//GEN-LAST:event_localhost_dbActionPerformed

    private void options_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_options_menuitemActionPerformed
        option o = new option();
        o.setVisible(true);
    }//GEN-LAST:event_options_menuitemActionPerformed

    private void select_table_managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_table_managementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_table_managementActionPerformed

    private void product_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_imgActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        pathname_box.setText(path);
// Unfinished image linking
//         product_img.setIcon(new ImageIcon(path));
//         try{
//             FileInputStream fin=new FileInputStream(f);
//
//
//             //   updateTable(dao.getData());
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//
//             int len=(int)f.length();
//
//             Class.forName("com.mysql.jdbc.Drive­r");
//
//         Connection con=DriverManager.getConnection("jd­bc:mysql://localhost/new", "root", "root");
//         PreparedStatement ps=con.prepareStatement("insert into `Image` values(?)");
//         ps.setBinaryStream(1, fin, len); int status=ps.executeUpdate();
//         if(status is greater than 0) {
//             jLabel2.setText("Successfully inserted in DB");
//         }
//         else{ jLabel2.setText("Image not inserted!");
//                 } }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//
//
//        String imagePath;
//        File path = null; // remember last user's path
//        JFileChooser chooser = new JFileChooser();
//        if(path !=null) { chooser = new JFileChooser(path); }
//        else {  chooser = new JFileChooser(); }
//        FileFilter ff = new FileFilter() {
//            @Override
//            public boolean accept(File f) {
//                if(f.isDirectory()) {
//                    return true;
//                }
//                String extension = Utils.getExtension(f);
//                if(extension !=null) {
//                    if(extension.equals(Utils.gif) ||
//                            extension.equals(Utils.jpeg) ||
//                            extension.equals(Utils.jpg) ||
//                            extension.equals(Utils.png) ||
//                            extension.equals(Utils.tif) ||
//                            extension.equals(Utils.tiff)) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//                return false;
//            }
//        @Override
//        public String getDescription() {
//            return null;
//        }
//     };
//        chooser.setFileFilter(ff);
//
//        int returnVal = chooser.showOpenDialog(this);
//        // If user selected
//        if(returnVal == JFileChooser.APPROVE_OPTION) {
//        imagePath = (String) chooser.getSelectedFile().getPath();
//        path = chooser.getCurrentDirectory();
//        ImageIcon icon = new javax.swing.ImageIcon(imagePath);
//        Image img = icon.getImage();
//        Image newimg = img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
//        ImageIcon newIcon = new ImageIcon(newimg);
//        product_img.setIcon(newIcon);
//    }
    }//GEN-LAST:event_product_imgActionPerformed

    private void da_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_da_button_welActionPerformed
        body.setSelectedIndex(1);
    }//GEN-LAST:event_da_button_welActionPerformed

    private void sm_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_button_welActionPerformed
        body.setSelectedIndex(2);
    }//GEN-LAST:event_sm_button_welActionPerformed

    private void mai_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mai_button_welActionPerformed
        body.setSelectedIndex(10);
    }//GEN-LAST:event_mai_button_welActionPerformed

    private void rep_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_button_welActionPerformed
        body.setSelectedIndex(7);
    }//GEN-LAST:event_rep_button_welActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        /*DefaultPieDataset PieDataset = new DefaultPieDataset();
        PieDataset.setValue("Jan", new Integer(10));
        PieDataset.setValue("Feb", new Integer(20));
        PieDataset.setValue("Mar", new Integer(10));
        PieDataset.setValue("Apr", new Integer(30));
        PieDataset.setValue("May", new Integer(30)); */
        //JFreeChart char = ChartFactory.createPieChart(null, PieDataset, PieDataset, HIDE_ON_CLOSE, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled, Locale.FRENCH, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void trac_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trac_button_welActionPerformed
        body.setSelectedIndex(4);
    }//GEN-LAST:event_trac_button_welActionPerformed

    private void sta_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sta_button_welActionPerformed
        body.setSelectedIndex(8);
    }//GEN-LAST:event_sta_button_welActionPerformed

    private void ser_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_button_welActionPerformed
        body.setSelectedIndex(6);
    }//GEN-LAST:event_ser_button_welActionPerformed

    private void ord_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ord_button_welActionPerformed
        body.setSelectedIndex(3);
    }//GEN-LAST:event_ord_button_welActionPerformed

    private void bac_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bac_button_welActionPerformed
        body.setSelectedIndex(9);
    }//GEN-LAST:event_bac_button_welActionPerformed

    private void welcome_panel_picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcome_panel_picActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://mergano.com").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_welcome_panel_picActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        body.setSelectedIndex(2);
    }//GEN-LAST:event_search_buttonActionPerformed

    private void search_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyPressed
        if (evt.getKeyCode() == 10) {
            search_product_buttonActionPerformed(null);
        }
    }//GEN-LAST:event_search_boxKeyPressed

    private void print_database_info_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_database_info_buttonActionPerformed
        new_db_menuitemActionPerformed(evt);
    }//GEN-LAST:event_print_database_info_buttonActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        ConnectDB df = new ConnectDB();
        database_name_show_box.setText("CSC105_G1");
        database_type_show_box.setText("MySQL");
        port_show_box.setText("3306");
        driver_box.setText("jdbc:mysql://cs14sitkmutt.me:3306/CSC105_G1");
        hostname_show_box.setText("cs14sitkmutt.me");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void category_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_inputActionPerformed

    private void test_connection_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test_connection_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test_connection_buttonActionPerformed

    private void query_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_tableMouseClicked
        this.fillDataField();
    }//GEN-LAST:event_query_tableMouseClicked

    private void fillDataField() {
        String selectedData = null;
        int selectedRow = query_table.getSelectedRow();
        int selectedColumn = query_table.getSelectedColumn();

        String selectedID = (String) query_table.getModel().getValueAt(selectedRow, 0);
        String selectedProductID = (String) query_table.getModel().getValueAt(selectedRow, 1);
        String selectedCategory = (String) query_table.getModel().getValueAt(selectedRow, 2);
        String selectedType = (String) query_table.getModel().getValueAt(selectedRow, 3);
        String selectedProductName = (String) query_table.getModel().getValueAt(selectedRow, 4);
        String selectedManufacture = (String) query_table.getModel().getValueAt(selectedRow, 5);
        String selectedModel = (String) query_table.getModel().getValueAt(selectedRow, 6);
        String selectedDescription = (String) query_table.getModel().getValueAt(selectedRow, 7);
        String selectedCost = (String) query_table.getModel().getValueAt(selectedRow, 8);
        String selectedWarranty = (String) query_table.getModel().getValueAt(selectedRow, 9);
        String selectedQuantity = (String) query_table.getModel().getValueAt(selectedRow, 10);

        id_input.setText(selectedID);
        productID_input.setText(selectedProductID);
        category_input.setSelectedItem(selectedCategory);
        type_input.setText(selectedType);
        name_input.setText(selectedProductName);
        manufacture_input.setText(selectedManufacture);
        model_input.setText(selectedModel);
        cost_input.setText(selectedCost);
        quantity_input.setValue(Integer.parseInt(selectedQuantity));
        warranty_input.setText(selectedWarranty);
        description_input.setText(selectedDescription);
    }
    private void db4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db4ActionPerformed
        hostname_show_box.setText("");
        database_name_show_box.setText("");
        database_type_show_box.setText("MySQL");
        port_show_box.setText("");
    }//GEN-LAST:event_db4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MerganoDAO dao = new MerganoDAO();
        try {
            dao.deleteBacklog();
            updateBacklog(dao.getBacklogData());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void search_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyTyped

    }//GEN-LAST:event_search_boxKeyTyped

    private void cost_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_inputActionPerformed

    private void url_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_url_boxActionPerformed

    private void User_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_User_buttonMouseClicked

    private void query_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_query_tableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            this.fillDataField();
        }
    }//GEN-LAST:event_query_tableKeyPressed

    private void order_management_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_management_menuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_management_menuitemActionPerformed

    private void data_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_button_welActionPerformed
        body.setSelectedIndex(5);
    }//GEN-LAST:event_data_button_welActionPerformed

    private void find_database_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_database_buttonActionPerformed
        // unlock the database setting
    }//GEN-LAST:event_find_database_buttonActionPerformed

    private void logout_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_menuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_menuitemActionPerformed

    private void updateBacklog(ArrayList<MerganoBean> list) {
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        MerganoDAO db = new MerganoDAO();
        try {
            list = db.getBacklogData();
        } catch (Exception e) {
        }
        columns.add("ID");
        columns.add("History");
        columns.add("Time");
        for (int i = 0; i < list.size(); i++) {
            values.add(new String[]{""
                + list.get(i).getBLID(),
                list.get(i).getHistory(),
                list.get(i).getTime()
            });
        }
        backlog_table.setModel(new javax.swing.table.DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray())
        );
        ScrollPanelForBacklog.setViewportView(backlog_table);
    }

    public void updateTable(ArrayList<MerganoBean> list) {
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        columns.add("ID");
        columns.add("Product ID");
        columns.add("Category");
        columns.add("Type");
        columns.add("Manufacture");
        columns.add("Name");
        columns.add("Model");
        columns.add("Description");
        columns.add("Cost");
        columns.add("Warranty");
        columns.add("Quantity");
        columns.add("Import");
        for (int i = 0; i < list.size(); i++) {
            values.add(new String[]{""
                + list.get(i).getID(),
                list.get(i).getProductID(),
                list.get(i).getCategory(),
                list.get(i).getType(),
                list.get(i).getManufacture(),
                list.get(i).getName(),
                list.get(i).getModel(),
                list.get(i).getDescription(),
                list.get(i).getCost(),
                list.get(i).getWarranty(),
                list.get(i).getQuantity(),
                list.get(i).getImport()
            });
        }
        // set Model of JTabel from list array of data
        query_table.setModel(new javax.swing.table.DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray())
        );
        // set the JTable into scroll panel
        ScrollPanelForQueryTable.setViewportView(query_table);
    }

    public void displayAllTable() {
        ArrayList<MerganoBean> list = null;
        MerganoDAO db = new MerganoDAO();
        try {
            list = db.getData();
        } catch (Exception e) {
        }
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        columns.add("ID");
        columns.add("Product ID");
        columns.add("Category");
        columns.add("Type");
        columns.add("Manufacture");
        columns.add("Name");
        columns.add("Model");
        columns.add("Description");
        columns.add("Cost");
        columns.add("Warranty");
        columns.add("Quantity");
        columns.add("Import");

        for (int i = 0; i < list.size(); i++) {
            values.add(new String[]{""
                + list.get(i).getID(),
                list.get(i).getProductID(),
                list.get(i).getCategory(),
                list.get(i).getType(),
                list.get(i).getManufacture(),
                list.get(i).getName(),
                list.get(i).getModel(),
                list.get(i).getDescription(),
                list.get(i).getCost(),
                list.get(i).getWarranty(),
                list.get(i).getQuantity(),
                list.get(i).getImport()
            });
        }
        ScrollPanelForQueryTable.setViewportView(query_table);

    }

    public void displayBacklog() {

        //  backlog_table.setModel(new javax.swing.table.DefaultTableModel(valuesBL.toArray(new Object[][]{}), columnsBL.toArray()));
        // ScrollPanelForBacklog.setViewportView(backlog_table);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bookmark_button;
    private javax.swing.JButton Dashboard_button;
    private javax.swing.JButton Home_button;
    private javax.swing.JButton Options_button;
    private javax.swing.JButton Print_button;
    private javax.swing.JButton Reports_button;
    private javax.swing.JScrollPane ScrollPanelForBacklog;
    private javax.swing.JScrollPane ScrollPanelForQueryTable;
    private javax.swing.JButton Search_Button;
    private javax.swing.JLabel Type;
    private javax.swing.JButton User_button;
    private javax.swing.JButton View_button;
    private javax.swing.JMenuItem about_menuitem;
    private javax.swing.JButton add_database_button;
    public javax.swing.JButton add_product_button;
    private javax.swing.JButton bac_button_wel;
    private javax.swing.JMenuItem backlog_menuitem;
    private javax.swing.JPanel backlog_panel;
    private javax.swing.JTable backlog_table;
    private javax.swing.JMenuItem backup_menuitem;
    public javax.swing.JTabbedPane body;
    private javax.swing.JPanel body_panel;
    private javax.swing.JMenuItem bookmark_menuitem;
    public javax.swing.JButton browse_button;
    private javax.swing.JComboBox category_input;
    private javax.swing.JMenuItem check_for_update_menuitem;
    private static javax.swing.JMenuItem connect_menuitem;
    public static javax.swing.JTextField connect_status_box;
    private javax.swing.JTextField cost_input;
    private javax.swing.JButton da_button_wel;
    private javax.swing.JMenuItem dashboard_menuitem;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JButton data_button_wel;
    private javax.swing.JMenu database_menu;
    private javax.swing.JMenuItem database_menuitem;
    private javax.swing.JTextField database_name_show_box;
    private javax.swing.JPanel database_panel;
    private javax.swing.JTextField database_type_show_box;
    private javax.swing.JToggleButton db4;
    private javax.swing.JPanel db_info_panel;
    private javax.swing.JPanel db_manager_panel;
    public static javax.swing.JTextField db_name_box;
    private javax.swing.JPanel db_show_info_panel;
    public static javax.swing.JTextField db_type_box;
    private javax.swing.JMenuItem del_db_menuitem;
    private javax.swing.JButton delete_database_button1;
    private javax.swing.JTextArea description_input;
    private static javax.swing.JMenuItem disconnect_menuitem;
    private javax.swing.JTextField driver_box;
    private javax.swing.JMenu edit_menu;
    private javax.swing.JButton edit_product_button;
    private javax.swing.JMenuItem exit_program;
    private javax.swing.JMenuItem export_csv_menuitem;
    private javax.swing.JMenu export_menuitem;
    private javax.swing.JMenuItem export_sql_menuitem;
    private javax.swing.JMenuItem export_txt_menuitem;
    private javax.swing.JMenuItem feedback_menuitem;
    private javax.swing.JMenu file_menu;
    private javax.swing.JComboBox filter_column;
    private javax.swing.JButton find_database_button;
    private javax.swing.JMenuItem find_db_menuitem;
    private javax.swing.JMenuItem help_contents_menuitem;
    private javax.swing.JMenu help_menu;
    private javax.swing.JCheckBoxMenuItem hint_menuitem;
    private javax.swing.JPanel home_icon_panel;
    private javax.swing.JPanel home_panel;
    private javax.swing.JTextField hostname_show_box;
    private javax.swing.JTextField id_input;
    private javax.swing.JMenuItem import_csv_menuitem;
    private javax.swing.JMenu import_menuitem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton localhost_db;
    private javax.swing.JMenuItem logout_menuitem;
    private javax.swing.JButton mai_button_wel;
    private javax.swing.JMenuBar main_menubar;
    private javax.swing.JToolBar main_toolbar;
    public javax.swing.JPanel management_panel;
    private javax.swing.JTextField manufacture_input;
    private javax.swing.JTextField model_input;
    private javax.swing.JLabel model_txt;
    private javax.swing.JLabel model_txt1;
    private javax.swing.JLabel model_txt2;
    private javax.swing.JLabel model_txt3;
    private javax.swing.JTextField name_input;
    private javax.swing.JMenuItem new_db_menuitem;
    private javax.swing.JMenuItem online_docs_menuitem;
    private javax.swing.JMenuItem open_menuitem;
    private javax.swing.JMenuItem options_menuitem;
    private javax.swing.JButton ord_button_wel;
    private javax.swing.JButton order_confirm_btn;
    private javax.swing.JMenuItem order_management_menuitem;
    private javax.swing.JPanel order_pane;
    private javax.swing.JPanel order_panel;
    private javax.swing.JPanel panel;
    public javax.swing.JTextField pathname_box;
    public static javax.swing.JTextField port_box;
    private javax.swing.JTextField port_show_box;
    private javax.swing.JButton print_database_info_button;
    private javax.swing.JMenuItem print_menuitem;
    private javax.swing.JMenuItem print_preview_menuitem;
    private javax.swing.JTextField productID_input;
    private javax.swing.JButton product_img;
    private javax.swing.JPanel product_img_panel;
    private javax.swing.JPanel product_information_panel;
    private javax.swing.JSpinner quantity_input;
    public javax.swing.JTable query_table;
    private javax.swing.JButton remove_product_button;
    private javax.swing.JButton rep_button_wel;
    private javax.swing.JMenuItem report_bug_menuitem;
    private javax.swing.JMenuItem report_menuitem;
    private javax.swing.JPanel report_panel;
    private javax.swing.JMenuItem save_menuitem;
    private javax.swing.JButton save_product_button;
    private javax.swing.JMenuItem saveas_menuitem;
    private javax.swing.JTextField search_box;
    private javax.swing.JTextField search_box_searching;
    private javax.swing.JButton search_button;
    private javax.swing.JMenuItem search_menuitem;
    private javax.swing.JButton search_product_button;
    private javax.swing.JMenuItem searching_menuitem;
    private javax.swing.JPanel searching_panel;
    private javax.swing.JComboBox select_table_management;
    private javax.swing.JButton ser_button_wel;
    private javax.swing.JButton set_as_default_button;
    private javax.swing.JButton sm_button_wel;
    private javax.swing.JButton sta_button_wel;
    private javax.swing.JMenuItem statistics_menuitem;
    private javax.swing.JPanel statistics_panel;
    private javax.swing.JPanel status_bar_frame;
    public static javax.swing.JTextField status_box;
    private javax.swing.JLabel status_label;
    private javax.swing.JLabel status_label1;
    private javax.swing.JCheckBoxMenuItem statusbar_menuitem;
    private javax.swing.JMenuItem stock_management_menuitem;
    private javax.swing.JPanel store_db_panel;
    private javax.swing.JButton test_connection_button;
    private javax.swing.JPanel tool_bar_frame;
    private javax.swing.JCheckBoxMenuItem toolbar_menuitem;
    private javax.swing.JMenu tools_menu;
    private javax.swing.JButton trac_button_wel;
    private javax.swing.JMenuItem tracking_menuitem;
    private javax.swing.JPanel tracking_panel;
    private javax.swing.JTextField type_input;
    public static javax.swing.JTextField url_box;
    private javax.swing.JMenu view_menu;
    private javax.swing.JTextField warranty_input;
    private javax.swing.JMenuItem website_menuitem;
    private javax.swing.JLabel welcome_bg;
    private javax.swing.JMenuItem welcome_menuitem;
    private javax.swing.JButton welcome_panel_pic;
    // End of variables declaration//GEN-END:variables

}
