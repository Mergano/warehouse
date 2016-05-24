package com.mergano.core.dao;

import com.mergano.core.bean.CustomerBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CustomerDAO extends ConnectDB {

    private final String table = "customer";
    private Connection conn;
    private PreparedStatement p = null;
    private ResultSet rs = null;
    private boolean flag;

    public CustomerDAO() {
        try {
            conn = super.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<CustomerBean> getCustomerData() {
        ArrayList<CustomerBean> customer_list = new ArrayList<>();
        if (conn == null) {
            System.err.println("ERROR: NO INTERNET CONNECTION");
            JOptionPane.showMessageDialog(null, "Internet connection is broken or disconnected. \nPlease check your internet connection and try again.", "Communication error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            String sql = "SELECT * FROM " + table + ";";
            try {
                p = conn.prepareStatement(sql);
                rs = p.executeQuery();

                if (rs.next()) {
                    do {
                        CustomerBean bean = new CustomerBean();
                        bean.setIdcustomer(rs.getInt("idcustomer"));
                        bean.setName(rs.getString("name"));
                        bean.setCompany(rs.getString("company"));
                        bean.setContact(rs.getString("contact"));
                        bean.setDatetime(rs.getTimestamp("date_created").toString());

                        customer_list.add(bean);
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
        return customer_list;
    }
}
