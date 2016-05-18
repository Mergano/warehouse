/*
 * Copyright 2016 vchuk.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mergano.gui;

import com.mergano.core.ExportCSV;
import com.mergano.core.Logout;
import com.mergano.core.TextFieldLimit;
import com.mergano.core.Utils;
import com.mergano.core.WebBrowse;
import com.mergano.core.dao.HistoryBean;
import com.mergano.core.dao.HistoryDAO;
import com.mergano.core.dao.ProductBean;
import com.mergano.core.dao.ProductDAO;
import com.mergano.core.dao.SearchDAO;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Main extends javax.swing.JFrame {

    // Pre initialized
    private static boolean addType = false;
    DefaultTableModel mod;
    WebBrowse w = new WebBrowse();

    public Main() {
        initComponents();
        search_box.setDocument(new TextFieldLimit(100));
        pathname_box.setDocument(new TextFieldLimit(500));
        productID_input.setDocument(new TextFieldLimit(13));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        property_popup_menu = new javax.swing.JPopupMenu();
        add_to_order_btn = new javax.swing.JMenuItem();
        edit_product_click_btn = new javax.swing.JMenuItem();
        delete_product_click_btn = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        report_product_btn = new javax.swing.JMenuItem();
        product_img_popup_menu = new javax.swing.JPopupMenu();
        change_product_img_menu = new javax.swing.JMenuItem();
        remove_product_img_menu = new javax.swing.JMenuItem();
        header = new javax.swing.JPanel();
        main_toolbar = new javax.swing.JToolBar();
        Home_button = new javax.swing.JButton();
        Dashboard_button = new javax.swing.JButton();
        Search_Button = new javax.swing.JButton();
        Customer_button = new javax.swing.JButton();
        User_button = new javax.swing.JButton();
        Print_button = new javax.swing.JButton();
        Import_button = new javax.swing.JButton();
        Export_button = new javax.swing.JButton();
        Options_button = new javax.swing.JButton();
        Logout_button = new javax.swing.JButton();
        body = new javax.swing.JTabbedPane();
        home_panel = new javax.swing.JPanel();
        header_panel = new javax.swing.JPanel();
        welcome_bg = new javax.swing.JLabel();
        body_panel = new javax.swing.JPanel();
        left_panel = new javax.swing.JPanel();
        da_button_wel = new javax.swing.JButton();
        sm_button_wel = new javax.swing.JButton();
        ord_button_wel = new javax.swing.JButton();
        order_request_button_wel = new javax.swing.JButton();
        data_button_wel = new javax.swing.JButton();
        ser_button_wel = new javax.swing.JButton();
        rep_button_wel = new javax.swing.JButton();
        sta_button_wel = new javax.swing.JButton();
        his_button_wel = new javax.swing.JButton();
        mai_button_wel = new javax.swing.JButton();
        right_panel = new javax.swing.JPanel();
        welcome_panel_pic = new javax.swing.JButton();
        dashboard_panel = new javax.swing.JPanel();
        dashboard_panel_body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        management_panel = new javax.swing.JPanel();
        sm_left_panel = new javax.swing.JPanel();
        sm_header_group_panel = new javax.swing.JPanel();
        sm_import_product_panel = new javax.swing.JPanel();
        browse_button = new javax.swing.JButton();
        pathname_box = new javax.swing.JTextField();
        import_action_panel = new javax.swing.JPanel();
        View_button = new javax.swing.JButton();
        import_product = new javax.swing.JButton();
        export_product = new javax.swing.JButton();
        sm_search_panel = new javax.swing.JPanel();
        filter_column = new javax.swing.JComboBox();
        search_box = new javax.swing.JTextField();
        search_product_button = new javax.swing.JButton();
        ScrollPanelForQueryTable = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        sm_right_panel = new javax.swing.JPanel();
        product_info_head_panel = new javax.swing.JPanel();
        product_img_panel = new javax.swing.JPanel();
        product_img = new javax.swing.JLabel();
        product_head_group_panel = new javax.swing.JPanel();
        product_id_label = new javax.swing.JLabel();
        productID_input = new javax.swing.JTextField();
        category_label = new javax.swing.JLabel();
        category_input = new javax.swing.JComboBox();
        product_name_label = new javax.swing.JLabel();
        name_input = new javax.swing.JTextField();
        manufacture_label = new javax.swing.JLabel();
        manufacture_input = new javax.swing.JTextField();
        model_label = new javax.swing.JLabel();
        model_input = new javax.swing.JTextField();
        product_info_body_panel = new javax.swing.JPanel();
        product_info_group_panel = new javax.swing.JPanel();
        location_label = new javax.swing.JLabel();
        location_input = new javax.swing.JTextField();
        product_status_label = new javax.swing.JLabel();
        product_status_box = new javax.swing.JTextField();
        warranty_label = new javax.swing.JLabel();
        warranty_input = new javax.swing.JTextField();
        cost_label = new javax.swing.JLabel();
        cost_input = new javax.swing.JTextField();
        quantity_label = new javax.swing.JLabel();
        quantity_input = new javax.swing.JSpinner();
        product_info_desc_panel = new javax.swing.JPanel();
        description_label = new javax.swing.JLabel();
        description_scroll = new javax.swing.JScrollPane();
        description_input = new javax.swing.JTextArea();
        product_info_footer_panel = new javax.swing.JPanel();
        add_product_button = new javax.swing.JButton();
        remove_product_button = new javax.swing.JButton();
        edit_product_button = new javax.swing.JButton();
        save_product_button = new javax.swing.JButton();
        order_panel = new javax.swing.JPanel();
        order_pane = new javax.swing.JPanel();
        ScrollPanelForQueryTable2 = new javax.swing.JScrollPane();
        query_table2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        order_quantity = new javax.swing.JSpinner();
        order_quantity_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        delete_order_btn = new javax.swing.JButton();
        save_order_btn = new javax.swing.JButton();
        order_confirm_btn = new javax.swing.JButton();
        order_product_img_panel = new javax.swing.JPanel();
        order_product_img = new javax.swing.JButton();
        order_request_panel = new javax.swing.JPanel();
        request_order_body_panel = new javax.swing.JPanel();
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
        search_input_panel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        search_box_searching = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        search_button = new javax.swing.JButton();
        search_result_panel = new javax.swing.JPanel();
        img_box_search = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        product_group_panel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        product_location_panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        statistics_panel = new javax.swing.JPanel();
        statistic_graph = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        view_graph_button = new javax.swing.JToggleButton();
        report_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        print_report_button = new javax.swing.JButton();
        save_report_button = new javax.swing.JButton();
        done_report_btn = new javax.swing.JButton();
        stock_report_panel = new javax.swing.JPanel();
        ScrollPanelForBacklog1 = new javax.swing.JScrollPane();
        report_table = new javax.swing.JTable();
        clear_report_btn = new javax.swing.JButton();
        history_panel = new javax.swing.JPanel();
        ScrollPanelForHistory = new javax.swing.JScrollPane();
        history_table = new javax.swing.JTable();
        truncate_history_btn = new javax.swing.JButton();
        status_bar_frame = new javax.swing.JPanel();
        dbname_label = new javax.swing.JLabel();
        db_name_box = new javax.swing.JTextField();
        status_label = new javax.swing.JLabel();
        status_box = new javax.swing.JTextField();
        dbType_label = new javax.swing.JLabel();
        db_type_box = new javax.swing.JTextField();
        hostname_label = new javax.swing.JLabel();
        url_box = new javax.swing.JTextField();
        port_label = new javax.swing.JLabel();
        port_box = new javax.swing.JTextField();
        user_label = new javax.swing.JLabel();
        user_box = new javax.swing.JTextField();
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
        statistics_menuitem = new javax.swing.JMenuItem();
        report_menuitem = new javax.swing.JMenuItem();
        history_menuitem = new javax.swing.JMenuItem();
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
        language_menuitem = new javax.swing.JMenu();
        en_us_menuitem = new javax.swing.JMenuItem();
        en_us_menuitem1 = new javax.swing.JMenuItem();
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

        property_popup_menu.setMinimumSize(new java.awt.Dimension(103, 94));

        add_to_order_btn.setText("Add to Order");
        add_to_order_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_order_btnActionPerformed(evt);
            }
        });
        property_popup_menu.add(add_to_order_btn);

        edit_product_click_btn.setText("Edit this product");
        edit_product_click_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_product_click_btnActionPerformed(evt);
            }
        });
        property_popup_menu.add(edit_product_click_btn);

        delete_product_click_btn.setText("Remove this product");
        delete_product_click_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_product_click_btnActionPerformed(evt);
            }
        });
        property_popup_menu.add(delete_product_click_btn);
        property_popup_menu.add(jSeparator11);

        report_product_btn.setText("Report product");
        property_popup_menu.add(report_product_btn);

        change_product_img_menu.setText("Browse...");
        product_img_popup_menu.add(change_product_img_menu);

        remove_product_img_menu.setText("Delete this image");
        remove_product_img_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_product_img_menuActionPerformed(evt);
            }
        });
        product_img_popup_menu.add(remove_product_img_menu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/mergano/Bundle"); // NOI18N
        setTitle(bundle.getString("title")); // NOI18N
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/com/mergano/gui/_static/pic/icon.png")).getImage());
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setName("main_frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));

        header.setAlignmentX(0.0F);
        header.setAlignmentY(0.0F);
        header.setPreferredSize(new java.awt.Dimension(57, 24));
        header.setLayout(new java.awt.BorderLayout());

        main_toolbar.setFloatable(false);
        main_toolbar.setRollover(true);
        main_toolbar.setMaximumSize(new java.awt.Dimension(522, 58));
        main_toolbar.setMinimumSize(new java.awt.Dimension(902, 42));
        main_toolbar.setPreferredSize(new java.awt.Dimension(902, 42));

        Home_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/home.png"))); // NOI18N
        Home_button.setText("Home");
        Home_button.setAlignmentX(0.5F);
        Home_button.setFocusable(false);
        Home_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Home_button.setIconTextGap(10);
        Home_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Home_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Home_button.setPreferredSize(new java.awt.Dimension(70, 40));
        Home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Home_button);

        Dashboard_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Dashboard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/dashboard.png"))); // NOI18N
        Dashboard_button.setText("Dashboard");
        Dashboard_button.setAlignmentX(0.5F);
        Dashboard_button.setFocusable(false);
        Dashboard_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Dashboard_button.setIconTextGap(5);
        Dashboard_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Dashboard_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Dashboard_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Dashboard_button.setPreferredSize(new java.awt.Dimension(100, 40));
        Dashboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Dashboard_button);

        Search_Button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Search_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/search.png"))); // NOI18N
        Search_Button.setText("Search");
        Search_Button.setAlignmentX(0.5F);
        Search_Button.setFocusable(false);
        Search_Button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Search_Button.setIconTextGap(10);
        Search_Button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Search_Button.setMaximumSize(new java.awt.Dimension(90, 40));
        Search_Button.setMinimumSize(new java.awt.Dimension(90, 40));
        Search_Button.setPreferredSize(new java.awt.Dimension(62, 30));
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });
        main_toolbar.add(Search_Button);

        Customer_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Customer_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/users_business.png"))); // NOI18N
        Customer_button.setText("Customer");
        Customer_button.setAlignmentX(0.5F);
        Customer_button.setFocusable(false);
        Customer_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Customer_button.setIconTextGap(10);
        Customer_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Customer_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Customer_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Customer_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Customer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Customer_button);

        User_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        User_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/user.png"))); // NOI18N
        User_button.setText("User");
        User_button.setAlignmentX(0.5F);
        User_button.setFocusable(false);
        User_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        User_button.setIconTextGap(10);
        User_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        User_button.setMaximumSize(new java.awt.Dimension(90, 40));
        User_button.setMinimumSize(new java.awt.Dimension(90, 40));
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

        Print_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Print_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/print.png"))); // NOI18N
        Print_button.setText("Print");
        Print_button.setAlignmentX(0.5F);
        Print_button.setFocusable(false);
        Print_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Print_button.setIconTextGap(10);
        Print_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Print_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Print_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Print_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Print_button);

        Import_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Import_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/folder_add.png"))); // NOI18N
        Import_button.setText("Import");
        Import_button.setFocusable(false);
        Import_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Import_button.setIconTextGap(10);
        Import_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Import_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Import_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Import_button.setPreferredSize(new java.awt.Dimension(70, 30));
        Import_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Import_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Import_button);

        Export_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Export_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/folder_upload.png"))); // NOI18N
        Export_button.setText("Export");
        Export_button.setFocusable(false);
        Export_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Export_button.setIconTextGap(10);
        Export_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Export_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Export_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Export_button.setPreferredSize(new java.awt.Dimension(70, 30));
        main_toolbar.add(Export_button);

        Options_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Options_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/gear.png"))); // NOI18N
        Options_button.setText("Options");
        Options_button.setAlignmentX(0.5F);
        Options_button.setFocusable(false);
        Options_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Options_button.setIconTextGap(10);
        Options_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Options_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Options_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Options_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Options_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Options_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Options_button);

        Logout_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/lock.png"))); // NOI18N
        Logout_button.setText("Logout");
        Logout_button.setAlignmentX(0.5F);
        Logout_button.setFocusable(false);
        Logout_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Logout_button.setIconTextGap(10);
        Logout_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Logout_button.setMaximumSize(new java.awt.Dimension(90, 40));
        Logout_button.setMinimumSize(new java.awt.Dimension(90, 40));
        Logout_button.setPreferredSize(new java.awt.Dimension(62, 30));
        Logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_buttonActionPerformed(evt);
            }
        });
        main_toolbar.add(Logout_button);

        header.add(main_toolbar, java.awt.BorderLayout.CENTER);

        home_panel.setBackground(new java.awt.Color(255, 255, 255));
        home_panel.setLayout(new java.awt.BorderLayout());

        header_panel.setBackground(new java.awt.Color(231, 76, 60));
        header_panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        welcome_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/pic/welcome.png"))); // NOI18N
        welcome_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header_panel.add(welcome_bg);

        home_panel.add(header_panel, java.awt.BorderLayout.NORTH);

        body_panel.setLayout(new java.awt.GridLayout(1, 2));

        left_panel.setBackground(new java.awt.Color(255, 255, 255));
        left_panel.setLayout(new java.awt.GridLayout(5, 2));

        da_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        da_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        da_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Dashboard.png"))); // NOI18N
        da_button_wel.setText("Dashboard");
        da_button_wel.setContentAreaFilled(false);
        da_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        da_button_wel.setIconTextGap(16);
        da_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        da_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Dashboard_roll.png"))); // NOI18N
        da_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Dashboard_roll.png"))); // NOI18N
        da_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                da_button_welActionPerformed(evt);
            }
        });
        left_panel.add(da_button_wel);

        sm_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sm_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        sm_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/notebook.png"))); // NOI18N
        sm_button_wel.setText("Stock Management");
        sm_button_wel.setBorderPainted(false);
        sm_button_wel.setContentAreaFilled(false);
        sm_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sm_button_wel.setIconTextGap(16);
        sm_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/notebook_roll.png"))); // NOI18N
        sm_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/notebook_roll.png"))); // NOI18N
        sm_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_button_welActionPerformed(evt);
            }
        });
        left_panel.add(sm_button_wel);

        ord_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ord_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        ord_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clipboard_Full.png"))); // NOI18N
        ord_button_wel.setText("Order Management");
        ord_button_wel.setBorderPainted(false);
        ord_button_wel.setContentAreaFilled(false);
        ord_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ord_button_wel.setIconTextGap(16);
        ord_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        ord_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clipboard_Full_roll.png"))); // NOI18N
        ord_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clipboard_Full_roll.png"))); // NOI18N
        ord_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ord_button_welActionPerformed(evt);
            }
        });
        left_panel.add(ord_button_wel);

        order_request_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        order_request_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        order_request_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Checkmark.png"))); // NOI18N
        order_request_button_wel.setText("Order Request");
        order_request_button_wel.setBorderPainted(false);
        order_request_button_wel.setContentAreaFilled(false);
        order_request_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        order_request_button_wel.setIconTextGap(16);
        order_request_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Checkmark_roll.png"))); // NOI18N
        order_request_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Checkmark_roll.png"))); // NOI18N
        order_request_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_request_button_welActionPerformed(evt);
            }
        });
        left_panel.add(order_request_button_wel);

        data_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        data_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        data_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
        data_button_wel.setText("Database");
        data_button_wel.setBorderPainted(false);
        data_button_wel.setContentAreaFilled(false);
        data_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data_button_wel.setIconTextGap(16);
        data_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        data_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32_roll.png"))); // NOI18N
        data_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32_roll.png"))); // NOI18N
        data_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_button_welActionPerformed(evt);
            }
        });
        left_panel.add(data_button_wel);

        ser_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ser_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        ser_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Search.png"))); // NOI18N
        ser_button_wel.setText("Searching");
        ser_button_wel.setBorderPainted(false);
        ser_button_wel.setContentAreaFilled(false);
        ser_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ser_button_wel.setIconTextGap(16);
        ser_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Search_roll.png"))); // NOI18N
        ser_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Search_roll.png"))); // NOI18N
        ser_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_button_welActionPerformed(evt);
            }
        });
        left_panel.add(ser_button_wel);

        rep_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rep_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        rep_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Graph.png"))); // NOI18N
        rep_button_wel.setText("Reporting");
        rep_button_wel.setBorderPainted(false);
        rep_button_wel.setContentAreaFilled(false);
        rep_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rep_button_wel.setIconTextGap(16);
        rep_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        rep_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Graph_roll.png"))); // NOI18N
        rep_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Graph_roll.png"))); // NOI18N
        rep_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_button_welActionPerformed(evt);
            }
        });
        left_panel.add(rep_button_wel);

        sta_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sta_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        sta_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Pie.png"))); // NOI18N
        sta_button_wel.setText("Statistics");
        sta_button_wel.setBorderPainted(false);
        sta_button_wel.setContentAreaFilled(false);
        sta_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sta_button_wel.setIconTextGap(16);
        sta_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Pie_roll.png"))); // NOI18N
        sta_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Pie_roll.png"))); // NOI18N
        sta_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sta_button_welActionPerformed(evt);
            }
        });
        left_panel.add(sta_button_wel);

        his_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        his_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        his_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clock2.png"))); // NOI18N
        his_button_wel.setText("History");
        his_button_wel.setBorderPainted(false);
        his_button_wel.setContentAreaFilled(false);
        his_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        his_button_wel.setIconTextGap(16);
        his_button_wel.setMargin(new java.awt.Insets(2, 34, 2, 14));
        his_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clock2_roll.png"))); // NOI18N
        his_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clock2_roll.png"))); // NOI18N
        his_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                his_button_welActionPerformed(evt);
            }
        });
        left_panel.add(his_button_wel);

        mai_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mai_button_wel.setForeground(new java.awt.Color(51, 51, 51));
        mai_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/cup.png"))); // NOI18N
        mai_button_wel.setText("Maintainance");
        mai_button_wel.setBorderPainted(false);
        mai_button_wel.setContentAreaFilled(false);
        mai_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mai_button_wel.setIconTextGap(16);
        mai_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/cup_roll.png"))); // NOI18N
        mai_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/cup_roll.png"))); // NOI18N
        mai_button_wel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mai_button_welActionPerformed(evt);
            }
        });
        left_panel.add(mai_button_wel);

        body_panel.add(left_panel);

        right_panel.setBackground(new java.awt.Color(255, 255, 255));
        right_panel.setLayout(new java.awt.BorderLayout());

        welcome_panel_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/pic/welcome_panel.png"))); // NOI18N
        welcome_panel_pic.setBorderPainted(false);
        welcome_panel_pic.setContentAreaFilled(false);
        welcome_panel_pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcome_panel_picActionPerformed(evt);
            }
        });
        right_panel.add(welcome_panel_pic, java.awt.BorderLayout.CENTER);

        body_panel.add(right_panel);

        home_panel.add(body_panel, java.awt.BorderLayout.CENTER);

        body.addTab("Welcome", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/home.png")), home_panel); // NOI18N

        dashboard_panel.setLayout(new java.awt.BorderLayout(5, 5));

        dashboard_panel_body.setBorder(javax.swing.BorderFactory.createTitledBorder("Stock Information"));
        dashboard_panel_body.setPreferredSize(new java.awt.Dimension(860, 500));

        jLabel2.setText("Total Product");

        jLabel3.setText("Last Updated");

        javax.swing.GroupLayout dashboard_panel_bodyLayout = new javax.swing.GroupLayout(dashboard_panel_body);
        dashboard_panel_body.setLayout(dashboard_panel_bodyLayout);
        dashboard_panel_bodyLayout.setHorizontalGroup(
            dashboard_panel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panel_bodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(dashboard_panel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(dashboard_panel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(932, Short.MAX_VALUE))
        );
        dashboard_panel_bodyLayout.setVerticalGroup(
            dashboard_panel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panel_bodyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(dashboard_panel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dashboard_panel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(473, Short.MAX_VALUE))
        );

        dashboard_panel.add(dashboard_panel_body, java.awt.BorderLayout.CENTER);

        body.addTab("Dashboard", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/dashboard.png")), dashboard_panel); // NOI18N

        management_panel.setLayout(new java.awt.BorderLayout());

        sm_left_panel.setLayout(new java.awt.BorderLayout());

        sm_header_group_panel.setLayout(new java.awt.GridLayout(2, 0));

        sm_import_product_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Import / Export Product ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        sm_import_product_panel.setMinimumSize(new java.awt.Dimension(100, 50));
        sm_import_product_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        sm_import_product_panel.setLayout(new java.awt.BorderLayout(5, 5));

        browse_button.setText("Browse...");
        browse_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_buttonActionPerformed(evt);
            }
        });
        sm_import_product_panel.add(browse_button, java.awt.BorderLayout.WEST);

        pathname_box.setMaximumSize(new java.awt.Dimension(600, 23));
        pathname_box.setMinimumSize(new java.awt.Dimension(250, 23));
        pathname_box.setPreferredSize(new java.awt.Dimension(250, 23));
        pathname_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_search_box(evt);
            }
        });
        sm_import_product_panel.add(pathname_box, java.awt.BorderLayout.CENTER);

        import_action_panel.setLayout(new java.awt.BorderLayout(5, 0));

        View_button.setText("Preview");
        View_button.setEnabled(false);
        View_button.setMaximumSize(new java.awt.Dimension(75, 23));
        View_button.setMinimumSize(new java.awt.Dimension(75, 23));
        View_button.setPreferredSize(new java.awt.Dimension(75, 23));
        View_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_buttonActionPerformed(evt);
            }
        });
        import_action_panel.add(View_button, java.awt.BorderLayout.WEST);

        import_product.setText("Import");
        import_product.setEnabled(false);
        import_product.setMaximumSize(new java.awt.Dimension(75, 23));
        import_product.setMinimumSize(new java.awt.Dimension(75, 23));
        import_product.setPreferredSize(new java.awt.Dimension(75, 23));
        import_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                import_productActionPerformed(evt);
            }
        });
        import_action_panel.add(import_product, java.awt.BorderLayout.CENTER);

        export_product.setText("Export");
        export_product.setMaximumSize(new java.awt.Dimension(75, 23));
        export_product.setMinimumSize(new java.awt.Dimension(75, 23));
        export_product.setPreferredSize(new java.awt.Dimension(75, 23));
        export_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_productActionPerformed(evt);
            }
        });
        import_action_panel.add(export_product, java.awt.BorderLayout.LINE_END);

        sm_import_product_panel.add(import_action_panel, java.awt.BorderLayout.EAST);

        sm_header_group_panel.add(sm_import_product_panel);

        sm_search_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        sm_search_panel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        sm_search_panel.setMinimumSize(new java.awt.Dimension(100, 50));
        sm_search_panel.setPreferredSize(new java.awt.Dimension(100, 50));
        sm_search_panel.setLayout(new java.awt.BorderLayout(5, 5));

        filter_column.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product ID", "Name", "Category", "Manufacture", "Location", "Low Quantity" }));
        filter_column.setPreferredSize(new java.awt.Dimension(85, 23));
        sm_search_panel.add(filter_column, java.awt.BorderLayout.WEST);

        search_box.setMinimumSize(new java.awt.Dimension(6, 23));
        search_box.setPreferredSize(new java.awt.Dimension(500, 23));
        search_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_boxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_boxKeyReleased(evt);
            }
        });
        sm_search_panel.add(search_box, java.awt.BorderLayout.CENTER);

        search_product_button.setText("Search");
        search_product_button.setPreferredSize(new java.awt.Dimension(75, 23));
        search_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_product_buttonActionPerformed(evt);
            }
        });
        sm_search_panel.add(search_product_button, java.awt.BorderLayout.EAST);

        sm_header_group_panel.add(sm_search_panel);

        sm_left_panel.add(sm_header_group_panel, java.awt.BorderLayout.NORTH);

        ScrollPanelForQueryTable.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanelForQueryTable.setBorder(null);
        ScrollPanelForQueryTable.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        ScrollPanelForQueryTable.setMinimumSize(new java.awt.Dimension(500, 430));
        ScrollPanelForQueryTable.setPreferredSize(new java.awt.Dimension(500, 450));
        ScrollPanelForQueryTable.setRequestFocusEnabled(false);

        ArrayList<com.mergano.core.dao.ProductBean> list = null;
        com.mergano.core.dao.ProductDAO db = new com.mergano.core.dao.ProductDAO();
        try {
            list = db.getData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        columns.add("Product ID");
        columns.add("Category");
        columns.add("Name");
        columns.add("Manufacture");
        columns.add("Model");
        columns.add("Description");
        columns.add("Cost");
        columns.add("Location");
        columns.add("Warranty");
        columns.add("Quantity");
        columns.add("Import");
        columns.add("Status");
        columns.add("Last modified");

        for(int i =0; i< list.size(); i++) {
            values.add(new String[] {"" +
                list.get(i).getProductID(),
                list.get(i).getCategory(),
                list.get(i).getName(),
                list.get(i).getManufacture(),
                list.get(i).getModel(),
                list.get(i).getDescription(),
                list.get(i).getCost(),
                list.get(i).getLocation(),
                list.get(i).getWarranty(),
                String.valueOf(list.get(i).getQuantity()),
                list.get(i).getImport(),
                list.get(i).getStatus(),
                list.get(i).getUserLastModified()
            });

        }
        product_table.setAutoCreateRowSorter(true);
        product_table.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray())
            {public boolean isCellEditable(int row, int column){return false;}}
        );
        product_table.setToolTipText("Product table");
        product_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product_table.setFillsViewportHeight(true);
        product_table.setGridColor(new java.awt.Color(204, 204, 204));
        product_table.setName(""); // NOI18N
        product_table.setRowHeight(20);
        product_table.setRowMargin(3);
        product_table.setSelectionBackground(new java.awt.Color(255, 51, 51));
        product_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        product_table.setShowHorizontalLines(false);
        product_table.setShowVerticalLines(false);
        product_table.removeColumn(product_table.getColumnModel().getColumn(5));
        product_table.getColumnModel().getColumn(0).setPreferredWidth(90);
        product_table.getColumnModel().getColumn(1).setPreferredWidth(76);
        product_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        product_table.getColumnModel().getColumn(3).setPreferredWidth(160);
        product_table.getColumnModel().getColumn(4).setPreferredWidth(50);
        product_table.getColumnModel().getColumn(6).setPreferredWidth(60);
        product_table.getColumnModel().getColumn(7).setPreferredWidth(50);
        product_table.getColumnModel().getColumn(8).setPreferredWidth(60);
        product_table.getColumnModel().getColumn(9).setPreferredWidth(60);
        product_table.getColumnModel().getColumn(10).setPreferredWidth(70);
        product_table.getColumnModel().getColumn(11).setPreferredWidth(65);

        if (product_table.getRowCount() == 0) {
            remove_product_button.setEnabled(false);
            edit_product_button.setEnabled(false);
        }
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                product_tableMouseReleased(evt);
            }
        });
        product_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_tableKeyPressed(evt);
            }
        });
        ScrollPanelForQueryTable.setViewportView(product_table);
        product_table.getAccessibleContext().setAccessibleName("Product Table");
        product_table.getAccessibleContext().setAccessibleDescription("This table store product information of warehouse.");

        sm_left_panel.add(ScrollPanelForQueryTable, java.awt.BorderLayout.CENTER);

        management_panel.add(sm_left_panel, java.awt.BorderLayout.CENTER);

        sm_right_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Information", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        sm_right_panel.setPreferredSize(new java.awt.Dimension(393, 420));
        sm_right_panel.setLayout(new java.awt.BorderLayout(5, 5));

        product_info_head_panel.setPreferredSize(new java.awt.Dimension(175, 200));
        product_info_head_panel.setLayout(new java.awt.GridLayout(1, 0, 5, 1));

        product_img_panel.setBackground(new java.awt.Color(255, 255, 255));
        product_img_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        product_img_panel.setMinimumSize(new java.awt.Dimension(60, 20));
        product_img_panel.setPreferredSize(new java.awt.Dimension(80, 20));
        product_img_panel.setLayout(new java.awt.BorderLayout());

        product_img.setBackground(new java.awt.Color(0, 204, 102));
        product_img.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        product_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_img.setText("NO IMAGE");
        product_img.setEnabled(false);
        product_img.setPreferredSize(new java.awt.Dimension(60, 20));
        product_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_imgMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                product_imgMouseReleased(evt);
            }
        });
        product_img_panel.add(product_img, java.awt.BorderLayout.CENTER);

        product_info_head_panel.add(product_img_panel);

        product_head_group_panel.setLayout(new java.awt.GridLayout(10, 0, 0, 1));

        product_id_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        product_id_label.setText("Product ID");
        product_head_group_panel.add(product_id_label);

        productID_input.setEditable(false);
        productID_input.setBackground(new java.awt.Color(255, 255, 255));
        product_head_group_panel.add(productID_input);

        category_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        category_label.setText("Category");
        product_head_group_panel.add(category_label);

        category_input.setEditable(true);
        category_input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Book", "Stationary", "Drink", "Beauty", "Other" }));
        category_input.setEnabled(false);
        category_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_inputActionPerformed(evt);
            }
        });
        product_head_group_panel.add(category_input);

        product_name_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        product_name_label.setText("Product Name");
        product_head_group_panel.add(product_name_label);

        name_input.setEditable(false);
        name_input.setBackground(new java.awt.Color(255, 255, 255));
        product_head_group_panel.add(name_input);

        manufacture_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        manufacture_label.setText("Manufacture");
        product_head_group_panel.add(manufacture_label);

        manufacture_input.setEditable(false);
        manufacture_input.setBackground(new java.awt.Color(255, 255, 255));
        product_head_group_panel.add(manufacture_input);

        model_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        model_label.setText("Model");
        product_head_group_panel.add(model_label);

        model_input.setEditable(false);
        model_input.setBackground(new java.awt.Color(255, 255, 255));
        product_head_group_panel.add(model_input);

        product_info_head_panel.add(product_head_group_panel);

        sm_right_panel.add(product_info_head_panel, java.awt.BorderLayout.NORTH);

        product_info_body_panel.setLayout(new java.awt.BorderLayout(0, 5));

        product_info_group_panel.setLayout(new java.awt.GridLayout(10, 1, 0, 1));

        location_label.setText("Location");
        product_info_group_panel.add(location_label);

        location_input.setEditable(false);
        location_input.setBackground(new java.awt.Color(255, 255, 255));
        product_info_group_panel.add(location_input);

        product_status_label.setText("Status");
        product_info_group_panel.add(product_status_label);

        product_status_box.setEditable(false);
        product_status_box.setBackground(new java.awt.Color(255, 255, 255));
        product_info_group_panel.add(product_status_box);

        warranty_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        warranty_label.setText("Warranty");
        product_info_group_panel.add(warranty_label);

        warranty_input.setEditable(false);
        warranty_input.setBackground(new java.awt.Color(255, 255, 255));
        warranty_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warranty_inputActionPerformed(evt);
            }
        });
        product_info_group_panel.add(warranty_input);

        cost_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cost_label.setText("Cost");
        product_info_group_panel.add(cost_label);

        cost_input.setEditable(false);
        cost_input.setBackground(new java.awt.Color(255, 255, 255));
        cost_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_inputActionPerformed(evt);
            }
        });
        product_info_group_panel.add(cost_input);

        quantity_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        quantity_label.setText("Quantity");
        product_info_group_panel.add(quantity_label);

        quantity_input.setEnabled(false);
        product_info_group_panel.add(quantity_input);

        product_info_body_panel.add(product_info_group_panel, java.awt.BorderLayout.NORTH);

        product_info_desc_panel.setPreferredSize(new java.awt.Dimension(381, 150));
        product_info_desc_panel.setLayout(new java.awt.BorderLayout(0, 2));

        description_label.setText("Description");
        product_info_desc_panel.add(description_label, java.awt.BorderLayout.NORTH);

        description_scroll.setPreferredSize(new java.awt.Dimension(183, 133));

        description_input.setEditable(false);
        description_input.setColumns(20);
        description_input.setRows(5);
        description_input.setPreferredSize(new java.awt.Dimension(170, 100));
        description_scroll.setViewportView(description_input);

        product_info_desc_panel.add(description_scroll, java.awt.BorderLayout.CENTER);

        product_info_body_panel.add(product_info_desc_panel, java.awt.BorderLayout.CENTER);

        sm_right_panel.add(product_info_body_panel, java.awt.BorderLayout.CENTER);

        add_product_button.setText("Add");
        add_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        add_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_buttonActionPerformed(evt);
            }
        });
        product_info_footer_panel.add(add_product_button);

        remove_product_button.setText("Remove");
        remove_product_button.setEnabled(false);
        remove_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        remove_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_product_buttonActionPerformed(evt);
            }
        });
        product_info_footer_panel.add(remove_product_button);

        edit_product_button.setText("Edit..");
        edit_product_button.setEnabled(false);
        edit_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        edit_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_product_buttonActionPerformed(evt);
            }
        });
        product_info_footer_panel.add(edit_product_button);

        save_product_button.setText("Save");
        save_product_button.setEnabled(false);
        save_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
        save_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_product_buttonActionPerformed(evt);
            }
        });
        product_info_footer_panel.add(save_product_button);

        sm_right_panel.add(product_info_footer_panel, java.awt.BorderLayout.SOUTH);

        management_panel.add(sm_right_panel, java.awt.BorderLayout.EAST);

        body.addTab("Stock Management", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/notebook.png")), management_panel); // NOI18N

        order_pane.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Management"));

        ScrollPanelForQueryTable2.setBorder(null);

        query_table2.setDragEnabled(true);
        query_table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query_table2MouseClicked(evt);
            }
        });
        query_table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                query_table2KeyPressed(evt);
            }
        });
        ScrollPanelForQueryTable2.setViewportView(query_table2);

        javax.swing.GroupLayout order_paneLayout = new javax.swing.GroupLayout(order_pane);
        order_pane.setLayout(order_paneLayout);
        order_paneLayout.setHorizontalGroup(
            order_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelForQueryTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        order_paneLayout.setVerticalGroup(
            order_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelForQueryTable2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        order_quantity_label.setText("Quantity");

        jLabel9.setText("Product ID");

        jLabel5.setText("Customer ID");

        delete_order_btn.setText("Delete Order");

        save_order_btn.setText("Save Order");

        order_confirm_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        order_confirm_btn.setText("Order");
        order_confirm_btn.setPreferredSize(new java.awt.Dimension(140, 40));

        order_product_img_panel.setBackground(new java.awt.Color(255, 255, 255));
        order_product_img_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        order_product_img_panel.setLayout(new java.awt.BorderLayout());

        order_product_img.setBackground(new java.awt.Color(255, 255, 255));
        order_product_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/pic/logo.png"))); // NOI18N
        order_product_img.setBorder(null);
        order_product_img.setContentAreaFilled(false);
        order_product_img.setMaximumSize(new java.awt.Dimension(150, 150));
        order_product_img.setMinimumSize(new java.awt.Dimension(150, 150));
        order_product_img.setOpaque(true);
        order_product_img.setPreferredSize(new java.awt.Dimension(150, 150));
        order_product_img.setRolloverEnabled(false);
        order_product_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_product_imgActionPerformed(evt);
            }
        });
        order_product_img_panel.add(order_product_img, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order_confirm_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order_quantity)
                            .addComponent(jTextField3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(order_quantity_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save_order_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(delete_order_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(order_product_img_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order_quantity_label)
                    .addComponent(order_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_order_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_order_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(order_confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(order_product_img_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout order_panelLayout = new javax.swing.GroupLayout(order_panel);
        order_panel.setLayout(order_panelLayout);
        order_panelLayout.setHorizontalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        order_panelLayout.setVerticalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        body.addTab("Order Management", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/clipboard.png")), order_panel); // NOI18N

        request_order_body_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        javax.swing.GroupLayout request_order_body_panelLayout = new javax.swing.GroupLayout(request_order_body_panel);
        request_order_body_panel.setLayout(request_order_body_panelLayout);
        request_order_body_panelLayout.setHorizontalGroup(
            request_order_body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        request_order_body_panelLayout.setVerticalGroup(
            request_order_body_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout order_request_panelLayout = new javax.swing.GroupLayout(order_request_panel);
        order_request_panel.setLayout(order_request_panelLayout);
        order_request_panelLayout.setHorizontalGroup(
            order_request_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_request_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(request_order_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        order_request_panelLayout.setVerticalGroup(
            order_request_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_request_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(request_order_body_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        body.addTab("Order Request", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/checkmark.png")), order_request_panel); // NOI18N

        store_db_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stored Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        store_db_panel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        localhost_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
        localhost_db.setText("Localhost");
        localhost_db.setBorder(null);
        localhost_db.setBorderPainted(false);
        localhost_db.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        localhost_db.setFocusPainted(false);
        localhost_db.setFocusable(false);
        localhost_db.setIconTextGap(12);
        localhost_db.setMargin(new java.awt.Insets(5, 5, 5, 5));
        localhost_db.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32_roll.png"))); // NOI18N
        localhost_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localhost_dbActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
        jToggleButton2.setText("Database 2");
        jToggleButton2.setFocusPainted(false);
        jToggleButton2.setFocusable(false);
        jToggleButton2.setIconTextGap(12);
        jToggleButton2.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton2.setOpaque(true);
        jToggleButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32_roll.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
        jToggleButton3.setText("Database 3");
        jToggleButton3.setFocusPainted(false);
        jToggleButton3.setFocusable(false);
        jToggleButton3.setIconTextGap(12);
        jToggleButton3.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton3.setOpaque(true);
        jToggleButton3.setRolloverEnabled(false);

        db4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
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

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
        jToggleButton5.setText("Database 5");
        jToggleButton5.setFocusPainted(false);
        jToggleButton5.setFocusable(false);
        jToggleButton5.setIconTextGap(12);
        jToggleButton5.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jToggleButton5.setRolloverEnabled(false);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
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

        add_database_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_add_32.png"))); // NOI18N
        add_database_button.setText("Add Database");
        add_database_button.setIconTextGap(6);
        add_database_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_database_buttonActionPerformed(evt);
            }
        });

        find_database_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_search_32.png"))); // NOI18N
        find_database_button.setText("Edit Database");
        find_database_button.setActionCommand("Find Database");
        find_database_button.setIconTextGap(6);
        find_database_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_database_buttonActionPerformed(evt);
            }
        });

        delete_database_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_close_32.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_database_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
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
                .addContainerGap(274, Short.MAX_VALUE))
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

        print_database_info_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/button_up.png"))); // NOI18N
        print_database_info_button.setText("Quick Connect");
        print_database_info_button.setIconTextGap(12);
        print_database_info_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_database_info_buttonActionPerformed(evt);
            }
        });

        test_connection_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/button_sync.png"))); // NOI18N
        test_connection_button.setText("Test Connection");
        test_connection_button.setIconTextGap(12);
        test_connection_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test_connection_buttonActionPerformed(evt);
            }
        });

        set_as_default_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/leaf.png"))); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(test_connection_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
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

        body.addTab("Database", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/database_32.png")), database_panel); // NOI18N

        searching_panel.setLayout(new java.awt.GridLayout(1, 2));

        search_input_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel7.setText("Product ID");
        jPanel7.add(jLabel7);

        search_box_searching.setPreferredSize(new java.awt.Dimension(250, 20));
        jPanel7.add(search_box_searching);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel4.setText("Search Type");
        jPanel6.add(jLabel4);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Quick Search");
        jPanel6.add(jRadioButton1);

        jRadioButton2.setText("Deep Search");
        jPanel6.add(jRadioButton2);

        search_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/search.png"))); // NOI18N
        search_button.setText("Search");
        search_button.setIconTextGap(8);
        search_button.setMaximumSize(new java.awt.Dimension(140, 40));
        search_button.setMinimumSize(new java.awt.Dimension(140, 40));
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout search_input_panelLayout = new javax.swing.GroupLayout(search_input_panel);
        search_input_panel.setLayout(search_input_panelLayout);
        search_input_panelLayout.setHorizontalGroup(
            search_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_input_panelLayout.createSequentialGroup()
                .addGroup(search_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(search_input_panelLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        search_input_panelLayout.setVerticalGroup(
            search_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_input_panelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searching_panel.add(search_input_panel);

        search_result_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        img_box_search.setBackground(new java.awt.Color(255, 255, 255));
        img_box_search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        img_box_search.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout img_box_searchLayout = new javax.swing.GroupLayout(img_box_search);
        img_box_search.setLayout(img_box_searchLayout);
        img_box_searchLayout.setHorizontalGroup(
            img_box_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        img_box_searchLayout.setVerticalGroup(
            img_box_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel25.setText("Description");

        product_group_panel.setLayout(new java.awt.GridLayout(16, 1, 0, 1));

        jLabel17.setText("Product ID");
        product_group_panel.add(jLabel17);

        jTextField4.setEditable(false);
        product_group_panel.add(jTextField4);

        jLabel19.setText("Category");
        product_group_panel.add(jLabel19);

        jTextField5.setEditable(false);
        product_group_panel.add(jTextField5);

        jLabel18.setText("Name");
        product_group_panel.add(jLabel18);

        jTextField6.setEditable(false);
        product_group_panel.add(jTextField6);

        jLabel6.setText("Model");
        product_group_panel.add(jLabel6);

        jTextField8.setEditable(false);
        product_group_panel.add(jTextField8);

        jLabel10.setText("Cost");
        product_group_panel.add(jLabel10);

        jTextField9.setEditable(false);
        product_group_panel.add(jTextField9);

        jLabel21.setText("Quantity");
        product_group_panel.add(jLabel21);

        jTextField12.setEditable(false);
        product_group_panel.add(jTextField12);

        jLabel20.setText("Warranty");
        product_group_panel.add(jLabel20);

        jTextField11.setEditable(false);
        product_group_panel.add(jTextField11);

        jLabel23.setText("Status");
        product_group_panel.add(jLabel23);

        jTextField14.setEditable(false);
        product_group_panel.add(jTextField14);

        product_location_panel.setLayout(new java.awt.GridLayout(6, 1, 0, 1));

        jLabel11.setText("Location");
        product_location_panel.add(jLabel11);

        jTextField10.setEditable(false);
        product_location_panel.add(jTextField10);

        jLabel22.setText("Imported Date");
        product_location_panel.add(jLabel22);

        jTextField13.setEditable(false);
        product_location_panel.add(jTextField13);

        jLabel24.setText("User Last modified");
        product_location_panel.add(jLabel24);

        jTextField15.setEditable(false);
        product_location_panel.add(jTextField15);

        javax.swing.GroupLayout search_result_panelLayout = new javax.swing.GroupLayout(search_result_panel);
        search_result_panel.setLayout(search_result_panelLayout);
        search_result_panelLayout.setHorizontalGroup(
            search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_result_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addGroup(search_result_panelLayout.createSequentialGroup()
                        .addGroup(search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25)
                            .addComponent(product_location_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(img_box_search, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(product_group_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        search_result_panelLayout.setVerticalGroup(
            search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_result_panelLayout.createSequentialGroup()
                .addGroup(search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_result_panelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(img_box_search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product_location_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(product_group_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        searching_panel.add(search_result_panel);

        body.addTab("Searching", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/search.png")), searching_panel); // NOI18N

        statistic_graph.setBackground(new java.awt.Color(255, 255, 255));
        statistic_graph.setLayout(new java.awt.BorderLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Months revenue", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        view_graph_button.setText("View");
        view_graph_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_graph_buttonActionPerformed(evt);
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
                .addComponent(view_graph_button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(925, Short.MAX_VALUE))
            .addComponent(statistic_graph, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statistics_panelLayout.setVerticalGroup(
            statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statistics_panelLayout.createSequentialGroup()
                .addComponent(statistic_graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statistics_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view_graph_button))
                .addContainerGap())
        );

        body.addTab("Statistics", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/statistics.png")), statistics_panel); // NOI18N

        report_panel.setPreferredSize(new java.awt.Dimension(1024, 453));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Current Stock Information");

        print_report_button.setText("Print Report");
        print_report_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_report_buttonActionPerformed(evt);
            }
        });

        save_report_button.setText("Save Report as..");

        done_report_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        done_report_btn.setText("Done");
        done_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                done_report_btnActionPerformed(evt);
            }
        });

        stock_report_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        /*  ArrayList<com.mergano.core.dbManager.<ReportBean> list = null;
        com.mergano.core.dbManager.ReportDAO rpdao = new com.mergano.core.dbManager.ReportDAO();
        try {
            list = rpdao.getReportData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        columns.add("Report ID");
        columns.add("Type");
        columns.add("Detail");
        columns.add("Product ID");
        columns.add("Status");
        columns.add("Reported User");
        columns.add("Date created");
        for(int i =0; i< list.size(); i++) {
            values.add(new String[] {"" +
                list.get(i).getReportID(),
                list.get(i).getReportType(),
                list.get(i).getReportDetail(),
                list.get(i).getReportProductID(),
                list.get(i).getReportStatus(),
                list.get(i).getReportUser(),
                list.get(i).getReportDate()
            });
        } */
        ScrollPanelForBacklog1.setViewportView(report_table);

        javax.swing.GroupLayout stock_report_panelLayout = new javax.swing.GroupLayout(stock_report_panel);
        stock_report_panel.setLayout(stock_report_panelLayout);
        stock_report_panelLayout.setHorizontalGroup(
            stock_report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
            .addGroup(stock_report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(stock_report_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ScrollPanelForBacklog1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        stock_report_panelLayout.setVerticalGroup(
            stock_report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(stock_report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(stock_report_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ScrollPanelForBacklog1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        clear_report_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        clear_report_btn.setText("Clear Report");

        javax.swing.GroupLayout report_panelLayout = new javax.swing.GroupLayout(report_panel);
        report_panel.setLayout(report_panelLayout);
        report_panelLayout.setHorizontalGroup(
            report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(report_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(report_panelLayout.createSequentialGroup()
                        .addComponent(stock_report_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(done_report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save_report_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear_report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print_report_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        report_panelLayout.setVerticalGroup(
            report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(report_panelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(report_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(report_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(done_report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear_report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save_report_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print_report_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stock_report_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        body.addTab("Reporting", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/chart_graph.png")), report_panel); // NOI18N

        ScrollPanelForHistory.setBorder(null);

        ArrayList<com.mergano.core.dao.HistoryBean> listHIS = null;
        com.mergano.core.dao.HistoryDAO hisdao = new com.mergano.core.dao.HistoryDAO();
        try {
            listHIS = hisdao.getHistoryData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String[]> valuesHIS = new ArrayList<>();
        List<String> columnsHIS = new ArrayList<>();
        columnsHIS.add("#");
        columnsHIS.add("Type");
        columnsHIS.add("Action detail");
        columnsHIS.add("Date modified");
        columnsHIS.add("Time");
        columnsHIS.add("Username");

        for(int i =0; i< listHIS.size(); i++) {
            valuesHIS.add(new String[] {"" +
                listHIS.get(i).getBacklogID(),
                listHIS.get(i).getActionType(),
                listHIS.get(i).getActionDetail(),
                listHIS.get(i).getBacklogDate(),
                listHIS.get(i).getBacklogTime(),
                listHIS.get(i).getUser()
            });
        }
        history_table.setAutoCreateRowSorter(true);
        history_table.setModel(new javax.swing.table.DefaultTableModel(valuesHIS.toArray(new Object[][] {}), columnsHIS.toArray())
            {public boolean isCellEditable(int row, int column){return false;}});
        history_table.setFillsViewportHeight(true);
        history_table.setShowHorizontalLines(false);
        history_table.setShowVerticalLines(false);
        if (history_table.getRowCount() == 0) {
            truncate_history_btn.setEnabled(false);
        }
        ScrollPanelForHistory.setViewportView(history_table);
        history_table.getAccessibleContext().setAccessibleName("History table");
        history_table.getAccessibleContext().setAccessibleDescription("This table store history action of user.");

        truncate_history_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        truncate_history_btn.setText("Clear");
        truncate_history_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truncate_history_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout history_panelLayout = new javax.swing.GroupLayout(history_panel);
        history_panel.setLayout(history_panelLayout);
        history_panelLayout.setHorizontalGroup(
            history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(history_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelForHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(truncate_history_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        history_panelLayout.setVerticalGroup(
            history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, history_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPanelForHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGroup(history_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(truncate_history_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        body.addTab("History", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/clock2.png")), history_panel); // NOI18N

        status_bar_frame.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        status_bar_frame.setPreferredSize(new java.awt.Dimension(176, 40));
        status_bar_frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 12, 12));

        dbname_label.setText("Database name");
        status_bar_frame.add(dbname_label);

        db_name_box.setEditable(false);
        db_name_box.setBackground(new java.awt.Color(255, 255, 255));
        db_name_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        db_name_box.setMinimumSize(new java.awt.Dimension(120, 20));
        db_name_box.setPreferredSize(new java.awt.Dimension(120, 20));
        db_name_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db_name_boxActionPerformed(evt);
            }
        });
        status_bar_frame.add(db_name_box);

        status_label.setText("Database status");
        status_bar_frame.add(status_label);

        status_box.setEditable(false);
        status_box.setBackground(new java.awt.Color(255, 255, 255));
        status_box.setForeground(new java.awt.Color(0, 153, 102));
        status_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status_box.setMinimumSize(new java.awt.Dimension(80, 20));
        status_box.setPreferredSize(new java.awt.Dimension(80, 20));
        status_bar_frame.add(status_box);

        dbType_label.setText("Type");
        status_bar_frame.add(dbType_label);

        db_type_box.setEditable(false);
        db_type_box.setBackground(new java.awt.Color(255, 255, 255));
        db_type_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        db_type_box.setMinimumSize(new java.awt.Dimension(80, 20));
        db_type_box.setPreferredSize(new java.awt.Dimension(80, 20));
        status_bar_frame.add(db_type_box);

        hostname_label.setText("Hostname");
        status_bar_frame.add(hostname_label);

        url_box.setEditable(false);
        url_box.setBackground(new java.awt.Color(255, 255, 255));
        url_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        url_box.setMinimumSize(new java.awt.Dimension(120, 20));
        url_box.setPreferredSize(new java.awt.Dimension(120, 20));
        url_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url_boxActionPerformed(evt);
            }
        });
        status_bar_frame.add(url_box);

        port_label.setText("Port");
        status_bar_frame.add(port_label);

        port_box.setEditable(false);
        port_box.setBackground(new java.awt.Color(255, 255, 255));
        port_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        port_box.setMinimumSize(new java.awt.Dimension(60, 20));
        port_box.setPreferredSize(new java.awt.Dimension(60, 20));
        status_bar_frame.add(port_box);

        user_label.setText("Username");
        status_bar_frame.add(user_label);

        user_box.setEditable(false);
        user_box.setBackground(new java.awt.Color(255, 255, 255));
        user_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_box.setMinimumSize(new java.awt.Dimension(120, 20));
        user_box.setPreferredSize(new java.awt.Dimension(120, 20));
        status_bar_frame.add(user_box);

        main_menubar.setBorder(null);
        main_menubar.setPreferredSize(new java.awt.Dimension(56, 23));

        file_menu.setText("File");

        open_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/folder_add.png"))); // NOI18N
        open_menuitem.setText("Open...");
        open_menuitem.setEnabled(false);
        open_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(open_menuitem);

        save_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/save-icon.png"))); // NOI18N
        save_menuitem.setText("Save");
        save_menuitem.setEnabled(false);
        file_menu.add(save_menuitem);

        saveas_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/save-as-icon.png"))); // NOI18N
        saveas_menuitem.setText("Save as...");
        saveas_menuitem.setEnabled(false);
        saveas_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveas_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(saveas_menuitem);
        file_menu.add(jSeparator3);

        welcome_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/home.png"))); // NOI18N
        welcome_menuitem.setText("Welcome");
        welcome_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_buttonActionPerformed(evt);
            }
        });
        file_menu.add(welcome_menuitem);

        dashboard_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/dashboard.png"))); // NOI18N
        dashboard_menuitem.setText("Dashboard");
        dashboard_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(dashboard_menuitem);

        stock_management_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/notebook.png"))); // NOI18N
        stock_management_menuitem.setText("Stock Management");
        stock_management_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_management_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(stock_management_menuitem);

        order_management_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/clipboard.png"))); // NOI18N
        order_management_menuitem.setText("Order Management");
        order_management_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_management_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(order_management_menuitem);

        tracking_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/checkmark.png"))); // NOI18N
        tracking_menuitem.setText("Tracking");
        tracking_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracking_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(tracking_menuitem);

        database_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/database_32.png"))); // NOI18N
        database_menuitem.setText("Database");
        database_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(database_menuitem);

        searching_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/search.png"))); // NOI18N
        searching_menuitem.setText("Searching");
        searching_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searching_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(searching_menuitem);

        statistics_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/chart_pie.png"))); // NOI18N
        statistics_menuitem.setLabel("Statistics");
        statistics_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistics_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(statistics_menuitem);

        report_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/chart_graph.png"))); // NOI18N
        report_menuitem.setText("Report");
        report_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(report_menuitem);

        history_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/clock2.png"))); // NOI18N
        history_menuitem.setText("History");
        history_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(history_menuitem);
        history_menuitem.getAccessibleContext().setAccessibleName("History button");

        file_menu.add(jSeparator7);

        print_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        print_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/print.png"))); // NOI18N
        print_menuitem.setText("Print...");
        print_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(print_menuitem);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/file_edit.png"))); // NOI18N
        jMenuItem16.setText("Page Setup...");
        file_menu.add(jMenuItem16);

        print_preview_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/print.png"))); // NOI18N
        print_preview_menuitem.setText("Print Preview...");
        print_preview_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_preview_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(print_preview_menuitem);
        file_menu.add(jSeparator10);

        logout_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        logout_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/lock_32.png"))); // NOI18N
        logout_menuitem.setText("Logout");
        logout_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_menuitemActionPerformed(evt);
            }
        });
        file_menu.add(logout_menuitem);
        file_menu.add(jSeparator2);

        exit_program.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
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

        jMenuItem27.setText("Cut");
        edit_menu.add(jMenuItem27);

        jMenuItem28.setText("Copy");
        edit_menu.add(jMenuItem28);

        jMenuItem30.setText("Paste");
        jMenuItem30.setEnabled(false);
        edit_menu.add(jMenuItem30);

        jMenuItem31.setText("Paste from History");
        jMenuItem31.setEnabled(false);
        edit_menu.add(jMenuItem31);

        jMenuItem33.setText("Delete");
        edit_menu.add(jMenuItem33);

        jMenuItem32.setText("Select All");
        edit_menu.add(jMenuItem32);
        edit_menu.add(jSeparator9);

        jMenuItem36.setText("Find/Replace...");
        jMenuItem36.setEnabled(false);
        edit_menu.add(jMenuItem36);

        jMenuItem34.setText("Find Next");
        jMenuItem34.setEnabled(false);
        edit_menu.add(jMenuItem34);

        jMenuItem35.setText("Find Previous");
        jMenuItem35.setEnabled(false);
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

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/database_32.png"))); // NOI18N
        jMenu7.setText("Connect..");
        jMenu7.setEnabled(false);

        new_db_menuitem.setText("New...");
        new_db_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_db_menuitemActionPerformed(evt);
            }
        });
        jMenu7.add(new_db_menuitem);

        del_db_menuitem.setText("Delete...");
        del_db_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_db_menuitemActionPerformed(evt);
            }
        });
        jMenu7.add(del_db_menuitem);

        find_db_menuitem.setText("Find...");
        jMenu7.add(find_db_menuitem);

        database_menu.add(jMenu7);

        connect_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/database_add_32.png"))); // NOI18N
        connect_menuitem.setText("Connect");
        connect_menuitem.setEnabled(false);
        connect_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_menuitemActionPerformed(evt);
            }
        });
        database_menu.add(connect_menuitem);

        disconnect_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/database_close_32.png"))); // NOI18N
        disconnect_menuitem.setText("Disconnect");
        disconnect_menuitem.setEnabled(false);
        disconnect_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnect_menuitemActionPerformed(evt);
            }
        });
        database_menu.add(disconnect_menuitem);
        database_menu.add(jSeparator1);

        import_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/folder_upload.png"))); // NOI18N
        import_menuitem.setText("Import...");

        import_csv_menuitem.setText("From CSV");
        import_menuitem.add(import_csv_menuitem);

        database_menu.add(import_menuitem);

        export_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/folder_upload.png"))); // NOI18N
        export_menuitem.setText("Export...");

        export_csv_menuitem.setText("To CSV");
        export_menuitem.add(export_csv_menuitem);

        export_txt_menuitem.setText("To TXT");
        export_menuitem.add(export_txt_menuitem);

        export_sql_menuitem.setText("To SQL");
        export_menuitem.add(export_sql_menuitem);

        database_menu.add(export_menuitem);

        main_menubar.add(database_menu);

        tools_menu.setText("Tools");

        search_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/application_blueprint.png"))); // NOI18N
        search_menuitem.setText("Search...");
        search_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_menuitemActionPerformed(evt);
            }
        });
        tools_menu.add(search_menuitem);

        backup_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/folder_add.png"))); // NOI18N
        backup_menuitem.setText("Backup");
        tools_menu.add(backup_menuitem);

        bookmark_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/user.png"))); // NOI18N
        bookmark_menuitem.setText("Manage User");
        tools_menu.add(bookmark_menuitem);
        tools_menu.add(jSeparator6);

        language_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/globe.png"))); // NOI18N
        language_menuitem.setText("Language");

        en_us_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/flags/usa.png"))); // NOI18N
        en_us_menuitem.setText("English");
        en_us_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                en_us_menuitemActionPerformed(evt);
            }
        });
        language_menuitem.add(en_us_menuitem);

        en_us_menuitem1.setFont(en_us_menuitem1.getFont());
        en_us_menuitem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/flags/thai.png"))); // NOI18N
        en_us_menuitem1.setText("ภาษาไทย");
        en_us_menuitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                en_us_menuitem1ActionPerformed(evt);
            }
        });
        language_menuitem.add(en_us_menuitem1);

        tools_menu.add(language_menuitem);

        options_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/gear.png"))); // NOI18N
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
        help_contents_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/help.png"))); // NOI18N
        help_contents_menuitem.setText("Help Contents");
        help_contents_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_contents_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(help_contents_menuitem);

        online_docs_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        online_docs_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/help2.png"))); // NOI18N
        online_docs_menuitem.setText("Online Docs and Support");
        online_docs_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                online_docs_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(online_docs_menuitem);
        help_menu.add(jSeparator5);

        report_bug_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/bug.png"))); // NOI18N
        report_bug_menuitem.setText("Report Bug...");
        report_bug_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_bug_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(report_bug_menuitem);

        feedback_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/comment.png"))); // NOI18N
        feedback_menuitem.setText("Feedback...");
        feedback_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedback_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(feedback_menuitem);

        website_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/globe.png"))); // NOI18N
        website_menuitem.setText("Website..");
        website_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(website_menuitem);
        help_menu.add(jSeparator4);

        check_for_update_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/button_up.png"))); // NOI18N
        check_for_update_menuitem.setText("Check for Updates");
        check_for_update_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_for_update_menuitemActionPerformed(evt);
            }
        });
        help_menu.add(check_for_update_menuitem);

        about_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/info.png"))); // NOI18N
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
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(status_bar_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status_bar_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        body.getAccessibleContext().setAccessibleName("Body");

        getAccessibleContext().setAccessibleDescription("This is main windows");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void about_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_menuitemActionPerformed
        About a = new About();
        a.setVisible(true);
    }//GEN-LAST:event_about_menuitemActionPerformed

    private void about_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_menuitemMouseClicked

    }//GEN-LAST:event_about_menuitemMouseClicked

    private void check_for_update_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_for_update_menuitemActionPerformed
        JOptionPane.showMessageDialog(this, "No new update found.", "Check for Updates", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_check_for_update_menuitemActionPerformed

    private void feedback_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedback_menuitemActionPerformed
        w.open_website("https://github.com/Juklab/mergano");
    }//GEN-LAST:event_feedback_menuitemActionPerformed

    private void print_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_menuitemActionPerformed
