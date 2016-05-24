package com.mergano.core.dao;

import com.mergano.core.bean.OrderBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class OrderDAO extends ConnectDB {

    private final String table = "order";
    private final String order_product_table = "order_product";
    private final String backlog_table = "backlog";
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private boolean flag;
    private String sql;

    public OrderDAO() {
        try {
            conn = super.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<OrderBean> getOrderData() {
        ArrayList<OrderBean> order_list = new ArrayList<>();
        if (conn == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connection is broken or disconnected. \nPlease check your internet connection and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            sql = "SELECT * FROM " + table + ";";
            try {
                p = conn.prepareStatement(sql);
                rs = p.executeQuery();

                if (rs.next()) {
                    do {
                        OrderBean bean = new OrderBean();
                        bean.setIdorder(rs.getInt("idorder"));
                        bean.setCustomer_id(rs.getInt("customer_id"));
                        bean.setOrder_status(rs.getString("order_status"));
                        bean.setUser_created(rs.getString("user_created"));
                        bean.setDate_created(rs.getTimestamp("date_created").toString());
                        order_list.add(bean);
                    } while (rs.next());
                } else {
                    // ERROR CODE QUERY ERROR
                }
                conn.commit();
                p.close();
                rs.close();
                conn.close();
            } catch (SQLException e) {
                System.err.print(e);
            }
        }
        return order_list;
    }

    public boolean AddOrder(int orderid, JTable table, int rows) {
        flag = false;
        sql = "INSERT INTO " + order_product_table + " VALUES(?,?,?,?,?,?,?);";
        System.out.println(sql);
        try {
            p = conn.prepareStatement(sql);
            for (int row = 0; row < rows; row++) {
                int product_id = (Integer) table.getValueAt(row, 0);
                String product_name = (String) table.getValueAt(row, 1);
                String quantity = (String) table.getValueAt(row, 2);
                double price = (Double) table.getValueAt(row, 3);
                p.setInt(1, orderid);
                p.setInt(2, product_id);
                p.setString(3, product_name);
                p.setString(4, quantity);
                p.setDouble(5, price);
                p.addBatch();
            }
            p.executeBatch();
            p.close();
            conn.commit();
            flag = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public boolean DeleteOrder(int n, String u) {
        flag = false;
        try {
            String sql_delete = "DELETE FROM " + table + " WHERE product_id =" + n + ";";
            String sql_delete_bl = "INSERT INTO " + backlog_table + " VALUES("
                    + "DEFAULT" + ","
                    + "'Deleted'" + ","
                    + "'Deleted order no. " + n + "',"
                    + "current_date()" + ","
                    + "current_time()" + ",'"
                    + u + "');";

            p = conn.prepareStatement(sql_delete);
            p.executeUpdate();
            p = conn.prepareStatement(sql_delete_bl);
            p.executeUpdate();
            p.close();
            conn.commit();
            flag = true;
        } catch (SQLException e) {
            System.err.println(e);
        } catch (Exception e) {
            flag = false;
            System.err.println(e);
        }
        return flag;
    }
}
