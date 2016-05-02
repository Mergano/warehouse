package com.mergano.core.dbManager;

import static com.mergano.gui.Main.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {

    String URL;
    String hostName;
    int port;
    String databaseName;
    String username;
    String password;
    String status;
    Connection con;
    Statement stmt;
    DatabaseMetaData meta;
    Savepoint savepoint1;
    Properties info = new Properties();
    PrintWriter writer = new PrintWriter(System.out);

    public ConnectDB() {
        con = null;
        stmt = null;
        URL = null;
        hostName = "localhost";
        port = 3306;
        databaseName = "mergano";
        username = "root";
        password = "jukjukjuk";
        status = null;
        savepoint1 = null;
    }

    public Connection getconnection() {
        URL = "jdbc:mysql://" + hostName + ":" + port + "/" + databaseName + "?useCompression=true" + "&autoReconnect=true" + "&useSSL=false";
        info.put("user", username);
        info.put("password", password);
        System.out.println("URL" + URL);

        // print the list with a PrintWriter object
        info.list(writer);
        // flush the stream
        writer.flush();

        try {
            Class.forName("com.mysql.jdbc.Driver"); // Registed JDBC MYSQL DRIVER
            System.out.println("Connnecting to database ..");
            con = (Connection) DriverManager.getConnection(URL, info);
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://128.199.117.93:" + "3306" + "/mergano" + "?useCompression=true", "user", "iloveoosd");
            con.setAutoCommit(false);
            meta = con.getMetaData();
            System.out.println("Connect status: " + con);
            if (con != null) {
                status = "Connected";
                status_box.setText(status);
                db_type_box.setText(meta.getDatabaseProductName());
                port_box.setText(this.port + "");
                url_box.setText(meta.getUserName());
                db_name_box.setText(con.getCatalog());
                System.out.println("Connected to database " + con);
            } else {
                status = "Disconnect";
                status_box.setText("Disconnect");
                System.out.println("Faild to connect to " + con);
                System.exit(1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        return con;
    }

    public void commit() {
        try {
            con.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex1) {
                System.err.println(ex.getMessage());
            }
        }
    }

    public void closeDB() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }

    public Statement createStatement() {
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            System.err.print(ex);
        }
        return stmt;
    }

}