//        try {
//            boolean complete = search_box.print();
//            if (complete) {
//                JOptionPane.showMessageDialog(null, "This job has been sent to the printer.", "Information", JOptionPane.INFORMATION_MESSAGE);
//            }
//        } catch (PrinterException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
//       }
        int selectedIndex = body.getSelectedIndex();
        if (selectedIndex == 2 && product_table.getRowCount() > 0) {
            MessageFormat headers = new MessageFormat("Product List Report");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                product_table.print(JTable.PrintMode.FIT_WIDTH, headers, footer);
            } catch (java.awt.print.PrinterException e) {
                System.err.format("Can't print file", e.getMessage());
            }
        }
    }//GEN-LAST:event_print_menuitemActionPerformed

    private void saveas_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveas_menuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveas_menuitemActionPerformed

    private void print_preview_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_preview_menuitemActionPerformed

    }//GEN-LAST:event_print_preview_menuitemActionPerformed

    private void exit_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_programActionPerformed
        if (evt.getSource() == exit_program) {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure do you want to exit?", "Exit confirmation", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_exit_programActionPerformed

    private void connect_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_menuitemActionPerformed

    }//GEN-LAST:event_connect_menuitemActionPerformed

    private void disconnect_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnect_menuitemActionPerformed

    }//GEN-LAST:event_disconnect_menuitemActionPerformed

    private void db_name_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_name_boxActionPerformed

    }//GEN-LAST:event_db_name_boxActionPerformed

    private void database_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_menuActionPerformed

    }//GEN-LAST:event_database_menuActionPerformed

    private void database_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_database_menuMouseClicked

    }//GEN-LAST:event_database_menuMouseClicked

    private void database_menuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_database_menuComponentShown

    }//GEN-LAST:event_database_menuComponentShown

    private void database_menuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_database_menuFocusGained

    }//GEN-LAST:event_database_menuFocusGained

    private void database_menuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_database_menuStateChanged

    }//GEN-LAST:event_database_menuStateChanged

    private void report_bug_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_bug_menuitemActionPerformed
        w.open_website("https://github.com/Juklab/mergano/issues");
    }//GEN-LAST:event_report_bug_menuitemActionPerformed

    private void help_contents_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_contents_menuitemActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "E:\\Users\\Chukkrit\\OneDrive\\+ Documents +\\NetBeansProjects\\mergano\\src\\help.html");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_help_contents_menuitemActionPerformed

    private void online_docs_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_online_docs_menuitemActionPerformed
        w.open_website("https://github.com/Juklab/mergano/wiki");
    }//GEN-LAST:event_online_docs_menuitemActionPerformed

    private void open_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_menuitemActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
    }//GEN-LAST:event_open_menuitemActionPerformed

    private void statusbar_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusbar_menuitemActionPerformed
        if (evt.getSource().equals(statusbar_menuitem)) {
            boolean stb_state = statusbar_menuitem.isSelected();

            int stb_status;
            if (stb_state == true) {
                stb_status = 1;
            } else {
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
            int tb_status;
            if (tb_state == true) {
                tb_status = 1;
            } else {
                tb_status = 0;
            }

            switch (tb_status) {
                case 1:
                    header.setVisible(true);
                    break;
                case 0:
                    header.setVisible(false);
                    break;
                default:
                    header.setVisible(true);
            }
        }
    }//GEN-LAST:event_toolbar_menuitemActionPerformed

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

    }//GEN-LAST:event_User_buttonActionPerformed

    private void Options_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Options_buttonActionPerformed

    }//GEN-LAST:event_Options_buttonActionPerformed

    private void Customer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_buttonActionPerformed

    }//GEN-LAST:event_Customer_buttonActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void website_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website_menuitemActionPerformed
        w.open_website("http://mergano.com");
    }//GEN-LAST:event_website_menuitemActionPerformed

    private void save_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_product_buttonActionPerformed
        if (addType) {
            AddandSave_ActionPerformed();
        } else {
            EditandSave_ActionPerformed();
        }
    }//GEN-LAST:event_save_product_buttonActionPerformed

    private void EditandSave_ActionPerformed() {
        String old_productID_txt = (String) product_table.getModel().getValueAt(product_table.getSelectedRow(), 0);
        long old_productID = Long.parseLong(old_productID_txt);
        String new_productID_txt = productID_input.getText();
        long new_productID = Long.parseLong(new_productID_txt);
        String category = category_input.getSelectedItem().toString();
        String manufacture = manufacture_input.getText();
        String name = name_input.getText();
        String model = model_input.getText();
        String location = location_input.getText();
        String description = description_input.getText();
        String cost = cost_input.getText();
        String quantity_txt = quantity_input.getValue().toString();
        int quantity = (int) quantity_input.getValue();
        String warranty = warranty_input.getText();

        if (new_productID_txt.length() == 0
                || category.length() == 0
                || manufacture.length() == 0
                || name.length() == 0
                || location.length() == 0
                || cost.length() == 0
                || warranty.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please fill out request box", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (new_productID_txt.length() < 8 || new_productID_txt.length() > 13) {
            JOptionPane.showMessageDialog(this, "Product ID must between 8-13 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (cost.length() > 8) {
            JOptionPane.showMessageDialog(this, "Cost must less than or 8 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (warranty.length() > 3) {
            JOptionPane.showMessageDialog(this, "Warranty must less than or 3 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (quantity > 999999) {
            JOptionPane.showMessageDialog(this, "Quantity must less than or 6 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(quantity_txt) || !isNumeric(cost) || !isNumeric(new_productID_txt)) {
            JOptionPane.showMessageDialog(this, "Quantity, Cost or ProductID must be an integer format only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {

            // Update product bean
            ProductDAO dao = new ProductDAO();
            HistoryDAO hisdao = new HistoryDAO();
            ProductBean bean = new ProductBean();
            bean.setProductID(new_productID);
            bean.setCategory(category);
            bean.setManufacture(manufacture);
            bean.setName(name);
            bean.setModel(model);
            bean.setDescription(description);
            bean.setCost(cost);
            bean.setLocation(location);
            bean.setQuantity(quantity);
            bean.setWarranty(warranty);
            bean.setUserLastModified(user_box.getText());
            bean.setImage(null);

            boolean status = dao.updateData(bean, old_productID);
            updateTable(dao.getData());
            updateHistory(hisdao.getHistoryData());
            if (status) {
                setInputEnable(false);
                JOptionPane.showMessageDialog(this, "Updated data successfully", "Updated Success", JOptionPane.INFORMATION_MESSAGE);
                save_product_button.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Updated data Failed", "Updated Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void AddandSave_ActionPerformed() {
        String productID_txt = productID_input.getText();
        long productID = Long.parseLong(productID_txt);
        String category = category_input.getSelectedItem().toString();
        String manufacture = manufacture_input.getText();
        String name = name_input.getText();
        String model = model_input.getText();
        String location = location_input.getText();
        String description = description_input.getText();
        String cost = cost_input.getText();
        String quantity_txt = quantity_input.getValue().toString();
        int quantity = Integer.parseInt(quantity_txt);
        String warranty = warranty_input.getText();

        if (productID_txt.length() == 0
                || category.length() == 0
                || manufacture.length() == 0
                || name.length() == 0
                || location.length() == 0
                || cost.length() == 0
                || warranty.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please fill out request box", "Information is null", JOptionPane.WARNING_MESSAGE);
        } else if (productID_txt.length() < 8 || productID_txt.length() > 13) {
            JOptionPane.showMessageDialog(this, "Product ID must between 8-13 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (cost.length() > 8) {
            JOptionPane.showMessageDialog(this, "Cost must less than or 8 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (warranty.length() > 3) {
            JOptionPane.showMessageDialog(this, "Warranty must less than or 3 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (quantity_txt.length() > 13) {
            JOptionPane.showMessageDialog(this, "Quantity must less than or 13 digits only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(quantity_txt) || !isNumeric(cost) || !isNumeric(productID_txt)) {
            JOptionPane.showMessageDialog(this, "Quantity, Cost or ProductID must be an integer format only", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Update product bean
            ProductDAO dao = new ProductDAO();
            HistoryDAO hisdao = new HistoryDAO();
            ProductBean bean = new ProductBean();
            bean.setProductID(productID);
            bean.setCategory(category);
            bean.setManufacture(manufacture);
            bean.setName(name);
            bean.setModel(model);
            bean.setDescription(description);
            bean.setCost(cost);
            bean.setLocation(location);
            bean.setQuantity(quantity);
            bean.setWarranty(warranty);
            bean.setStatus("Available");
            bean.setImport(null);
            bean.setUserLastModified(user_box.getText());
            bean.setImage(null);

            try {
                boolean status = dao.insertData(bean);
                updateTable(dao.getData());
                updateHistory(hisdao.getHistoryData());

                if (status) {
                    setInputEnable(false);
                    JOptionPane.showMessageDialog(this, "Added to database successfully", "Added Success", JOptionPane.INFORMATION_MESSAGE);
                    save_product_button.setEnabled(false);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error while adding product: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void edit_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_product_buttonActionPerformed
        editProduct();
    }//GEN-LAST:event_edit_product_buttonActionPerformed

    private void remove_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_product_buttonActionPerformed
        deleteProduct();
    }//GEN-LAST:event_remove_product_buttonActionPerformed

    private void editProduct() {
        if (productID_input.getText().length() != 0) {
            addType = false;
            setInputEnable(true);
            save_product_button.setEnabled(true);
        }
    }

    private void deleteProduct() {
        if (productID_input.getText().length() != 0) {
            int DeleteConfirm = JOptionPane.showConfirmDialog(this, "Are you sure do you want to delete this row?", "Delete confirmation", YES_NO_OPTION, WARNING_MESSAGE);

            if (DeleteConfirm == JOptionPane.YES_OPTION) {
                long product_id = Long.parseLong(productID_input.getText());
                ProductDAO dao = new ProductDAO();
                HistoryDAO hisdao = new HistoryDAO();
                ProductBean bean = new ProductBean();
                bean.setProductID(product_id);
                bean.setUserLastModified(user_box.getText());

                try {
                    boolean status = dao.deleteData(bean, product_id);
                    updateTable(dao.getData());
                    updateHistory(hisdao.getHistoryData());

                    if (status) {
                        JOptionPane.showMessageDialog(this, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        save_product_button.setEnabled(false);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error while deleting product " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No product is selected to delete.", "Nothing to delete", INFORMATION_MESSAGE);
        }
    }

    private void clearProductInput() {
        productID_input.setText("");
        category_input.setSelectedItem("Book");
        name_input.setText("");
        manufacture_input.setText("");
        model_input.setText("");
        location_input.setText("");
        product_status_box.setText("");
        warranty_input.setText("");
        cost_input.setText("");
        quantity_input.setValue(0);
        description_input.setText("");
    }

    private void setInputEnable(boolean b) {
        productID_input.setEditable(b);
        category_input.setEnabled(b);
        name_input.setEditable(b);
        manufacture_input.setEditable(b);
        model_input.setEditable(b);
        location_input.setEditable(b);
        cost_input.setEditable(b);
        warranty_input.setEditable(b);
        quantity_input.setEnabled(b);
        description_input.setEditable(b);
        product_img.setEnabled(b);
    }

    private static boolean isNumeric(String str) {
        return str.matches("^-?[0-9]+(\\.[0-9]+)?$");
    }

    private void add_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_buttonActionPerformed
        // clearProductInput();
        setInputEnable(true);
        addType = true;
        category_input.setEnabled(true);
        save_product_button.setEnabled(true);
    }//GEN-LAST:event_add_product_buttonActionPerformed

    private void import_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_import_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_import_productActionPerformed

    private void action_search_box(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_search_box
        // TODO add your handling code here:
    }//GEN-LAST:event_action_search_box

    private void View_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_buttonActionPerformed
        if (pathname_box.getText().length() != 0) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pathname_box.getText());
            } catch (Exception e) {
                System.err.println("Error detail " + e);
                JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_View_buttonActionPerformed

    private void browse_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_buttonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            String filename = selectedFile.getName();

            if (Utils.getFileExtension(selectedFile).equals("csv")) {
                View_button.setEnabled(true);
                import_product.setEnabled(true);
                pathname_box.setText(path);
            } else {
                JOptionPane.showMessageDialog(this, "The selected file must be .csv type only.", "File type error", WARNING_MESSAGE);
            }
            product_img.setText("");
            product_img.setIcon(ResizeImage(path));
        } else if (result == JFileChooser.CANCEL_OPTION) {
        }

    }//GEN-LAST:event_browse_buttonActionPerformed

    private void new_db_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_db_menuitemActionPerformed

    }//GEN-LAST:event_new_db_menuitemActionPerformed

    private void del_db_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_db_menuitemActionPerformed

    }//GEN-LAST:event_del_db_menuitemActionPerformed

    private void warranty_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warranty_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warranty_inputActionPerformed

    private void search_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_product_buttonActionPerformed
        int filter = filter_column.getSelectedIndex();
        String input_search = search_box.getText();
        ProductDAO pdao = new ProductDAO();
        SearchDAO sdao = new SearchDAO();
        if (search_box.getText().isEmpty()) {
            updateTable(pdao.getData());
        } else {
            switch (filter) {
                case 0: // ProductID
                    if (isNumeric(input_search)) {
                        updateTable(sdao.getDataSearch(input_search, 0));
                    } else {
                        updateTable(pdao.getData());
                    }
                    break;
                case 1: // Name
                    updateTable(sdao.getDataSearch(input_search, 1));
                    break;
                case 2: // Category
                    updateTable(sdao.getDataSearch(input_search, 2));
                    break;
                case 3: // Manufacture
                    updateTable(sdao.getDataSearch(input_search, 3));
                    break;
                case 4: // Location
                    updateTable(sdao.getDataSearch(input_search, 4));
                    break;
                case 5: // Low quantity
                    updateTable(sdao.getLowQuantity());
                    break;
                default:
                    updateTable(pdao.getData());
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

    private void history_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_menuitemActionPerformed
        body.setSelectedIndex(9);
    }//GEN-LAST:event_history_menuitemActionPerformed

    private void add_database_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_database_buttonActionPerformed
        new_db_menuitemActionPerformed(evt);
    }//GEN-LAST:event_add_database_buttonActionPerformed

    private void delete_database_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_database_button1ActionPerformed
        del_db_menuitemActionPerformed(evt);
    }//GEN-LAST:event_delete_database_button1ActionPerformed

    private void set_as_default_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_as_default_buttonActionPerformed
        set_as_default_button.setEnabled(false);
        // save connection setting to file then load as default
    }//GEN-LAST:event_set_as_default_buttonActionPerformed

    private void driver_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driver_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driver_boxActionPerformed

    private void localhost_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localhost_dbActionPerformed
        hostname_show_box.setText("localhost");
        database_name_show_box.setText("mergano");
        database_type_show_box.setText("MySQL");
        port_show_box.setText("3306");
    }//GEN-LAST:event_localhost_dbActionPerformed

    private void options_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_options_menuitemActionPerformed

    }//GEN-LAST:event_options_menuitemActionPerformed

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

    private void view_graph_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_graph_buttonActionPerformed

    }//GEN-LAST:event_view_graph_buttonActionPerformed

    private void order_request_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_request_button_welActionPerformed
        body.setSelectedIndex(4);
    }//GEN-LAST:event_order_request_button_welActionPerformed

    private void sta_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sta_button_welActionPerformed
        body.setSelectedIndex(8);
    }//GEN-LAST:event_sta_button_welActionPerformed

    private void ser_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_button_welActionPerformed
        body.setSelectedIndex(6);
    }//GEN-LAST:event_ser_button_welActionPerformed

    private void ord_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ord_button_welActionPerformed
        body.setSelectedIndex(3);
    }//GEN-LAST:event_ord_button_welActionPerformed

    private void his_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_his_button_welActionPerformed
        body.setSelectedIndex(9);
    }//GEN-LAST:event_his_button_welActionPerformed

    private void welcome_panel_picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcome_panel_picActionPerformed
        w.open_website("http://mergano.com");
    }//GEN-LAST:event_welcome_panel_picActionPerformed

    private void Import_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Import_buttonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
    }//GEN-LAST:event_Import_buttonActionPerformed

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

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void category_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_inputActionPerformed

    private void test_connection_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test_connection_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test_connection_buttonActionPerformed

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        int selectedRow = product_table.getSelectedRow();
        int selectedColumn = product_table.getSelectedColumn();
        fillDataField(selectedRow);
    }//GEN-LAST:event_product_tableMouseClicked

    private void db4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db4ActionPerformed
    }//GEN-LAST:event_db4ActionPerformed

    private void truncate_history_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truncate_history_btnActionPerformed
        if (history_table.getRowCount() > 0) {
            HistoryDAO hisdao = new HistoryDAO();
            hisdao.truncateHistory();
            updateHistory(hisdao.getHistoryData());
            truncate_history_btn.setEnabled(false);
        }
    }//GEN-LAST:event_truncate_history_btnActionPerformed

    private void cost_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_inputActionPerformed

    }//GEN-LAST:event_cost_inputActionPerformed

    private void url_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url_boxActionPerformed

    }//GEN-LAST:event_url_boxActionPerformed

    private void User_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_buttonMouseClicked

    }//GEN-LAST:event_User_buttonMouseClicked

    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(product_img.getWidth(), product_img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    private void fillDataField(int selectedRow) {
        edit_product_button.setEnabled(true);
        remove_product_button.setEnabled(true);
        String selectedProductID = (String) product_table.getModel().getValueAt(selectedRow, 0);
        String selectedCategory = (String) product_table.getModel().getValueAt(selectedRow, 1);
        String selectedProductName = (String) product_table.getModel().getValueAt(selectedRow, 2);
        String selectedManufacture = (String) product_table.getModel().getValueAt(selectedRow, 3);
        String selectedModel = (String) product_table.getModel().getValueAt(selectedRow, 4);
        String selectedDescription = (String) product_table.getModel().getValueAt(selectedRow, 5);
        String selectedCost = (String) product_table.getModel().getValueAt(selectedRow, 6);
        String selectedLocation = (String) product_table.getModel().getValueAt(selectedRow, 7);
        String selectedWarranty = (String) product_table.getModel().getValueAt(selectedRow, 8);
        String selectedQuantity = (String) product_table.getModel().getValueAt(selectedRow, 9);
        String selectedStatus = (String) product_table.getModel().getValueAt(selectedRow, 11);

        productID_input.setText(selectedProductID);
        category_input.setSelectedItem(selectedCategory);
        name_input.setText(selectedProductName);
        manufacture_input.setText(selectedManufacture);
        model_input.setText(selectedModel);
        cost_input.setText(selectedCost);
        quantity_input.setValue(Integer.parseInt(selectedQuantity));
        location_input.setText(selectedLocation);
        warranty_input.setText(selectedWarranty);
        product_status_box.setText(selectedStatus);
        description_input.setText(selectedDescription);

        //System.out.println("CURRENT DATA LIST: " + list.get(selectedRow).getName());
        // System.out.println("CURRENT DATA IMAGE: " + Arrays.toString(list.get(selectedRow).getImage()));
        //if (Arrays.toString(list.get(selectedRow).getImage()) == null) {
        //    product_img.setText("NO IMAGE");
        //} else if (Arrays.toString(list.get(selectedRow).getImage()) != null) {
        //    product_img.setText("");
        //   ImageIcon icon = new ImageIcon(list.get(selectedRow).getImage());
        //   Image image = icon.getImage().getScaledInstance(product_img.getWidth(), product_img.getHeight(), Image.SCALE_SMOOTH);
        //   product_img.setIcon(new ImageIcon(image));
        //}
    }

    private void product_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_tableKeyPressed
        int index = product_table.getSelectedRow();
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            if (index >= 1) {
                fillDataField(index - 1);
            } else if (index == 1) {
                // fillDataField(index);
            } else if (product_table.getRowCount() == 1) { // If table have only 1 row
                fillDataField(1);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (index < product_table.getRowCount() - 1) {
                fillDataField(index + 1);
            } else if (index == product_table.getRowCount()) { // If selected row is last row
                fillDataField(product_table.getRowCount());
            } else if (product_table.getRowCount() == 1) { // If table have only 1 row
                fillDataField(1);
            }
        }
    }//GEN-LAST:event_product_tableKeyPressed

    private void order_management_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_management_menuitemActionPerformed

    }//GEN-LAST:event_order_management_menuitemActionPerformed

    private void data_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_button_welActionPerformed
        body.setSelectedIndex(5);
    }//GEN-LAST:event_data_button_welActionPerformed

    private void find_database_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_database_buttonActionPerformed

    }//GEN-LAST:event_find_database_buttonActionPerformed

    private void logout_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_menuitemActionPerformed
        logout_action();
    }//GEN-LAST:event_logout_menuitemActionPerformed

    private void Logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_buttonActionPerformed
        logout_action();
    }//GEN-LAST:event_Logout_buttonActionPerformed

    private void search_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_menuitemActionPerformed
        body.setSelectedIndex(6);
    }//GEN-LAST:event_search_menuitemActionPerformed

    private void export_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_productActionPerformed
        ExportCSV ex = new ExportCSV();
        ex.exportToCSV(product_table);
    }//GEN-LAST:event_export_productActionPerformed

    private void done_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_done_report_btnActionPerformed

    }//GEN-LAST:event_done_report_btnActionPerformed

    private void query_table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query_table2MouseClicked

    }//GEN-LAST:event_query_table2MouseClicked

    private void query_table2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_query_table2KeyPressed

    }//GEN-LAST:event_query_table2KeyPressed

    private void print_report_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_report_buttonActionPerformed
        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            report_table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Can't print file", e.getMessage());
        }

    }//GEN-LAST:event_print_report_buttonActionPerformed

    private void order_product_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_product_imgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_product_imgActionPerformed

    private void product_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_imgMouseClicked
        if (evt.getClickCount() == 2) {

        }
    }//GEN-LAST:event_product_imgMouseClicked

    private void search_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyReleased
        String keyword = search_box.getText().toLowerCase();
        int selectedCol = filter_column.getSelectedIndex();
        int col;
        switch (selectedCol) {
            case 0:
                filter_search(keyword, 0);
                break;
            case 1:
                filter_search(keyword, 2);
                break;
            case 2:
                filter_search(keyword, 1);
                break;
            case 3:
                filter_search(keyword, 3);
                break;
            case 4:
                filter_search(keyword, 7);
                break;
            default:
                filter_search(keyword, 9);
                break;
        }
    }//GEN-LAST:event_search_boxKeyReleased

    private void product_tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseReleased
        if (product_table.getSelectedRow() == -1) { // if table not select
        } else if (evt.isPopupTrigger()) {
            property_popup_menu.show(evt.getComponent(), evt.getX(), evt.getY());
            String Table_click = (product_table.getModel().getValueAt(product_table.getSelectedRow(), 0).toString());
            System.out.println(Table_click);
        }
    }//GEN-LAST:event_product_tableMouseReleased

    private void add_to_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_order_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_to_order_btnActionPerformed

    private void delete_product_click_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_product_click_btnActionPerformed
        deleteProduct();
    }//GEN-LAST:event_delete_product_click_btnActionPerformed

    private void edit_product_click_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_product_click_btnActionPerformed
        editProduct();
    }//GEN-LAST:event_edit_product_click_btnActionPerformed

    private void product_imgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_imgMouseReleased
        if (product_table.getSelectedRow() == -1) { // if table not select
        } else if (evt.isPopupTrigger()) {
            product_img_popup_menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_product_imgMouseReleased

    private void remove_product_img_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_product_img_menuActionPerformed
        int DeleteImgConfirm = JOptionPane.showConfirmDialog(this, "Are you sure do you want to delete this picture?", "Delete confirmation", YES_NO_OPTION, QUESTION_MESSAGE);
    }//GEN-LAST:event_remove_product_img_menuActionPerformed

    private void en_us_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_en_us_menuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_en_us_menuitemActionPerformed

    private void en_us_menuitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_en_us_menuitem1ActionPerformed
        Locale l = new Locale("th", "TH");
        //  ResourceBundle r = new ResourceBundle.getBundle("Bundle", 1);

    }//GEN-LAST:event_en_us_menuitem1ActionPerformed

    private void filter_search(String keyword, int column) {
        mod = (DefaultTableModel) product_table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(mod);
        product_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + keyword, column));
    }

    private void logout_action() {
        Logout.logout_confirm();
    }

    public void updateTable(ArrayList<ProductBean> list) {
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        columns.add("Product ID");
        columns.add("Category");
        columns.add("Name");
        columns.add("Manufacture");
        columns.add("Model");
        columns.add("Description");
        columns.add("Cost");
        columns.add("Location");
        columns.add("Warranty");
        columns.add("Quantity");
        columns.add("Import");
        columns.add("Status");
        columns.add("Last modified");
        for (int i = 0; i < list.size(); i++) {
            values.add(new String[]{""
                + list.get(i).getProductID(),
                list.get(i).getCategory(),
                list.get(i).getName(),
                list.get(i).getManufacture(),
                list.get(i).getModel(),
                list.get(i).getDescription(),
                list.get(i).getCost(),
                list.get(i).getLocation(),
                list.get(i).getWarranty(),
                String.valueOf(list.get(i).getQuantity()),
                list.get(i).getImport(),
                list.get(i).getStatus(),
                list.get(i).getUserLastModified()
            });
        }
        // set Model of JTabel from list array of data
        product_table.setModel(new javax.swing.table.DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray()));
        product_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        product_table.removeColumn(product_table.getColumnModel().getColumn(5));
        product_table.getColumnModel().getColumn(0).setPreferredWidth(90);
        product_table.getColumnModel().getColumn(1).setPreferredWidth(76);
        product_table.getColumnModel().getColumn(2).setPreferredWidth(150);
        product_table.getColumnModel().getColumn(3).setPreferredWidth(160);
        product_table.getColumnModel().getColumn(4).setPreferredWidth(50);
        product_table.getColumnModel().getColumn(6).setPreferredWidth(60);
        product_table.getColumnModel().getColumn(7).setPreferredWidth(50);
        product_table.getColumnModel().getColumn(8).setPreferredWidth(60);
        product_table.getColumnModel().getColumn(9).setPreferredWidth(60);
        product_table.getColumnModel().getColumn(10).setPreferredWidth(70);
        product_table.getColumnModel().getColumn(11).setPreferredWidth(65);
        // set the JTable into scroll panel
        ScrollPanelForQueryTable.setViewportView(product_table);
        System.out.println("Product table updated");
    }

    public void displayHistory() {
        //backlog_table.setModel(new javax.swing.table.DefaultTableModel(valuesBL.toArray(new Object[][]{}), columnsBL.toArray()));
        ScrollPanelForHistory.setViewportView(history_table);
    }

    private void updateHistory(ArrayList<HistoryBean> list) {
        List<String[]> values = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        HistoryDAO dao = new HistoryDAO();
        try {
            list = dao.getHistoryData();
        } catch (Exception e) {
        }

        columns.add("Backlog ID");
        columns.add("Type");
        columns.add("Action detail");
        columns.add("Date modified");
        columns.add("Time");
        columns.add("Username");

        for (int i = 0; i < list.size(); i++) {
            values.add(new String[]{""
                + list.get(i).getBacklogID(),
                list.get(i).getActionType(),
                list.get(i).getActionDetail(),
                list.get(i).getBacklogDate(),
                list.get(i).getBacklogTime(),
                list.get(i).getUser()
            });
        }
        history_table.setModel(new javax.swing.table.DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray()));
        ScrollPanelForHistory.setViewportView(history_table);
        truncate_history_btn.setEnabled(true);
        System.out.println("History table updated");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton Customer_button;
    protected javax.swing.JButton Dashboard_button;
    protected javax.swing.JButton Export_button;
    protected javax.swing.JButton Home_button;
    protected javax.swing.JButton Import_button;
    protected javax.swing.JButton Logout_button;
    protected javax.swing.JButton Options_button;
    protected javax.swing.JButton Print_button;
    private javax.swing.JScrollPane ScrollPanelForBacklog1;
    private javax.swing.JScrollPane ScrollPanelForHistory;
    private javax.swing.JScrollPane ScrollPanelForQueryTable;
    private javax.swing.JScrollPane ScrollPanelForQueryTable2;
    protected javax.swing.JButton Search_Button;
    protected javax.swing.JButton User_button;
    private javax.swing.JButton View_button;
    private javax.swing.JMenuItem about_menuitem;
    private javax.swing.JButton add_database_button;
    public javax.swing.JButton add_product_button;
    private javax.swing.JMenuItem add_to_order_btn;
    private javax.swing.JMenuItem backup_menuitem;
    public javax.swing.JTabbedPane body;
    private javax.swing.JPanel body_panel;
    private javax.swing.JMenuItem bookmark_menuitem;
    public javax.swing.JButton browse_button;
    private javax.swing.JComboBox category_input;
    private javax.swing.JLabel category_label;
    private javax.swing.JMenuItem change_product_img_menu;
    private javax.swing.JMenuItem check_for_update_menuitem;
    private javax.swing.JButton clear_report_btn;
    private static javax.swing.JMenuItem connect_menuitem;
    public static javax.swing.JTextField connect_status_box;
    private javax.swing.JTextField cost_input;
    private javax.swing.JLabel cost_label;
    protected javax.swing.JButton da_button_wel;
    private javax.swing.JMenuItem dashboard_menuitem;
    protected javax.swing.JPanel dashboard_panel;
    private javax.swing.JPanel dashboard_panel_body;
    protected javax.swing.JButton data_button_wel;
    protected javax.swing.JMenu database_menu;
    private javax.swing.JMenuItem database_menuitem;
    private javax.swing.JTextField database_name_show_box;
    protected javax.swing.JPanel database_panel;
    private javax.swing.JTextField database_type_show_box;
    private javax.swing.JToggleButton db4;
    private javax.swing.JLabel dbType_label;
    private javax.swing.JPanel db_info_panel;
    private javax.swing.JPanel db_manager_panel;
    public static javax.swing.JTextField db_name_box;
    private javax.swing.JPanel db_show_info_panel;
    public static javax.swing.JTextField db_type_box;
    private javax.swing.JLabel dbname_label;
    private javax.swing.JMenuItem del_db_menuitem;
    private javax.swing.JButton delete_database_button1;
    private javax.swing.JButton delete_order_btn;
    private javax.swing.JMenuItem delete_product_click_btn;
    private javax.swing.JTextArea description_input;
    private javax.swing.JLabel description_label;
    private javax.swing.JScrollPane description_scroll;
    private static javax.swing.JMenuItem disconnect_menuitem;
    private javax.swing.JButton done_report_btn;
    private javax.swing.JTextField driver_box;
    protected javax.swing.JMenu edit_menu;
    private javax.swing.JButton edit_product_button;
    private javax.swing.JMenuItem edit_product_click_btn;
    private javax.swing.JMenuItem en_us_menuitem;
    private javax.swing.JMenuItem en_us_menuitem1;
    private javax.swing.JMenuItem exit_program;
    private javax.swing.JMenuItem export_csv_menuitem;
    private javax.swing.JMenu export_menuitem;
    private javax.swing.JButton export_product;
    private javax.swing.JMenuItem export_sql_menuitem;
    private javax.swing.JMenuItem export_txt_menuitem;
    private javax.swing.JMenuItem feedback_menuitem;
    protected javax.swing.JMenu file_menu;
    private javax.swing.JComboBox filter_column;
    private javax.swing.JButton find_database_button;
    private javax.swing.JMenuItem find_db_menuitem;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header_panel;
    private javax.swing.JMenuItem help_contents_menuitem;
    protected javax.swing.JMenu help_menu;
    private javax.swing.JCheckBoxMenuItem hint_menuitem;
    protected javax.swing.JButton his_button_wel;
    private javax.swing.JMenuItem history_menuitem;
    protected javax.swing.JPanel history_panel;
    private javax.swing.JTable history_table;
    protected javax.swing.JPanel home_panel;
    private javax.swing.JLabel hostname_label;
    private javax.swing.JTextField hostname_show_box;
    private javax.swing.JPanel img_box_search;
    private javax.swing.JPanel import_action_panel;
    private javax.swing.JMenuItem import_csv_menuitem;
    private javax.swing.JMenu import_menuitem;
    private javax.swing.JButton import_product;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JMenu language_menuitem;
    private javax.swing.JPanel left_panel;
    private javax.swing.JToggleButton localhost_db;
    private javax.swing.JTextField location_input;
    private javax.swing.JLabel location_label;
    private javax.swing.JMenuItem logout_menuitem;
    protected javax.swing.JButton mai_button_wel;
    private javax.swing.JMenuBar main_menubar;
    private javax.swing.JToolBar main_toolbar;
    protected javax.swing.JPanel management_panel;
    private javax.swing.JTextField manufacture_input;
    private javax.swing.JLabel manufacture_label;
    private javax.swing.JTextField model_input;
    private javax.swing.JLabel model_label;
    private javax.swing.JTextField name_input;
    private javax.swing.JMenuItem new_db_menuitem;
    private javax.swing.JMenuItem online_docs_menuitem;
    private javax.swing.JMenuItem open_menuitem;
    private javax.swing.JMenuItem options_menuitem;
    protected javax.swing.JButton ord_button_wel;
    private javax.swing.JButton order_confirm_btn;
    private javax.swing.JMenuItem order_management_menuitem;
    private javax.swing.JPanel order_pane;
    protected javax.swing.JPanel order_panel;
    private javax.swing.JButton order_product_img;
    private javax.swing.JPanel order_product_img_panel;
    private javax.swing.JSpinner order_quantity;
    private javax.swing.JLabel order_quantity_label;
    protected javax.swing.JButton order_request_button_wel;
    protected javax.swing.JPanel order_request_panel;
    public javax.swing.JTextField pathname_box;
    public static javax.swing.JTextField port_box;
    private javax.swing.JLabel port_label;
    private javax.swing.JTextField port_show_box;
    private javax.swing.JButton print_database_info_button;
    private javax.swing.JMenuItem print_menuitem;
    private javax.swing.JMenuItem print_preview_menuitem;
    private javax.swing.JButton print_report_button;
    private javax.swing.JTextField productID_input;
    private javax.swing.JPanel product_group_panel;
    private javax.swing.JPanel product_head_group_panel;
    private javax.swing.JLabel product_id_label;
    private javax.swing.JLabel product_img;
    private javax.swing.JPanel product_img_panel;
    private javax.swing.JPopupMenu product_img_popup_menu;
    private javax.swing.JPanel product_info_body_panel;
    private javax.swing.JPanel product_info_desc_panel;
    private javax.swing.JPanel product_info_footer_panel;
    private javax.swing.JPanel product_info_group_panel;
    private javax.swing.JPanel product_info_head_panel;
    private javax.swing.JPanel product_location_panel;
    private javax.swing.JLabel product_name_label;
    private javax.swing.JTextField product_status_box;
    private javax.swing.JLabel product_status_label;
    public javax.swing.JTable product_table;
    private javax.swing.JPopupMenu property_popup_menu;
    private javax.swing.JSpinner quantity_input;
    private javax.swing.JLabel quantity_label;
    public javax.swing.JTable query_table2;
    private javax.swing.JButton remove_product_button;
    private javax.swing.JMenuItem remove_product_img_menu;
    protected javax.swing.JButton rep_button_wel;
    private javax.swing.JMenuItem report_bug_menuitem;
    private javax.swing.JMenuItem report_menuitem;
    protected javax.swing.JPanel report_panel;
    private javax.swing.JMenuItem report_product_btn;
    private javax.swing.JTable report_table;
    private javax.swing.JPanel request_order_body_panel;
    private javax.swing.JPanel right_panel;
    private javax.swing.JMenuItem save_menuitem;
    private javax.swing.JButton save_order_btn;
    private javax.swing.JButton save_product_button;
    private javax.swing.JButton save_report_button;
    private javax.swing.JMenuItem saveas_menuitem;
    private javax.swing.JTextField search_box;
    private javax.swing.JTextField search_box_searching;
    private javax.swing.JButton search_button;
    private javax.swing.JPanel search_input_panel;
    private javax.swing.JMenuItem search_menuitem;
    private javax.swing.JButton search_product_button;
    private javax.swing.JPanel search_result_panel;
    private javax.swing.JMenuItem searching_menuitem;
    protected javax.swing.JPanel searching_panel;
    protected javax.swing.JButton ser_button_wel;
    private javax.swing.JButton set_as_default_button;
    protected javax.swing.JButton sm_button_wel;
    private javax.swing.JPanel sm_header_group_panel;
    private javax.swing.JPanel sm_import_product_panel;
    private javax.swing.JPanel sm_left_panel;
    private javax.swing.JPanel sm_right_panel;
    private javax.swing.JPanel sm_search_panel;
    protected javax.swing.JButton sta_button_wel;
    public javax.swing.JPanel statistic_graph;
    private javax.swing.JMenuItem statistics_menuitem;
    protected javax.swing.JPanel statistics_panel;
    private javax.swing.JPanel status_bar_frame;
    public static javax.swing.JTextField status_box;
    private javax.swing.JLabel status_label;
    private javax.swing.JCheckBoxMenuItem statusbar_menuitem;
    private javax.swing.JMenuItem stock_management_menuitem;
    private javax.swing.JPanel stock_report_panel;
    private javax.swing.JPanel store_db_panel;
    private javax.swing.JButton test_connection_button;
    private javax.swing.JCheckBoxMenuItem toolbar_menuitem;
    protected javax.swing.JMenu tools_menu;
    private javax.swing.JMenuItem tracking_menuitem;
    private javax.swing.JButton truncate_history_btn;
    public static javax.swing.JTextField url_box;
    public static javax.swing.JTextField user_box;
    private javax.swing.JLabel user_label;
    private javax.swing.JToggleButton view_graph_button;
    protected javax.swing.JMenu view_menu;
    private javax.swing.JTextField warranty_input;
    private javax.swing.JLabel warranty_label;
    private javax.swing.JMenuItem website_menuitem;
    private javax.swing.JLabel welcome_bg;
    private javax.swing.JMenuItem welcome_menuitem;
    private javax.swing.JButton welcome_panel_pic;
    // End of variables declaration//GEN-END:variables

}
