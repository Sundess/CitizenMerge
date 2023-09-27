package com.example.javafx_1_home;

import com.example.javafx_1_home.model.LoginModel;
import com.example.javafx_1_home.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.javafx_1_home.model.UserModel.validateLogin;

public class LoginController {

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Label displayStatus;

    private Main main;

    public LoginController(){
    }

    public void setApplication(Main main){
        this.main = main;
    }


    @FXML
    protected void onLogin() throws IOException {

        if(validateLogin(email.getText(), password.getText())){
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

    @FXML
    protected void goToRegistration() throws  IOException{
        main.registerScene();
    }

}