package com.mergano.core.dao;

import com.mergano.core.bean.HistoryBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoryDAO extends ConnectDB {

    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private final String backlog_table = "backlog";
    private String sql;

    public HistoryDAO() {
        try {
            conn = super.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // get backlog data from backlog table
    public ArrayList<HistoryBean> getHistoryData() {
        ArrayList<HistoryBean> list = new ArrayList<>();
        sql = "SELECT idbacklog, action_type, action_detail, date, time, user FROM " + backlog_table + ";";
        if (conn == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            conn.commit();
            while (rs.next()) {
                HistoryBean bean = new HistoryBean();
                bean.setBacklogID(rs.getInt("idbacklog"));
                bean.setActionType(rs.getString("action_type"));
                bean.setActionDetail(rs.getString("action_detail"));
                bean.setBacklogDate(rs.getDate("date").toString());
                bean.setBacklogTime(rs.getTime("time").toString());
                bean.setUser(rs.getString("user"));
                list.add(bean);
            }
            p.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return list;
    }

    public void truncateHistory() {
        try {
            sql = "TRUNCATE " + backlog_table + ";";
            p = conn.prepareStatement(sql);
            p.executeUpdate();
            sql = "ALTER TABLE " + backlog_table + " AUTO_INCREMENT = 1;";
            p = conn.prepareStatement(sql);
            p.executeUpdate();
            conn.commit();
            p.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
