package com.mergano.core;

import com.mergano.core.dbManager.LoginBean;
import com.mergano.core.dbManager.LoginDAO;

public class Authenticate {

    public int VerifyUser(String encryptedUser, String encryptedPass) {

        LoginDAO log = new LoginDAO();
        LoginBean data = new LoginBean();
        int flag = log.getUser(encryptedUser, encryptedPass);

        if (flag == 1) {
            System.out.println("QUERY SUCCESSFUL");
        } else if (flag == 0) {
            System.out.println("QUERY FAILED");
        }

        System.out.println("User type " + data.getUserType());
        System.out.println("Username encrypted " + encryptedUser);
        System.out.println("Username from db " + data.getUsername());
        System.out.println("Password encrypted " + encryptedPass);
        System.out.println("Password from db " + data.getPassword());

        if (encryptedUser.equals(data.getUsername()) && encryptedPass.equals(data.getPassword()) && data.getUserType().equals("administrator")) {
            return 1; // LOGIN SUCCESSFUL AS ADMINISTRATOR
        } else if (encryptedUser.equals(data.getUsername()) && encryptedPass.equals(data.getPassword()) && data.getUserType().equals("user")) {
            return 2; // LOGIN SUCCESGULL AS USER
        } else if (encryptedUser.equals(data.getUsername()) && encryptedPass.equals(data.getPassword()) && data.getUserType().equals("agent")) {
            return 3; // LOGIN SUCCESGULL AS AGENT
        } else if (encryptedUser.equals(data.getUsername()) && encryptedPass.equals(data.getPassword()) && data.getUserType().equals("driver")) {
            return 4; // LOGIN SUCCESGULL AS DRIVER
        } else if (encryptedUser.equals(data.getUsername()) && encryptedPass.equals(data.getPassword()) && data.getUserType().equals("debug")) {
            return 5;  // LOGIN SUCCESGULL AS DEBUG
        } else {
            return 0; // LOGIN FAILED
        }
    }
}
