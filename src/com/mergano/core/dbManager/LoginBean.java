package com.mergano.core.dbManager;

public class LoginBean {

    private static String username;
    private static String password;
    private static String userType;
    private static String userEmail;
    private static String empno;
    private static String firstname;
    private static String lastname;
    private static String datetime;
    private static String userTxt;

    // Setter and Getter for authenticate
    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        LoginBean.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        LoginBean.password = password;
    }

    public static String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        LoginBean.userType = userType;
    }

    public static String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        LoginBean.userEmail = userEmail;
    }

    public static String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        LoginBean.empno = empno;
    }

    public static String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        LoginBean.firstname = firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        LoginBean.lastname = lastname;
    }

    public static String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        LoginBean.datetime = datetime;
    }

    public static String getUserTxt() {
        return userTxt;
    }

    public void setUserTxt(String userTxt) {
        LoginBean.userTxt = userTxt;
    }

}
