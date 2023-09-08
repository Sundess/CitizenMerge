package com.example.javafx_1_home.model;

public class LoginModel {

    static final String EMAIL = "sandesh";
    static final String PASSWORD = "sandesh";


    public static boolean loginAuth (String email,String pass){
        return email.equals(EMAIL) && pass.equals(PASSWORD);
    }
}
