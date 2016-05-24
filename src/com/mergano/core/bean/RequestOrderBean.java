package com.mergano.core.bean;

public class RequestOrderBean {

    public int getIdrequest() {
        return idrequest;
    }

    public void setIdrequest(int idrequest) {
        this.idrequest = idrequest;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public String getUser_created() {
        return user_created;
    }

    public void setUser_created(String user_created) {
        this.user_created = user_created;
    }

    private int idrequest;
    private int order_id;
    private int quantity;
    private long product_id;
    private String request_status;
    private String user_created;

}
