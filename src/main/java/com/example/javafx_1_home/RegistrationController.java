package com.example.javafx_1_home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegistrationController {

    @FXML
    private TextField fName;

    @FXML
    private TextField lName;

    @FXML
    private TextField r_email;

    @FXML
    private PasswordField r_pass;

    @FXML
    private  PasswordField r_pass1;

    @FXML
    private  Button register;

    @FXML
    private Button goToLogin;

    @FXML
    private Label registerStatus;

    private  Application application;

    public RegistrationController(){
    }

    public void  setApplication(Application application){
        this.application = application;
    }

    public void register() throws IOException{
        //save the details in csv format

        registerStatus.setText("Registration Process");
        registerStatus.getStyleClass().clear();
        registerStatus.getStyleClass().add("login-success");

    }

    public void goToLogin () throws IOException {
        application.loginScene();
    }




}
