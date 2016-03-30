package core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.sql.Statement;
import java.sql.Timestamp;

public class MerganoDAO {

    private final String table = "product";
    private final String backlog = "backlog";
    private ConnectDB con;
    private Connection connect;
    private PreparedStatement p = null;
    private ResultSet rs = null;

    public MerganoDAO() {
        try {
            con = new ConnectDB();
            connect = con.getconnection();
        } catch (Exception ex) {
            Logger.getLogger(MerganoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Display all data from table
    public ArrayList<MerganoBean> getData() {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + ";";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
        }
        return list;
    }

    // get backlog data from database
    public ArrayList<MerganoBean> getBacklogData() {
        ArrayList<MerganoBean> list = new ArrayList<>();

        // display data from
        String sql = "SELECT * FROM " + backlog + ";";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setBLID(rs.getInt("id"));
                stub.setHistory(rs.getString("history"));
                Timestamp BacklogTime = rs.getTimestamp("timed");
                stub.setTime(BacklogTime.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    // Search by ID
    public ArrayList<MerganoBean> getDataID(int id) {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE id=" + id + ";";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    // Search by Name
    public ArrayList<MerganoBean> getDataName(String name) {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE name=" + name + ";";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    // Search by ProductID
    public ArrayList<MerganoBean> getDataProductID(String productID) {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE product_id=" + productID + ";";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    // Search by Category
    public ArrayList<MerganoBean> getDataCategory(String category) {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE category='" + category + "';";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    // Search by Type
    public ArrayList<MerganoBean> getDataType(String type) {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE type='" + type + "';";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    // Search by Manufacture
    public ArrayList<MerganoBean> getDataManufacture(String manufacture) {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE manufacture='" + manufacture + "';";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

// Insert data into database
    public boolean insertData(MerganoBean bean) {
        boolean flag = false;
        try {
            String sql = "INSERT INTO " + table + " VALUES('" + bean.getID() + "','"
                    + bean.getProductID() + "','"
                    + bean.getCategory() + "','"
                    + bean.getType() + "','"
                    + bean.getManufacture() + "','"
                    + bean.getName() + "','"
                    + bean.getModel() + "','"
                    + bean.getDescription() + "','"
                    + bean.getCost() + "','"
                    + bean.getWarranty() + "','"
                    + bean.getQuantity() + "',current_date());";
            // p = connect.prepareStatement(sql);
            String sql2 = "INSERT INTO backlog VALUES('" + bean.getID() + "','" + bean.getHistory() + "',now());";
            //p.executeUpdate();
            p = connect.prepareStatement(sql);
            p.executeUpdate();
            p = connect.prepareStatement(sql2);
            p.executeUpdate();
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
            flag = true;
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            flag = false;
            System.out.println(e);
            e.printStackTrace();
        }
        return flag;
    }

    public ArrayList<MerganoBean> getLowQuantity() {
        ArrayList<MerganoBean> list = new ArrayList<>();

        String sql = "SELECT * FROM " + table + " WHERE quantity <=10;";
        if (connect == null) {
            System.out.print("ERROR NO CONNECTION");
        }

        try {
            p = connect.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                MerganoBean stub = new MerganoBean();
                stub.setID(rs.getInt("id"));
                stub.setProductID(rs.getString("product_id"));
                stub.setCategory(rs.getString("category"));
                stub.setType(rs.getString("type"));
                stub.setManufacture(rs.getString("manufacture"));
                stub.setName(rs.getString("name"));
                stub.setModel(rs.getString("model"));
                stub.setDescription(rs.getString("description"));
                stub.setCost(rs.getString("cost"));
                stub.setWarranty(rs.getString("warranty"));
                stub.setQuantity(rs.getString("quantity"));
                Date dbSqlDate = rs.getDate("dated");
                stub.setImport(dbSqlDate.toString()); // SQL NOW
                list.add(stub);
            }
        } catch (Exception e) {
            e.printStackTrace(); // write log file
        }
        return list;
    }

    //TRUNCATE (CLEAR) BACKLOG TABLE
    public void deleteBacklog() {
        ArrayList<MerganoBean> list = new ArrayList<>();
        MerganoBean stub = null;

        try {
            String sql = "DELETE FROM " + backlog;
            p = connect.prepareStatement(sql);
            p.executeUpdate(sql);
            System.out.println(sql);
            //p.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Update data into database
    public boolean updateData(MerganoBean bean, int n) {
        boolean flag = false;
        try {
            String sql = "UPDATE " + table + " SET id ='" + bean.getID() + "' , product_id='" + bean.getProductID() + "' , category='" + bean.getProductID() + "' , manufacture='" + bean.getManufacture() + "' , type='" + bean.getType() + "' , model='" + bean.getModel() + "' , description='" + bean.getDescription() + "' , cost='" + bean.getCost() + "' , warranty='" + bean.getWarranty() + "' , quantity='" + bean.getQuantity() + "' WHERE id ='" + n + "';";
            String sql2 = "INSERT INTO backlog VALUES('" + bean.getID() + "','" + bean.getHistory() + "',now());";
            p = connect.prepareStatement(sql);
            p.executeUpdate();
            p = connect.prepareStatement(sql2);
            p.executeUpdate();
            flag = true;
        } catch (Exception e) {
            flag = false;
            System.out.println(e);
        }
        return flag;
    }

    // Delete data from database
    public boolean deleteData(MerganoBean bean, int n) {
        boolean flag = false;
        try {
            String sql = "DELETE FROM " + table + " WHERE id ='" + n + "';";
            String sql2 = "INSERT INTO backlog VALUES('" + bean.getID() + "','" + bean.getHistory() + "',now());";
            p = connect.prepareStatement(sql);
            p.executeUpdate();
            p = connect.prepareStatement(sql2);
            p.executeUpdate();
            System.out.println(sql);
            flag = true;
        } catch (Exception e) {
            flag = false;
            System.out.println(e);
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
