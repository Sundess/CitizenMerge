package com.example.javafx_1_home;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Label displayStatus;

    @FXML
    protected void onSubmit(){
        if(email.getText().equals("sandesh") && password.getText().equals("sandesh")){
            displayStatus.setText("Logged in successfully.");
        }else {
            displayStatus.setText("Error loggin in.");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}