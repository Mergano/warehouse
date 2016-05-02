package com.mergano.core.dbManager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BacklogDAO {

    private ConnectDB conn;
    private Connection connect;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private final String backlog_table = "backlog";
    private String sql;

    public BacklogDAO() {
        try {
            conn = new ConnectDB();
            connect = conn.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // get backlog data from backlog table
    public ArrayList<BacklogBean> getBacklogData() {
        ArrayList<BacklogBean> list = new ArrayList<>();
        sql = "SELECT * FROM " + backlog_table + ";";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                BacklogBean stub = new BacklogBean();
                stub.setBacklogID(rs.getInt("idbacklog"));
                stub.setActionType(rs.getString("action_type"));
                stub.setActionDetail(rs.getString("action_detail"));
                Date BacklogDate = rs.getDate("date");
                stub.setBacklogDate(BacklogDate.toString());
                Time BacklogTime = rs.getTime("time");
                stub.setBacklogTime(BacklogTime.toString());
                stub.setUser(rs.getString("user"));
                //  Timestamp Backlog2Time = rs.getTimestamp("timed");
                //  stub.setTime(BacklogTime.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return list;
    }

    public void truncateBacklog() {
        try {
            sql = "TRUNCATE backlog;";
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
