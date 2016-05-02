package com.mergano.core.dbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {

    private final String table = "user";
    private ConnectDB c;
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;

    public LoginDAO() {
        try {
            c = new ConnectDB();
            conn = c.getconnection();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public int getUser(String users, String passwd) {
        System.out.println("Connect status: " + conn);
        if (conn == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            System.exit(0);
        }

        String sql = "SELECT * FROM " + table + " WHERE username =? AND password =? ;";

        try {
            p = conn.prepareStatement(sql);
            p.setString(1, users);
            p.setString(2, passwd);
            System.out.println(sql);

            rs = p.executeQuery();
            conn.commit();
            while (rs.next()) {
                LoginBean bean = new LoginBean();
                bean.setUsername(rs.getString("username"));
                bean.setPassword(rs.getString("password"));
                bean.setUserType(rs.getString("type"));
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
                System.out.println(rs.getString("type"));
                System.out.println(rs.getString("firstname"));
            }

            //Clean-up environment
            p.close();
            rs.close();
            conn.close();
            return 1;

        } catch (SQLException se) {
            try {
                System.err.println(se);
                conn.close();
                return 0;
            } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }

}
