package com.mergano.core.dao;

import com.mergano.core.bean.ReportBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReportDAO extends ConnectDB {

    private final String table = "norification_report";
    private final String backlog_table = "backlog";
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private boolean flag;
    private String sql;

    public ReportDAO() {
        try {
            conn = super.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Display all data from product table
    public ArrayList<ReportBean> getReportData() {
        ArrayList<ReportBean> report_list = new ArrayList<>();

        if (conn == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connection is broken or disconnected. \nPlease check your internet connection and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            sql = "SELECT * FROM " + table + ";";
            try {
                p = conn.prepareStatement(sql);
                rs = p.executeQuery();

                if (rs.next()) {
                    do {
                        ReportBean bean = new ReportBean();
                        bean.setReportID(rs.getInt("idnotice"));
                        bean.setReportType(rs.getString("report_type"));
                        bean.setReportDetail(rs.getString("report_detail"));
                        bean.setReportStatus(rs.getString("report_status"));
                        bean.setUserCreated(rs.getString("user_created"));
                        bean.setCreatedDate(rs.getDate("date_created").toString());
                        report_list.add(bean);
                    } while (rs.next());
                } else {
                    // ERROR CODE QUERY ERROR
                }
                conn.commit();
                p.close();
                rs.close();
                conn.close();
            } catch (SQLException e) {
                System.err.print(e);
            }
        }
        return report_list;
    }

    public void createReport(ReportBean bean) {
        try {
            String sql_insert = "INSERT INTO " + table + " VALUES(DEFAULT,?,?,?,?,?)";
            p = conn.prepareStatement(sql_insert);
            p.setString(2, bean.getReportType());
            p.setString(3, bean.getReportDetail());
            p.setString(4, bean.getReportStatus());
            p.setString(5, bean.getUserCreated());
            p.setString(6, bean.getCreatedDate());
            p.executeUpdate();

            String sql_insert_his = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Created'" + ","
                    + "'Create Report " + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + bean.getUserCreated() + "');";
            p = conn.prepareStatement(sql_insert_his);
            int query_status = p.executeUpdate();
            System.out.println(query_status);
            conn.commit();
            flag = true;
            p.close();
        } catch (SQLException | NumberFormatException e) {
            flag = false;
            System.err.println(e);
        }
    }

    public void updateReport(ReportBean bean, int n, String u) {
        try {
            String sql_update = "UPDATE " + table + " SET report_type=?, report_detail=?, report_status=?, user_created=?, date_created=current WHERE idnotice =" + n + ";";
            p = conn.prepareStatement(sql_update);
            p.setString(2, bean.getReportType());
            p.setString(3, bean.getReportDetail());
            p.setString(4, bean.getReportStatus());
            p.setString(5, bean.getUserCreated());
            java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
            p.setTimestamp(6, date);
            System.out.println(sql_update);
            p.executeUpdate();

            String sql_edit_his = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Accepted'" + ","
                    + "'Accepted report " + n + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + u + "');";
            p = conn.prepareStatement(sql_edit_his);
            p.executeUpdate();
            conn.commit();
            p.close();
        } catch (SQLException e) {
        }
    }

    public void truncateReport(String u) {
        try {
            sql = "TRUNCATE " + table + ";";
            p = conn.prepareStatement(sql);
            p.executeUpdate();
            sql = "ALTER TABLE " + table + " AUTO_INCREMENT = 1;";
            p = conn.prepareStatement(sql);
            p.executeUpdate();
            String sql_clear_his = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Clear'" + ","
                    + "'Clear all reports" + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + u + "');";
            p = conn.prepareStatement(sql_clear_his);
            p.executeUpdate();
            conn.commit();
            p.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
