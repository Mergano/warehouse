package com.mergano.core.dbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductDAO {

    private final String table = "products";
    private final String backlog_table = "backlog";
    private ConnectDB con;
    private Connection connect;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private String username = "admin";

    public ProductDAO() {
        try {
            con = new ConnectDB();
            connect = con.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// Display all data from product table
    public ArrayList<ProductBean> getData() {
        ArrayList<ProductBean> list = new ArrayList<>();

        if (connect == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connection is broken or disconnected. \nPlease check your internet connection and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            String sql = "SELECT * FROM " + table + ";";
            try {
                long start = java.lang.System.currentTimeMillis();
                p = connect.prepareStatement(sql);
                rs = p.executeQuery();
                con.commit();

                // Benchmark time
//                long stop = java.lang.System.currentTimeMillis();
//                if (rs.next()) {
//                    System.out.println("QUERY PRODUCT SUCCESSFUL");
//                    System.out.println("JDBC query time: " + String.valueOf((stop - start)) + " ms");
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
                    //Date dbSqlDate = rs.getDate("import_date").toString();
                    //stub.setImport(dbSqlDate.toString()); // SQL NOW
                    stub.setImport(rs.getDate("import_date").toString());
                    stub.setStatus(rs.getString("status"));
                    stub.setUserLastModified(rs.getString("user_lastmodified"));
                    stub.setImage(rs.getBytes("image"));
                    list.add(stub);
                }
                //                } else {
//                    System.out.println("QUERY PRODUCT FAILED");
//                }
                p.close();
                rs.close();
            } catch (Exception e) {
                System.err.print(e);
            }
        }
        return list;
    }

// Insert data into product table
    public boolean insertData(ProductBean bean) {
        boolean flag = false;
        try {
            String sql_insert = "INSERT INTO " + table + " VALUES("
                    + bean.getProductID() + ",'"
                    + bean.getCategory() + "','"
                    + bean.getManufacture() + "','"
                    + bean.getName() + "','"
                    + bean.getModel() + "','"
                    + bean.getDescription() + "','"
                    + bean.getCost() + "','"
                    + bean.getLocation() + "','"
                    + bean.getWarranty() + "',"
                    + bean.getQuantity() + ", current_date());";

            String sql_insert_bl = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Added'" + ","
                    + "'Added product " + bean.getProductID() + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + username + "');";
            p = connect.prepareStatement(sql_insert);
            p.executeUpdate();
            p = connect.prepareStatement(sql_insert_bl);
            p.executeUpdate();
            con.commit();
            flag = true;
            p.close();
        } catch (SQLException e) {
            System.err.println(e);
        } catch (Exception e) {
            flag = false;
            System.err.println(e);
        }
        return flag;
    }

    // Update data into product table
    public boolean updateData(ProductBean bean, long n) {
        boolean flag = false;
        int quan = Integer.parseInt(bean.getQuantity());
        double cost = Double.parseDouble(bean.getCost());
        try {
            String sql_update = "UPDATE " + table
                    + " product_id="
                    + bean.getProductID()
                    + " , category='"
                    + bean.getCategory()
                    + "' , manufacture='"
                    + bean.getManufacture()
                    + "' , model='"
                    + bean.getModel()
                    + "' , description='"
                    + bean.getDescription()
                    + "' , cost="
                    + cost
                    + " , location='"
                    + bean.getLocation()
                    + "' , warranty='"
                    + bean.getWarranty()
                    + "' , quantity="
                    + quan
                    + " WHERE product_id =" + n + ";";

            String sql_update_bl = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Update'" + ","
                    + "'Updated product " + bean.getProductID() + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + username + "');";

            p = connect.prepareStatement(sql_update);
            p.executeUpdate();
            p = connect.prepareStatement(sql_update_bl);
            p.executeUpdate();
            con.commit();
            flag = true;
            p.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        } catch (Exception e) {
            flag = false;
            System.err.println(e);
        }
        return flag;
    }

    // Delete data from database
    public boolean deleteData(ProductBean bean, int n) {
        boolean flag = false;
        try {
            String sql_delete = "DELETE FROM " + table + " WHERE product_id =" + n + ";";
            String sql_delete_bl = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Delete'" + ","
                    + "'Deleted product " + bean.getProductID() + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + username + "');";

            p = connect.prepareStatement(sql_delete);
            p.executeUpdate();
            p = connect.prepareStatement(sql_delete_bl);
            p.executeUpdate();
            con.commit();
            flag = true;
            p.close();
        } catch (SQLException e) {
            System.err.println(e);
        } catch (Exception e) {
            flag = false;
            System.err.println(e);
        }
        return flag;
    }

}

// DEBUG CODE
//           ResultSetMetaData metadata = (ResultSetMetaData) rs.getMetaData();
//           int cols = metadata.getColumnCount();
//           String columnNames[] = new String[cols];
//           for(int i=1; i<= cols; i++){
//               System.out.println(metadata.getColumnLabel(i));
//           }
//            String sql = "INSERT INTO " + table + " values(?,?,?,?,?,?,?,?,?,?,?,?)";
// print for sql test
//            p.setInt(1, bean.getID()); // "LAST_INSERT_ID()");
//            p.setString(2, bean.getProductID());
//            p.setString(3, bean.getCategory());
//            p.setString(4, bean.getType());
//            p.setString(5, bean.getManufacture());
//            p.setString(6, bean.getName());
//            p.setString(7, bean.getModel());
//            p.setString(8, bean.getDescription());
//            p.setString(9, bean.getCost());
//            p.setString(10,bean.getWarranty());
//            p.setString(11, bean.getQuantity());
//            p.setString(12, "current_date()");
            // p.executeQuery();
