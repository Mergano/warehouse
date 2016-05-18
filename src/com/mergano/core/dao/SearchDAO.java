package com.mergano.core.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SearchDAO {

    private final String table = "products";
    private ConnectDB connect;
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private Statement stmt = null;

    public SearchDAO() {
        try {
            connect = new ConnectDB();
            conn = connect.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Deep search with SQL
    public ArrayList<ProductBean> getDataSearch(String key_input, int filter) {
        ArrayList<ProductBean> list = new ArrayList<>();
        String selector = null, key = null;
        switch (filter) {
            case 0:
                selector = "product_id";
                key = key_input;
                break;
            case 1:
                selector = "name";
                key = "'" + key_input + "'";
                break;
            case 2:
                selector = "category";
                key = "'" + key_input + "'";
                break;
            case 3:
                selector = "manufacture";
                key = "'" + key_input + "'";
                break;
            case 4:
                selector = "location";
                key = "'" + key_input + "'";
                break;
            default:
                break;
        }
        String sql = "SELECT product_id, category, manufacture, name, model, description, cost, location, warranty, quantity, import_date, status, user_lastmodified FROM " + table + " WHERE " + selector + " = " + key + ";";
        System.out.println(sql);
        if (conn == null) {
            System.err.print("ERROR NO CONNECTION");
        }
        try {
            long start = java.lang.System.currentTimeMillis();
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            connect.commit();
            while (rs.next()) {
                ProductBean stub = new ProductBean();
                stub.setProductID(rs.getLong("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setLocation(rs.getString("location"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getInt("quantity"));
                Date dbSqlDate = rs.getDate("import_date");
                stub.setImport(dbSqlDate.toString()); // SQL NOW convert to String
                stub.setStatus(rs.getString("status"));
                stub.setUserLastModified(rs.getString("user_lastmodified"));
                list.add(stub);
            }
            // Benchmark time
            long stop = java.lang.System.currentTimeMillis();
            System.out.println("JDBC search query time: " + String.valueOf((stop - start)) + " ms");
            rs.close();
            p.close();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    // Get low quantity
    public ArrayList<ProductBean> getLowQuantity() {
        ArrayList<ProductBean> list = new ArrayList<>();

        if (conn == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connion is broken or disconned. \nPlease check your internet connion and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            String sql = "SELECT product_id, category, manufacture, name, model, description, cost, location, warranty, quantity, import_date, status, user_lastmodified FROM " + table + " WHERE quantity <= 5 " + ";";
            try {
                long start = java.lang.System.currentTimeMillis();
                p = conn.prepareStatement(sql);
                rs = p.executeQuery();
                connect.commit();
                // Benchmark time
                long stop = java.lang.System.currentTimeMillis();
                if (rs.next()) {
                    System.out.println("Query successful");
                    System.out.println("JDBC query time: " + String.valueOf((stop - start)) + " ms");
                } else {
                    System.out.println("Query failed");
                }

                while (rs.next()) {
                    ProductBean stub = new ProductBean();
                    stub.setProductID(rs.getInt("product_id"));
                    stub.setCategory(rs.getString("category"));
                    stub.setManufacture(rs.getString("manufacture"));
                    stub.setName(rs.getString("name"));
                    stub.setModel(rs.getString("model"));
                    stub.setDescription(rs.getString("description"));
                    stub.setCost(rs.getString("cost"));
                    stub.setLocation(rs.getString("location"));
                    stub.setWarranty(rs.getString("warranty"));
                    stub.setQuantity(rs.getInt("quantity"));
                    Date dbSqlDate = rs.getDate("dated");
                    stub.setImport(dbSqlDate.toString()); // SQL NOW
                    stub.setUserLastModified(rs.getString("user_lastmodified"));
                    list.add(stub);
                }
                p.close();
                rs.close();
            } catch (SQLException e) {
                System.err.print(e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

}
