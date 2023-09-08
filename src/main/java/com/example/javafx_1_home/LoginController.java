package com.example.javafx_1_home;

import com.example.javafx_1_home.model.LoginModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Label displayStatus;

    private Application application;

    public LoginController(){
    }

    public void setApplication(Application application){
        this.application = application;
    }


    @FXML
    protected void onLogin() throws IOException {
        if(LoginModel.loginAuth(email.getText(), password.getText())){
            displayStatus.setText("Logged in successfully.");
            displayStatus.getStyleClass().clear();
            displayStatus.getStyleClass().add("login-success");
//            application.registerScene();
        }else {
            displayStatus.setText("Error loggin in.");
            displayStatus.getStyleClass().clear();
            displayStatus.getStyleClass().add("login-error");
        }
    }

}