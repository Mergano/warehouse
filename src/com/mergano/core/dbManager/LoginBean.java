package com.mergano.core.dbManager;

import java.io.Serializable;

public class LoginBean implements Serializable {

    private String username;
    private String password;
    private String userType;

    // Setter and Getter for authenticate
    public String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    protected void setUserType(String userType) {
        this.userType = userType;
    }

}
