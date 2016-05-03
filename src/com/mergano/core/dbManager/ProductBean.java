package com.mergano.core.dbManager;

public class ProductBean {

    // Product Management table
    private long productID;
    private String category;
    private String manufacture;
    private String name;
    private String model;
    private String description;
    private String cost;
    private int quantity;
    private String date;
    private String warranty;
    private String p_status;
    private String p_location;
    private String user_lastmodified;
    private byte[] image;

    // Setter and Getter for Product Management
    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost + "";
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getQuantity() {
        return quantity + "";
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return p_location;
    }

    public void setLocation(String p_location) {
        this.p_location = p_location;
    }

    public String getImport() {
        return date;
    }

    public void setImport(String date) {
        this.date = date;
    }

    public String getStatus() {
        return p_status;
    }

    public void setStatus(String p_status) {
        this.p_status = p_status;
    }

    public String getUserLastModified() {
        return user_lastmodified;
    }

    public void setUserLastModified(String user_lastmodified) {
        this.user_lastmodified = user_lastmodified;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] img) {
        this.image = img;
    }

}
