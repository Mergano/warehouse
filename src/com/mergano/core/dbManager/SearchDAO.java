package com.mergano.core.dbManager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SearchDAO {

    private final String table = "product";
    private ConnectDB con;
    private Connection connect;
    private PreparedStatement p = null;
    private ResultSet rs = null;

    public SearchDAO() {
        try {
            con = new ConnectDB();
            connect = con.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

        String sql = "SELECT * FROM " + table + " WHERE " + selector + " = " + key + ";";
        System.out.println(sql);
        if (connect == null) {
            System.err.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();
            con.commit();
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
                Date dbSqlDate = rs.getDate("import_date");
                stub.setImport(dbSqlDate.toString()); // SQL NOW convert to String
                stub.setStatus(rs.getString("status"));
                stub.setUserLastModified(rs.getString("user_lastmodified"));
                list.add(stub);
            }
            rs.close();
            p.close();
            con.closeDB();
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    // Get low quantity
    public ArrayList<ProductBean> getLowQuantity() {
        ArrayList<ProductBean> list = new ArrayList<>();

        if (connect == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connection is broken or disconnected. \nPlease check your internet connection and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            String sql = "SELECT * FROM " + table + " WHERE quantity <= 5 " + ";";
            try {
                long start = java.lang.System.currentTimeMillis();
                p = connect.prepareStatement(sql);
                rs = p.executeQuery();

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
            } catch (Exception e) {
                System.err.print(e);
            }
        }
        return list;
    }

}
