package com.mergano.core.dbManager;

import com.mergano.gui.main;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    String hostName;
    int port;
    String DBtype;
    String databaseName;
    String username;
    String password;
    String url;
    String status;
    String error;
    Connection con;

    public ConnectDB() {
        hostName = null;
        port = 3306;
        DBtype = null;
        databaseName = null;
        username = null;
        password = null;
        status = null;
    }

    public void setHostname(String h) {
        hostName = h;
    }

    public void setPort(int p) {
        port = p;
    }

    public void setDatabaseName(String n) {
        databaseName = n;
    }

    public void setUsername(String s) {
        username = s;
    }

    public void setPassword(String w) {
        password = w;
    }

    public void setUrl(String u) {
        url = u;
    }

    public String getHostname() {
        return hostName;
    }

    public int getPort() {
        return port;
    }

    public String getProtocol() {
        return DBtype;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getUrl() {
        return url;
    }

    public String getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public Connection getconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Load JDBC MYSQL DRIVER
            con = (Connection) DriverManager.getConnection("jdbc:mysql://128.199.117.93:" + "3306" + "/mergano" + "?useCompression=true", "user", "iloveoosd");
            con.setAutoCommit(true);

            if (con == null) {
                status = "Disconnect";
                error = "Error Database Connection Failed";
                main.status_box.setText("Disconnect");
                System.out.println("Faild to connect to " + con);
            } else {
                error = "Database Connected Successfully";
                status = "Connected";
                DatabaseMetaData meta = con.getMetaData();
                main.status_box.setText(status);
                main.db_type_box.setText(meta.getDatabaseProductName());
                main.port_box.setText(this.port + "");
                main.url_box.setText(meta.getUserName());
                main.db_name_box.setText(con.getCatalog());
                System.out.println("Connecting database to " + con);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public void closeDB() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.err.print(ex);
        } finally {
            //System.exit(0);
        }
    }
}
