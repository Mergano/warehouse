package com.mergano.core.dao;

import com.mergano.core.Encryption;
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
        if (conn == null) {
            return 0; // NO INTERNET CONNECTION
        }
        String sql = "SELECT * FROM " + table + " WHERE username =? AND password =? ;";
        String decryptUser;
        try {
            p = conn.prepareStatement(sql);
            p.setString(1, users);
            p.setString(2, passwd);

            rs = p.executeQuery();
            conn.commit();
            while (rs.next()) {
                LoginBean bean = new LoginBean();
                bean.setUsername(rs.getString("username"));
                bean.setPassword(rs.getString("password"));
                bean.setUserType(rs.getString("type"));
                bean.setUserEmail(rs.getString("email"));
                decryptUser = Encryption.decrypt(rs.getString("username"));
                bean.setUserTxt(decryptUser);
            }
            //Clean-up environment
            p.close();
            rs.close();
            conn.close();
            System.out.println("=== CLOSED CONNECTION SUCCESSFULLY ===");
            return 1;

        } catch (SQLException se) {
            try {
                System.err.println(se);
                conn.close();
                return -1; // FAILED TO QUERY
            } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; // DEFAULT RETURN
    }

}
