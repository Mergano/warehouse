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
    private ConnectDB connect;
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private boolean flag;

    public ProductDAO() {
        try {
            connect = new ConnectDB();
            conn = connect.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// Display all data from product table
    public ArrayList<ProductBean> getData() {
        ArrayList<ProductBean> product_list = new ArrayList<>();

        if (conn == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connection is broken or disconnected. \nPlease check your internet connection and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            String sql = "SELECT product_id, category, manufacture, name, model, description, cost, location, warranty, quantity, import_date, status, user_lastmodified "
                    + "FROM " + table + " ORDER BY " + "category;";
            try {
                long start = java.lang.System.currentTimeMillis();
                p = conn.prepareStatement(sql);
                rs = p.executeQuery();

                if (rs.next()) {
                    do {
                        ProductBean bean = new ProductBean();
                        bean.setProductID(rs.getLong("product_id"));
                        bean.setCategory(rs.getString("category"));
                        bean.setManufacture(rs.getString("manufacture"));
                        bean.setName(rs.getString("name"));
                        bean.setModel(rs.getString("model"));
                        bean.setDescription(rs.getString("description"));
                        bean.setCost(rs.getString("cost"));
                        bean.setLocation(rs.getString("location"));
                        bean.setWarranty(rs.getString("warranty"));
                        bean.setQuantity(rs.getInt("quantity"));
                        bean.setImport(rs.getDate("import_date").toString());
                        bean.setStatus(rs.getString("status"));
                        bean.setUserLastModified(rs.getString("user_lastmodified"));
                        //bean.setImage(rs.getBytes("image"));
                        product_list.add(bean);
                    } while (rs.next());
                    // Benchmark time
                    long stop = java.lang.System.currentTimeMillis();
                    System.out.println("JDBC query time: " + String.valueOf((stop - start)) + " ms");
                } else {
                    // ERROR CODE QUERY ERROR
                }
                conn.commit();
                p.close();
                rs.close();
                conn.close();
            } catch (Exception e) {
                System.err.print(e);
            }
        }
        return product_list;
    }

// Insert data into product table
    public boolean insertData(ProductBean bean) {
        flag = false;
        try {
            String sql_insert = "INSERT INTO " + table + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            p = conn.prepareStatement(sql_insert);
            p.setLong(1, bean.getProductID());
            p.setString(2, bean.getCategory());
            p.setString(3, bean.getManufacture());
            p.setString(4, bean.getName());
            p.setString(5, bean.getModel());
            p.setString(6, bean.getDescription());
            p.setDouble(7, Double.parseDouble(bean.getCost()));
            p.setString(8, bean.getLocation());
            p.setString(9, bean.getWarranty());
            p.setInt(10, bean.getQuantity());
            p.setDate(11, java.sql.Date.valueOf(java.time.LocalDate.now()));
            p.setString(12, bean.getStatus());
            p.setString(13, bean.getUserLastModified());
            p.setString(14, null);
            p.executeUpdate();

            String sql_insert_his = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Added'" + ","
                    + "'Added product " + bean.getProductID() + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + bean.getUserLastModified() + "');";
            System.out.println(sql_insert_his);
            p = conn.prepareStatement(sql_insert_his);
            p.executeUpdate();
            conn.commit();
            flag = true;
            p.close();
        } catch (SQLException | NumberFormatException e) {
            flag = false;
            System.err.println(e);
        }
        return flag;
    }

    // Update data into product table
    public boolean updateData(ProductBean bean, long n) {
        flag = false;
        try {
            String sql_update = "UPDATE " + table + " SET"
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
                    + Double.parseDouble(bean.getCost())
                    + " , location='"
                    + bean.getLocation()
                    + "' , warranty='"
                    + bean.getWarranty()
                    + "' , quantity="
                    + bean.getQuantity()
                    + ", user_lastmodified= '"
                    + bean.getUserLastModified()
                    + "' WHERE product_id =" + n + ";";
            p = conn.prepareStatement(sql_update);
            p.executeUpdate();
            String sql_edit_his = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Edited'" + ","
                    + "'Edited product " + bean.getProductID() + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + bean.getUserLastModified() + "');";
            p = conn.prepareStatement(sql_edit_his);
            p.executeUpdate();
            conn.commit();
            flag = true;
            p.close();
        } catch (SQLException e) {
            flag = false;
            System.err.println(e);
        }
        return flag;
    }

    // Delete data from database
    public boolean deleteData(ProductBean bean, long n) {
        flag = false;
        try {
            String sql_delete = "DELETE FROM " + table + " WHERE product_id =" + n + ";";
            String sql_delete_bl = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Deleted'" + ","
                    + "'Deleted product " + bean.getProductID() + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + bean.getUserLastModified() + "');";

            p = conn.prepareStatement(sql_delete);
            p.executeUpdate();
            p = conn.prepareStatement(sql_delete_bl);
            p.executeUpdate();
            conn.commit();
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
