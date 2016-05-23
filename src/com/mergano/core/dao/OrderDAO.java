package com.mergano.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDAO extends ConnectDB {

    private final String table = "order";
    private final String backlog_table = "backlog";
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private boolean flag;
    private String sql;

    public OrderDAO() {
        try {
            conn = super.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean AddOrder() {
        sql = "INSERT INTO " + table + "VALUES(?,?,?,?,?,?,?);";
        try {
            p = conn.prepareStatement(sql);
//            for (int row = 0; row < rows; row++) {
//                String coitemname = (String) tblCO2.getValueAt(row, 0);
//                String cocateg = (String) tblCO2.getValueAt(row, 1);
//                String codesc = (String) tblCO2.getValueAt(row, 2);
//                String coloc = (String) tblCO2.getValueAt(row, 3);
//                String coitemtagno = (String) tblCO2.getValueAt(row, 4);
            p.setString(1, coitemname);
            p.setString(2, cocateg);
            p.setString(3, codesc);
            p.setString(4, coloc);
            p.setString(5, coitemtagno);

            p.addBatch();
        }
        p.executeBatch();
        conn.commit();

    }
    catch (SQLException ex


        ) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
    }


return false;
    }
}
