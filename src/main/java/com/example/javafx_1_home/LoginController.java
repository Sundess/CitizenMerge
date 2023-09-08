package com.example.javafx_1_home;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label welcomeText;

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
    protected void onSubmit() throws IOException {
        if(email.getText().equals("sandesh") && password.getText().equals("sandesh")){
            displayStatus.setText("Logged in successfully.");
            application.registerScene();
        }else {
            displayStatus.setText("Error loggin in.");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}