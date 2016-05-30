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

import com.mergano.core.AreaChart;
import com.mergano.core.ExportCSV;
import com.mergano.core.Logout;
import com.mergano.core.TextFieldLimit;
import com.mergano.core.Utils;
import com.mergano.core.WebBrowse;
import com.mergano.core.bean.HistoryBean;
import com.mergano.core.bean.OrderBean;
import com.mergano.core.bean.ProductBean;
import com.mergano.core.bean.ReportBean;
import com.mergano.core.dao.HistoryDAO;
import com.mergano.core.dao.OrderDAO;
import com.mergano.core.dao.ProductDAO;
import com.mergano.core.dao.ReportDAO;
import com.mergano.core.dao.SearchDAO;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
    private InputStream pimgInstr = null;
    DefaultTableModel mod;
    WebBrowse w = new WebBrowse();

    public Main() {
        initComponents();
        search_box.setDocument(new TextFieldLimit(100));
        pathname_box.setDocument(new TextFieldLimit(500));
        productID_input.setDocument(new TextFieldLimit(13));
        initialDashboard();
        initialStatisticChart();
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
        ser_button_wel = new javax.swing.JButton();
        rep_button_wel = new javax.swing.JButton();
        sta_button_wel = new javax.swing.JButton();
        his_button_wel = new javax.swing.JButton();
        right_panel = new javax.swing.JPanel();
        welcome_panel_pic = new javax.swing.JButton();
        dashboard_panel = new javax.swing.JPanel();
        dashboard_panel_body_left = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        in_stock_dashboard_label = new javax.swing.JLabel();
        in_stock_dashboard = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        out_of_stock_dashboard_label = new javax.swing.JLabel();
        out_of_stock_dashboard = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        current_report_dashboard_label = new javax.swing.JLabel();
        current_report_dashboard = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        current_order_dashboard_label = new javax.swing.JLabel();
        current_order_dashboard = new javax.swing.JLabel();
        dashboard_panel_body_right = new javax.swing.JPanel();
        scroll_panel_request_order = new javax.swing.JScrollPane();
        ArrayList<ProductBean> listofs = null;
        ProductDAO dbofs = new ProductDAO();
        try {
            listofs =  dbofs.getDataOutofStock();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String[] columnsofs = {"Product ID","Category","Name","Manufacture","Cost"};
        Object[][] rowsofs = new Object[listofs.size()][5];
        for(int i =0; i< listofs.size(); i++) {
            rowsofs[i][0] = listofs.get(i).getProductID();
            rowsofs[i][1] = listofs.get(i).getCategory();
            rowsofs[i][2] = listofs.get(i).getName();
            rowsofs[i][3] = listofs.get(i).getManufacture();
            rowsofs[i][4] = listofs.get(i).getCost();
        }
        request_order_table_dashboard = new javax.swing.JTable();
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
        order_left_panel = new javax.swing.JPanel();
        ScrollPanelForQueryTable2 = new javax.swing.JScrollPane();
        ArrayList<OrderBean> listo = null;
        OrderDAO odb = new OrderDAO();
        try {
            listo = odb.getOrderData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String[] columnso = {"Order ID","Customer ID","Order Status","User created","Date created"};
        Object[][] rowso = new Object[listo.size()][5];
        for(int i =0; i< listo.size(); i++) {
            rowso[i][0] = listo.get(i).getIdorder();
            rowso[i][1] = listo.get(i).getCustomer_id();
            rowso[i][2] = listo.get(i).getOrder_status();
            rowso[i][3] = listo.get(i).getUser_created();
            rowso[i][4] = listo.get(i).getDate_created();
        }
        order_table = new javax.swing.JTable();
        order_right_panel = new javax.swing.JPanel();
        order_input = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        order_quantity_label = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        order_id = new javax.swing.JTextField();
        customer_id = new javax.swing.JTextField();
        product_id = new javax.swing.JTextField();
        order_quantity = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        add_to_orderlist_btn = new javax.swing.JButton();
        delete_to_orderlist_btn = new javax.swing.JButton();
        order_product_input = new javax.swing.JPanel();
        add_product_to_order_table = new javax.swing.JScrollPane();
        product_orderlist_table = new javax.swing.JTable();
        order_action_btn_group = new javax.swing.JPanel();
        add_order_btn = new javax.swing.JButton();
        edit_order_btn = new javax.swing.JButton();
        delete_order_btn = new javax.swing.JButton();
        order_comfirm_btn_group = new javax.swing.JPanel();
        order_confirm_btn = new javax.swing.JButton();
        order_confirm_btn1 = new javax.swing.JButton();
        order_request_panel = new javax.swing.JPanel();
        request_order_body_panel_left = new javax.swing.JPanel();
        ScrollPanelForQueryTable3 = new javax.swing.JScrollPane();
        request_order_table = new javax.swing.JTable();
        accept = new javax.swing.JButton();
        request_order_body_panel_right = new javax.swing.JPanel();
        ScrollPanelForQueryTable4 = new javax.swing.JScrollPane();
        request_order_table1 = new javax.swing.JTable();
        database_panel = new javax.swing.JPanel();
        store_db_panel = new javax.swing.JPanel();
        localhost_db = new javax.swing.JToggleButton();
        db2 = new javax.swing.JToggleButton();
        db3 = new javax.swing.JToggleButton();
        db4 = new javax.swing.JToggleButton();
        db5 = new javax.swing.JToggleButton();
        db6 = new javax.swing.JToggleButton();
        db_info_panel = new javax.swing.JPanel();
        db_show_info_panel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        port_show_box = new javax.swing.JTextField();
        hostname_show_box = new javax.swing.JTextField();
        database_type_show_box = new javax.swing.JTextField();
        database_name_show_box = new javax.swing.JTextField();
        connect_status_box = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        usename_db_box = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        db_manager_panel = new javax.swing.JPanel();
        db_action_group_panel = new javax.swing.JPanel();
        print_database_info_button = new javax.swing.JButton();
        test_connection_button = new javax.swing.JButton();
        set_as_default_button = new javax.swing.JButton();
        add_database_button = new javax.swing.JButton();
        delete_database_button1 = new javax.swing.JButton();
        find_database_button = new javax.swing.JButton();
        searching_panel = new javax.swing.JPanel();
        search_input_panel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        search_filter_column = new javax.swing.JComboBox();
        searching_box_input = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        search_button = new javax.swing.JButton();
        search_result_panel = new javax.swing.JPanel();
        img_box_search = new javax.swing.JPanel();
        img_search_result_input = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        s_descrip_search_input = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        product_group_panel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        s_product_id_input = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        s_category_input = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        s_name_input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        s_model_input = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        s_cost_input = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        s_quantity_input = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        s_warranty_input = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        s_status_input = new javax.swing.JTextField();
        product_location_panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        s_location_input = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        s_import_date_input = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        s_user_last_modified_input = new javax.swing.JTextField();
        statistics_panel = new javax.swing.JPanel();
        statistic_graph = new javax.swing.JPanel();
        statistic_control_group = new javax.swing.JPanel();
        month_select = new javax.swing.JComboBox();
        refresh_graph_button = new javax.swing.JToggleButton();
        print_graph_button = new javax.swing.JToggleButton();
        report_panel = new javax.swing.JPanel();
        stock_report_panel = new javax.swing.JPanel();
        scroll_panel_for_report = new javax.swing.JScrollPane();
        ArrayList<ReportBean> rlist = null;
        ReportDAO dbr = new ReportDAO();
        try {
            rlist = dbr.getReportData();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        String[] columnsr = {"Report No.","Report Level","Detail","Status","User Created", "Datetime Created"};
        Object[][] rowsr = new Object[rlist.size()][6];
        for(int i =0; i< rlist.size(); i++) {
            //values.add(new Object[] {
                rowsr[i][0] = rlist.get(i).getReportID() ;
                rowsr[i][1] = rlist.get(i).getReportType();
                rowsr[i][2] = rlist.get(i).getReportDetail();
                rowsr[i][3] = rlist.get(i).getReportStatus();
                rowsr[i][4] = rlist.get(i).getCreatedDate();
                rowsr[i][5] = rlist.get(i).getUserCreated();
            }
            report_table = new javax.swing.JTable();
            report_button_panel = new javax.swing.JPanel();
            report_text_area_panel = new javax.swing.JPanel();
            report_text_scroll = new javax.swing.JScrollPane();
            report_text_area = new javax.swing.JTextArea();
            report_type = new javax.swing.JComboBox<>();
            report_btn_panel = new javax.swing.JPanel();
            report_btn_group = new javax.swing.JPanel();
            create_report_button = new javax.swing.JButton();
            print_report_button = new javax.swing.JButton();
            clear_report_btn = new javax.swing.JButton();
            accept_report_btn = new javax.swing.JButton();
            save_report_button = new javax.swing.JButton();
            history_panel = new javax.swing.JPanel();
            ScrollPanelForHistory = new javax.swing.JScrollPane();
            history_table = new javax.swing.JTable();
            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            truncate_history_btn = new javax.swing.JButton();
            print_history_btn = new javax.swing.JButton();
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
            manager_user_menuitem = new javax.swing.JMenuItem();
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
            add_to_order_btn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    add_to_order_btnMouseClicked(evt);
                }
            });
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
            report_product_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    report_product_btnActionPerformed(evt);
                }
            });
            property_popup_menu.add(report_product_btn);

            change_product_img_menu.setText("Browse...");
            change_product_img_menu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    change_product_img_menuActionPerformed(evt);
                }
            });
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
            Export_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Export_buttonActionPerformed(evt);
                }
            });
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
            left_panel.setLayout(new java.awt.GridLayout(4, 2));

            da_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            da_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            da_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Dashboard.png"))); // NOI18N
            da_button_wel.setText("Dashboard");
            da_button_wel.setContentAreaFilled(false);
            da_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            da_button_wel.setIconTextGap(16);
            da_button_wel.setMargin(new java.awt.Insets(2, 60, 2, 14));
            da_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Dashboard_roll.png"))); // NOI18N
            da_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Dashboard_roll.png"))); // NOI18N
            da_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    da_button_welActionPerformed(evt);
                }
            });
            left_panel.add(da_button_wel);

            sm_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            sm_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            sm_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/notebook.png"))); // NOI18N
            sm_button_wel.setText("Stock Management");
            sm_button_wel.setBorderPainted(false);
            sm_button_wel.setContentAreaFilled(false);
            sm_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            sm_button_wel.setIconTextGap(16);
            sm_button_wel.setMargin(new java.awt.Insets(2, 40, 2, 14));
            sm_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/notebook_roll.png"))); // NOI18N
            sm_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/notebook_roll.png"))); // NOI18N
            sm_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sm_button_welActionPerformed(evt);
                }
            });
            left_panel.add(sm_button_wel);

            ord_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            ord_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            ord_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clipboard_Full.png"))); // NOI18N
            ord_button_wel.setText("Order Management");
            ord_button_wel.setBorderPainted(false);
            ord_button_wel.setContentAreaFilled(false);
            ord_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ord_button_wel.setIconTextGap(16);
            ord_button_wel.setMargin(new java.awt.Insets(2, 60, 2, 14));
            ord_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clipboard_Full_roll.png"))); // NOI18N
            ord_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clipboard_Full_roll.png"))); // NOI18N
            ord_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ord_button_welActionPerformed(evt);
                }
            });
            left_panel.add(ord_button_wel);

            order_request_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            order_request_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            order_request_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Checkmark.png"))); // NOI18N
            order_request_button_wel.setText("Order Request");
            order_request_button_wel.setBorderPainted(false);
            order_request_button_wel.setContentAreaFilled(false);
            order_request_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            order_request_button_wel.setIconTextGap(16);
            order_request_button_wel.setMargin(new java.awt.Insets(2, 40, 2, 14));
            order_request_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Checkmark_roll.png"))); // NOI18N
            order_request_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Checkmark_roll.png"))); // NOI18N
            order_request_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    order_request_button_welActionPerformed(evt);
                }
            });
            left_panel.add(order_request_button_wel);

            ser_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            ser_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            ser_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Search.png"))); // NOI18N
            ser_button_wel.setText("Searching");
            ser_button_wel.setBorderPainted(false);
            ser_button_wel.setContentAreaFilled(false);
            ser_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ser_button_wel.setIconTextGap(16);
            ser_button_wel.setMargin(new java.awt.Insets(2, 60, 2, 14));
            ser_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Search_roll.png"))); // NOI18N
            ser_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Search_roll.png"))); // NOI18N
            ser_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ser_button_welActionPerformed(evt);
                }
            });
            left_panel.add(ser_button_wel);

            rep_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            rep_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            rep_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Graph.png"))); // NOI18N
            rep_button_wel.setText("Reporting");
            rep_button_wel.setBorderPainted(false);
            rep_button_wel.setContentAreaFilled(false);
            rep_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            rep_button_wel.setIconTextGap(16);
            rep_button_wel.setMargin(new java.awt.Insets(2, 40, 2, 14));
            rep_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Graph_roll.png"))); // NOI18N
            rep_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Graph_roll.png"))); // NOI18N
            rep_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rep_button_welActionPerformed(evt);
                }
            });
            left_panel.add(rep_button_wel);

            sta_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            sta_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            sta_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Pie.png"))); // NOI18N
            sta_button_wel.setText("Statistics");
            sta_button_wel.setBorderPainted(false);
            sta_button_wel.setContentAreaFilled(false);
            sta_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            sta_button_wel.setIconTextGap(16);
            sta_button_wel.setMargin(new java.awt.Insets(2, 60, 2, 14));
            sta_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Pie_roll.png"))); // NOI18N
            sta_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Chart_Pie_roll.png"))); // NOI18N
            sta_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sta_button_welActionPerformed(evt);
                }
            });
            left_panel.add(sta_button_wel);

            his_button_wel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            his_button_wel.setForeground(new java.awt.Color(51, 51, 51));
            his_button_wel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clock2.png"))); // NOI18N
            his_button_wel.setText("History");
            his_button_wel.setBorderPainted(false);
            his_button_wel.setContentAreaFilled(false);
            his_button_wel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            his_button_wel.setIconTextGap(16);
            his_button_wel.setMargin(new java.awt.Insets(2, 40, 2, 14));
            his_button_wel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clock2_roll.png"))); // NOI18N
            his_button_wel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/Clock2_roll.png"))); // NOI18N
            his_button_wel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    his_button_welActionPerformed(evt);
                }
            });
            left_panel.add(his_button_wel);

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

            dashboard_panel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    dashboard_panelMouseClicked(evt);
                }
            });
            dashboard_panel.setLayout(new java.awt.GridLayout(1, 2));

            dashboard_panel_body_left.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
            dashboard_panel_body_left.setPreferredSize(new java.awt.Dimension(860, 500));
            dashboard_panel_body_left.setLayout(new java.awt.GridLayout(2, 2));

            jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel8.setLayout(new java.awt.GridLayout(2, 1));

            in_stock_dashboard_label.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
            in_stock_dashboard_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            in_stock_dashboard_label.setText("In Stock");
            in_stock_dashboard_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            in_stock_dashboard_label.setMinimumSize(new java.awt.Dimension(206, 25));
            in_stock_dashboard_label.setPreferredSize(new java.awt.Dimension(206, 25));
            jPanel8.add(in_stock_dashboard_label);

            in_stock_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
            in_stock_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            in_stock_dashboard.setToolTipText("");
            in_stock_dashboard.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jPanel8.add(in_stock_dashboard);

            dashboard_panel_body_left.add(jPanel8);

            jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel11.setLayout(new java.awt.GridLayout(2, 1));

            out_of_stock_dashboard_label.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
            out_of_stock_dashboard_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            out_of_stock_dashboard_label.setText("Out of stock");
            out_of_stock_dashboard_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            out_of_stock_dashboard_label.setMinimumSize(new java.awt.Dimension(206, 25));
            out_of_stock_dashboard_label.setPreferredSize(new java.awt.Dimension(206, 25));
            jPanel11.add(out_of_stock_dashboard_label);

            out_of_stock_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
            out_of_stock_dashboard.setForeground(new java.awt.Color(255, 0, 0));
            out_of_stock_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            out_of_stock_dashboard.setToolTipText("");
            out_of_stock_dashboard.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jPanel11.add(out_of_stock_dashboard);

            dashboard_panel_body_left.add(jPanel11);

            jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel15.setLayout(new java.awt.GridLayout(2, 1));

            current_report_dashboard_label.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
            current_report_dashboard_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            current_report_dashboard_label.setText("Current report");
            current_report_dashboard_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            current_report_dashboard_label.setMinimumSize(new java.awt.Dimension(206, 25));
            current_report_dashboard_label.setPreferredSize(new java.awt.Dimension(206, 25));
            jPanel15.add(current_report_dashboard_label);

            current_report_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
            current_report_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            current_report_dashboard.setToolTipText("");
            current_report_dashboard.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jPanel15.add(current_report_dashboard);

            dashboard_panel_body_left.add(jPanel15);

            jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
            jPanel16.setLayout(new java.awt.GridLayout(2, 1));

            current_order_dashboard_label.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
            current_order_dashboard_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            current_order_dashboard_label.setText("Current Order");
            current_order_dashboard_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            current_order_dashboard_label.setMinimumSize(new java.awt.Dimension(206, 25));
            current_order_dashboard_label.setPreferredSize(new java.awt.Dimension(206, 25));
            jPanel16.add(current_order_dashboard_label);

            current_order_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
            current_order_dashboard.setForeground(new java.awt.Color(0, 102, 204));
            current_order_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            current_order_dashboard.setText("0");
            current_order_dashboard.setToolTipText("");
            current_order_dashboard.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jPanel16.add(current_order_dashboard);

            dashboard_panel_body_left.add(jPanel16);

            dashboard_panel.add(dashboard_panel_body_left);

            dashboard_panel_body_right.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Out of stock Product ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
            dashboard_panel_body_right.setPreferredSize(new java.awt.Dimension(860, 500));
            dashboard_panel_body_right.setLayout(new java.awt.BorderLayout());

            scroll_panel_request_order.setBorder(null);

            request_order_table_dashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            request_order_table_dashboard.setModel(new javax.swing.table.DefaultTableModel(rowsofs, columnsofs)
                {public boolean iasCellEditable(int row, int column){return false;}});
            request_order_table_dashboard.setDragEnabled(true);
            request_order_table_dashboard.setRowHeight(25);
            request_order_table_dashboard.setRowMargin(3);
            request_order_table_dashboard.setSelectionBackground(new java.awt.Color(255, 51, 51));
            request_order_table_dashboard.setShowHorizontalLines(false);
            request_order_table_dashboard.setShowVerticalLines(false);
            request_order_table_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    request_order_table_dashboardMouseClicked(evt);
                }
            });
            request_order_table_dashboard.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    request_order_table_dashboardKeyPressed(evt);
                }
            });
            scroll_panel_request_order.setViewportView(request_order_table_dashboard);

            dashboard_panel_body_right.add(scroll_panel_request_order, java.awt.BorderLayout.CENTER);

            dashboard_panel.add(dashboard_panel_body_right);

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

            ArrayList<ProductBean> list = null;
            ProductDAO db = new ProductDAO();
            try {
                list = db.getData();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            String[] columns = {"Product ID","Category","Name","Manufacture","Model","Description","Cost","Location","Warranty","Quantity","Import","Status","Last modified","Image"};
            Object[][] rows = new Object[list.size()][14];
            for(int i =0; i< list.size(); i++) {
                rows[i][0] = list.get(i).getProductID();
                rows[i][1] = list.get(i).getCategory();
                rows[i][2] = list.get(i).getName();
                rows[i][3] = list.get(i).getManufacture();
                rows[i][4] = list.get(i).getModel();
                rows[i][5] = list.get(i).getDescription();
                rows[i][6] = list.get(i).getCost();
                rows[i][7] = list.get(i).getLocation();
                rows[i][8] = list.get(i).getWarranty();
                rows[i][9] = list.get(i).getQuantity();
                rows[i][10] = list.get(i).getImport();
                rows[i][11] = list.get(i).getStatus();
                rows[i][12] = list.get(i).getUserLastModified();
                if (list.get(i).getPImage() != null) {
                    InputStream is = new BufferedInputStream(list.get(i).getPImage());
                    try {
                        Image image = ImageIO.read(is);
                        ImageIcon image2 = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(60, 20, Image.SCALE_SMOOTH));
                        rows[i][13] = image2;
                    } catch (IOException ex) {
                        rows[i][13] = null;
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    rows[i][13] = null;
                }
            }
            product_table.setAutoCreateRowSorter(true);
            product_table.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            product_table.setModel(new javax.swing.table.DefaultTableModel(rows, columns)
                {public boolean iasCellEditable(int row, int column){return false;}}
            );
            product_table.setToolTipText("Product table");
            product_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            product_table.setFillsViewportHeight(true);
            product_table.setGridColor(new java.awt.Color(204, 204, 204));
            product_table.setName(""); // NOI18N
            product_table.setRowHeight(25);
            product_table.setRowMargin(3);
            product_table.setSelectionBackground(new java.awt.Color(255, 51, 51));
            product_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            product_table.setShowHorizontalLines(false);
            product_table.setShowVerticalLines(false);
            product_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            product_table.removeColumn(product_table.getColumnModel().getColumn(5));
            product_table.removeColumn(product_table.getColumnModel().getColumn(12));
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
            product_table.getAccessibleContext().setAccessibleName("");
            product_table.getAccessibleContext().setAccessibleDescription("");

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
            product_img.setIcon(null);
            product_img.setText("NO IMAGE");
            product_img.setMaximumSize(new java.awt.Dimension(60, 20));
            product_img.setMinimumSize(new java.awt.Dimension(60, 20));
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

            quantity_input.setModel(new javax.swing.SpinnerNumberModel(1, 0, 999, 1));
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

            add_product_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            add_product_button.setText("Add");
            add_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
            add_product_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    add_product_buttonActionPerformed(evt);
                }
            });
            product_info_footer_panel.add(add_product_button);

            remove_product_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            remove_product_button.setText("Remove");
            remove_product_button.setEnabled(false);
            remove_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
            remove_product_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    remove_product_buttonActionPerformed(evt);
                }
            });
            product_info_footer_panel.add(remove_product_button);

            edit_product_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            edit_product_button.setText("Edit..");
            edit_product_button.setEnabled(false);
            edit_product_button.setPreferredSize(new java.awt.Dimension(80, 28));
            edit_product_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    edit_product_buttonActionPerformed(evt);
                }
            });
            product_info_footer_panel.add(edit_product_button);

            save_product_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
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

            order_panel.setLayout(new java.awt.BorderLayout());

            order_left_panel.setPreferredSize(new java.awt.Dimension(800, 400));
            order_left_panel.setLayout(new java.awt.BorderLayout(10, 10));

            ScrollPanelForQueryTable2.setBorder(null);

            order_table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            order_table.setModel(new javax.swing.table.DefaultTableModel(rowso, columnso)
                {public boolean iasCellEditable(int row, int column){return false;}});
            order_table.setDragEnabled(true);
            order_table.setRowHeight(25);
            order_table.setRowMargin(3);
            order_table.setSelectionBackground(new java.awt.Color(255, 51, 51));
            order_table.setShowHorizontalLines(false);
            order_table.setShowVerticalLines(false);
            order_table.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    order_tableMouseClicked(evt);
                }
            });
            order_table.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    order_tableKeyPressed(evt);
                }
            });
            ScrollPanelForQueryTable2.setViewportView(order_table);

            order_left_panel.add(ScrollPanelForQueryTable2, java.awt.BorderLayout.CENTER);

            order_panel.add(order_left_panel, java.awt.BorderLayout.CENTER);

            order_right_panel.setPreferredSize(new java.awt.Dimension(395, 400));
            order_right_panel.setLayout(new java.awt.BorderLayout());

            order_input.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Order ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
            order_input.setLayout(new java.awt.BorderLayout(10, 10));

            jPanel12.setLayout(new java.awt.GridLayout(4, 1, 10, 10));

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jLabel1.setText("Order ID");
            jPanel12.add(jLabel1);

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jLabel5.setText("Customer ID");
            jPanel12.add(jLabel5);

            jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jLabel9.setText("Product ID");
            jPanel12.add(jLabel9);

            order_quantity_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            order_quantity_label.setText("Quantity");
            jPanel12.add(order_quantity_label);

            order_input.add(jPanel12, java.awt.BorderLayout.WEST);

            jPanel10.setLayout(new java.awt.GridLayout(4, 0, 5, 5));

            order_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jPanel10.add(order_id);

            customer_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jPanel10.add(customer_id);

            product_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jPanel10.add(product_id);

            order_quantity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jPanel10.add(order_quantity);

            order_input.add(jPanel10, java.awt.BorderLayout.CENTER);

            jPanel9.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

            add_to_orderlist_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            add_to_orderlist_btn.setText("Add Product");
            add_to_orderlist_btn.setPreferredSize(new java.awt.Dimension(99, 30));
            add_to_orderlist_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    add_to_orderlist_btnActionPerformed(evt);
                }
            });
            jPanel9.add(add_to_orderlist_btn);

            delete_to_orderlist_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            delete_to_orderlist_btn.setText("Remove Product");
            delete_to_orderlist_btn.setPreferredSize(new java.awt.Dimension(99, 30));
            delete_to_orderlist_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    delete_to_orderlist_btnActionPerformed(evt);
                }
            });
            jPanel9.add(delete_to_orderlist_btn);

            order_input.add(jPanel9, java.awt.BorderLayout.SOUTH);

            order_right_panel.add(order_input, java.awt.BorderLayout.NORTH);

            order_product_input.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Order List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
            order_product_input.setPreferredSize(new java.awt.Dimension(214, 423));
            order_product_input.setLayout(new java.awt.BorderLayout(10, 10));

            add_product_to_order_table.setBackground(new java.awt.Color(255, 255, 255));
            add_product_to_order_table.setPreferredSize(new java.awt.Dimension(100, 600));
            add_product_to_order_table.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    add_product_to_order_tableMouseClicked(evt);
                }
            });

            product_orderlist_table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            product_orderlist_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Product ID", "Quantity"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            product_orderlist_table.setRowHeight(25);
            product_orderlist_table.setRowMargin(3);
            product_orderlist_table.setSelectionBackground(new java.awt.Color(255, 51, 51));
            product_orderlist_table.setShowHorizontalLines(false);
            product_orderlist_table.setShowVerticalLines(false);
            add_product_to_order_table.setViewportView(product_orderlist_table);

            order_product_input.add(add_product_to_order_table, java.awt.BorderLayout.CENTER);

            order_action_btn_group.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

            add_order_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            add_order_btn.setText("Create Order");
            add_order_btn.setPreferredSize(new java.awt.Dimension(120, 40));
            add_order_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    add_order_btnActionPerformed(evt);
                }
            });
            order_action_btn_group.add(add_order_btn);

            edit_order_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            edit_order_btn.setText("Edit Order");
            order_action_btn_group.add(edit_order_btn);

            delete_order_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            delete_order_btn.setText("Delete Order");
            delete_order_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    delete_order_btnActionPerformed(evt);
                }
            });
            order_action_btn_group.add(delete_order_btn);

            order_product_input.add(order_action_btn_group, java.awt.BorderLayout.SOUTH);

            order_right_panel.add(order_product_input, java.awt.BorderLayout.CENTER);

            order_comfirm_btn_group.setLayout(new java.awt.BorderLayout(5, 5));

            order_confirm_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            order_confirm_btn.setText("Confirm Order");
            order_confirm_btn.setPreferredSize(new java.awt.Dimension(140, 40));
            order_confirm_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    order_confirm_btnActionPerformed(evt);
                }
            });
            order_comfirm_btn_group.add(order_confirm_btn, java.awt.BorderLayout.CENTER);

            order_confirm_btn1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            order_confirm_btn1.setText("Print Order Invoice");
            order_confirm_btn1.setPreferredSize(new java.awt.Dimension(140, 40));
            order_confirm_btn1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    order_confirm_btn1ActionPerformed(evt);
                }
            });
            order_comfirm_btn_group.add(order_confirm_btn1, java.awt.BorderLayout.PAGE_END);

            order_right_panel.add(order_comfirm_btn_group, java.awt.BorderLayout.PAGE_END);

            order_panel.add(order_right_panel, java.awt.BorderLayout.EAST);

            body.addTab("Order Management", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/clipboard.png")), order_panel); // NOI18N

            order_request_panel.setLayout(new java.awt.GridLayout(1, 2));

            request_order_body_panel_left.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
            request_order_body_panel_left.setPreferredSize(new java.awt.Dimension(462, 400));
            request_order_body_panel_left.setLayout(new java.awt.BorderLayout());

            ScrollPanelForQueryTable3.setBorder(null);

            request_order_table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            request_order_table.setDragEnabled(true);
            request_order_table.setRowHeight(25);
            request_order_table.setRowMargin(3);
            request_order_table.setRowSelectionAllowed(false);
            request_order_table.setSelectionBackground(new java.awt.Color(102, 153, 0));
            request_order_table.setShowHorizontalLines(false);
            request_order_table.setShowVerticalLines(false);
            request_order_table.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    request_order_tableMouseClicked(evt);
                }
            });
            request_order_table.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    request_order_tableKeyPressed(evt);
                }
            });
            ScrollPanelForQueryTable3.setViewportView(request_order_table);

            request_order_body_panel_left.add(ScrollPanelForQueryTable3, java.awt.BorderLayout.CENTER);

            accept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            accept.setText("Accept");
            request_order_body_panel_left.add(accept, java.awt.BorderLayout.SOUTH);

            order_request_panel.add(request_order_body_panel_left);

            request_order_body_panel_right.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
            request_order_body_panel_right.setPreferredSize(new java.awt.Dimension(462, 400));
            request_order_body_panel_right.setLayout(new java.awt.BorderLayout());

            ScrollPanelForQueryTable4.setBorder(null);

            request_order_table1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            request_order_table1.setDragEnabled(true);
            request_order_table1.setRowHeight(25);
            request_order_table1.setRowMargin(3);
            request_order_table1.setRowSelectionAllowed(false);
            request_order_table1.setSelectionBackground(new java.awt.Color(102, 153, 0));
            request_order_table1.setShowHorizontalLines(false);
            request_order_table1.setShowVerticalLines(false);
            request_order_table1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    request_order_table1MouseClicked(evt);
                }
            });
            request_order_table1.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    request_order_table1KeyPressed(evt);
                }
            });
            ScrollPanelForQueryTable4.setViewportView(request_order_table1);

            request_order_body_panel_right.add(ScrollPanelForQueryTable4, java.awt.BorderLayout.CENTER);

            order_request_panel.add(request_order_body_panel_right);

            body.addTab("Order Request", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/checkmark.png")), order_request_panel); // NOI18N

            database_panel.setEnabled(false);
            database_panel.setLayout(new java.awt.BorderLayout());

            store_db_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stored Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
            store_db_panel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            store_db_panel.setPreferredSize(new java.awt.Dimension(650, 460));
            store_db_panel.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

            localhost_db.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            localhost_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
            localhost_db.setText("Database 1");
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
            store_db_panel.add(localhost_db);

            db2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            db2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
            db2.setText("Database 2");
            db2.setFocusPainted(false);
            db2.setFocusable(false);
            db2.setIconTextGap(12);
            db2.setMargin(new java.awt.Insets(5, 5, 5, 5));
            db2.setOpaque(true);
            db2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32_roll.png"))); // NOI18N
            db2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    db2ActionPerformed(evt);
                }
            });
            store_db_panel.add(db2);

            db3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            db3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
            db3.setText("Database 3");
            db3.setFocusPainted(false);
            db3.setFocusable(false);
            db3.setIconTextGap(12);
            db3.setMargin(new java.awt.Insets(5, 5, 5, 5));
            db3.setOpaque(true);
            db3.setRolloverEnabled(false);
            store_db_panel.add(db3);

            db4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
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
            store_db_panel.add(db4);

            db5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            db5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
            db5.setText("Database 5");
            db5.setFocusPainted(false);
            db5.setFocusable(false);
            db5.setIconTextGap(12);
            db5.setMargin(new java.awt.Insets(5, 5, 5, 5));
            db5.setRolloverEnabled(false);
            store_db_panel.add(db5);

            db6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            db6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_32.png"))); // NOI18N
            db6.setText("Database 6");
            db6.setFocusPainted(false);
            db6.setFocusable(false);
            db6.setIconTextGap(12);
            db6.setMargin(new java.awt.Insets(5, 5, 5, 5));
            db6.setRolloverEnabled(false);
            store_db_panel.add(db6);

            database_panel.add(store_db_panel, java.awt.BorderLayout.WEST);

            db_info_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Infomation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
            db_info_panel.setLayout(new java.awt.BorderLayout(10, 10));

            db_show_info_panel.setBackground(new java.awt.Color(255, 255, 255));
            db_show_info_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            db_show_info_panel.setPreferredSize(new java.awt.Dimension(792, 400));

            jPanel5.setBackground(new java.awt.Color(255, 255, 255));
            jPanel5.setLayout(new java.awt.GridLayout(8, 1, 0, 18));

            jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel8.setText("Connection Status");
            jPanel5.add(jLabel8);

            jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel12.setText("Database Name");
            jPanel5.add(jLabel12);

            jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel13.setText("Database Type");
            jPanel5.add(jLabel13);

            jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel14.setText("Host name");
            jPanel5.add(jLabel14);

            jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel15.setText("Port");
            jPanel5.add(jLabel15);

            jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel16.setText("Driver type");
            jPanel5.add(jLabel16);

            jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel26.setText("Username");
            jPanel5.add(jLabel26);

            jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel27.setText("Password");
            jPanel5.add(jLabel27);

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));
            jPanel4.setLayout(new java.awt.GridLayout(8, 1, 0, 18));

            port_show_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(port_show_box);

            hostname_show_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(hostname_show_box);

            database_type_show_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(database_type_show_box);

            database_name_show_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(database_name_show_box);

            connect_status_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(connect_status_box);

            jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MySQL", "Postgresql", "SQL Server", "DB2" }));
            jPanel4.add(jComboBox1);

            usename_db_box.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(usename_db_box);

            jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jPanel4.add(jPasswordField1);

            javax.swing.GroupLayout db_show_info_panelLayout = new javax.swing.GroupLayout(db_show_info_panel);
            db_show_info_panel.setLayout(db_show_info_panelLayout);
            db_show_info_panelLayout.setHorizontalGroup(
                db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(db_show_info_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20))
            );
            db_show_info_panelLayout.setVerticalGroup(
                db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(db_show_info_panelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(db_show_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(36, Short.MAX_VALUE))
            );

            db_info_panel.add(db_show_info_panel, java.awt.BorderLayout.NORTH);

            db_manager_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Manager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
            db_manager_panel.setPreferredSize(new java.awt.Dimension(485, 100));
            db_manager_panel.setLayout(new java.awt.BorderLayout());

            db_action_group_panel.setLayout(new java.awt.GridLayout(2, 3, 10, 10));

            print_database_info_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            print_database_info_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/button_up.png"))); // NOI18N
            print_database_info_button.setText("Quick Connect");
            print_database_info_button.setIconTextGap(12);
            print_database_info_button.setPreferredSize(new java.awt.Dimension(130, 50));
            print_database_info_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    print_database_info_buttonActionPerformed(evt);
                }
            });
            db_action_group_panel.add(print_database_info_button);

            test_connection_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            test_connection_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/button_sync.png"))); // NOI18N
            test_connection_button.setText("Test Connection");
            test_connection_button.setIconTextGap(12);
            test_connection_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    test_connection_buttonActionPerformed(evt);
                }
            });
            db_action_group_panel.add(test_connection_button);

            set_as_default_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            set_as_default_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/leaf.png"))); // NOI18N
            set_as_default_button.setText("Set as Default");
            set_as_default_button.setIconTextGap(12);
            set_as_default_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    set_as_default_buttonActionPerformed(evt);
                }
            });
            db_action_group_panel.add(set_as_default_button);

            add_database_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            add_database_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_add_32.png"))); // NOI18N
            add_database_button.setText("Add Database");
            add_database_button.setIconTextGap(6);
            add_database_button.setPreferredSize(new java.awt.Dimension(150, 50));
            add_database_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    add_database_buttonActionPerformed(evt);
                }
            });
            db_action_group_panel.add(add_database_button);

            delete_database_button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            delete_database_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_close_32.png"))); // NOI18N
            delete_database_button1.setText("Delete Database");
            delete_database_button1.setIconTextGap(6);
            delete_database_button1.setPreferredSize(new java.awt.Dimension(150, 50));
            delete_database_button1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    delete_database_button1ActionPerformed(evt);
                }
            });
            db_action_group_panel.add(delete_database_button1);

            find_database_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            find_database_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico32/database_search_32.png"))); // NOI18N
            find_database_button.setText("Edit Database");
            find_database_button.setActionCommand("Find Database");
            find_database_button.setIconTextGap(6);
            find_database_button.setPreferredSize(new java.awt.Dimension(150, 50));
            find_database_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    find_database_buttonActionPerformed(evt);
                }
            });
            db_action_group_panel.add(find_database_button);

            db_manager_panel.add(db_action_group_panel, java.awt.BorderLayout.CENTER);

            db_info_panel.add(db_manager_panel, java.awt.BorderLayout.CENTER);

            database_panel.add(db_info_panel, java.awt.BorderLayout.CENTER);

            body.addTab("Database", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/database_32.png")), database_panel); // NOI18N

            searching_panel.setLayout(new java.awt.GridLayout(1, 2));

            search_input_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
            search_input_panel.setLayout(new java.awt.BorderLayout());

            jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 10));

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jLabel4.setText("Search Type");
            jPanel6.add(jLabel4);

            jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jRadioButton1.setSelected(true);
            jRadioButton1.setText("Quick Search");
            jPanel6.add(jRadioButton1);

            jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jRadioButton2.setText("Deep Search");
            jPanel6.add(jRadioButton2);

            search_input_panel.add(jPanel6, java.awt.BorderLayout.NORTH);

            jPanel7.setPreferredSize(new java.awt.Dimension(531, 300));
            jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

            search_filter_column.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product ID", "Name" }));
            search_filter_column.setPreferredSize(new java.awt.Dimension(100, 30));
            jPanel7.add(search_filter_column);

            searching_box_input.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            searching_box_input.setMinimumSize(new java.awt.Dimension(300, 30));
            searching_box_input.setPreferredSize(new java.awt.Dimension(450, 30));
            searching_box_input.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    searching_box_inputKeyPressed(evt);
                }
            });
            jPanel7.add(searching_box_input);

            search_input_panel.add(jPanel7, java.awt.BorderLayout.CENTER);

            jPanel3.setPreferredSize(new java.awt.Dimension(585, 107));
            jPanel3.setLayout(new java.awt.BorderLayout());

            search_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico/search.png"))); // NOI18N
            search_button.setText("Search");
            search_button.setIconTextGap(8);
            search_button.setMaximumSize(new java.awt.Dimension(140, 40));
            search_button.setMinimumSize(new java.awt.Dimension(180, 45));
            search_button.setPreferredSize(new java.awt.Dimension(180, 45));
            search_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    search_buttonActionPerformed(evt);
                }
            });
            jPanel3.add(search_button, java.awt.BorderLayout.SOUTH);

            search_input_panel.add(jPanel3, java.awt.BorderLayout.SOUTH);

            searching_panel.add(search_input_panel);

            search_result_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

            img_box_search.setBackground(new java.awt.Color(255, 255, 255));
            img_box_search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            img_box_search.setPreferredSize(new java.awt.Dimension(150, 150));
            img_box_search.setLayout(new java.awt.BorderLayout());

            img_search_result_input.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            img_search_result_input.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            img_search_result_input.setText("NO IMAGE");
            img_box_search.add(img_search_result_input, java.awt.BorderLayout.CENTER);

            s_descrip_search_input.setEditable(false);
            s_descrip_search_input.setColumns(20);
            s_descrip_search_input.setRows(5);
            jScrollPane1.setViewportView(s_descrip_search_input);

            jLabel25.setText("Description");

            product_group_panel.setLayout(new java.awt.GridLayout(16, 1, 0, 1));

            jLabel17.setText("Product ID");
            product_group_panel.add(jLabel17);

            s_product_id_input.setEditable(false);
            s_product_id_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_product_id_input);

            jLabel19.setText("Category");
            product_group_panel.add(jLabel19);

            s_category_input.setEditable(false);
            s_category_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_category_input);

            jLabel18.setText("Name");
            product_group_panel.add(jLabel18);

            s_name_input.setEditable(false);
            s_name_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_name_input);

            jLabel6.setText("Model");
            product_group_panel.add(jLabel6);

            s_model_input.setEditable(false);
            s_model_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_model_input);

            jLabel10.setText("Cost");
            product_group_panel.add(jLabel10);

            s_cost_input.setEditable(false);
            s_cost_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_cost_input);

            jLabel21.setText("Quantity");
            product_group_panel.add(jLabel21);

            s_quantity_input.setEditable(false);
            s_quantity_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_quantity_input);

            jLabel20.setText("Warranty");
            product_group_panel.add(jLabel20);

            s_warranty_input.setEditable(false);
            s_warranty_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_warranty_input);

            jLabel23.setText("Status");
            product_group_panel.add(jLabel23);

            s_status_input.setEditable(false);
            s_status_input.setBackground(new java.awt.Color(255, 255, 255));
            product_group_panel.add(s_status_input);

            product_location_panel.setLayout(new java.awt.GridLayout(6, 1, 0, 1));

            jLabel11.setText("Location");
            product_location_panel.add(jLabel11);

            s_location_input.setEditable(false);
            s_location_input.setBackground(new java.awt.Color(255, 255, 255));
            product_location_panel.add(s_location_input);

            jLabel22.setText("Imported Date");
            product_location_panel.add(jLabel22);

            s_import_date_input.setEditable(false);
            s_import_date_input.setBackground(new java.awt.Color(255, 255, 255));
            product_location_panel.add(s_import_date_input);

            jLabel24.setText("User Last modified");
            product_location_panel.add(jLabel24);

            s_user_last_modified_input.setEditable(false);
            s_user_last_modified_input.setBackground(new java.awt.Color(255, 255, 255));
            product_location_panel.add(s_user_last_modified_input);

            javax.swing.GroupLayout search_result_panelLayout = new javax.swing.GroupLayout(search_result_panel);
            search_result_panel.setLayout(search_result_panelLayout);
            search_result_panelLayout.setHorizontalGroup(
                search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(search_result_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
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
                    .addGap(18, 18, 18)
                    .addComponent(jLabel25)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            searching_panel.add(search_result_panel);

            body.addTab("Searching", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/search.png")), searching_panel); // NOI18N

            statistics_panel.setLayout(new java.awt.BorderLayout());

            statistic_graph.setBackground(new java.awt.Color(255, 255, 255));
            statistic_graph.setLayout(new java.awt.BorderLayout());
            statistics_panel.add(statistic_graph, java.awt.BorderLayout.CENTER);

            statistic_control_group.setPreferredSize(new java.awt.Dimension(500, 40));
            statistic_control_group.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

            month_select.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            month_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
            month_select.setPreferredSize(new java.awt.Dimension(150, 30));
            statistic_control_group.add(month_select);

            refresh_graph_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            refresh_graph_button.setText("Refresh");
            refresh_graph_button.setPreferredSize(new java.awt.Dimension(100, 30));
            refresh_graph_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    refresh_graph_buttonActionPerformed(evt);
                }
            });
            statistic_control_group.add(refresh_graph_button);

            print_graph_button.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            print_graph_button.setText("Print");
            print_graph_button.setPreferredSize(new java.awt.Dimension(100, 30));
            print_graph_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    print_graph_buttonActionPerformed(evt);
                }
            });
            statistic_control_group.add(print_graph_button);

            statistics_panel.add(statistic_control_group, java.awt.BorderLayout.SOUTH);

            body.addTab("Statistics", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/statistics.png")), statistics_panel); // NOI18N

            report_panel.setPreferredSize(new java.awt.Dimension(1024, 453));
            report_panel.setLayout(new java.awt.BorderLayout());

            stock_report_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Information Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
            stock_report_panel.setPreferredSize(new java.awt.Dimension(800, 502));
            stock_report_panel.setLayout(new java.awt.BorderLayout());

            scroll_panel_for_report.setBackground(new java.awt.Color(255, 255, 255));
            scroll_panel_for_report.setBorder(null);

            report_table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            report_table.setModel(new javax.swing.table.DefaultTableModel(rowsr, columnsr)
                {public boolean isCellEditable(int row, int column){return false;}});
            report_table.setRowHeight(20);
            report_table.setRowMargin(3);
            if (report_table.getRowCount() == 0) {
                clear_report_btn.setEnabled(false);
                save_report_button.setEnabled(false);
                accept_report_btn.setEnabled(false);
                print_report_button.setEnabled(false);
            } else {
                clear_report_btn.setEnabled(true);
                save_report_button.setEnabled(true);
                accept_report_btn.setEnabled(true);
                print_report_button.setEnabled(true);
            }
            report_table.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    report_tableMouseClicked(evt);
                }
            });
            scroll_panel_for_report.setViewportView(report_table);

            stock_report_panel.add(scroll_panel_for_report, java.awt.BorderLayout.CENTER);

            report_panel.add(stock_report_panel, java.awt.BorderLayout.WEST);

            report_button_panel.setLayout(new java.awt.BorderLayout());

            report_text_area_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report to stock ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
            report_text_area_panel.setPreferredSize(new java.awt.Dimension(218, 350));
            report_text_area_panel.setLayout(new java.awt.BorderLayout(5, 10));

            report_text_scroll.setPreferredSize(new java.awt.Dimension(200, 280));

            report_text_area.setColumns(20);
            report_text_area.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            report_text_area.setRows(9);
            report_text_scroll.setViewportView(report_text_area);

            report_text_area_panel.add(report_text_scroll, java.awt.BorderLayout.NORTH);

            report_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            report_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "Severve", "Regular" }));
            report_type.setSelectedItem("Regular");
            report_type.setMinimumSize(new java.awt.Dimension(65, 30));
            report_text_area_panel.add(report_type, java.awt.BorderLayout.CENTER);

            report_button_panel.add(report_text_area_panel, java.awt.BorderLayout.NORTH);

            report_btn_panel.setLayout(new java.awt.BorderLayout());

            report_btn_group.setLayout(new java.awt.GridLayout(5, 1, 5, 5));

            create_report_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            create_report_button.setText("Create Report");
            create_report_button.setPreferredSize(new java.awt.Dimension(120, 40));
            create_report_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    create_report_buttonActionPerformed(evt);
                }
            });
            report_btn_group.add(create_report_button);

            print_report_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            print_report_button.setText("Print Report");
            print_report_button.setPreferredSize(new java.awt.Dimension(120, 40));
            print_report_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    print_report_buttonActionPerformed(evt);
                }
            });
            report_btn_group.add(print_report_button);

            clear_report_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            clear_report_btn.setText("Clear Report");
            clear_report_btn.setPreferredSize(new java.awt.Dimension(120, 40));
            clear_report_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clear_report_btnActionPerformed(evt);
                }
            });
            report_btn_group.add(clear_report_btn);

            accept_report_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            accept_report_btn.setText("Accept");
            accept_report_btn.setEnabled(false);
            accept_report_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    accept_report_btnActionPerformed(evt);
                }
            });
            report_btn_group.add(accept_report_btn);

            save_report_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            save_report_button.setText("Save Report as PDF");
            save_report_button.setEnabled(false);
            save_report_button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    save_report_buttonActionPerformed(evt);
                }
            });
            report_btn_group.add(save_report_button);

            report_btn_panel.add(report_btn_group, java.awt.BorderLayout.CENTER);

            report_button_panel.add(report_btn_panel, java.awt.BorderLayout.CENTER);

            report_panel.add(report_button_panel, java.awt.BorderLayout.CENTER);

            body.addTab("Reporting", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/chart_graph.png")), report_panel); // NOI18N

            history_panel.setLayout(new java.awt.BorderLayout());

            ScrollPanelForHistory.setBorder(null);
            ScrollPanelForHistory.setPreferredSize(new java.awt.Dimension(450, 470));

            ArrayList<com.mergano.core.bean.HistoryBean> listHIS = null;
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
            history_table.setRowHeight(25);
            history_table.setRowMargin(3);
            history_table.setSelectionBackground(new java.awt.Color(255, 51, 51));
            history_table.setShowHorizontalLines(false);
            history_table.setShowVerticalLines(false);
            if (history_table.getRowCount() == 0) {
                truncate_history_btn.setEnabled(false);
            }
            ScrollPanelForHistory.setViewportView(history_table);
            history_table.getAccessibleContext().setAccessibleName("History table");
            history_table.getAccessibleContext().setAccessibleDescription("This table store history action of user.");

            history_panel.add(ScrollPanelForHistory, java.awt.BorderLayout.NORTH);

            jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

            truncate_history_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            truncate_history_btn.setText("Clear");
            truncate_history_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            truncate_history_btn.setPreferredSize(new java.awt.Dimension(200, 40));
            truncate_history_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    truncate_history_btnActionPerformed(evt);
                }
            });
            jPanel2.add(truncate_history_btn);

            print_history_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            print_history_btn.setText("Print");
            print_history_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            print_history_btn.setPreferredSize(new java.awt.Dimension(200, 40));
            print_history_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    print_history_btnActionPerformed(evt);
                }
            });
            jPanel2.add(print_history_btn);

            jPanel1.add(jPanel2);

            history_panel.add(jPanel1, java.awt.BorderLayout.CENTER);

            body.addTab("History", new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/clock2.png")), history_panel); // NOI18N

            status_bar_frame.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
            status_bar_frame.setPreferredSize(new java.awt.Dimension(176, 40));
            status_bar_frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 12, 12));

            dbname_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            dbname_label.setText("Database name");
            status_bar_frame.add(dbname_label);

            db_name_box.setEditable(false);
            db_name_box.setBackground(new java.awt.Color(255, 255, 255));
            db_name_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            db_name_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            db_name_box.setMinimumSize(new java.awt.Dimension(120, 20));
            db_name_box.setPreferredSize(new java.awt.Dimension(120, 20));
            db_name_box.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    db_name_boxActionPerformed(evt);
                }
            });
            status_bar_frame.add(db_name_box);

            status_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            status_label.setText("Database status");
            status_bar_frame.add(status_label);

            status_box.setEditable(false);
            status_box.setBackground(new java.awt.Color(255, 255, 255));
            status_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            status_box.setForeground(new java.awt.Color(0, 153, 102));
            status_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            status_box.setMinimumSize(new java.awt.Dimension(80, 20));
            status_box.setPreferredSize(new java.awt.Dimension(80, 20));
            status_bar_frame.add(status_box);

            dbType_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            dbType_label.setText("Type");
            status_bar_frame.add(dbType_label);

            db_type_box.setEditable(false);
            db_type_box.setBackground(new java.awt.Color(255, 255, 255));
            db_type_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            db_type_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            db_type_box.setMinimumSize(new java.awt.Dimension(80, 20));
            db_type_box.setPreferredSize(new java.awt.Dimension(80, 20));
            status_bar_frame.add(db_type_box);

            hostname_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            hostname_label.setText("Hostname");
            status_bar_frame.add(hostname_label);

            url_box.setEditable(false);
            url_box.setBackground(new java.awt.Color(255, 255, 255));
            url_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            url_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            url_box.setMinimumSize(new java.awt.Dimension(120, 20));
            url_box.setPreferredSize(new java.awt.Dimension(120, 20));
            url_box.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    url_boxActionPerformed(evt);
                }
            });
            status_bar_frame.add(url_box);

            port_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            port_label.setText("Port");
            status_bar_frame.add(port_label);

            port_box.setEditable(false);
            port_box.setBackground(new java.awt.Color(255, 255, 255));
            port_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            port_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            port_box.setMinimumSize(new java.awt.Dimension(60, 20));
            port_box.setPreferredSize(new java.awt.Dimension(60, 20));
            status_bar_frame.add(port_box);

            user_label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            user_label.setText("Username");
            status_bar_frame.add(user_label);

            user_box.setEditable(false);
            user_box.setBackground(new java.awt.Color(255, 255, 255));
            user_box.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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

            search_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/search.png"))); // NOI18N
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

            manager_user_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mergano/gui/_static/ico16/user.png"))); // NOI18N
            manager_user_menuitem.setText("Manage User");
            manager_user_menuitem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    manager_user_menuitemActionPerformed(evt);
                }
            });
            tools_menu.add(manager_user_menuitem);
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
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1265, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(body)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(status_bar_frame, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            body.getAccessibleContext().setAccessibleName("Body");

            getAccessibleContext().setAccessibleDescription("This is main windows");

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void initialDashboard() {
        int pcount = product_table.getRowCount();
        int rcount = report_table.getRowCount();
        int ocount = request_order_table.getRowCount();
        in_stock_dashboard.setText(Integer.toString(pcount));
        current_report_dashboard.setText(Integer.toString(rcount));
        current_order_dashboard.setText(Integer.toString(ocount));
        int outofstock = 0;
        for (int i = 1; i < pcount; i++) {
            if ((int) product_table.getModel().getValueAt(i, 9) == 0) {
                outofstock++;
            } else {
                outofstock = 0;
            }
        }
        out_of_stock_dashboard.setText(Integer.toString(outofstock));
    }

    private void initialStatisticChart() {
        AreaChart a = new AreaChart();
        a.getChart();
        statistic_graph.add(a.getChart(), BorderLayout.CENTER);
        statistic_graph.validate();
    }

    private void about_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_menuitemActionPerformed
        About a = new About();
        a.setVisible(true);
    }//GEN-LAST:event_about_menuitemActionPerformed

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

    private void User_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_buttonActionPerformed
        openUserManager();
    }//GEN-LAST:event_User_buttonActionPerformed

    private void Options_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Options_buttonActionPerformed

    }//GEN-LAST:event_Options_buttonActionPerformed

    private void Customer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_buttonActionPerformed
        openCustomerManager();
    }//GEN-LAST:event_Customer_buttonActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void website_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website_menuitemActionPerformed
        w.open_website("http://mergano.com");
    }//GEN-LAST:event_website_menuitemActionPerformed

    private void save_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_product_buttonActionPerformed
        if (addType) {
            AddandSave_ActionPerformed(getImageInputStream());
        } else {
            EditandSave_ActionPerformed(getImageInputStream());
        }
    }//GEN-LAST:event_save_product_buttonActionPerformed

    private void EditandSave_ActionPerformed(InputStream instm) {
        String old_productID_txt = String.valueOf(product_table.getModel().getValueAt(product_table.getSelectedRow(), 0));
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
            JOptionPane.showMessageDialog(this, "Please fill out request box", "Information is null", JOptionPane.WARNING_MESSAGE);
        } else if (new_productID_txt.length() < 8 || new_productID_txt.length() > 13) {
            JOptionPane.showMessageDialog(this, "Product ID must between 8-13 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (cost.length() > 8) {
            JOptionPane.showMessageDialog(this, "Cost must less than or 8 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (warranty.length() > 3) {
            JOptionPane.showMessageDialog(this, "Warranty must less than or 3 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (quantity_txt.length() > 13) {
            JOptionPane.showMessageDialog(this, "Quantity must less than or 13 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (quantity < 0) {
            JOptionPane.showMessageDialog(this, "Quantity cannot be negative.", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (!isNumeric(quantity_txt) || !isNumeric(cost) || !isNumeric(new_productID_txt)) {
            JOptionPane.showMessageDialog(this, "Quantity, Cost or ProductID must be an integer format only", "Input Error", JOptionPane.WARNING_MESSAGE);
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
            if (quantity > 0) {
                bean.setStatus("Available");
            } else if (quantity == 0) {
                bean.setStatus("Unavailable");
            }
            bean.setUserLastModified(user_box.getText());
            bean.setInputStream(instm);

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
        initialDashboard();
    }

    private void AddandSave_ActionPerformed(InputStream instm) {
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
            JOptionPane.showMessageDialog(this, "Product ID must between 8-13 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (cost.length() > 8) {
            JOptionPane.showMessageDialog(this, "Cost must less than or 8 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (warranty.length() > 3) {
            JOptionPane.showMessageDialog(this, "Warranty must less than or 3 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (quantity_txt.length() > 13) {
            JOptionPane.showMessageDialog(this, "Quantity must less than or 13 digits only", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (quantity < 0) {
            JOptionPane.showMessageDialog(this, "Quantity cannot be negative.", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else if (!isNumeric(quantity_txt) || !isNumeric(cost) || !isNumeric(productID_txt)) {
            JOptionPane.showMessageDialog(this, "Quantity, Cost or ProductID must be an integer format only", "Input Error", JOptionPane.WARNING_MESSAGE);
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
            if (quantity > 0) {
                bean.setStatus("Available");
            } else if (quantity == 0) {
                bean.setStatus("Unavailable");
            }
            bean.setUserLastModified(user_box.getText());
            bean.setInputStream(instm);

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
        initialDashboard();
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
                long productid = Long.parseLong(productID_input.getText());
                ProductDAO dao = new ProductDAO();
                HistoryDAO hisdao = new HistoryDAO();
                ProductBean bean = new ProductBean();
                bean.setProductID(productid);
                bean.setUserLastModified(user_box.getText());

                try {
                    boolean status = dao.deleteData(bean, productid);
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
        category_input.setSelectedItem("");
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
    }

    private static boolean isNumeric(String str) {
        return str.matches("^-?[0-9]+(\\.[0-9]+)?$");
    }

    private void add_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_buttonActionPerformed
        clearProductInput();
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
    }//GEN-LAST:event_set_as_default_buttonActionPerformed

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

    private void rep_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_button_welActionPerformed
        body.setSelectedIndex(8);
    }//GEN-LAST:event_rep_button_welActionPerformed

    private void refresh_graph_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_graph_buttonActionPerformed

    }//GEN-LAST:event_refresh_graph_buttonActionPerformed

    private void order_request_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_request_button_welActionPerformed
        body.setSelectedIndex(4);
    }//GEN-LAST:event_order_request_button_welActionPerformed

    private void sta_button_welActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sta_button_welActionPerformed
        body.setSelectedIndex(7);
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
        search_action();
    }//GEN-LAST:event_search_buttonActionPerformed

    private void search_action() {
        int filter = filter_column.getSelectedIndex();
        String input_search = searching_box_input.getText();

        if (searching_box_input.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Search field cannot be empty", "Input error", WARNING_MESSAGE);
        } else {
            switch (filter) {
                case 0: // ProductID
                    if (isNumeric(input_search)) {
                        search_setDate(0);
                    } else {
                        JOptionPane.showMessageDialog(this, "Product ID must be integer type.", "Input error", WARNING_MESSAGE);
                    }
                    break;
                case 1: // Name
                    search_setDate(1);
                    break;
                default:
            }
        }
    }

    private void search_setDate(int n) {
        int filter = filter_column.getSelectedIndex();
        String input_search = searching_box_input.getText();
        SearchDAO sdao = new SearchDAO();
        ArrayList<ProductBean> list = sdao.getDataSearch(input_search, n);
        for (int i = 0; i < list.size(); i++) {
            s_product_id_input.setText(String.valueOf(list.get(i).getProductID()));
            s_category_input.setText(list.get(i).getCategory());
            s_name_input.setText(list.get(i).getName());
            String manu = list.get(i).getManufacture();
            s_model_input.setText(list.get(i).getModel());
            s_descrip_search_input.setText(list.get(i).getDescription());
            s_cost_input.setText(list.get(i).getCost());
            s_location_input.setText(list.get(i).getLocation());
            s_warranty_input.setText(list.get(i).getWarranty());
            s_quantity_input.setText(Integer.toString(list.get(i).getQuantity()));
            s_import_date_input.setText(list.get(i).getImport());
            s_status_input.setText(list.get(i).getStatus());
            s_user_last_modified_input.setText(list.get(i).getUserLastModified());
            if (list.get(i).getPImage() != null) {
                try {
                    InputStream is = new BufferedInputStream(list.get(i).getPImage());
                    Image image = ImageIO.read(is);
                    System.out.println("set image");
                    img_search_result_input.setText("");
                    img_search_result_input.setIcon(new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img_search_result_input.getWidth(), img_search_result_input.getHeight(), Image.SCALE_SMOOTH)));
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            } else {
                img_search_result_input.setIcon(null);
                img_search_result_input.setText("NO IMAGE");
            }
        }
    }
    private void search_boxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyPressed
        if (evt.getKeyCode() == 10) {
            search_product_buttonActionPerformed(null);
        }
    }//GEN-LAST:event_search_boxKeyPressed

    private void print_database_info_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_database_info_buttonActionPerformed
        new_db_menuitemActionPerformed(evt);
    }//GEN-LAST:event_print_database_info_buttonActionPerformed

    private void db2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db2ActionPerformed

    }//GEN-LAST:event_db2ActionPerformed

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

    private void fillDataField(int selectedRow) throws ClassCastException, NullPointerException {
        edit_product_button.setEnabled(true);
        remove_product_button.setEnabled(true);
        String selectedProductID = String.valueOf(product_table.getModel().getValueAt(selectedRow, 0));
        String selectedCategory = (String) product_table.getModel().getValueAt(selectedRow, 1);
        String selectedProductName = (String) product_table.getModel().getValueAt(selectedRow, 2);
        String selectedManufacture = (String) product_table.getModel().getValueAt(selectedRow, 3);
        String selectedModel = (String) product_table.getModel().getValueAt(selectedRow, 4);
        String selectedDescription = (String) product_table.getModel().getValueAt(selectedRow, 5);
        String selectedCost = product_table.getModel().getValueAt(selectedRow, 6).toString();
        String selectedLocation = (String) product_table.getModel().getValueAt(selectedRow, 7);
        String selectedWarranty = (String) product_table.getModel().getValueAt(selectedRow, 8);
        int selectedQuantity = (Integer) product_table.getModel().getValueAt(selectedRow, 9);
        String selectedStatus = (String) product_table.getModel().getValueAt(selectedRow, 11);
        ImageIcon imgIcon = (ImageIcon) product_table.getModel().getValueAt(selectedRow, 13);

        productID_input.setText(selectedProductID);
        category_input.setSelectedItem(selectedCategory);
        name_input.setText(selectedProductName);
        manufacture_input.setText(selectedManufacture);
        model_input.setText(selectedModel);
        cost_input.setText(selectedCost);
        quantity_input.setValue(selectedQuantity);
        location_input.setText(selectedLocation);
        warranty_input.setText(selectedWarranty);
        product_status_box.setText(selectedStatus);
        description_input.setText(selectedDescription);
        if (imgIcon != null) {
            Image img = imgIcon.getImage().getScaledInstance(product_img.getWidth(), product_img.getHeight(), Image.SCALE_FAST);
            product_img.setText("");
            product_img.setIcon(new ImageIcon(img));
        } else {
            product_img.setIcon(null);
            product_img.setText("NO IMAGE");
        }
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
        body.setSelectedIndex(3);
    }//GEN-LAST:event_order_management_menuitemActionPerformed

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

    private void accept_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accept_report_btnActionPerformed
        int selectedRow = report_table.getSelectedRow();
        int reportID = (Integer) report_table.getModel().getValueAt(selectedRow, 0);
        ReportBean bean = new ReportBean();
        bean.setReportStatus("Accepted");
        bean.setReportID(reportID);
        ReportDAO dao = new ReportDAO();
        HistoryDAO hisdao = new HistoryDAO();
        dao.updateReport(bean, reportID, user_box.getText());
        updateReportTable(dao.getReportData());
        updateHistory(hisdao.getHistoryData());
        initialDashboard();
    }//GEN-LAST:event_accept_report_btnActionPerformed

    private void order_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_tableMouseClicked

    }//GEN-LAST:event_order_tableMouseClicked

    private void order_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_order_tableKeyPressed

    }//GEN-LAST:event_order_tableKeyPressed

    private void print_report_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_report_buttonActionPerformed
        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            report_table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Can't print file", e.getMessage());
        }
    }//GEN-LAST:event_print_report_buttonActionPerformed

    private void product_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_imgMouseClicked
        if (save_product_button.isEnabled()) {
            if (evt.getClickCount() == 2) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "bmp");

                fileChooser.addChoosableFileFilter(filter);
                int result = fileChooser.showSaveDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File selectedFile = fileChooser.getSelectedFile();
                        String exten = Utils.getFileExtension(selectedFile);
                        if (exten.equals("jpg") || exten.equals("png") || exten.equals("bmp") || exten.equals("jpeg")) {
                            InputStream is = new FileInputStream(selectedFile);
                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            //ImageIO.write(bufferedImage, "png", baos);
                            //InputStream is = new ByteArrayInputStream(baos.toByteArray());
                            BufferedImage img_buffer = ImageIO.read(selectedFile); // read data from inputstream and store into image
                            setImageInputStream(is);
                            ImageIcon imageIcon = new ImageIcon(img_buffer);
                            String path = selectedFile.getAbsolutePath();
                            String filename = selectedFile.getName();
                            product_img.setText("");
                            Image img = imageIcon.getImage().getScaledInstance(product_img.getWidth(), product_img.getHeight(), Image.SCALE_SMOOTH);
                            product_img.setIcon(new ImageIcon(img));
                        } else {
                            JOptionPane.showMessageDialog(this, "The selected file must be png, jpg or bmp type only.", "File type error", WARNING_MESSAGE);
                        }
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "File not found or the file is broken.", "File not found", WARNING_MESSAGE);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    product_img.setText("NO IMAGE");
                }
            }
        }
    }//GEN-LAST:event_product_imgMouseClicked

    public void setImageInputStream(InputStream inst) {
        pimgInstr = inst;
    }

    public InputStream getImageInputStream() {
        return pimgInstr;
    }
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
        int selectedRow = product_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) product_orderlist_table.getModel();
        Object selectedProductID = product_table.getModel().getValueAt(selectedRow, 0);
        body.setSelectedIndex(3);
        model.addRow(new Object[]{selectedProductID, "1",});
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

        if (product_img.getIcon() == null) {
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

    }//GEN-LAST:event_remove_product_img_menuActionPerformed

    private void en_us_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_en_us_menuitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_en_us_menuitemActionPerformed

    private void en_us_menuitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_en_us_menuitem1ActionPerformed
        Locale l = new Locale("th", "TH");
        //  ResourceBundle r = new ResourceBundle.getBundle("Bundle", 1);

    }//GEN-LAST:event_en_us_menuitem1ActionPerformed

    private void change_product_img_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_product_img_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change_product_img_menuActionPerformed

    private void save_report_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_report_buttonActionPerformed

    }//GEN-LAST:event_save_report_buttonActionPerformed

    private void create_report_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_report_buttonActionPerformed
        String report_type_txt = report_type.getSelectedItem().toString();
        String report_detail = report_text_area.getText();
        if (report_detail.length() != 0) {
            ReportBean bean = new ReportBean();
            bean.setReportDetail(report_detail);
            bean.setReportType(report_type_txt);
            bean.setReportStatus("Pending");
            bean.setUserCreated(user_box.getText());
            ReportDAO rdao = new ReportDAO();
            rdao.createReport(bean);
            updateReportTable(rdao.getReportData());
        } else {
            JOptionPane.showMessageDialog(null, "Report detail cannot empty", "Create report error", JOptionPane.WARNING_MESSAGE);
        }
        initialDashboard();
    }//GEN-LAST:event_create_report_buttonActionPerformed

    private void request_order_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_request_order_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_request_order_tableMouseClicked

    private void request_order_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_request_order_tableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_request_order_tableKeyPressed

    private void request_order_table_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_request_order_table_dashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_request_order_table_dashboardMouseClicked

    private void request_order_table_dashboardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_request_order_table_dashboardKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_request_order_table_dashboardKeyPressed

    private void Dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_buttonActionPerformed
        body.setSelectedIndex(1);
    }//GEN-LAST:event_Dashboard_buttonActionPerformed

    private void manager_user_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_user_menuitemActionPerformed
        openUserManager();
    }//GEN-LAST:event_manager_user_menuitemActionPerformed

    private void dashboard_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_panelMouseClicked
        initialDashboard();
    }//GEN-LAST:event_dashboard_panelMouseClicked

    private void print_graph_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_graph_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print_graph_buttonActionPerformed

    private void clear_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_report_btnActionPerformed
        if (report_table.getRowCount() > 0) {
            ReportDAO dao = new ReportDAO();
            dao.truncateReport(user_box.getText());
            updateReportTable(dao.getReportData());
        } else {
        }
        initialDashboard();
    }//GEN-LAST:event_clear_report_btnActionPerformed

    private void report_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_tableMouseClicked
        int selectedRow = report_table.getSelectedRow();
        if (selectedRow > 0) {
            accept_report_btn.setEnabled(true);
        }
    }//GEN-LAST:event_report_tableMouseClicked

    private void Export_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_buttonActionPerformed
        ExportCSV ex = new ExportCSV();
        ex.exportToCSV(product_table);
    }//GEN-LAST:event_Export_buttonActionPerformed

    private void searching_box_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searching_box_inputKeyPressed
        if (evt.getKeyCode() == 10) {
            search_action();
        }
    }//GEN-LAST:event_searching_box_inputKeyPressed

    private void print_history_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_history_btnActionPerformed
        if (history_table.getRowCount() > 0) {
            MessageFormat header = new MessageFormat("Report Print");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                report_table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } catch (java.awt.print.PrinterException e) {
                System.err.format("Can't print file", e.getMessage());
            }
        }
    }//GEN-LAST:event_print_history_btnActionPerformed

    private void add_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_order_btnActionPerformed
        int rows = product_orderlist_table.getRowCount();
        int orderid = Integer.parseInt(order_id.getText());
        if (rows > 0 && customer_id.getText().length() > 0 && isNumeric(order_id.getText())) {
            OrderDAO odao = new OrderDAO();
            odao.AddOrder(orderid, order_table, rows);
            updateOrderTable(odao.getOrderData());
        }
    }//GEN-LAST:event_add_order_btnActionPerformed

    private void order_confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_confirm_btnActionPerformed
        confirmOrder();
    }//GEN-LAST:event_order_confirm_btnActionPerformed

    private void delete_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_order_btnActionPerformed
        deleteOrder();
    }//GEN-LAST:event_delete_order_btnActionPerformed

    private void request_order_table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_request_order_table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_request_order_table1MouseClicked

    private void request_order_table1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_request_order_table1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_request_order_table1KeyPressed

    private void add_to_orderlist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_orderlist_btnActionPerformed
        int quantity = (Integer) order_quantity.getValue();
        long productid = Long.parseLong(product_id.getText());
        DefaultTableModel model = (DefaultTableModel) product_orderlist_table.getModel();
        model.addRow(new Object[]{productid, quantity});
        model.setValueAt(productid, product_orderlist_table.getSelectedRow(), 0);
        model.setValueAt(quantity, product_orderlist_table.getSelectedRow(), 1);
    }//GEN-LAST:event_add_to_orderlist_btnActionPerformed

    private void add_product_to_order_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_product_to_order_tableMouseClicked

    }//GEN-LAST:event_add_product_to_order_tableMouseClicked

    private void add_to_order_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_to_order_btnMouseClicked

    }//GEN-LAST:event_add_to_order_btnMouseClicked

    private void report_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_product_btnActionPerformed
        int selectedRow = product_table.getSelectedRow();
        Object selectedProductID = product_table.getModel().getValueAt(selectedRow, 0);
        body.setSelectedIndex(8);
        report_text_area.setText("Product ID" + selectedProductID + "Out of stock");
    }//GEN-LAST:event_report_product_btnActionPerformed

    private void order_confirm_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_confirm_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_confirm_btn1ActionPerformed

    private void delete_to_orderlist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_to_orderlist_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_to_orderlist_btnActionPerformed

    private void confirmOrder() {

    }

    private void deleteOrder() {
        int orderid = (int) order_table.getModel().getValueAt(order_table.getSelectedRow(), 0);

        if (orderid > 0) {
            int DeleteConfirm = JOptionPane.showConfirmDialog(this, "Are you sure do you want to delete order no. " + orderid + " ?", "Delete confirmation", YES_NO_OPTION, WARNING_MESSAGE);
            if (DeleteConfirm == JOptionPane.YES_OPTION) {
                OrderDAO dao = new OrderDAO();
                HistoryDAO hisdao = new HistoryDAO();
                try {
                    boolean status = dao.DeleteOrder(orderid, user_box.getText());
                    updateOrderTable(dao.getOrderData());
                    updateHistory(hisdao.getHistoryData());

                    if (status) {
                        JOptionPane.showMessageDialog(this, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        save_product_button.setEnabled(false);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error while deleting order" + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No order is selected to delete.", "Nothing to delete", INFORMATION_MESSAGE);
        }
    }

    private void openUserManager() {
        UserManager m = new UserManager();
        m.setVisible(true);
    }

    private void openCustomerManager() {
        Customer c = new Customer();
        c.setVisible(true);
    }

    private void filter_search(String keyword, int column) {
        mod = (DefaultTableModel) product_table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(mod);
        product_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + keyword, column));
    }

    private void logout_action() {
        Logout.logout_confirm();
    }

    public void updateOrderTable(ArrayList<OrderBean> list) {

    }

    public void updateReportTable(ArrayList<ReportBean> list) {
        String[] columns = {"Report No.", "Report Level", "Detail", "Status", "User Created", "Datetime Created"};
        Object[][] rows = new Object[list.size()][6];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getReportID();
            rows[i][1] = list.get(i).getReportType();
            rows[i][2] = list.get(i).getReportDetail();
            rows[i][3] = list.get(i).getReportStatus();
            rows[i][4] = list.get(i).getCreatedDate();
            rows[i][5] = list.get(i).getUserCreated();
        }
        report_table.setModel(new javax.swing.table.DefaultTableModel(rows, columns));
        scroll_panel_for_report.setViewportView(report_table);
        System.out.println("Report table updated");
    }

    public void updateTable(ArrayList<ProductBean> list) {
        String[] columns = {"Product ID", "Category", "Name", "Manufacture", "Model", "Description", "Cost", "Location", "Warranty", "Quantity", "Import", "Status", "Last modified", "Image"};
        Object[][] rows = new Object[list.size()][14];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getProductID();
            rows[i][1] = list.get(i).getCategory();
            rows[i][2] = list.get(i).getName();
            rows[i][3] = list.get(i).getManufacture();
            rows[i][4] = list.get(i).getModel();
            rows[i][5] = list.get(i).getDescription();
            rows[i][6] = list.get(i).getCost();
            rows[i][7] = list.get(i).getLocation();
            rows[i][8] = list.get(i).getWarranty();
            rows[i][9] = list.get(i).getQuantity();
            rows[i][10] = list.get(i).getImport();
            rows[i][11] = list.get(i).getStatus();
            rows[i][12] = list.get(i).getUserLastModified();
            if (list.get(i).getPImage() != null) {
                InputStream is = new BufferedInputStream(list.get(i).getPImage());
                try {
                    Image image = ImageIO.read(is);
                    ImageIcon image2 = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(60, 20, Image.SCALE_SMOOTH));
                    rows[i][13] = image2;
                } catch (IOException ex) {
                    rows[i][13] = null;
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                rows[i][13] = null;
            }
        }
        // set Model of JTabel from list array of data
        product_table.setModel(new javax.swing.table.DefaultTableModel(rows, columns));
        product_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        product_table.removeColumn(product_table.getColumnModel().getColumn(5));
        product_table.removeColumn(product_table.getColumnModel().getColumn(12));
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
        // set the JTable into scroll panel
        ScrollPanelForQueryTable.setViewportView(product_table);
        System.out.println("Product table updated");
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
    private javax.swing.JScrollPane ScrollPanelForHistory;
    private javax.swing.JScrollPane ScrollPanelForQueryTable;
    private javax.swing.JScrollPane ScrollPanelForQueryTable2;
    private javax.swing.JScrollPane ScrollPanelForQueryTable3;
    private javax.swing.JScrollPane ScrollPanelForQueryTable4;
    protected javax.swing.JButton Search_Button;
    protected javax.swing.JButton User_button;
    private javax.swing.JButton View_button;
    private javax.swing.JMenuItem about_menuitem;
    private javax.swing.JButton accept;
    private javax.swing.JButton accept_report_btn;
    private javax.swing.JButton add_database_button;
    private javax.swing.JButton add_order_btn;
    public javax.swing.JButton add_product_button;
    private javax.swing.JScrollPane add_product_to_order_table;
    private javax.swing.JMenuItem add_to_order_btn;
    private javax.swing.JButton add_to_orderlist_btn;
    private javax.swing.JMenuItem backup_menuitem;
    public javax.swing.JTabbedPane body;
    private javax.swing.JPanel body_panel;
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
    private javax.swing.JButton create_report_button;
    private javax.swing.JLabel current_order_dashboard;
    private javax.swing.JLabel current_order_dashboard_label;
    private javax.swing.JLabel current_report_dashboard;
    private javax.swing.JLabel current_report_dashboard_label;
    private javax.swing.JTextField customer_id;
    protected javax.swing.JButton da_button_wel;
    private javax.swing.JMenuItem dashboard_menuitem;
    protected javax.swing.JPanel dashboard_panel;
    private javax.swing.JPanel dashboard_panel_body_left;
    private javax.swing.JPanel dashboard_panel_body_right;
    protected javax.swing.JMenu database_menu;
    protected javax.swing.JMenuItem database_menuitem;
    private javax.swing.JTextField database_name_show_box;
    protected javax.swing.JPanel database_panel;
    private javax.swing.JTextField database_type_show_box;
    private javax.swing.JToggleButton db2;
    private javax.swing.JToggleButton db3;
    private javax.swing.JToggleButton db4;
    private javax.swing.JToggleButton db5;
    private javax.swing.JToggleButton db6;
    private javax.swing.JLabel dbType_label;
    private javax.swing.JPanel db_action_group_panel;
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
    private javax.swing.JButton delete_to_orderlist_btn;
    private javax.swing.JTextArea description_input;
    private javax.swing.JLabel description_label;
    private javax.swing.JScrollPane description_scroll;
    private static javax.swing.JMenuItem disconnect_menuitem;
    protected javax.swing.JMenu edit_menu;
    private javax.swing.JButton edit_order_btn;
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
    private javax.swing.JLabel img_search_result_input;
    private javax.swing.JPanel import_action_panel;
    private javax.swing.JMenuItem import_csv_menuitem;
    private javax.swing.JMenu import_menuitem;
    private javax.swing.JButton import_product;
    private javax.swing.JLabel in_stock_dashboard;
    private javax.swing.JLabel in_stock_dashboard_label;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
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
    private javax.swing.JMenu language_menuitem;
    private javax.swing.JPanel left_panel;
    private javax.swing.JToggleButton localhost_db;
    private javax.swing.JTextField location_input;
    private javax.swing.JLabel location_label;
    private javax.swing.JMenuItem logout_menuitem;
    private javax.swing.JMenuBar main_menubar;
    private javax.swing.JToolBar main_toolbar;
    protected javax.swing.JPanel management_panel;
    protected javax.swing.JMenuItem manager_user_menuitem;
    private javax.swing.JTextField manufacture_input;
    private javax.swing.JLabel manufacture_label;
    private javax.swing.JTextField model_input;
    private javax.swing.JLabel model_label;
    private javax.swing.JComboBox month_select;
    private javax.swing.JTextField name_input;
    private javax.swing.JMenuItem new_db_menuitem;
    private javax.swing.JMenuItem online_docs_menuitem;
    private javax.swing.JMenuItem open_menuitem;
    private javax.swing.JMenuItem options_menuitem;
    protected javax.swing.JButton ord_button_wel;
    private javax.swing.JPanel order_action_btn_group;
    private javax.swing.JPanel order_comfirm_btn_group;
    private javax.swing.JButton order_confirm_btn;
    private javax.swing.JButton order_confirm_btn1;
    private javax.swing.JTextField order_id;
    private javax.swing.JPanel order_input;
    private javax.swing.JPanel order_left_panel;
    private javax.swing.JMenuItem order_management_menuitem;
    protected javax.swing.JPanel order_panel;
    private javax.swing.JPanel order_product_input;
    private javax.swing.JSpinner order_quantity;
    private javax.swing.JLabel order_quantity_label;
    protected javax.swing.JButton order_request_button_wel;
    protected javax.swing.JPanel order_request_panel;
    private javax.swing.JPanel order_right_panel;
    public javax.swing.JTable order_table;
    private javax.swing.JLabel out_of_stock_dashboard;
    private javax.swing.JLabel out_of_stock_dashboard_label;
    public javax.swing.JTextField pathname_box;
    public static javax.swing.JTextField port_box;
    private javax.swing.JLabel port_label;
    private javax.swing.JTextField port_show_box;
    private javax.swing.JButton print_database_info_button;
    private javax.swing.JToggleButton print_graph_button;
    private javax.swing.JButton print_history_btn;
    private javax.swing.JMenuItem print_menuitem;
    private javax.swing.JMenuItem print_preview_menuitem;
    private javax.swing.JButton print_report_button;
    private javax.swing.JTextField productID_input;
    private javax.swing.JPanel product_group_panel;
    private javax.swing.JPanel product_head_group_panel;
    private javax.swing.JTextField product_id;
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
    private javax.swing.JTable product_orderlist_table;
    private javax.swing.JTextField product_status_box;
    private javax.swing.JLabel product_status_label;
    public javax.swing.JTable product_table;
    private javax.swing.JPopupMenu property_popup_menu;
    private javax.swing.JSpinner quantity_input;
    private javax.swing.JLabel quantity_label;
    private javax.swing.JToggleButton refresh_graph_button;
    private javax.swing.JButton remove_product_button;
    private javax.swing.JMenuItem remove_product_img_menu;
    protected javax.swing.JButton rep_button_wel;
    private javax.swing.JPanel report_btn_group;
    private javax.swing.JPanel report_btn_panel;
    private javax.swing.JMenuItem report_bug_menuitem;
    private javax.swing.JPanel report_button_panel;
    private javax.swing.JMenuItem report_menuitem;
    protected javax.swing.JPanel report_panel;
    private javax.swing.JMenuItem report_product_btn;
    private javax.swing.JTable report_table;
    private javax.swing.JTextArea report_text_area;
    private javax.swing.JPanel report_text_area_panel;
    private javax.swing.JScrollPane report_text_scroll;
    private javax.swing.JComboBox<String> report_type;
    private javax.swing.JPanel request_order_body_panel_left;
    private javax.swing.JPanel request_order_body_panel_right;
    public javax.swing.JTable request_order_table;
    public javax.swing.JTable request_order_table1;
    public javax.swing.JTable request_order_table_dashboard;
    private javax.swing.JPanel right_panel;
    private javax.swing.JTextField s_category_input;
    private javax.swing.JTextField s_cost_input;
    private javax.swing.JTextArea s_descrip_search_input;
    private javax.swing.JTextField s_import_date_input;
    private javax.swing.JTextField s_location_input;
    private javax.swing.JTextField s_model_input;
    private javax.swing.JTextField s_name_input;
    private javax.swing.JTextField s_product_id_input;
    private javax.swing.JTextField s_quantity_input;
    private javax.swing.JTextField s_status_input;
    private javax.swing.JTextField s_user_last_modified_input;
    private javax.swing.JTextField s_warranty_input;
    private javax.swing.JMenuItem save_menuitem;
    private javax.swing.JButton save_product_button;
    private javax.swing.JButton save_report_button;
    private javax.swing.JMenuItem saveas_menuitem;
    private javax.swing.JScrollPane scroll_panel_for_report;
    private javax.swing.JScrollPane scroll_panel_request_order;
    private javax.swing.JTextField search_box;
    private javax.swing.JButton search_button;
    private javax.swing.JComboBox search_filter_column;
    private javax.swing.JPanel search_input_panel;
    private javax.swing.JMenuItem search_menuitem;
    private javax.swing.JButton search_product_button;
    private javax.swing.JPanel search_result_panel;
    private javax.swing.JTextField searching_box_input;
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
    private javax.swing.JPanel statistic_control_group;
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
    public static javax.swing.JTextField usename_db_box;
    public static javax.swing.JTextField user_box;
    private javax.swing.JLabel user_label;
    protected javax.swing.JMenu view_menu;
    private javax.swing.JTextField warranty_input;
    private javax.swing.JLabel warranty_label;
    private javax.swing.JMenuItem website_menuitem;
    private javax.swing.JLabel welcome_bg;
    private javax.swing.JMenuItem welcome_menuitem;
    private javax.swing.JButton welcome_panel_pic;
    // End of variables declaration//GEN-END:variables

}
