package com.mergano.core;

import com.mergano.core.dbManager.LoginBean;
import com.mergano.core.dbManager.LoginDAO;

public class Authenticate {

    public int VerifyUser(String encryptedUsername, String encryptedPassword) {
        LoginDAO log = new LoginDAO();
        log.getUser(encryptedUsername, encryptedPassword);
        LoginBean data = new LoginBean();

        System.out.println("User type " + data.getUserType());
        System.out.println("Username encrypted " + encryptedUsername);
        System.out.println("Username from db " + data.getUsername());
        System.out.println("Password encrypted " + encryptedPassword);
        System.out.println("Password from db " + data.getPassword());

        if (encryptedUsername.equals(data.getUsername()) && encryptedPassword.equals(data.getPassword()) && data.getUserType().equals("administrator")) {
            return 1; // LOGIN SUCCESSFUL AS ADMINISTRATOR
        } else if (encryptedUsername.equals(data.getUsername()) && encryptedPassword.equals(data.getPassword()) && data.getUserType().equals("user")) {
            return 2; // LOGIN SUCCESGULL AS USER
        } else if (encryptedUsername.equals(data.getUsername()) && encryptedPassword.equals(data.getPassword()) && data.getUserType().equals("agent")) {
            return 3; // LOGIN SUCCESGULL AS AGENT
        } else if (encryptedUsername.equals(data.getUsername()) && encryptedPassword.equals(data.getPassword()) && data.getUserType().equals("driver")) {
            return 4; // LOGIN SUCCESGULL AS DRIVER
        } else if (encryptedUsername.equals(data.getUsername()) && encryptedPassword.equals(data.getPassword()) && data.getUserType().equals("debug")) {
            return 5;  // LOGIN SUCCESGULL AS DEBUG
        } else {
            return 0; // LOGIN FAILED
        }
    }
}
