package core;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {  

    String hostname;
    int port;
    String DBtype;
    String Driver;
    String databasename;
    String username;
    String password;
    String url;
    String status;
    String error;
    Connection con;

    public ConnectDB() {
    hostname=null;
    port=3306;
    DBtype=null;
    databasename=null;
    username=null;
    password=null;
    status=null;
    }
    public void setHostname(String h) {
        hostname = h;
    }
    public void setPort(int p) {
        port = p;
    }
    public void setProtocol(int d) {
        if(d == 0) DBtype = "jdbc"; Driver = "com.mysql.jdbc.Driver"; // mysql
        if(d == 1) DBtype = "odbc"; Driver = "com.mysql.jdbc.Driver";//mssql server
        if(d == 2) DBtype = "oracle"; Driver = "com.mysql.jdbc.Driver"; // oracle db
        if(d == 4) DBtype = "db2"; Driver = "com.mysql.jdbc.Driver"; // IBM db2
    }
    public void setDatabaseName(String n) {
        databasename = n;
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
        return hostname;
    }
    public int getPort() {
        return port;
    }
    public String getProtocol() {
        return DBtype;
    }
    public String getDatabaseName() {
        return databasename;
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
    
//"jdbc:mysql://192.168.117.93:3306/mergano_db";

    public Connection getconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Load JDBC MYSQL DRIVER
            con = (Connection) DriverManager.getConnection("jdbc:mysql://cs14sitkmutt.me:3306/CSC105_G1","CSC105_G1","CSC105_G1"); 
                    // jdbc:mysql://localhost:3306/mergano_db", "root", "123456"); 
            con.setAutoCommit(true);
            
            if(con == null) {
                status = "Disconnect";
                error = "Error Database Connection Failed";
                main.status_box.setText("Disconnect");
                System.out.println("Faild to connect to " + con);
            } else {
                error = "Database Connected Successfully";
                //DatabaseMetaData meta = con.getMetaData();
                main.status_box.setText("Connected");
                main.db_type_box.setText("MySQL");
                main.port_box.setText("3306");
                main.url_box.setText("cs14sitkmutt.me");
                main.db_name_box.setText(con.getCatalog());
                System.out.println("Connecting database to " + con);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
        return con; 
    }
    
    public void closeDB() {
        try {
            con.close();
        } catch (SQLException ex) {
                ex.printStackTrace();
        }
    }
    
    
    public void showdata() {
        System.out.println("TYPE DB: "+ DBtype);
        System.out.println("DATABASE NAME: "+databasename);
        System.out.println("HOSTNAME: "+hostname);
        System.out.println("PORT: "+port);
        System.out.println("USER NAME: "+username);
        System.out.println("PASSWORD: "+password);
        System.out.println("-----------------------------------------------------");
        System.out.println("URL: "+ url);
    }
}


