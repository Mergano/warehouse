package com.mergano.core.dbManager;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {

    private Connection conn;
    private String URL;
    private final String hostName;
    private final int port;
    private final String databaseName;
    private final String username;
    private final String password;
    private String status;
    private DatabaseMetaData meta;
    private final Properties info = new Properties();
    private PrintWriter writer = new PrintWriter(System.out);

    public ConnectDB() {
        conn = null;
        hostName = "localhost";
        port = 3306;
        databaseName = "mergano";
        username = "root";
        password = "jukjukjuk";
        status = null;
    }

    public Connection getconnection() {
        URL = "jdbc:mysql://" + hostName + ":" + port + "/" + databaseName + "?useCompression=true" + "&autoReconnnect=true" + "&useSSL=false";
        info.put("user", username);
        info.put("password", password);
// System.out.println("URL: " + URL);
//  print the list with a PrintWriter object
//        info.list(writer);
// flush the stream
//        writer.flush();
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Registed JDBC MYSQL DRIVER
            conn = DriverManager.getConnection(URL, info);
            //conn = (Connection) DriverManager.getConnection("jdbc:mysql://128.199.117.93:" + "3306" + "/mergano" + "?useCompression=true", "user", "iloveoosd");
            conn.setAutoCommit(false);
            meta = conn.getMetaData();
            if (conn == null) {
                status = "Disconnnect";
                System.out.println("Faild to connect database");
                System.exit(1);
            } else {
                status = "Connected";
                StatusBean.setStatus(status);
                StatusBean.setDbType(meta.getDatabaseProductName());
                StatusBean.setDbName(conn.getCatalog());
                StatusBean.setPort(port + "");
                StatusBean.setUrl(meta.getUserName());
                System.out.println("Connected to database " + conn);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error " + ex);
            System.exit(1);
        }
        return conn;
    }

    public void commit() {
        try {
            conn.commit();
        } catch (SQLException ex) {
            try {
                System.err.println(ex.getMessage());
                conn.rollback();
            } catch (SQLException ex1) {
                System.err.println(ex.getMessage());
                System.exit(1);
            }
        }
    }

    public void closeDB() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }

}
