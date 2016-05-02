package com.mergano.core.dbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class LoginDAO {

    private final String table = "user";
    private ConnectDB con;
    private Connection connect;
    private PreparedStatement p = null;
    // private Statement stmt;
    private ResultSet rs = null;

    public LoginDAO() {
        try {
            con = new ConnectDB();
            connect = con.getconnection();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public void getUser(String user, String passwd) {
        try {
            String sql = "SELECT * FROM " + table + " WHERE username = '" + user + "' AND password = '" + passwd + "';";
            //stmt = connect.createStatement();
            long start = java.lang.System.currentTimeMillis();
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();
            con.commit();
            //rs = stmt.executeQuery(sql);
            System.out.println("Resultset" + rs);
            long stop = java.lang.System.currentTimeMillis();
            if (rs.next()) {
                System.out.println("Query successful");
                System.out.println("JDBC query time: " + String.valueOf((stop - start)) + " ms");
            } else {
                System.out.println("Query failed");
            }
            while (rs.next()) {
                //Retrieve by column name
                LoginBean stub = new LoginBean();
                System.out.println("Set bean " + rs.getString("username"));
                stub.setUsername(rs.getString("username"));
                stub.setPassword(rs.getString("password"));
                stub.setUserType(rs.getString("type"));
            }
            //Clean-up environment
            rs.close();
            //stmt.close();
            con.closeDB();
        } catch (SQLException se) {
            System.err.println(se);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
