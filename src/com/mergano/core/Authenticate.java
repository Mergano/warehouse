package com.mergano.core;

import com.mergano.core.dbManager.LoginBean;
import com.mergano.core.dbManager.LoginDAO;

public class Authenticate {

    public int VerifyUser(String encryptedUser, String encryptedPass) {
        LoginDAO log = new LoginDAO();
        int flag = log.getUser(encryptedUser, encryptedPass);
        switch (flag) {
            case 1:
                System.out.println("AUTHENTICATE QUERY SUCCESSFUL");

                if (encryptedUser.equals(LoginBean.getUsername()) && encryptedPass.equals(LoginBean.getPassword()) && LoginBean.getUserType().equals("administrator")) {
                    return 1; // LOGIN SUCCESSFUL AS ADMINISTRATOR LEVEL
                } else if (encryptedUser.equals(LoginBean.getUsername()) && encryptedPass.equals(LoginBean.getPassword()) && LoginBean.getUserType().equals("user")) {
                    return 2; // LOGIN SUCCESGULL AS USER LEVEL
                } else if (encryptedUser.equals(LoginBean.getUsername()) && encryptedPass.equals(LoginBean.getPassword()) && LoginBean.getUserType().equals("agent")) {
                    return 3; // LOGIN SUCCESGULL AS AGENT LEVEL
                } else if (encryptedUser.equals(LoginBean.getUsername()) && encryptedPass.equals(LoginBean.getPassword()) && LoginBean.getUserType().equals("driver")) {
                    return 4; // LOGIN SUCCESGULL AS DRIVER LEVEL
                } else if (encryptedUser.equals(LoginBean.getUsername()) && encryptedPass.equals(LoginBean.getPassword()) && LoginBean.getUserType().equals("debug")) {
                    return 5;  // LOGIN SUCCESGULL AS DEBUG MODE LEVEL
                } else if ((!encryptedUser.equals(LoginBean.getUsername())) || (!encryptedPass.equals(LoginBean.getPassword()))) {
                    return 6; // LOGIN FAILED WRONG USER OR PASSWORD
                }
                return 1;
            case 0:
                return 0; // LOGIN FAILED NO INTERNET CONNECTION
            case -1:
                return -1; // UNKNOWN ERROR
            default:
                break;
        }
        return 0;
    }
}
